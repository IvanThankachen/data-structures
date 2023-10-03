import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        //Create a priority queue of to-do items
        //A WorkOrder has a message ID that is used to determine priority
        //A priority queue can only store Comparable objects
        Queue<WorkOrder> toDo = new PriorityQueue<>();
        toDo.add(new WorkOrder(3,"Walk the fish on the pavement."));
        toDo.add(new WorkOrder (2,"Make 3 AM Upside Down groggy smack"));
        toDo.add(new WorkOrder (2, "Eat the fishy!"));
        toDo.add(new WorkOrder (7, "Drink concotion with fish food"));
        System.out.println(toDo);

        while(toDo.size() > 0)
        {
            System.out.println(toDo.remove());
        }
    }
}
