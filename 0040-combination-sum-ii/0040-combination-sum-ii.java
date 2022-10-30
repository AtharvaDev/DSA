class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> tempList = new ArrayList<>(); 
        Arrays.sort(candidates);
        solve(candidates, target, 0, 0, tempList);
        return ans;
    }
    
    public void solve(int[] candidates,int target, int index, int sum,List<Integer> tempList){
        if(sum > target) return;
        if(sum == target) ans.add(new ArrayList(tempList));
        int n = candidates.length;
        for(int i=index; i<n ;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            tempList.add(candidates[i]);
            sum+=candidates[i];
            solve(candidates, target, i+1, sum, tempList);
            sum-=candidates[i];
            tempList.remove(tempList.size()-1);
        }
    }
}