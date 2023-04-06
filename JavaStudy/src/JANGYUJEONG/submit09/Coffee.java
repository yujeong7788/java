package JANGYUJEONG.submit09;

public class Coffee {
	// 1. 필드 변수
	String drinkname;
	int drinkprice;
	
	
	// 2. 생성자
	public Coffee(){};
	
	public Coffee(String drinkname, int drinkprice) {
		super();
		this.drinkname = drinkname;
		this.drinkprice = drinkprice;
	}
	
	
	// toString
	@Override
	public String toString() {
		return drinkname + " : " + drinkprice;
	}
	
	
	

}
