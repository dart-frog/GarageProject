import java.util.ArrayList;
import java.util.Scanner;

import java.util.*; 
public class MyGarage {
	
	static Scanner console = new Scanner(System.in);
	static ArrayList myGarage = new ArrayList();
	public static void main (String Args[]){
		reciever();
		display();
		
	}
	
	public static void reciever(){
        System.out.print("please type in the type of vehichle you would like to store");
		String answer = console.next();
    	if (answer.equalsIgnoreCase("Boat")){
    		addVehicle("Boat");
    	}
    	else if (answer.equalsIgnoreCase("ElectricCar")){
    		addVehicle("Electric Car");
    	}
    	else if (answer.equalsIgnoreCase("GasCar")){
    		addVehicle("Gas Car");
    	}
    	else {
    		System.out.println("unrecognizable vehicle");
    	}
    }
    public static void addVehicle(String type){ 
    	System.out.print("make");
    	String yourMake = console.next();
    	System.out.print("model");
    	String yourModel = console.next();
    	
    	System.out.print("year");
    	int yourYear = console.nextInt();
    	System.out.print("radius");
    	int yourRadius = console.nextInt();
    	if (type.equals("Electric Car") || type.equals("Gas Car")){
    		int yourDoors = console.nextInt();
    		
    		if(type.equals("Electic Car")){
    			System.out.print("KPM");
    			double yourKpm = console.nextDouble();
    			System.out.print("Battery");
    			double yourBattery = console.nextDouble();
    			int yourRange = rangeCalculatorForElectricCar(yourKpm, yourBattery);
    			//public ElectricCar(double myBattery, double myMpk,int myDoors, String myMake, String myModel, int myYear,int myRange, int myRadius){
    			ElectricCar myElectricCar = new ElectricCar(yourBattery,yourKpm,yourDoors,yourMake,yourModel,yourYear,yourRange,yourRadius);
    			
    			
    		}
    		if (type.equals("Gas Car")){
    			System.out.print("Mpg");
    			double yourMpg = console.nextDouble();
    			System.out.print("tank");
    			double yourTank = console.nextDouble();
    			int yourRange = rangeCalculatorForGasCar(yourMpg, yourTank);
    			//public GasCar (double myMpg, double myTank, int myDoors, int myRange, int myRadius, String myMake, String myModel, int myYear){
    			GasCar myGasCar = new GasCar(yourMpg,yourTank,yourDoors,yourRange,yourRadius,yourMake,yourModel,yourYear);
            	myGarage.add(myGasCar);
    		}
    	}
    	else {
    		//you have a boat!
    		System.out.print("Range");
        	int yourRange = console.nextInt();
        	// public Boat(String myMake, String myModel, int myYear,int myRange, int myRadius){
        	Boat myBoat = new Boat(yourMake,yourModel,yourYear,yourRange,yourRadius);
        	myGarage.add(myBoat);
    	}
    	
    }
    public static int rangeCalculatorForElectricCar(double yourKpm, double yourBattery){
    	int range = (int)(yourKpm * yourBattery  * 0.7); 
    	return range;
    }
    public static int rangeCalculatorForGasCar(double yourMpg, double yourTank){
    	int range = (int)(yourMpg * yourTank);
    	return range;
    }
    public static void display(){
    	for (int i = 0; i < myGarage.size(); i++){
    		Object splicer = (String) myGarage.get(i);
    		
    		
    		Boat newBoat = (Boat) myGarage.get(i);
    		int xYear = newBoat.getYear();
    		System.out.print(xYear);
    	}
    }
    

}
