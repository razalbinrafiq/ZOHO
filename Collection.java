import java.io.*;
import java.util.*;
  
class Collection {
  
    public static void main(String[] args)
    {
        int intArray[] = new int[] { 1, 2, 3, 4, 5, 6 };
        System.out.println(intArray[5]);
        
        Vector<Integer> vector = new Vector();
        vector.addElement(1);
        vector.addElement(2);
        System.out.println(vector.elementAt(1));
        
        Hashtable<Integer, String> hTable = new Hashtable();
        hTable.put(1, "Dominic");
        hTable.put(2, "Toreto");
        System.out.println(hTable.get(1));

    }
}