
/*A non-empty array A consisting of N integers and sorted in a non-decreasing order
(i.e. A[0] ≤ A[1] ≤ ... ≤ A[N−1]) is given.
The leader of this array is the value that occurs in more than half of the elements of A.

Given a non-empty array A consisting of N integers,sorted in a non-decreasing order, returns the leader of array A.
The function should return −1 if array A does not contain a leader.
For example A ={2,2,2,2,2,3,4,4,4,6}; should return −1, because the value that occurs most
frequently in the array, 2, occurs five times, and 5 is not more than half of 10*/


import java.util.*;

public class LeaderNum {
    public static void main(String[] args) {
        int [] A ={2,2,2,2,2,3,4,4,4,6}; // most freg. 2:5 , 5 !> 10/2, return -1
        int [] B = {1,1,1,1,50};         // most freg. 1:4 , 4 > 5/2,  return leader which is 1
        int [] C = {1,1};                // most freg. 1:2 , 2 > 2/2, return leader, 1
        int [] D = {2,2,2,2};            // most freg. 2:2 , 2 !> 4/2 , return leader ,2
        int [] E = {-1,-1};              // most freg.-1:2 , -1 !> 2/2 ,  return, -1
        System.out.println(leaderNum(A));
        System.out.println(leaderNum(B));
        System.out.println(leaderNum(C));
        System.out.println(leaderNum(D));
        System.out.println(leaderNum(E));

    }

    static int leaderNum (int A []){
        double halfOfSize = A.length / 2;

        Map<Integer, Integer> fregOfElem = new HashMap<>();
        int leaderKey = 0;
        int maxValue = 0;

        //If HashMap contains the key (array element), increase its value by 1, not add keys with the value of 1
        for(int i= 0; i<A.length; i++){
           if(fregOfElem.containsKey(A[i])){
               fregOfElem.put(A[i],fregOfElem.get(A[i])+1);
               if(fregOfElem.get(A[i]) > maxValue){
                   maxValue = fregOfElem.get(A[i]);
                   leaderKey = A[i];               }
           }else{
               fregOfElem.put(A[i] , 1);
           }
        }

        if(fregOfElem.get(leaderKey) > halfOfSize)
            return leaderKey;
        return -1;

    }

}
