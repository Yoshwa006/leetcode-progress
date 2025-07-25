// Last updated: 7/25/2025, 8:53:01 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        // HashSet<Integer> set=new HashSet<>();
        // for(int i:nums){
        //     set.add(i);
        // }
        // for(int i=1;i<=nums.length;i++){
        //     if(!set.contains(i)){
        //         ans.add(i);
        //     }
        // }
        // return ans;
        int arr[]=new int[nums.length+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
        for(int i:nums){
            arr[i]=1;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0)ans.add(i);
        }
        return ans;
    }
}