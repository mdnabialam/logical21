package com.chatgpt;

public class ArrayConcat {

    public static void main(String[] args) {
        int[] arr1 = {12, 32, 14, 54};
        int[] arr2 = {45, 10, 99, 88};

        // Concatenate arr1 and arr2 into arr3
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        // Print the concatenated array
        System.out.print("arr3: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
}

