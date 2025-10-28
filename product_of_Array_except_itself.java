// Source  Leetcode
public class product_of_Array_except_itself {


    //MOST OPTIMAL SOLUTION
// Time Complexity: O(n)
// Space Complexity: O(1)
    class Solution {
        public int[] productExceptSelf(int[] nums) {
        
            int n = nums.length;
            int ans[] = new int[n];
            
            // Initialize ans array: The first element is set to 1 because
            // we will be multiplying prefix values from the left.
            ans[0] = 1;
            int suffix = 1;
    
            // Compute prefix product for each element
            // ans[i] stores the product of all elements before index i.
            for (int i = 1; i < n; i++) {
                ans[i] = ans[i - 1] * nums[i - 1];
            }
    
            // Compute suffix product and multiply with prefix product
            // suffix keeps track of the product of elements after index i.
            for (int i = n - 2; i >= 0; i--) {
                suffix *= nums[i + 1];  // Update suffix with the next element
                ans[i] *= suffix;       // Multiply suffix with the stored prefix product
            }
    
            // ans[i] now contains the product of all elements except nums[i]
            return ans;
        }
    }


    
    //OPTIMAL SOLUTION
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    
    
    
    class Solution2 {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int ans[] = new int[n]; // Final result array
            int prefix[] = new int[n]; // Stores prefix products
            int suffix[] = new int[n]; // Stores suffix products
    
            // Initialize prefix and suffix arrays
            prefix[0] = 1; // No elements before index 0, so prefix is 1
            suffix[n - 1] = 1; // No elements after last index, so suffix is 1
    
            // Compute prefix product for each element
            // prefix[i] stores the product of all elements before index i
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] * nums[i - 1];
            }
    
            // Compute suffix product for each element
            // suffix[i] stores the product of all elements after index i
            for (int i = n - 2; i >= 0; i--) {
                suffix[i] = suffix[i + 1] * nums[i + 1];
            }
    
            // Multiply prefix and suffix to get the result
            // ans[i] = product of all elements except nums[i]
            for (int i = 0; i < n; i++) {
                ans[i] = prefix[i] * suffix[i];
            }
    
            return ans;
        }
    }

    
}


