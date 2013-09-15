package dip.lab2.student.solution1;

// An useful import if you need it.


import java.text.DecimalFormat;
import java.text.NumberFormat;

// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
    public static NumberFormat currencyFormatter = new DecimalFormat("#,###.00");
    public static NumberFormat percentFormatter = new DecimalFormat("#,###.##%");
    
    
    
    /*TODO:
     * Create a TipManager service (high level) class
     * Create a TipCalculator Interface
     * Create an enumeration class
     * Get rid of magic numbers in classes
     * Change some final variables in classes
     */
    
    
    
 
    public static void main(String[] args) {
        
        
        TipManager tipManager = new TipManager();
        
        ITipCalculator bagService =
                new BaggageServiceTipCalculator(
                ServiceQuality.FAIR,1000);
        ITipCalculator foodService = 
                new FoodServiceTipCalculator(ServiceQuality.GOOD, 1250);
        
        System.out.println("You had " 
                + ((BaggageServiceTipCalculator)bagService).getBagCount()
                + " bags and rated the service as "
                + ((BaggageServiceTipCalculator)bagService).getServiceQuality()
                + ". \nThe tip amount is $"
                + currencyFormatter.format(tipManager.getTipForService(bagService)));
        
        System.out.println("");
        
        System.out.println("Your bill was $" 
                + currencyFormatter.format(((FoodServiceTipCalculator)foodService).getBill())
                + " and rated the service as "
                + ((FoodServiceTipCalculator)foodService).getServiceQuality()
                + ". \nThe tip amount is $"
                + currencyFormatter.format(tipManager.getTipForService(foodService))
                + ". \nThat is " 
                + percentFormatter.format(tipManager.getTipForService(foodService)/((FoodServiceTipCalculator)foodService).getBill()));
        
    }

}
