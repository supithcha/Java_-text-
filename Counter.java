/**
* A generic implementation of the IList iterface.
*/
public class Counter<E> implements ICounter<E> {

    //Select one data structure that you prefer and explain why.
    MyArrayList<Count<E>> counts = new MyArrayList<>();
//    MyArrayList<Count<E>> counts = new MyArrayList<>();
//    MySet<Count<E>> counts = new MySet<>();
//    MyLinkedList<Count<E>> counts = new MyLinkedList<>();
    
    // INCOMPLETE.
    public int getCount(E element) {
        //CODE HERE
        return 0;
    }
    
    public String getString(int _index){
        return this.counts.get(_index).getObj().toString();
    }
    
    // INCOMPLETE.
    public boolean add(E element) {
        //CODE HERE
        return true;
    }

    // INCOMPLETE.
    public int size() {
        // Returns the total count of all items in the list.
        // CODE HERE
        return 0;
    }
    public int sizeArray() {
        return counts.size();
    }

    // INCOMPLETE.
    // Returns the count object related to element.
    // Returns null if the element does not exist.
    private Count<E> find(E element) {
        //CODE HERE
        return null;
    }

    // INCOMPLETE.
    public void clear() {
        //CODE HERE;
    }

    // INCOMPLETE.
    public boolean contains(E element) {
        //CODE HERE
        return true;
    }

    // INCOMPLETE.
    public boolean isEmpty() {
        //CODE HERE
        return true;
    }

    // INCOMPLETE.
    public boolean remove(E element) {
        //CODE HERE
        return true;
    }

}
