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
    	System.out.println("make");
    	String yourMake = console.next();
    	String yourModel = console.next();
    	int yourRange = console.nextInt();
    	int yourYear = console.nextInt();
    	
    }
    

}
