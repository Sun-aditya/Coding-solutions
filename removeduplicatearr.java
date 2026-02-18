package leetcode;

public class removeduplicatearr {

    public static int removeduplicate(int[] arr){
        int n = arr.length;

        int index = 1; 

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                arr[index] = arr[i];
                index++;
            }
        }

        return index;
    }

     public static int removeduplicate2(int[] arr){
        int n = arr.length;

        int index = 1; 

        return index;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeduplicate(arr));
    }
}