package leetcode;

// A unique element can appear atmost twice nothing more than that
public class removeduplicatesmed {
    
    public static void removeduplicate(int[] arr){
        int n = arr.length;

        int index = 2;
        for(int i =2; i< n; i++){
            if( arr[i] != arr[index-2]){
                arr[index++] = arr[i];
            }
        }
        
        for(int i = 0; i < index; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};   // Expected output : 9 , arr = {0,0, 1,1 ,2,2 ,3,3 , 4};
        // System.out.println(removeduplicate(arr));
        removeduplicate(arr);
    }
}
