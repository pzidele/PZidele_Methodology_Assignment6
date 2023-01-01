package assignment6;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Tag tag1 = new Div("Touro");
		
		
		tag1 = new Strong(tag1);
		tag1 = new A(tag1, "www.touro.edu");
		tag1 = new I(tag1);
		
		System.out.println(tag1.toString());

		Tag tag2 = new P("Hi how are you");
		tag2 = new Em(tag2);
		tag2 = new U(tag2);
		System.out.println(tag2);
		
		Tag tag3 = new Input("javascript:alert('action')" ,"button", "onclick", "action");
		tag3 = new Small(tag3);
		tag3 = new Em(tag3);
		System.out.println(tag3);

	}
}
