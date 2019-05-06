import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        a = a.toLowerCase();
        b = b.toLowerCase();
        StringBuilder newA = new StringBuilder(a);
        StringBuilder newB = new StringBuilder(b);
        if (newA.length() == 0 || newB.length() == 0) {
            return true;
        }
        if (newA.length() == newB.length()) {
            for (int i = 0; i < newA.length(); i++) {
                for (int j = 0; j < newB.length(); j++) {
                    if (newA.charAt(i) == newB.charAt(j)) {
                        newB.deleteCharAt(j);
                        break;
                    }
                }
                if (i == newA.length() - 1 && newB.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}