import java.util.*;

public class Strings1 {

    public static void fullname(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // East
            else if (dir == 'E') {
                x++;
            }
            // West
            else {
                y--;
            }
        }
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static String compress(String str){
        String newStr="";
        for(int i=0;i<str.length()-1;i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;

    }

    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are immutable
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length()); // String Length
        String str3 = str + " " + str2; // String Concatenate

        System.out.println(str3); // String.charAt(index)
        fullname(str3);

        String s = "racecar"; // Check if Palindrome
        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not A Palindrome");
        }

        String path = "WNEENESENNN"; // Direction Solving Problem(Distance Formula)
        System.out.println(getShortestPath(path));
        // String Comparison str1.equals(str2)
        String s1 = "DEB";
        String s2 = "DEB";
        String s3 = new String("DEB");

        if (s1 == s2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        if (s1 == s3) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        if (s1.equals(s3)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        // End of Comparison

        // Substring str.substring(start index,end index)
        String stri = "HelloWorld";
        System.out.println(stri.substring(0, 5));
        System.out.println(substring(stri, 0, 7));
        // end of substring

        // Largest String str1.compareTo(str2) ==> 0:equal <0:-ve str1<str2 >0:+ve
        // str1>str2
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
        // end of largest string

        // String Builder
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
        // End String Builder

        // Uppercase every first letter of each word
        String st = "hi, i am deb";
        System.out.println(toUpperCase(st));
        //end of uppercase

        //String Compression
        String stt="aaabbccccddd";
        System.out.println(compress(stt));

        //End of Compression
        sc.close();
    }
}

