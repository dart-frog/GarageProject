
public class ElectricCar extends Car {
	double battery;
	double mpk;
	public ElectricCar(double myBattery, double myMpk,int myDoors, String myMake, String myModel, int myYear,int myRange, int myRadius){
		battery = myBattery;
		mpk = myMpk;
		setDoors(myDoors);
		setMake(myMake);
		setModel(myModel);
		setYear(myYear);
		setRange(myRange);
		setRadius(myRadius);
		
	}
	
}
