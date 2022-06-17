
public class CarpetCalculator {
	
	float pricePerSqrFt;
	float installCharge = 0;
	float totalCost = 0;
	
	public CarpetCalculator(float PricePerSqrFt) {
		this.pricePerSqrFt = PricePerSqrFt;
	}
	
	public CarpetCalculator(float PricePerSqrFt, float InstallCharge) {
		this.pricePerSqrFt = PricePerSqrFt;
		this.installCharge = InstallCharge;
	}
	
	public void addRoom(Room room) {
		double area = room.getLength() * room.getWidth();
		totalCost = (float) (totalCost + (area * this.pricePerSqrFt));
		
	}
	
	public float getTotalCost() {
		totalCost = totalCost + this.installCharge;
		return totalCost;
	}
	
	public void addPercentDiscount(float percentage) {
		float discount = totalCost * (percentage/100);
		System.out.println(discount);
		totalCost = totalCost - discount;
	}
}
