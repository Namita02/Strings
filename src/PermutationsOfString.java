public class PermutationsOfString {
    public static void permutationsOfAString(String s){
        int length = factorial(s.length());
        for(int i = 0 ; i < length ; i++){
            StringBuilder sb = new StringBuilder(s);
            int temp = i;
            for(int j = s.length()  ; j >= 1 ; j--){
                int remainder = temp % j;
                int quotient = temp / j ;
                System.out.print(sb.charAt(remainder));
                sb.deleteCharAt(remainder);
                temp = quotient;
            }
            System.out.println();
        }

    }
    public static int factorial(int num){
       int ans = 1;
        for(int i = 1 ; i <= num ; i++){
            ans = ans * i;
        }
        return ans;
    }
}
