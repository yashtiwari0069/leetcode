class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) return new int[] {l+1, r+1};
            else if (sum < target) l++;
            else r--;
        }
        return new int[] {-1, -1}; // fallback
    }
}


       


/*
Mistakes I made:
1. Method return type was int[] but I didn't return anything → compile error.
2. Spelled num.length incorrectly as num.lenght.
3. Used System.out.print(num) which prints memory address instead of array.
4. Ignored the method parameters (numbers, target) and took new input using Scanner.
5. Wrote input code instead of solving the actual Two Sum logic.
6. Scanner not neede for input in leetcode
*/

// my own logic for this problem
    // one p is at the start and one p in the end
     // for(int i = 0; i < numbers.length ; i ++){
      //  for(int j = numbers.length ; j > 0 ; j++){
        //   int  sum =  numbers[i] + numbers[j];
         //  if(sum > target){
         //   break;
        //   } 
        //   else if ( sum < target){
            
        //   }
      //  }
    //  }
