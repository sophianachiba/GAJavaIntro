
// Trip is where the action is and is where you need to make your changes.
class Trip{
	
	//your data field go here.
	
	public Trip(String fromDes, String toDes, int passenger){
		// you need to capture from, to and passenger
	}
	
	// this calculate the final price and return a text summary
	// we assume a flat fare (i.e $300) regardless of the destination
	public String getQuote(){
		// use your class data field to calculate and display the trip summary
		return "Your trip from " + xxx + " to " + xxx +
				"is estimated at : $" + xxxx; 
	}
}


// No work required here
// This class is complete and calls "Trip" to calculate an display the trip summary
public class Travel{
	static public void main(String[] args){		
		TripSolution trip = new TripSolution(args[0], args[1], Integer.valueOf(args[2]));
		System.out.print(trip.getQuote());
	}
}
