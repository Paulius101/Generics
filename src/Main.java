package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("Hello");
        stringArray.add("World");

        customMethod(intArray);
        customMethod(stringArray);
    }


    static <T> void customMethod(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
