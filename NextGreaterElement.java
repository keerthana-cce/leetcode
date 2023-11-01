class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(s.isEmpty() == false && s.peek() <= nums[i%n]){
                s.pop();
            }
            if(i<n){
                if(s.isEmpty() == false)
                    arr[i] = s.peek();
                else
                    arr[i] = -1;
            }
            s.push(nums[i%n]);
        }
        return arr;
    }
}
