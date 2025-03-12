import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};
        //total profit ->
        // int[] weight = {4, 8, 2, 6, 1};
        // int[] val = {12, 32, 40, 30, 50};
        // total profit --> 124
        int W = 50; //total capacity of the knapsack

        // ratio= value/weight --> per unit cost
        double ratio[][] = new double[val.length][2];

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;    //stroring indexes
            ratio[i][1] = val[i]/(double)weight[i];  //storing corresponding unit prices
        }

        //sorting 2D ratio array in non-decreasing order based on row 1 (ratio)
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1] ));

        int capacity = W;
        int finalVal = 0;
        // as the largest ration has higher value, so looping from last
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            // if the total weight of a bottle is lesser then the knapsack
            // the whole bottle will be included into the knapsack
            if(weight[idx]<=capacity){
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                //fractional part will be added in the knapsack
                finalVal += capacity*ratio[i][1];
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value "+finalVal);
    }
}
