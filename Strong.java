package assignment6;

public class Strong extends TagDecorator{

Tag tag;
	
	public Strong(Tag tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "<strong>" + tag.toString() + "</strong>";
	}






}
