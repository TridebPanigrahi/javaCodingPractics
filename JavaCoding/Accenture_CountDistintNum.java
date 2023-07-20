
class Distinct{
    public static int CountDistint(int arr[], int n){
        int count=0;
        for (int i = 0; i < n; i++) {
            int flag =0;
            for (int j = i+1; j < n; j++) {
                if(arr[i]== arr[j]){
                    flag =1;
                    break;
                }
            }
            if(flag==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
       int arr [] = {12,34,12,23,34,34,54};
       System.out.println(CountDistint(arr, arr.length));
    }
}