package com.Java_Evaluation_1;

public class Car {
	private String model;
    private String companyName;
    private String color;
    private String engine;
	
	public class Engine{
		
		private int rmp;
        private int Power;
		private String manufacturer;
		private Boolean hasTurbo;
	}
	

		
		//zero argument
		public Car() {
			
		}
		
		
		public String getModel() {
			return model;
		}


		public void setModel(String model) {
			this.model = model;
		}


		public String getCompanyName() {
			return companyName;
		}


		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public String getEngine() {
			return engine;
		}


		public void setEngine(String engine) {
			this.engine = engine;
		}


		//paraametrized argument
		public Car (String m,String cn,String col,String eng,int rm, int P, String ma,) {
		this.model=m;
		this.companyName=cn;
		this.color=col;
		this.engine=eng;
//		this.rmp=rm;
//        this.Power=P;
//		this. manufacturer=ma;
//	   
	}
		public void printDetail() {
			System.out.println("Car Model is " + model);
			System.out.println("Car CompanyName is " + companyName);
			System.out.println("Car CompanyName is " + companyName);
			System.out.println("Car Color is " + color);
//			System.out.println("Car RPM is " + companyName);
//			System.out.println("Car Power is " + power);
//			System.out.println("Car is " + companyName);
//			System.out.println("Car  is " + companyName);
//			
		}
		
		public static void main(String[] args) {
		
	}
	
	
}
