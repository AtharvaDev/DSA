class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> combinations = new ArrayList<>();
        solve(k, n, combinations, 1);
        return ans;
    }
    
    public void solve(int k, int target, List<Integer> combinations, int index){
        if(k<=0){
            if(target ==0){
                ans.add(new ArrayList<>(combinations));
            }
            return;
        }
        for(int i=index;i<=9; i++){
            combinations.add(i);
            solve(k-1, target-i, combinations, i+1);
            combinations.remove(combinations.size()-1);
        }
        
    }
}