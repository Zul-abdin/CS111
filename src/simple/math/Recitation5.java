package simple.math;

import rutgers.cs.IO;

public class Recitation5 {

    public static  int GCF (int x, int y){

        int GCF;   // Greatest Common Factor
        int GPGCF; // Greatest Possible GCF

        if ( x < y){

            int temp = x;
            x = y;
            y = temp;

        }

        GPGCF = x - y;

        if ( GPGCF > y){

            GPGCF = y;

        }

        for (GCF = GPGCF; GCF > 1; GCF--){

            if (x % GCF == 0 && y % GCF == 0){

                return GCF;

            }
        }
        return 1;
    }

    public static String SimplifyFraction(){

        System.out.print("Enter Numerator: ");
        int x = IO.readInt();

        System.out.print("Enter Denominator: ");
        int y = IO.readInt();

        int GCF = GCF(x, y);

        x /= GCF;
        y /= GCF;

        return x + "/" + y;
    }

    public static boolean isPrime (int x){

        if (x < 2){
            return false;
        }

        for(int i = 2; i < x; i++){

            if ( x % i == 0){

                return false;

            }

        }

        return true;

    }


}
