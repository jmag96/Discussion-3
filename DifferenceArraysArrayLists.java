import java.util.ArrayList;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {

        // ----------- Using a regular array -----------
        // Arrays in Java are fixed in size. You must know how many elements you'll need.
        int[] numberArray = new int[3]; // Array of size 3

        // Adding values to the array by directly assigning them to an index
        numberArray[0] = 10;
        numberArray[1] = 20;
        numberArray[2] = 30;

        // Printing the array values
        System.out.println("Values in the array:");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Index " + i + ": " + numberArray[i]);
        }

        // ----------- Using an ArrayList -----------
        // ArrayLists can grow and shrink in size automatically. No need to declare the size up front.
        ArrayList<Integer> numberList = new ArrayList<>();

        // Adding values to the ArrayList using .add()
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40); // Notice: We can keep adding without worrying about size

        // Printing the ArrayList values
        System.out.println("\nValues in the ArrayList:");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println("Index " + i + ": " + numberList.get(i));
        }

        // ----------- Key Differences -----------
        System.out.println("\nSummary of differences:");

        System.out.println("- Array: fixed size, stores primitive types (like int), faster for simple tasks.");
        System.out.println("- ArrayList: flexible size, uses wrapper classes (like Integer), has built-in methods.");

        // Example of using a method only available in ArrayList
        numberList.remove(0); // Removes the first element
        System.out.println("\nAfter removing the first element, ArrayList becomes: " + numberList);
    }
}
