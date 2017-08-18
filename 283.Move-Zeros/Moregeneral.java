public class Solution {
    public void moveZeroes(int[] nums) {
        int zeros=0;
        int ones=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0&&nums[i]!=1){
                nums[j++]=nums[i];
            }
            else if(nums[i]==0){
                zeros++;
            }
            else{
                ones++;
            }
        }
        j--;
        for(int i=nums.length-zeros-1;i>=ones;i--){
            nums[i]=nums[j--];
        }
        for(int i=nums.length-zeros;i<nums.length;i++){
            nums[i]=0;
        }
        for(int i=0;i<ones;i++){
            nums[i]=1;
        }
    }
}
