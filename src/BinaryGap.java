import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinaryGap {

    public static void main(String[] args) {

        String number = Integer.toBinaryString(2520);
        System.out.println(number);
        char [] numberArray = number.toCharArray();//sorun var
        System.out.println(numberArray.toString());
        int zeroCounter = 0;
        ArrayList<Integer> gap = new ArrayList<>();

        for (int i = 0; i <= numberArray.length-1; i++) {
            if (numberArray[i] == 0) {
                zeroCounter++;
                gap.add(zeroCounter);

            } else if (numberArray[i] == 1) {
                zeroCounter = 0;
            }
        }
        Collections.sort(gap);
        System.out.println(gap.toString());


    }



}
