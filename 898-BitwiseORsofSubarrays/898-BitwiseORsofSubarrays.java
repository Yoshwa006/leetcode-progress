// Last updated: 8/18/2025, 6:01:27 PM
class Solution {
    
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> st=new HashSet<>();
        int cnt=0,n=arr.length;
        for(int i=0;i<n;i++){
            st.add(arr[i]);
            int curr=arr[i];
            for(int j=i-1;j>=0;j--){
                curr|=arr[j];
                if(curr==arr[j])break;
                arr[j]=curr;
                st.add(curr);
            }
        }
        return st.size();
    }
}