// GREEDY APPROACH
// activities start time and end times are given
// activities are sorted in non-decreasing order about end times
// highest occuring events of a day should be counted 
// TC--> O(n)
import java.util.ArrayList;

public class ActivitySelection {

    public static void main(String[] args) {

        ArrayList<Integer> activity = new ArrayList<>();
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};  //activities are sorted based on end time

        //as the 1st activity will end up first
        activity.add(0);
        int maxAct = 1;
        int lastEnd = end[0];

        for(int i=1; i<end.length; i++){
            if( lastEnd<=start[i] ){
                activity.add(i);
                maxAct++;
                lastEnd = end[i];
            }
        }

        System.out.println("Maximum activities= "+maxAct);
        for(int i=0; i<activity.size(); i++){
            System.out.print("A"+activity.get(i)+" ");
        }
    }
}
