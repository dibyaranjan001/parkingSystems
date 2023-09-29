package car_parking;
import java.util.Scanner;
import java.util.ArrayList;

public class parkingSystems{
	static int totalSlots , avilableSlots;
	static  ArrayList<String> parkedCars = new ArrayList<String>();
             
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total number of parked cars");
		totalSlots = sc.nextInt();
		avilableSlots = totalSlots;
		while(true) {
		    System.out.println("\nWhat would you like to do?");
            System.out.println("1. Park a car");
            System.out.println("2. Remove a car");
            System.out.println("3. View parked cars");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch(choice) {
            case 1:
            	parkCar();
            	break;
            case 2:
            	removeCar();
            	break;
            case 3:
            	viewParkedCar();
            	break;
            case 4:
            	System.exit(0);
            default:
            	System.out.println("invalid choice. please try again");
            }
            }
	}
    public static void parkCar (){
    	if(avilableSlots==0) {
    		System.out.println("sorry, there are no parking slots");
    	}
    	Scanner sc = new Scanner(System.in);
    	System.out.println("entered the license plate number of the car ");
    	String licesense = sc.nextLine();
    	parkedCars.add(licesense);
    	avilableSlots--;
    	System.out.println("car parked succesfully. Avilabe slots are"+ avilableSlots);
    }
    public static void removeCar() {
    	if(avilableSlots == totalSlots) {
    		System.out.println("there is no parked cars");
    		return;
        }
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the license plate of the car to be removed");
    	String licensePlate = sc.nextLine();
    	if(parkedCars.contains(licensePlate)) {
    		parkedCars.remove(licensePlate);
    		avilableSlots++;
    		System.out.println("car remove suceesfully. avilable slots"+ avilableSlots);
    	}
    	else { 
    		System.out.println("your car is not parked here");
    	}
    }
    public static void viewParkedCar() {
        if (avilableSlots == totalSlots) {
            System.out.println("There are no parked cars.");
            return;
        }

        System.out.println("Parked cars:");
        for (String licensePlate : parkedCars) {
            System.out.println(licensePlate);
        }
    }

	

}