public class PalindromicSubstrings {
    public static void  palindromicSubstrings(String s){
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i + 1 ; j <= s.length() ; j++ ){
                String str = s.substring(i , j);
                int left = 0;
                int right = str.length() - 1;
                boolean palin = true;
                while (left <= right){
                    char c1 = str.charAt(left);
                    char c2 = str.charAt(right);
                    if(c1 != c2){
                        palin = false;
                        break;

                    }
                    else {
                        left++;
                        right--;

                    }
                    }
                if (palin == true) {
                    System.out.println(str);
                }
                }

        }

    }
}
