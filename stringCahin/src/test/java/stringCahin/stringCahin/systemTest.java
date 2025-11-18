package stringCahin.stringCahin;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

// בדיקה מערכת
public class systemTest {
	@Test
	//בדיקת End-to-End שמוודאת שהשרשרת המלאה מחזירה HELLO
    public void testRunEndToEnd() {

	    ChainMain runner = new ChainMain();

	    String result=runner.run();

	    assertEquals("HELLO", result);

    }

}
