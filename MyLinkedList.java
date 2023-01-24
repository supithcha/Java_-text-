/**
* A generic implementation of the IList iterface, that uses MyLinkedListElement.
*/
public class MyLinkedList<E> implements IList<E> {
    
    MyLinkedListElement<E> head, tail;
    
    Integer count;

    //INCOMPLETE.
    public MyLinkedList() {
        //CODE HERE
    }

    // INCOMPLETE.
    public boolean isEmpty() {
        // Returns whether the list is empty.
        //CODE HERE
        return true;
    }
    
    // INCOMPLETE.
    public boolean add(E element) {
        // Adds an element to the head of the list.
        // if the list is not empty, point the new link to head
        //CODE HERE
        return true;
    }
    
    // INCOMPLETE.
    public int size() {
        // Returns the number of elements in stored in this list.
        //CODE HERE
        return 0;
    }
    
    // INCOMPLETE.
    public String toString() {
        // Returns a string representation of this list.
        //CODE HERE
            return "";
    }
    
    // INCOMPLETE.
    public boolean addToTail(E element) {
        // Adds element to tail of the list
        //CODE HERE
        return true;
    }
    
    // INCOMPLETE.
    public String removeFromHead() {
        // Removes and returns the head element
        //CODE HERE
        return "";
    }
    
    public E get(int index) {
        // Gets the element at index in the list
        //CODE HERE
        return null;
    }

    //INCOMPLETE.
    public int indexOf(E element) {
        // Gets the index of element in the list
        //CODE HERE
        return -1;
    }

    //INCOMPLETE.
    public E set(int index, E element) {
        // Sets element at index in the list
        //CODE HERE
        return null;
    }

    //INCOMPLETE
    public void clear() {
        // Clears the list
        // CODE HERE
    }

    //INCOMPLETE
    public boolean contains(E element) {
        // Returns whether the element exists in the list
        //CODE HERE
        return true;
    }

    //INCOMPLETE
    public boolean remove(E element) {
        // Removes elemenet from the list
        //CODE HERE
        return false;
    }

    
}