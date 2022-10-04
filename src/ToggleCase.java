public class ToggleCase {
    public static String toggleCase(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0 ; i < sb.length() ; i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char uc = (char)('A' + ch - 'a');
                sb.setCharAt(i,uc);
            }
            else{
                char lc = (char)('a' + ch - 'A');
                sb.setCharAt(i,lc);
            }

        }
        return sb.toString();
    }
}
//'p' - 'a' = 'P' - 'A'