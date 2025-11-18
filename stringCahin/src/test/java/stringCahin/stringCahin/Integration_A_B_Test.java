package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class Integration_A_B_Test {

    @Test
    public void testIntegration_AtoB_withCStub() {
        // Arrange:
        CStub cStub = new CStub();   // stub replaces C
        B realB = new B(cStub);      // real B
        A realA = new A(realB);      // real A

        // Act:
        String result = realA.process("");   // A מתחילה עם prefix ריק

        // Assert:
        assertEquals("HEX", result);
        // הסבר:
        // A מוסיפה H → "H"
        // B מוסיפה E → "HE"
        // CStub מוסיף X → "HEX"
    }

}
