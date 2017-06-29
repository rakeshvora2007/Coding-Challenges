
import java.util.Arrays;

public class TwoSumsTargetValue {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for(int i=0; i<=nums.length-1;i++){
            for(int j=i+1; j<=nums.length-1; j++){
                
                if((nums[i] + nums[j]) == target){
                    indices[0] = i;
                    indices[1] = j;
                    
                }
                
            }
            
        }
        
        return indices;
      }
    
    public static void main(String[] args) {
        
        int[] nums = {2,4,8,1,3,7,9};
        Solution s = new Solution();
        int[] answer = s.twoSum(nums, 9);
        System.out.println(Arrays.toString(answer));
}
}
