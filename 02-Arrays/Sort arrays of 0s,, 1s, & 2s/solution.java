

public class solution {
    public void sortColors(int[] nums){
        int low  = 0 ;
        int mid = 0;
        int high = 0;

        while (mid <= high){
            if(nums[mid] == 0){
                //swap mid and low

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                //swap mid and high

                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                
                high--;
            }
        }
    }
}
