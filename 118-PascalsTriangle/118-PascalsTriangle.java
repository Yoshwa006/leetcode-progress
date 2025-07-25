// Last updated: 7/25/2025, 8:54:19 AM
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        ans.add(curr);
        if(n == 1){
        return ans;
        }
        curr = new ArrayList<>();
        curr.add(1);
        curr.add(1);
        ans.add(curr);

        while(n-2 > 0){
            List<Integer> prev = ans.get(ans.size() -1);

            curr = new ArrayList<>();
            curr.add(1);

            for(int i=1; i<prev.size(); i++){
                curr.add(prev.get(i) + prev.get(i-1));
            }

            curr.add(1);
            ans.add(curr);
            n--;
        }

        return ans;
    }
}