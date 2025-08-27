import java.util.Random;
import java.util.Scanner;

public class Questionnumber24 {

	public static int totalNumOfStudents = 30;
	
	public static double[] studentHeightx = {1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.22, 1.22, 1.22, 1.22, 1.22, 1.22, 1.22, 1.22, 1.22, 1.22, 1.22, 1.22, 1.22, 1.22, 1.22};
	
	public static void main (String[] args) {

	    Scanner scanner = new Scanner( System.in );
	    System.out.print( "Put in number: " );
	    String input = scanner.nextLine();
	    System.out.println( "input = " + input );
	    
	    int result = Integer.parseInt(input);
	   
	    double[] myIntArray = new double[result];
	    
	    for (int i = 0; i < result; i++) {
	    		Random random = new Random();
	    		System.out.println("studentHeightx = " + studentHeightx[random.nextInt(studentHeightx.length)]);
	    }
	    
	    for (int i = 0; i < 4; i++) {
	    		Random random = new Random();
	    		System.out.println("studentHeightx = " + studentHeightx[random.nextInt(studentHeightx.length)]);
	    }
	}   
}
