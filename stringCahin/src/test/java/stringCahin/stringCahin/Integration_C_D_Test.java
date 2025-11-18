package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;


public class Integration_C_D_Test {

    @Test
    public void testIntegration_CtoD_withEStub() {
        // Arrange
        EStub eStub = new EStub();   // Stub for E
        D realD = new D(eStub);      // real D
        C realC = new C(realD);      // real C

        // Act
        String result = realC.process("HE");

        // Assert
        assertEquals("HELLX", result);
        // הסבר:
        // C מוסיפה L → "HEL"
        // D מוסיפה L → "HELL"
        // EStub מוסיף X → "HELLX"
    }
}

