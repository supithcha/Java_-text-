import java.util.Arrays;

/**
* A generic implementation of the IList iterface.
*/
public class MyArrayList<E> implements IList<E> {
    private Object[] array;     // Generic Type Object
    private int size;           // Index
    private int capacity;       // Max size
    public MyArrayList() {
        //CODE HERE
    }
    public boolean add(E element) {
        // Adds element to the list, returns true on success and false otherwise.
        //CODE HERE
        return false;
    }
    public boolean contains(E element) {
        // Returns true when element is in the list, false otherwise.
        // CODE HERE
        return false;
    }
    public void clear() {
        //CODE HERE
    }
    public boolean isEmpty() {
        //CODE HERE
        return true;
    }
    public int size() {
        return 0;
    }
    // This line allows us to cast our object to type (E) without any warnings.
    // For further detais, please see: http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/SuppressWarnings.html
    @SuppressWarnings("unchecked") 
    public E get(int index) {
        return (E) this.array[index];
    }
    public int indexOf(E element) {
        //CODE HERE
        return -1;
    }
    public boolean remove(E element) {
        //CODE HERE
        return true;
    }
    public E set(int index, E element) {
        //CODE HERE
        E replaced = this.get(index);
        return replaced;
    }
    public String toString() {
        if (this.isEmpty()) {
            return "[]";
        }
        StringBuilder ret = new StringBuilder("[");
        for (int i=0;i<size;i++) {
            ret.append(this.get(i)).append(", ");
        }
        ret.deleteCharAt(ret.length()-1);
        ret.setCharAt(ret.length()-1, ']');
        return ret.toString();
    }
    
}
