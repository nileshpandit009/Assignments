package com.company.cdac.cop5;

public class Arrays4 {
    private static int[] array = new int[10];

    private static int currentIndex = -1;

    public static void main(String[] args) {
        System.out.println("Insert elements 1, 2, 3, 4, 5");
        for (int i = 0; i < 5; i++) {
            System.out.println("Element insertion success: " + (i+1) + "?  -->  " + addElement(i+1));
        }
        displayArray();

        System.out.println("Insert element 10 at index 9: success?  -->  " + addElementAt(10, 9));
        displayArray();
        System.out.println("Insert element 7 at index 6: success?  -->  " + addElementAt(7, 6));
        displayArray();
        System.out.println("Insert element 999 at index 11: success?  -->  " + addElementAt(999, 11));
        displayArray();
        System.out.println("Insert element 999 at index 1: success?  -->  " + addElementAt(999, 1));
        try {
            Thread.sleep(100);
            displayArray();
        } catch (InterruptedException ignored) {}

        System.out.println("Update element 99 at index 3: success?  -->  " + updateElementAt(99, 3));

        System.out.println("\nDisplay elements of array:");
        displayArray();
    }

    private static boolean addElement(int element) {
        try {
            array[++currentIndex] = element;
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    private static boolean addElementAt(int element, int index) {
        try {
            if (array[index] == 0) {
                array[index] = element;
                return true;
            } else {
                throw new UnsupportedOperationException("Non-zero element already exists!");
            }
        } catch (UnsupportedOperationException e) {
            System.err.println(e.getMessage());
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    private static boolean updateElementAt(int element, int index) {
        try {
            array[index] = element;
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    private static void displayArray() {
        for (int i : array) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
