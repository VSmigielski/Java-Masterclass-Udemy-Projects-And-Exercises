import java.util.ArrayList;

// Created a wrapper
class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        // String is not a primitive type
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Veronica");

        // Cannot do ArrayList<int> because it is a primitive type
        // Can create a class that accepts an int value and add the object to the ArrayList
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        // Autoboxing
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            // Auto convert i with the Integer class
            intArrayList.add(Integer.valueOf(i));
        }

        // Unboxing
        for (int i = 0; i <= 10; i++) {
            // Auto convert i with the Integer class
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        // New version after previous version was deprecated
        // Java converts this line to --> Integer.valueOf(56);
        Integer myIntValue = 56;

        // myInt.intValue();
        int myInt = myIntValue;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            // This is acceptable as well
            // double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}
