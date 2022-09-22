/**
 * Wrirte a Java program to reverse an array or integer values: [1, 7, 3, 10, 9].
 *
 * @author Kristel Talimaa *
 */
public class Homework4B {
    public static void main(String[] args) {

        int arr[] = {1, 7, 3, 10, 9};

        int x=arr.length;
        int start = 0;
        int end = x-1;
        while(start<end) {
            int reverse = arr[start];
            arr[start]=arr[end];
            arr[end]=reverse;
            start++;
            end--;
        }
        for(int i=0; i<x; i++) {
            System.out.println(arr[i] + "");
        }
    } // could have use for-loop here
}
