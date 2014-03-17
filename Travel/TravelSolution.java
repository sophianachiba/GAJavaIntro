

class TripSolution{

	String from = "";
	String to = "";
	int nbOfPassenger = 0;
	int tripFlatRate = 300;
	
	public TripSolution(String fromDes, String toDes, int passenger){
		from = fromDes;
		to = toDes;
		nbOfPassenger = passenger;
	}
	
	
	public String getQuote(){		
		int totalPrice = (nbOfPassenger * tripFlatRate);
		return "Your trip from " + from + " to " + to +
				"is estimated at : $" + totalPrice; 
	}
}

public class TravelSolution{
	static public void main(String[] args){
		TripSolution trip = new TripSolution(args[0], args[1], Integer.valueOf(args[2]));
		System.out.print(trip.getQuote());
	}
}
