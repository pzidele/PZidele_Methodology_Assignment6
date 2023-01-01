package assignment6;

public class Em extends TagDecorator{
	
	Tag tag;
	
	public Em(Tag tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "<em>" + tag.toString() + "</em>";
	}

}
