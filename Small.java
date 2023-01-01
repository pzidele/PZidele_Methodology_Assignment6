package assignment6;

public class Small extends TagDecorator{
Tag tag;
	
	public Small(Tag tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "<small>" + tag.toString() + "</small>";
	}


}
