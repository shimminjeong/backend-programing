package basic.di;

public class Car {
	
	private Tire tire;
	
	public Car() {
		System.out.println("car()의 생성자입니다.");
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void printTireBrand() {
		System.out.println("타이어 브랜드는  "+ tire.getTireBrand());
	}

}
