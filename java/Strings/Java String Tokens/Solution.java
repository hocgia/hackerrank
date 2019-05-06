import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] rs = s.trim().split("[!,?._@\\'\\s]+");
        if (rs.length == 1 && rs[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(rs.length);
            for (String s1 : rs) {
                System.out.println(s1);
            }
        }
        scan.close();
    }
}

