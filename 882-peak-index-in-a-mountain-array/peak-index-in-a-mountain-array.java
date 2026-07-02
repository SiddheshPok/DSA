class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int n = arr.length;
        // for(int i = 1; i < n-1; i++){
        //     if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
        //         return i;
        //     }
        // }
        // return n-1;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;      
            if(arr[mid]<=arr[mid+1])
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return left;
    }
}