/**
 * Node class for the list
 */
package thequeue;

/**
 *
 * @author milto_000
 */
public class QueueElement {

    private String data;
    public QueueElement next;
//==============================================================================

    /**
     * Class constructors
     *
     * @param data
     */
    QueueElement() {

    }//end QueueElement()

    public QueueElement(String data) {
        this.data = data;

    }//end QueueElement()
//==============================================================================

    /**
     * accessors and mutators
     *
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    } //end setData()

    public void setNext(QueueElement next) {
        this.next = next;
    } //end setNext()

    public String getData() {
        return data;
    }//end getData()

    public QueueElement getNext() {
        return next;
    }//end getNext()
}//end class QueueElement
