

public class solution {
    public int maxWater(int[] height){
        int left = 0;
        int right = height.length -1;
        int maxnumberWater = 0;

        while(left < right){
            
        int h = Math.min(height[left],height[right]);
        int width = right - left;
        int area = h * width;

        maxnumberWater = Math.max(maxnumberWater,area);

        if(height[left] < height[right]){
            left++;
        }else{
            right--;
        }
            
        }
        return maxnumberWater;
    }
}
