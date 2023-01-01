package assignment6;

public class A extends TagDecorator{

	Tag tag;
	String href;
	
	public A(Tag tag, String href) {
		this.tag = tag;
		this.href = href;
	}

	@Override
	public String toString() {
		return "<a href=\"" + href + "\">" + tag.toString() + "</a>";
	}

	

	

}
