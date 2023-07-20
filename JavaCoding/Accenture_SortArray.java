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