package stringCahin.stringCahin;

//מחלקה D
public class D {
	private E next;
	
	public D(E next) {

		this.next = next;
	}
	
	public String process(String prefix) {
	   String updated = prefix + "L";
	   return next.process(updated);
	}
}