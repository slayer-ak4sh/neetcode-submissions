class Solution {
    public boolean isPalindrome(String s) {

        String a = s.toLowerCase().replaceAll("[\\s\\p{Punct}]", "");
        if(a.isEmpty() || a.length()==1) return true;

        //a = wasitacaroracatisaw
        int i=0;
        int j=a.length()-1;
        boolean ans = false;
        while(i<j){
            char c = a.charAt(i);
            char d = a.charAt(j);
            if(c==d){
                ans = true; 
            }else{
                return false;
            }
            i++;
            j--;
        }
        return ans;
    }
}
