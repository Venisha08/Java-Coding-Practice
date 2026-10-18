class Solution {
    public boolean isPalindrome(String s) {
        String  reverse = "";
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    for(int i = clean.length()-1; i >= 0; i--)
    {
        reverse = reverse + clean.charAt(i);
        
    }
       if(reverse.equals(clean))
       {
         return true;
       }
    return false;
     
    }
}