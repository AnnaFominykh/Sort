

public class Sort1 extends array{

    public void BubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            int min =arr[i];
            int min_i = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int x =arr[i];
               arr[i] = arr[min_i];
                arr[min_i] = x;
            }
            }

    }
}
