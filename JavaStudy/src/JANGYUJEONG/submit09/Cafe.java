package JANGYUJEONG.submit09;

public class Cafe {
	String cafename;
	Coffee drinklist;
	
	
	// 생성자
	public Cafe() {};
	
	public Cafe(String cafename) {
		super();
		this.cafename = cafename;
		//this.drinklist = drinklist;
	}
	
	public void addCoffee(Coffee coffee) {
		//this.cafename = cafename;
		this.drinklist = coffee;
	}
	
	
	// toString
	@Override
	public String toString() {
		return "Cafe [cafename=" + cafename + ", drinklist=" + drinklist + "]";
	}
	
	
}
