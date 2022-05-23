package com.Java_Evaluation_1;

public class Car{
	
}

		
public class Car {
	private String model;
	private String companyName;
	private String color;
	private Engine engine;
	

	
		Car(String m, String n, String col,int rpm, int p, String man){
			this.model = m;
			this.companyName = n;
			this.color = col;
			this.engine = new Engine();
			this.engine.rmp = rpm;
			this.engine.Power = p;
			this.engine.manufacturer = man;
			this.engine.enableTurbo();
		}

		public void printDetails() {
			System.out.println("Car Model : " + this.model);
			System.out.println("Car companyName : " + this.companyName);
			System.out.println("Car color : " + this.color);
			System.out.println("Car RPM : " + this.engine.rmp);
			System.out.println("Car power : " + this.engine.Power);
			System.out.println("Car Engine Manufacture : " + this.engine.manufacturer);
			System.out.println("Car Has Turbo : " + this.engine.hasTurbo);
		}
		

		public void printDetails() {
			System.out.println("Car Model : " + this.model);
			System.out.println("Car companyName : " + this.companyName);
			System.out.println("Car color : " + this.color);
			System.out.println("Car RPM : " + this.engine.rmp);
			System.out.println("Car power : " + this.engine.Power);
			System.out.println("Car Engine Manufacture : " + this.engine.manufacturer);
			System.out.println("Car Has Turbo : " + this.engine.hasTurbo);
		}
		public static void main(String[] args) {
			Car car1 = new Car();
			car1.printDetails();
			System.out.println("----------------------");
			Car car2 = new Car("Harrier","Tata","Black",15000,100,"Tata");
			car2.printDetails();
		}
		
	}
	
	

