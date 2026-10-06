class Solution {
    public int[] twoSum(int[] nums, int target) {
        //solution first
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int i =0; i< nums.length;i++ ){
        //     for(int j =i+1; j< nums.length; j++){
        //         if(target == (nums[i]+nums[j])) {
        //           return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};
        //seconde approch 
       HashMap<Integer, Integer> map = new HashMap<>(); 
       for (int i = 0; i < nums.length; i++) 
       { int value = target - nums[i];
        if (map.containsKey(value))
         { return new int[]{map.get(value), i};
          }
           map.put(nums[i], i); 
           }
            return new int[]{};
             }
}