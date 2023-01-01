package assignment6;

public class I extends TagDecorator{

Tag tag;
	
	public I(Tag tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "<i>" + tag.toString() + "</i>";
	}

}
