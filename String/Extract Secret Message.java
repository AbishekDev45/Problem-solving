import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine().toUpperCase();
        String s2 = s.nextLine().toUpperCase();
        String result = s1.replace(s2, "");
        System.out.println(result);       
    }
}
