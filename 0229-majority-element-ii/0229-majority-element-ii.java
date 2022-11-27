class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count = n/3;
        // System.out.println(count);
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int x: nums){
            if(hm.containsKey(x)){
                hm.put(x, hm.get(x)+1);
            }else{
                hm.put(x, 1);
            }
            // System.out.println(hm.get(x));
            if(hm.get(x)==count+1){
                ans.add(x);
            }
        }
        // System.out.println(hm.get(nums[n-1]));
        // if(hm.get(nums[n-1])==count+1){
        //         ans.add(nums[n-1]);
        // }
        
        return ans;
    }
}