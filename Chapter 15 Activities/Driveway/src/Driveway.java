import java.util.Stack;
import java.util.Scanner;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
public class Driveway
{
    /**
      * Stack representing the cars in the driveway.
    */
    private Stack<Integer> driveway;
    /**
      * Stack representing the cars in the street.
    */
    private Stack<Integer> street;
    private int license_plate;

    /**
      * Constructor.
    */
    public Driveway()
    {
      driveway = new Stack<>();
      street = new Stack<>();
      
        // Complete the constructor
        


    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void add(int licensePlate)
    {
        // Complete this method
        license_plate = licensePlate;

        driveway.push(license_plate);


    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void remove(int licensePlate)
    {
        // Complete this method
        license_plate = licensePlate;
        int spot = Math.abs(license_plate);
        for(int i = 0; i < driveway.size(); i++)
        {
          if(i != spot)
          {
            street.push(driveway.pop());
          }
          else
          {
            driveway.pop();
            for(int j = 0; j < street.size(); j++)
            {
              driveway.push(street.pop());
            }
          }
        }
        


    }

    /**
      * Prints the driveway and street details to the screen.
    */
    public void print()
    {
        System.out.println("In Driveway, starting at first in (one license plate per line):");
        // Print the cars in the driveway here
        for(int k = 0; k < driveway.size(); k++)
        {
          Integer drive = driveway.pop();
          System.out.println(drive);
        }
        System.out.println("In Street, starting at first in (one license plate per line):");
        // Print the cars in the street here
        

    }
}
