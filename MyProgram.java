import java.io.IOException;

public class MyProgram {
    public static void main(String[] args) {
        MyArrayList<String> terms1 = new MyArrayList<>();
        MySet<String> terms2 = new MySet<>();
        MyLinkedList<String> terms3 = new MyLinkedList<>();
        Counter<String> terms4 = new Counter<>();

        try {
            //Create a WordReader object to read words from a file.
            WordReader in = new WordReader("test.txt");
            String str = null;

            // Keep reading words while next word is not-null.
            while ((str = in.readWord()) != null) {
                terms1.add(str);
                terms2.add(str);
                terms3.add(str);
                terms4.add(str);
                //System.out.print(str+" ");
            }

            in.close(); // Close the file.

        } catch (IOException ex) {
            System.out.println("Error :" + ex);
            System.exit(1);
        }

        //@Test ArrayList
        for(int i=0; i<terms1.size();i++){
            System.out.print(terms1.get(i)+" ");
        }
        System.out.println("\n=====");
        //@Test MySet
        System.out.print(terms2.toString()+" ");

        System.out.println("\n=====");
        //@Test MyLinkedList
        for(int i=0; i<terms3.size();i++){
            System.out.print(terms3.get(i)+" ");
        }
        System.out.println("\n=====");
        //@Test Counter
        for(int i=0; i<terms4.sizeArray();i++){
            System.out.print(terms4.getString(i)+" ");
        }
        System.out.println("\n=====");
    }
}
