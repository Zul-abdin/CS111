package autolab.assignment4;

public class AppendRec {

    public static String appendNTimes(String original, int n){

        if ( n == 0){
            return original;
        } else {
            return original + appendNTimes(original, n - 1);
        }

    }

}
