import java.util.ArrayList;
import java.util.Scanner;

import java.util.*; 
public class MyGarage {
	
	static Scanner console = new Scanner(System.in);
	static ArrayList<GasCar> myGasCars = new ArrayList();
	static ArrayList<ElectricCar> myElectricCars = new ArrayList();
	static ArrayList<Boat> myBoats = new ArrayList();
	public static void main (String Args[]){
		start();
		
	}
	public static void start(){
		System.out.println("Welcome to your Garage");
		System.out.print("Would you like to store a vehichle?");
		String answer = console.next();
		if (answer.charAt(0) == 'y'){
			reciever();
		}
	}
	
	public static void reciever(){
		
		System.out.print("please type in the type of vehichle you would like to store ");
		String answer = console.next();
    	if (answer.equalsIgnoreCase("Boat")){
    		addVehicle("Boat");
    	}
    	else if (answer.equalsIgnoreCase("ElectricCar")){
    		addVehicle("ElectricCar");
    	}
    	else if (answer.equalsIgnoreCase("GasCar")){
    		addVehicle("GasCar");
    	}
    	else {
    		System.out.println("unrecognizable vehicle");
    	}
    }
    public static void addVehicle(String type){ 
    	System.out.println("Please Type in Your Information");
    	System.out.print("Make: ");
    	String yourMake = console.next();
    	System.out.print("Model: ");
    	String yourModel = console.next();
    	System.out.print("Year: ");
    	int yourYear = console.nextInt();
    	System.out.print("Steering Wheel Radius: ");
    	int yourRadius = console.nextInt();
    	if (type.equals("ElectricCar") || type.equals("GasCar")){
    		System.out.print("Doors: ");
    		int yourDoors = console.nextInt();
    		
    		if(type.equals("ElectricCar")){
    			System.out.print("Kilowatts per Mile: ");
    			double yourKpm = console.nextDouble();
    			System.out.print("Battery Capacity :");
    			double yourBattery = console.nextDouble();
    			int yourRange = rangeCalculatorForElectricCar(yourKpm, yourBattery);
    			//public ElectricCar(double myBattery, double myMpk,int myDoors, String myMake, String myModel, int myYear,int myRange, int myRadius){
    			ElectricCar myElectricCar = new ElectricCar(yourBattery,yourKpm,yourDoors,yourMake,yourModel,yourYear,yourRange,yourRadius);
    			myElectricCars.add(myElectricCar);
    			
    		}
    		if (type.equals("GasCar")){
    			System.out.print("Miles per Gallon: ");
    			double yourMpg = console.nextDouble();
    			System.out.print("Tank: ");
    			double yourTank = console.nextDouble();
    			int yourRange = rangeCalculatorForGasCar(yourMpg, yourTank);
    			//public GasCar (double myMpg, double myTank, int myDoors, int myRange, int myRadius, String myMake, String myModel, int myYear){
    			GasCar myGasCar = new GasCar(yourMpg,yourTank,yourDoors,yourRange,yourRadius,yourMake,yourModel,yourYear);
            	myGasCars.add(myGasCar);
    		}
    	}
    	if(type.equals("Boat")){  
    		//you have a boat!
    		System.out.print("Range: ");
        	int yourRange = console.nextInt();
        	// public Boat(String myMake, String myModel, int myYear,int myRange, int myRadius){
        	Boat myBoat = new Boat(yourMake,yourModel,yourYear,yourRange,yourRadius);
        	myBoats.add(myBoat);
    	}
    	//ask if you would to store another vehichle
    	System.out.print("Would you like to store another vehichle");
    	String yourAnswer = console.next();
    	if (yourAnswer.charAt(0) == 'y'){
			reciever();
		}
		else{
			display();
		}
    }
  
    public static int rangeCalculatorForElectricCar(double yourKpm, double yourBattery){
    	int range = (int)(yourBattery / yourKpm  * 0.7); 
    	return range;
    }
    public static int rangeCalculatorForGasCar(double yourMpg, double yourTank){
    	int range = (int)(yourMpg * yourTank);
    	return range;
    }
    public static void display(){
    	for (int i = 0; i < myBoats.size(); i++){
    		Boat newBoat = myBoats.get(i);
    		System.out.print("Make: " + newBoat.getMake() + " ");
    		System.out.print("Model: " + newBoat.getModel() + " ");
    		System.out.print("Year: " + newBoat.getYear() + " ");
    		System.out.print("Steering Wheel Radius: " + newBoat.getRadius() + " ");
    		System.out.println("Range: " + newBoat.getRange() + " ");
    	}
    	for (int i = 0; i < myGasCars.size(); i++){
    		GasCar newGasCar = myGasCars.get(i);
    		System.out.print("Make: " + newGasCar.getMake() + " ");
    		System.out.print("Model: " + newGasCar.getModel() + " ");
    		System.out.print("Year: " + newGasCar.getYear() + " ");
    		System.out.print("Steering Wheel Radius: " + newGasCar.getRadius() + " ");
    		System.out.print("Range: " + newGasCar.getRange() + " ");
    		System.out.print("Doors: " + newGasCar.getDoors() + " ");
    		System.out.print("Tank: " + newGasCar.getTank() + " ");
    		System.out.println("Miles per Gallon" + newGasCar.getMpg() + " ");
    	}
    	for (int i =0; i < myElectricCars.size();i++){
    		ElectricCar newElectricCar = myElectricCars.get(i);
    		System.out.print("Make: " + newElectricCar.getMake() + " ");
    		System.out.print("Model: " + newElectricCar.getModel() + " ");
    		System.out.print("Year: " + newElectricCar.getYear() + " ");
    		System.out.print("Steering Wheel Radius: " + newElectricCar.getRadius() + " ");
    		System.out.print("Range: " + newElectricCar.getRange() + " ");
    		System.out.print("Battery Capacity: " + newElectricCar.getBattery() + " ");
    		System.out.println("kilowatts per mile: " + newElectricCar.getMpk()+ " ");
    	}	
    }
    

}
