import java.util.Scanner;

import javax.swing.JFrame;

public class MissileLauncher {
	
	public static void main (String[] args) {
				
		boolean distanceisPositive = true;
		boolean missileChosen = true;
		
		double x = 0.0;
		double yVert = 0.0;
		double xOrigin = 0.0;		
				
		while (distanceisPositive == true) {
		    Scanner scanner = new Scanner( System.in );
		    System.out.print( "Distance: " );
		    String input = scanner.nextLine();

		    System.out.println( "input = " + input);
		   		    
		    System.out.println("input.length = " + input.length());
		    
		    if (input.isEmpty()) {
		    		System.out.println("Please enter a number.");
		    }
			double distance = Integer.parseInt(input);
		    
		    if (distance < 0) {
		    		System.out.println("That is not possible.");
		    		System.out.println("Please try again.");
		    }
		    else {
		    		distanceisPositive = false;
		    		x = distance;
		    }
		}
		
		while (missileChosen) {
		    Scanner scanner = new Scanner( System.in );
		    System.out.print( "Vertex of missile: " );
		    String missile = scanner.nextLine();

		    double heightOfMissile = Integer.parseInt(missile);
		    System.out.println( "input = " + missile);  
		    
		    if (missile.isEmpty()) {
		    		System.out.println("Please enter the vertex of missile.");
		    }
		    else if (heightOfMissile < 0) {
		    		System.out.println("That is impossible.");
		    }
		    else {
    				yVert = heightOfMissile;
		    		missileChosen = false;
		    }    
		}
		
		double xVert = x/2;
		double a = quadraticequationfinder(xVert, yVert, x);
		
		System.out.println("a = " + a);
		
		System.out.println("missile is launching!");
	}	
	
	public static double quadraticequationfinder(double xVert, double yVert, double distance) {
		
		double a = 0.0;
		System.out.println("xVert = " + xVert + "yVert = "+ yVert + "distance = " + distance);
		
		double difference = 0.0;
		
		difference = xVert - distance;
		
		System.out.println("difference = " + difference);
		
		double product = 0.0;
		
		product = difference * xVert;
		
		a = yVert / product;
		
		System.out.println("a = " + a);
		
		return a;
		
	}
}
