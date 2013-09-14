import java.util.Scanner;


public class MyGarage {
	
	static Scanner console = new Scanner(System.in);
	public static void main (String Args[]){
		
		
	}
	
	public static void reciever(){
        String answer = console.next();
    	if (answer.equalsIgnoreCase("Boat")){
    		addVehicle("Boat");
    	}
    	if (answer.equalsIgnoreCase("Electric Car")){
    		addVehicle("Electric Car");
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
    			
    			
    		}
    		if (type.equals("Gas Car")){
    			double yourMpg = console.nextDouble();
    			double yourTank = console.nextDouble();
    			int ypurRange = rangeCalculatorForGasCar(yourMpg, yourTank);
    		}
    	}
    	else {
    		//you have a boat!
    		System.out.print("Range");
        	int yourRange = console.nextInt();
    		
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
    

}
