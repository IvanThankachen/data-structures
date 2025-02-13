// Ivan Thankachen and Preston Probst
//9/15/23
//Downsize Tester Program
// Test method that allows businesses to downsize employees. 
import java.util.LinkedList;

/**
 * A test class for the downsize method.
*/
public class DownsizeTester
{
    public static void main(String[] args)
    {
        LinkedList<String> employeeNames = new LinkedList<>();
        employeeNames.addLast("Dick");
        employeeNames.addLast("Harry");
        employeeNames.addLast("Romeo");
        employeeNames.addLast("Juliet");

        Business.downsize(employeeNames, 2);

        System.out.println(employeeNames);
        System.out.println("Expected: [Dick, Romeo]");
    }
}
