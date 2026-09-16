import java.util.*;

public class AL2 {

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        /*
         * //Brute Force Approach Time Complexity=O(n^2)
         * for(int i=0;i<height.size();i++){
         * for(int j=i+1;j<height.size();j++){
         * int ht=Math.min(height.get(i),height.get(j));
         * int width=j-i;
         * int currWater=ht*width;
         * maxWater=Math.max(maxWater,currWater);
         * }
         * }
         */

        // Optimal Approach Time Complexity=O(n) Two Pointer Approach
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            // Calculate Water Area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            // Update Pointers
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }

}
