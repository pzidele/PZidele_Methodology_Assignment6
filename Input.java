package assignment6;

public class Input extends Tag{
	
	private String type;
	private String event;
	private String value;
		
	public Input(String name, String type, String event, String value) {
		this.name = name;
		id = "input";
		
		this.type = type;
		this.event = event;
		this.value = value;
		
	}
	
	@Override
	public String toString() {
		return "<" + id + " type=\"" + type +"\" value=\"" + value + "\" " + event + "=\"" + name + ">"+ "</" + id + ">";

	}
	


}
