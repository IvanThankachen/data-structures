// Ivan Thankachen and Preston Probst
//9/15/23
//Business Program
// Complete method that allows businesses to downsize employees. 
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Business utility methods.
*/
public class Business
{
    /**
      * Removes every nth element from the linked list
      *
      * @param employeeNames the linked list to remove from
      * @param n                 the parameter to determine "nth"
     */
    public static void downsize(LinkedList<String> employeeNames, int n)
    {
        ListIterator<String> iterator = employeeNames.listIterator();
        //System.out.println(employeeNames);
        // Initialize variables and objects.
        String x = "";
        int count = 0;

        while (iterator.hasNext())
        {

        x = iterator.next();
        //System.out.println(x);
        // System.out.println(count);

        //Used a counter and made sure that if it equaled the count - 1, remove the employee and reset the count. Outherwise, count will increment by 1.
        if (count == (n-1)){
            iterator.remove();
            count = 0;
        }
        else{
            count++;
        }

    }
}
}