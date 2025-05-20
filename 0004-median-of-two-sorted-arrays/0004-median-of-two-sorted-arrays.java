class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        if (n1 > n2) return findMedianSortedArrays(nums2, nums1);

        int start = 0, end = n1;
        int totalLength = n1 + n2;

        while (start <= end) {
            int mid1 = (start + end) / 2;
            int mid2 = (totalLength + 1) / 2 - mid1;

            int l1, l2, r1, r2;

            if (mid1 == 0) l1 = Integer.MIN_VALUE;
            else l1 = nums1[mid1 - 1];

            if (mid2 == 0) l2 = Integer.MIN_VALUE;
            else l2 = nums2[mid2 - 1];

            if (mid1 == n1) r1 = Integer.MAX_VALUE;
            else r1 = nums1[mid1];

            if (mid2 == n2) r2 = Integer.MAX_VALUE;
            else r2 = nums2[mid2];

            if (l1 <= r2 && l2 <= r1) {
                if (totalLength % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                end = mid1 - 1;
            } else {
                start = mid1 + 1;
            }
        }

        return 0.0; 
    }
}
