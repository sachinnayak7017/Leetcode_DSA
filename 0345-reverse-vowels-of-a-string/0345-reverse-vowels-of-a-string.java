class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i =0, j= s.length()-1;

        while(i <j){
            
            if(!isVowel(ch[i])){
              i++;
            }
            else if(!isVowel(ch[j])){
              j--;
            }else{
                char temp = ch[j];
                ch[j] =ch[i];
                ch[i] = temp;
                i++;
                j--;
            }
        }
      return String.valueOf(ch);        

    }
    public static boolean isVowel(char ch){
         if(ch=='a' || ch=='e' || ch=='o'|| ch=='i'|| ch=='u'|| ch =='A' || ch=='E' || ch=='O'|| ch=='I'|| ch=='U'){
              return true;
            }
            return false;
    }
}