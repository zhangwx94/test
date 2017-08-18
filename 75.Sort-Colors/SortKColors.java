class Solution {
    /**
     * @param colors: A list of integer
     * @param k: An integer
     * @return: nothing
     */
    public void sortColors2(int[] colors, int k) {
        // write your code here
        int low = 1, high = k;
        while(low<high){
            sortColor(colors,low++,high--);
        }
    }
    
    private void sortColor(int[] colors, int low, int high){
        int left = 0, right = colors.length-1;
        while(colors[left]<low) left++;
        while(colors[right]>high) right--;
        int mid = left;
        while(left<=mid&&mid<=right){
            if(colors[mid]==low&&mid>left) swap(colors,mid,left++);
            else if(colors[mid]==high&&mid<=right) swap(colors,mid,right--);
            else mid++;
        }
    }
    
    private void swap(int[] arr, int p1, int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
