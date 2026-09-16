public class Arr_4{
    public static int trappedRainwater(int height[]){
        int n = height.length;
        // Calculate Left Max Boundary - Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        // Calculate Right Max Boundary - Array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        // Loop
        for(int i=0;i<n;i++){
            // waterLevel = min(leftMax Boundary, rightMax Boundary)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

           // trapped water=waterLevel - height[i]
           trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int heights[] = {4,2,0,6,3,2,5};
        int result = trappedRainwater(heights);
        System.out.println("Trapped Rainwater: " + result);
    }

}
// Time Complexity of Trapped Rainwater: O(n), where n is the number of elements in the array.
