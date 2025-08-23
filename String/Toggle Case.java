class Solution {
    public String toggleCase(String s) {
        char[] arr = s.toCharArray();   
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch >= 'a' && ch <= 'z') {
                arr[i] = (char)(ch - 32);  
            } else if (ch >= 'A' && ch <= 'Z') {
                arr[i] = (char)(ch + 32);
            }
        }
        
        return new String(arr);  
    }
}
