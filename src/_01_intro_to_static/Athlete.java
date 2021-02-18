package _01_intro_to_static;

public class Athlete {
	    static int nextBibNumber = 1;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	     Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	        this.bibNumber=nextBibNumber;
	        nextBibNumber++;
	    }
	     
	    public static void main(String[] args) {
	       Athlete athlete1 = new Athlete("Bob", 5);
	       Athlete athlete2 = new Athlete("Kate", 4);
	       System.out.println("The race is held at " + raceLocation + ", the racers are " + athlete1.name + " with a bib number of " + athlete1.bibNumber + " and " + athlete2.name + " with a bib number of " + athlete2.bibNumber + ".");
	        
	    }
	}

