import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> iterator = strings.listIterator();

        //String first = iterator.previous();
        int count = strings.size() - 1;

        for (int i = 0; i < count; i++)
        {
           
            String value = iterator.next();
           


           
           iterator.previous();
           
           iterator.remove();
           
           if(i == count - 1)
           {
                strings.addLast(value);
               
           }
          
        }
        
    }
}