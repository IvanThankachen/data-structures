import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        //The addLast method can be used to populate a list.
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Diana");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");
        //The list is currently DHRT
        /*
        The listIterator method creates a new list iterator that is positioned at the head of the list. 
        The "|" is used to represent the iterator position
        */
       ListIterator<String> iterator = staff.listIterator(); //DHRT
       // The next method advances the iterator to the next element in the list.
       iterator.next(); // D|HRT
       // The net method also returns the element that the iterator is passing.
       String name = iterator.next(); // DH|RT
       //System.out.println(name);
       
       // The add method for iterators inserts an element at the iterator position.
       // The iterator is then positioned after the element that was added.
       iterator.add("Juliet"); // DHJ|RT
       iterator.add("Nina"); // DHJN|RT

       // The remove method removes the element returned by the last call to next or previous.
       //The rmove method can only be called once after calling next or previous.
       //The remove method cannot be called after calling add.
       iterator.next(); //DHJNR|T
       iterator.remove(); //DHJN|T
       System.out.println(staff);

       //The set method updates the element returns by the last call to next or previous.
       iterator.previous(); //DHJ|NT
       iterator.set("Albert");//DHJ|AT

       // The hasNext method returns true if the list has another element. It is often used in the condition of a while loop.
       iterator = staff.listIterator(); // resets to the beginning of the currently updated list.
       while (iterator.hasNext())
       {

        String n = iterator.next();
        if(n.equals("Juliet"))
        //DHJ|AT
        //DH|AT
        {
            iterator.remove();
        }

        //DHAT|

       }

       //Enhanced for loop works with linked list.
       for(String n: staff)
       {
        System.out.print(n + " ");

       }
       iterator = staff.listIterator();
       while(iterator.hasNext())
       {
        String n = iterator.next();
        if(n.equals("Harry"))
        {
            staff.remove("Diana");
        }
        System.out.print(staff);
       }





    }
}
