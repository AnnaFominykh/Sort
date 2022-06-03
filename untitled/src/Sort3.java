public class Sort3 {
    public void InsertionSort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int x = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > x ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = x;
        }
    }
}


