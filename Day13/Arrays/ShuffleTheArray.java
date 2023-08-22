class Solution {
    public int[] shuffle(int[] nums, int n) {
      int arr[] =new int[2*n];
      for(int i=0;i<2*n;i++){
          arr[i] = i%2 ==0 ? nums[i/2]:nums[n+i/2];
      }
      return arr;
    }
}
