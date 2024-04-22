import java.util.Scanner;
		public class Logistics {
			public static void main(String[] args){

			Scanner scanner = new Scanner(System.in);

		int basePay = 5000;
		int numberOfDeliveries = 100;
		int driverDelivery;
		


		
		
		


System.out.println("How many deliveries did the rider make today: ");  
 driverDelivery = scanner.nextInt();



if (driverDelivery <= 50){ 
	int totalPay = driverDelivery *160 + basePay;
	System.out.println("Collection Rate: " + totalPay);
	}


if(driverDelivery >= 50 && driverDelivery <= 59){
	int totalPay = driverDelivery * 200 + basePay;
	System.out.println("Collection Rate: " +  totalPay);
	
	}

if (driverDelivery  >= 60 && driverDelivery <= 69){
	int totalPay = driverDelivery * 250 + basePay;
	System.out.println("Collection Rate: " + totalPay);
	}


else if (driverDelivery >= 70){
	int totalPay = driverDelivery * 500 + basePay;
	System.out.println("Collection Rate: " + totalPay);
	}


}
}