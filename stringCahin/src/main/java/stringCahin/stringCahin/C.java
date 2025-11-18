package stringCahin.stringCahin;

public class C {
	 private D next;

	 public C(D next) {
		 this.next = next;
	 }

	 public String process(String prefix) {
	     String updated = prefix + "L";
	     return next.process(updated);
	 }
	}
