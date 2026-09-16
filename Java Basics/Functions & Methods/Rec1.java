public class Rec1 {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n - 1);
    }

    public static int printSumN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + printSumN(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int NthFibo(int n){
        if(n==0||n==1){
            return n;
        }
        return NthFibo(n-1)+NthFibo(n-2);
    }

    public static boolean isSort(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSort(arr,i+1);
    }

    public static int firstOccurrence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurrence(arr,key,i+1);
    }

    public static int lastOccurrence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurrence(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    public static int opPower(int x,int n){     //O(log n)
        if(n==0){
            return 1;
        }
        int halfPower=opPower(x,n/2)*opPower(x,n/2);
        if(n%2!=0){
            halfPower=x*halfPower;
        }
        return halfPower;
    }

    public static int tilingP(int n){
        if(n==0||n==1){
            return 1;
        }
        int verticalTiles =tilingP(n-1);
        int horizontalTiles=tilingP(n-2);
        return verticalTiles+horizontalTiles;
    }

    public static void removeDuplicate(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicate(str,idx+1,newStr,map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicate(str,idx+1,newStr.append(currChar),map);
        }
    }

    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        return friendsPairing(n-1)+ ((n-1)*friendsPairing(n-2));
    }

    public static void printBinaryStrings(int n,int lastPlace,StringBuilder str){
        if(n==0){
            System.out.println(str);
            return;
        }

        printBinaryStrings(n-1,0,str.append("0"));

        if(lastPlace==0){
            printBinaryStrings(n-1,1,str.append("1"));
        }
    }

    public static void main(String[] args) {
        int n = 11;
        printDec(n);
        System.out.println(factorial(n));

        System.out.println(printSumN(n));

        System.out.println(NthFibo(n));

        int arr[]={1,2,3,4,3};
        System.out.println(isSort(arr,0));

        int key=3;
        System.out.println(firstOccurrence(arr, key, 0));
        System.out.println(lastOccurrence(arr, key, 0));

        System.out.println(power(5,3));
        System.out.println(opPower(5,3));

        System.out.println(tilingP(5));

        String str="MyStudies".toLowerCase();
        removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);

        System.out.println(friendsPairing(3));

        printBinaryStrings(3,0,new StringBuilder(""));
    }
}

// Recursion : it used call stack . in case od recursion if the base condition is not mentioned then it leads to stack overflow.
