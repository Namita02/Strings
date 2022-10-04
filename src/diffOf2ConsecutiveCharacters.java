public class diffOf2ConsecutiveCharacters {
    public static String diff(String s){
       StringBuilder sb = new StringBuilder();
       sb.append(s.charAt(0));
       for(int i = 1 ; i < s.length() ; i++) {
           char ch1 = s.charAt(i);
           char ch2 = s.charAt(i-1);
           int diff = ch1 - ch2 ;

           sb.append(diff);
           sb.append(ch1);
       }
       return sb.toString();
    }
}
//abcde
//a1b1c1d1e