
public class Room {
	
	//Attributes
	private double length;
	private double width;
	
	//Getters & Setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	//Creates object of Room with a numerical width and length
	public Room(double width, double length) {
		this.width = width;
		this.length = length;
	}
}
