/*******************************************************************************
 * Queue Assignment
 * Milton Murray
 * CSCI 211 Spring 2016
 * Last edit, February 23, 9:00 p.m.
 ******************************************************************************/

package thequeue;

import java.util.*;

/*******************************************************************************
 * This program demonstrates the use of a queue 
 * Implemented using a Linked List
 * 
 * @author milto_000
 ******************************************************************************/
public class TheQueue {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue("Tom","Jackson", "0023423");
        q.enqueue("John","Wild","0025643");
        q.enqueue("Brady","Kennedy","0087824");
        q.enqueue("Cindy","Holms","0072844");
        q.enqueue("Mike","Epps","00397433");
        
        System.out.println("Enqueueing "+q.size()+" items...");
        System.out.println("First Person: "+q.getFront());
        System.out.println("Last Person: "+q.getBack()+"\n");
       
        while (!q.isEmpty()) {
            System.out.println(q);
            String element = q.dequeue();
            System.out.println("\n"+element+" leaves the queue."+"\n");
            
        }//end while()
        System.out.println(q);       

    }//end main()

}//end class TheQueue
