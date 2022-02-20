import java.util.*;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter The n Value: ");
		int n =input.nextInt(), firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");
	    for (int i = 1; i <= n; ++i)
        {
	    	if(i!=n)
		      {
		    	  System.out.print(firstTerm + ", ");
		      }
	    	else
		      {
		    	  System.out.print(firstTerm);
		      }
	    	int nextTerm = firstTerm + secondTerm;
	    	firstTerm = secondTerm;
	    	secondTerm = nextTerm;
	    }
	    input.close();
	}
}
