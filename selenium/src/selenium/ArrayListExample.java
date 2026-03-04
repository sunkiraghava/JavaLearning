package selenium;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> a = new ArrayList<String>();

        // Add elements
        a.add("rahul");
        a.add("raghav");

        // Print elements using for-each loop
        for (String val : a) {
            System.out.println(val);
        }

        // Check if element exists
        System.out.println(a.contains("rahul"));
    }
}