import java.lang.reflect.Array;

public class Sort2 extends array {
    public void  SelectionSort (int[] arr) {
        int x = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < (arr.length-i); j++){
                if(arr[j-1] > arr[j]){
                    x = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = x;
                }

            }
        }
    }}


