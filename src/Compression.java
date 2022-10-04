public class Compression {
public static String compression(String s){

    String str = s.charAt(0) + "";
    for( int i = 1 ; i < s.length() ; i++){
        if(s.charAt(i-1) == s.charAt(i)){
            continue;
        }else{
        str += s.charAt(i);}
    }
    return str;
}

}
