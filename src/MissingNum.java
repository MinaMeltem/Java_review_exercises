import java.util.Arrays;
import java.util.*;

public class MissingNum {

    public static void main(String[] args) {
        int[] A1 = {1, 3, 6, 4, 1, 2};  //5 +
        int[] A2 = {1, 2, 3};           //4 +
        int[] A3 = {-1, -3};            //1 +
        int[] A4 = {-1, 1, -3};         //2 -
        int [] A5 = {-5};               //1 +
        int [] A6 = {1,0};              //2 +
        int [] A7 = {7};                //1 +
        int [] A8 = {4, 5, 6, 2};        //1+

        System.out.println(smallestSq(A1));
        System.out.println(smallestSq(A2));
        System.out.println(smallestSq(A3));
        System.out.println(smallestSq(A4));
        System.out.println(smallestSq(A5));
        System.out.println(smallestSq(A6));
        System.out.println(smallestSq(A7));
        System.out.println(smallestSq(A8));
    }

    public static int smallestSq(int [] a){
        Arrays.sort(a);

        //Eliminate negative numbers
        List<Integer> pa = new ArrayList<>();
        for (int item : a) {
            if (item >= 0) pa.add(item);
        }

        //Empty or Single element array
        if(pa.isEmpty() || pa.get(0) > 1 ||  pa.size() == 1 && pa.get(0) !=1) return 1;

        for (int i = 0; i < pa.size()- 1; i ++) {
            if (pa.get(i+1)- pa.get(i) > 1 ) {
                return pa.get(i) + 1;
            }
        }
        return pa.get(pa.size()-1) +1;
    }
}

