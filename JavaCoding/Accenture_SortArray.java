/*
You are tasked with a complex matrix operation. 
You will need to input the size of the matrix and then provide the elements of the matrix. 
The main matrix must then be divided into two submatrices: one for even-indexed elements and the other for odd-indexed elements. 
Following this, you are required to sort both the even and odd matrices in ascending order. 
Finally, you must calculate and print the sum of the second largest numbers from both matrices.

For example:

Enter the size of the array: 5
Enter the element at the 0th index: 3
Enter the element at the 1st index: 4
Enter the element at the 2nd index: 1
Enter the element at the 3rd index: 7
Enter the element at the 4th index: 9

After sorting:
Sorted even array: 1 3 9
Sorted odd array: 4 7

The sum of the second largest numbers from both matrices is 7.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Secondnd_Sorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter"+ size+ "elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        ArrayList <Integer> even = new ArrayList<Integer>();
        ArrayList <Integer> odd = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        
        int secondLE = even.get(even.size()-2);
        int secondLO = odd.get(odd.size()-2);

        System.out.println("Sum of both secondLargest "+secondLE+secondLO);
    }
}