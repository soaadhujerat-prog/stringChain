package stringCahin.stringCahin;

public class ChainMain {

	public String run() {
        // יצירת השרשרת לפי הסדר הנכון
        E e = new E();
        D d = new D(e);
        C c = new C(d);
        B b = new B(c);
        A a = new A(b);

        // קריאה לשרשרת מההתחלה
        String result = a.process("");

        // הדפסת התוצאה הסופית למסך
        return result;
    }

}



