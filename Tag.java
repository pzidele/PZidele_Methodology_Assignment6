package assignment6;

public abstract class Tag {
	String id = "Unkown ID";
	String name = "Unknown name";
	
	
	
//	public void setId(String id) {
//		this.id = id;
//	}
//	
//	public void setName(String name) {
//		this.name =name;
//	}
	
//	public String getId() {
//		return id;
//	}
//	public String getName() {
//		return name;
//	}

	
	@Override
	public String toString() {
		return "<" + id + ">" + name + "</" + id + ">";
	}
	
}
