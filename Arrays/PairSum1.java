import java.util.ArrayList;

public class PairSum1 {

    public static boolean PairSum(ArrayList<Integer> list,int target){

        /*//Brute Force Approach Time Complexity=O(n^2)
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }*/

        // Optimal Approach Time Complexity=O(n) Two Pointer Approach for sorted array
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(PairSum(list, 10));
    }
}
// Find if any two numbers in the array add up to a specific target sum.
