
public class Vehicle {
	//make
	
	String make;
	
	//model
	
	String model; 
	
	//year
	
	int year; 
	
	//steering wheel
	int radius;
	
	//range
	int range; 
	
	public void setMake (String myMake){
		make = myMake; 
	}
	public void setModel (String myModel){
		model = myModel;
	}
	public void setYear (int myYear){
		year = myYear;
	}
	public void setRange (int myRange){
		range = myRange;
	}
	public void setRadius (int myRadius){
		radius = myRadius; 
	}
	public int getRadius (){
		return radius;
	}
	public int getRange (){
		return range; 
	}
	public int getYear (){
		return year;
	}
	public String getMake (){
		return make;
	}
	public String getModel (){
		return model;
	}
}
