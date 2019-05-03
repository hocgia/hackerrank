import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int a = 0;
        while (line != null) {
            System.out.printf("%d %s\n", ++a, line);
            line = scanner.nextLine();
        }
        scanner.close();
    }
}

