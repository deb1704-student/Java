package BackTracking;

public class BT1 {

    public static void changeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printArray(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;    //BackTracking Step
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr,0,100);
        printArray(arr);
    }
}

/*

Types of Backtracking
1. Decision
2. Optimization
3. Enumeration
*/
