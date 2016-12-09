/**
 * Queue class with linked list implementation
 * 
 * Methods:
 *  isEmpty()
 *  enqueue()
 *  dequeue()
 *  getFront()
 *  getBack()
 *  size()
 *  toString()
 * 
 */
package thequeue;

import java.util.*;

/**
 *
 * @author milto_000
 */
public class Queue {

    private QueueElement front;
    private QueueElement end;
    private int curr;
//==============================================================================
    /**
     * Class constructor
     */
    Queue() {

        front = null;

    }//end Queue
//==============================================================================
    /**
     * Checks if the list is empty
     * 
     * @return 
     */
    public boolean isEmpty() {
        return (front == null);
    }//end isEmpty()
//==============================================================================
    /**
     * Adds items to the queue
     * 
     * @param input 
     * @param id 
     */
    public void enqueue(String fname, String lname, String id) {
        //instantiating a Person data object and passing the parameters that were inputed
        Person x = new Person(fname, lname, id);
        
        if (isEmpty()) { //adds first node if empty   
            QueueElement newHead = new QueueElement(x.toString());//instantiates a node
            newHead.setNext(front); //moves back
            front = newHead;    //set new node to the front
            curr++; //iterate size by 1
        } else {
            end = front;//start in the front
            while (end.next != null) { //cycle to the back
                end = end.next;     

            }//end while
            curr++;
            end.next = new QueueElement(x.toString());//add new node to the tail
            end = end.next; //makes new node the new tail
        }//end if
    }//end enqueue()
//==============================================================================
    /**
     * Remove items from the queue
     * 
     * @return 
     */
    public String dequeue() {
        //Save first item data into a variable before removing
        String item = getFront();
        
        if (isEmpty()) {   
            System.out.println("Queue underflow");
        } else {

            front = front.next; // removed
            curr--; //size goes down
        }//end if

        return item;    //returns what was removed
    }//end dequeue()
//==============================================================================
    /**
     * Return the data of the first item in the queue
     * 
     * @return 
     */
    public String getFront() {
        if (isEmpty()) {
            throw new NullPointerException("Queue is empty");
        }//end if

        return front.getData();
    }//end getFront()
    //==============================================================================
    /**
     * Return the data of the first item in the queue
     * 
     * @return 
     */
    public String getBack() {
        if (isEmpty()) {
            throw new NullPointerException("Queue is empty");
        }//end if

        return end.getData();
    }//end getFront()
//==============================================================================
    /**
     * Returns the current size of the queue
     * 
     * @return 
     */
    public int size() {
        return curr;
    }//end size()    
//==============================================================================
    /**
     * String representation of the list 
     * 
     * @return 
     */
    public String toString() {

        if (isEmpty()) {
            return "[ ]";
        }//end if

        StringBuilder out = new StringBuilder("[");
        QueueElement tmp = front;
        
        //Cycles throw the list
        while (tmp != null) {
            out.append(tmp.getData() + "  ");
            tmp = tmp.next;
        }//end while

        out.append("]");
        return out.toString();
    }//end toString()

}//end class Queue
