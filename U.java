package assignment6;

public class U extends TagDecorator{

Tag tag;
	
	public U(Tag tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "<u>" + tag.toString() + "</u>";
	}


}
