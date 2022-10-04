public class Compression2{
    public static String compression2(String s){
        String str = s.charAt(0) + "";
        int count = 1;
        for(int i = 1 ; i < s.length() ; i ++){
            if(s.charAt(i - 1) == s.charAt(i)){
                count ++ ;
                continue;
            }
             if(count > 1){
                str += count;
                 count = 1;
            }

             str += s.charAt(i);

        }
        if (count > 1){
            str += count;
        }
        return str;
    }
}
