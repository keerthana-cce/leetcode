class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length-1;
        int mid,left=0,right=len;
        
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
        }
        if(target<nums[mid]){
            right=mid-1;
        }
        if(target>nums[mid]){
            left=mid+1;
        }
    }
    return -1;
}
}
