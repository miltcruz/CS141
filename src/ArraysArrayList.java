import java.util.ArrayList;

public class ArraysArrayList {
   public static void main(String[] args) {
     // create array of int and print all value and length
     int[] numbers = {1, 2, 3, 4, 5};
     //numbers[5] = 6; // This will cause an ArrayIndexOutOfBoundsException because the array has only 5 elements (index 0 to 4)
     System.out.println("int[] length: " + numbers.length); // 5

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index " + i + ": " + numbers[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2); 
        //list.add("string"); // This will cause a compile-time error because the list is defined to hold Integer objects       
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6); // This will work because ArrayList can grow dynamically

        System.out.println("ArrayList size: " + list.size()); // 5

        for (int i = 0; i < list.size(); i++) {
            System.out.println("index " + i + ": " + list.get(i));
        }

        // while loop
        int index = 0;
        while (index < list.size()) {
            System.out.println("index " + index + ": " + list.get(index));
            index++;
        }


        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        list.add(123); // This will cause a compile-time error because the list is defined to hold String objects
        names.add("Charlie");

        for (String x : names) {
            System.out.println(x);
        }
   }
}
    