import java.util.*;

public class Temperature {
    public static void main(String[] args) {
	
	//Initialization of the variables
	double initValue = 0.0;
	double finalValue = 0.0;
	char response = 'Z';
	char  mode = 'Z';
	int accuracy = 2 ; // the precision of the temperature value 
	
	//Scanner object
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" ------------------------------------------------- ");
	System.out.println(" ------------- HELLO TO THIS CODE ---------------- ");
	System.out.println(" CELSIUS DEGREES TO/FROM FAHRENHEIT DEGREES CONVERTER ");
	System.out.println(" ------------------------------------------------- ");
	
	do{// while the response = 0 // the principle loop
	    
	    do{// while the response is not Y or N
		mode = ' ';
		System.out.println("Choose your conversion mode : ");
		System.out.println("1 - From Celsius to Fahrenheit");
		System.out.println("2 - From Fahrenheit to Celsius ");
		
		mode =  sc.nextLine().charAt(0);
		
		if(mode != '1' && mode != '2')
		    System.out.println("Unknown mode, give another choice between 1 and 2");
		
	    } while (mode != '1' && mode != '2');
	    
	    // Scan the value of the temperature 
	    System.out.println("Temperature to convert : ");
	    initValue = sc.nextDouble();

	    // Very import we need to void the sc value
	    sc.nextLine();
	    
	    // According to the mode, we compute and display the result
	    if(mode == '1'){
		finalValue = ((9.0/5.0) * initValue) + 32.0;
		System.out.print(round(initValue, accuracy) + " °C equal to : ");
		System.out.println(round(finalValue, accuracy) + " °F.");
	    }
	    else{
		finalValue = ((initValue - 32) * 5) / 9;
		System.out.print(round(initValue, accuracy) + " °F equal to : ");
		System.out.println(round(finalValue, accuracy) + " °C.");
	    }
	    
	    // We call the user to restart the code or to quit
	    do{      
		System.out.println(" Do you want to convert another Temperature ?(Y/N)");
		response = sc.nextLine().charAt(0);
		
	    } while(response != 'Y' && response != 'N');
	    
	} while(response == 'Y');
     
	System.out.println(" End of the code ! ");
	
	// End of the code
    }
    
    public static double round(double X, int Y) {
    return (double) ( (int) (X * Math.pow(10, Y) + .5)) / Math.pow(10, Y);
    }
}
