
public class GasCar extends Car {
	double mpg;
	double tank; 
	public GasCar (double myMpg, double myTank, int myDoors, int myRange, int myRadius, String myMake, String myModel, int myYear){
		mpg = myMpg;
		tank = myTank;
		setDoors(myDoors);
		setRange(myRange);
		setRadius(myRadius);
		setMake(myMake);
		setModel(myModel);
		setYear(myYear);
	}
	public double getTank(){
		return tank;
	}
	public double getMpg(){
		return mpg;
	}
}
