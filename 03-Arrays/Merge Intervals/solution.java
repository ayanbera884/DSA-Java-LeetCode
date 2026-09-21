import java.util.*;

public class solution {
    public int[][] merged(int[][] intervals){

        int n = intervals.length;
        //step1 : sort 2d array
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> result = new ArrayList<>();

        //step2 : start with first interval;

        int start = intervals[0][0];
        int end = intervals[0][1];

        //check remainig intervals

        for(int i = 0; i < n ; i++){

            //if overlap

            if(intervals[i][0] <= end){
                end = Math.max(end , intervals[i][1]);
            }else{
                //if no overlap

                result.add(new int[] {start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        //add the last intervals

        result.add(new int[] {start , end});

        return result.toArray(new int [result.size()][]);
    }

    public static void main(String[] args) {
        
        // Input
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        // Create object
        solution obj = new solution();

        // Call merge()
        int[][] result = obj.merged(intervals);

        // Print result
        System.out.println("Merged Intervals:");

        for (int[] interval : result) {
            System.out.println(
                "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    
    }
}
