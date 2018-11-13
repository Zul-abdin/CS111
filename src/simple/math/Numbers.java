package simple.math;

public class Numbers {

    public static int reverseNumber(int number){

        int reverse = 0;
        int lastDigitOfNum;
        while(number != 0){
            lastDigitOfNum = number % 10;
            reverse = (reverse * 10)+ lastDigitOfNum;
            number /= 10;
        }
        return reverse;
    }
}
