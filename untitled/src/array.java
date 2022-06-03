
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class array {
    ArrayList<array_gs>arr=new ArrayList<>();
    int[] nummbers = new int[10500];
    Random random = new Random();
    public void arr(int i) {
        for (i = 0; i < nummbers.length; i++) {
            nummbers[i] = i;}

        for (i = 0; i < nummbers.length; i++) {
            int randomPosition = random.nextInt(nummbers.length);
            int temp = nummbers[i];
            nummbers[i] = nummbers[randomPosition];
            nummbers[randomPosition] = temp;
        }
        array_gs z = new array_gs();
        z.setX(i);
        arr.add(z);
    }
    public void out(){
        for (int i = 0; i < nummbers.length; i++){
            System.out.println(nummbers[i]);
        }


    }}



