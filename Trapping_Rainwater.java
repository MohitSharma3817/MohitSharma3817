public class Trapping_Rainwater {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    class Solution {
        public int trap(int[] height) {
            int n=height.length;
            int leftmax[]=new int[n];
            leftmax[0]=height[0];
            for(int i=1;i<n;i++){
                leftmax[i]=Math.max(height[i],leftmax[i-1]);
            }
            int rightmax[]=new int [n];
            rightmax[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--){
                rightmax[i]=Math.max(height[i],rightmax[i+1]);
    
            }
            int totalwatertrapped=0;
            for(int i=0;i<n;i++){
                int waterlevel=Math.min(leftmax[i],rightmax[i]);
                totalwatertrapped+=waterlevel-height[i];
            }
            return totalwatertrapped;
    
            
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)


    class Solution1 {
        public int trap(int[] height) {
    
            int ans=0;
            int leftmax=0,rightmax=0;
            int left=0,right=height.length-1;
            while(left<right){
                leftmax=Math.max(leftmax,height[left]);
                rightmax=Math.max(rightmax,height[right]);
                if(leftmax<rightmax){
                    ans+=leftmax-height[left];
                    left++;
                }
                else{
                    ans+=rightmax-height[right];
                    right--;
                }
            }
            return ans;
            
        }
    }
}