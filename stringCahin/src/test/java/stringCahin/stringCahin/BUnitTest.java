package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class BUnitTest {
    @Test
    public void testBWithCStub() {
        // יוצרים סטאב של C
        CStub stub = new CStub();
        // יוצרים את B עם הסטאב
        B b = new B(stub);

        // קוראים ל־B — לא לסטאב!
        String result = b.process("H");

        // ציפיה:
        // B מוסיפה "E" → "HE"
        // CStub מוסיף "X" → "HEX"
        assertEquals("HEX", result);
    }
}
