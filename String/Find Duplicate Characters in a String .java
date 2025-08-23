import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int n = s1.length();
        int[] du =new int[256];        
        for(int i=0;i<n;i++){
              du[s1.charAt(i)]++;  
        }
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(du[s1.charAt(i)] > 1){
                System.out.print(s1.charAt(i)+" ");
                du[s1.charAt(i)] = 0;
                flag = true;
            }
        }
        if(flag == false) System.out.println("No duplicates");       
    }   
}
