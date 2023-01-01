package assignment6;

public class Header extends Tag {

	//private int num;
	
	public Header (int num, String name) throws Exception {
		if (num > 6 || num < 1) {
			throw new Exception("Header value must be between 1 and 6");
		}
		else {
			//this.num = num;
			this.name = name;
			id = "h" + num;
		}
	}


}
