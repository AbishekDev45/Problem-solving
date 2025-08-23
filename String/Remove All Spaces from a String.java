String modify(String s) {
       
        String s1 ="";
        int n =s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) != ' '){
                s1 += s.charAt(i);
            }
        }
        return s1;
