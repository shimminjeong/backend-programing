package di.xml01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("spring-xml01.xml"); // bean 정의해준거 사용하기위해
//		1. 생성자 주입
//		Car c1= new Car(new HankkokTire());
		Car localcar = (Car) context.getBean("car");
		localcar.printTireBrand();

	}

}
