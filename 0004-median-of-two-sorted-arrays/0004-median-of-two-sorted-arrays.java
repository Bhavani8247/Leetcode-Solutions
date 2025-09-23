class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] concate = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, concate, 0, nums1.length);
        System.arraycopy(nums2, 0, concate, nums1.length, nums2.length);
        Arrays.sort(concate);
        int n=concate.length;
        if(n%2==0){
            return(concate[n/2 - 1]+concate[n/2])/2.0;
        }
        else{
            return concate[n/2];
        }  
    }
}