public class Solution {
    public void sortColors(int[] nums) {
        int mid = 0, left = 0, right = nums.length-1;
        while(left<=mid&&mid<=right){
            if(nums[mid]==0&&left<mid)
                swap(nums,left++,mid);
            else if(nums[mid]==2&&right>mid)
                swap(nums,right--,mid);
            else
                mid++;
        }
    }
    
    private void swap(int[] arr, int p1, int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
