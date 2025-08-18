class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res= new int[n+m];
        int l1= nums1.length;
        int l2= nums2.length;
        for(int i=0; i<m; i++){
            res[i] = nums1[i];
        }
        for(int j=0; j<n; j++){
            res[m+j] = nums2[j];
        }
        Arrays.sort(res);
        for(int k=0; k<m+n; k++){
            nums1[k] = res[k];
        }
    }
}