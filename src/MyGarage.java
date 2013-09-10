import java.util.Scanner;


public class MyGarage {
	Scanner console = new Scanner(System.in);
	public void static reciever(){
        String answer = console.next();
    	if (answer.equalsIgnoreCase("Boat")){
    		addVehicle("Boat");
    	}
    	if (answer.equalsIgnoreCase("Electric Car")){
    		addVehicle("Electric Car");
    	}
    }
    public static void addVehicle(String type){ 
    	System.out.println("make");
    	String yourMake = console.next();
    	
    }
    

}
