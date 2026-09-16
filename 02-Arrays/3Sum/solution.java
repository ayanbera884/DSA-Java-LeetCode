import java.util.*;

public class solution {
public List<List<Integer>> threeSum(int[] nums){
    int n = nums.length;

    List<List<Integer>> result = new ArrayList<>();

    Arrays.sort(nums);

    for(int i = 0 ; i < n-2; i++){
        //skip duplicate in i;
        if(i > 0 && nums[i] == nums[i -1]){
            continue;
        }

        int left = i+1;
        int right = n -1;
        while(left < right){

            int sum  = nums[i] + nums[left] + nums[right];
            if(sum == 0){
                result.add(Arrays.asList(nums[i], nums[left] , nums[right]));

                left ++;
                right--;
            
            //skip left dupicate

            while(left < right && nums[left] == nums[left - 1]){
                left++;
            }

            //skip right duplicate
            while(left < right && nums[right] == nums[right + 1]) {
                right--;
            }

        }else if(sum < 0){
            left++;
        }else{
            right--;
        }

    }
}

        return result;
}

    public static void main(String args[]){
            int nums[] = {-1, 0, 1, 2, -1, -4};
            solution obj = new solution();

        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println(result);
    }
}
