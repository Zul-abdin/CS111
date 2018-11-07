package simple.arrays;

public class ArrayMethods {

    public static int uniqueNumbers(int[] arr){
        boolean unique;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            unique = true;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    unique = false;
                    count--;
                }
            }
            if(unique){
                count++;
            }
        }

        return count;
    }

    public static int uniqueNumbersV2(int[] arr){
        int unique = 0;

        for(int i = 0; i < arr.length; i++){
            int count = 0;

            for(int j = 0; j < arr.length; j++){

                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count < 2){
                unique++;
            }
        }
        return unique;
    }

    public static String arrayStringReverse(String str){

        char[] arr = new char[str.length()];
        for(int i = 0; i < arr.length; i ++){
            arr[i] = str.charAt(i);
        }
        String rev = "";
        for(int j = arr.length - 1; j >= 0; j --){
            rev += arr[j];
        }

        return rev;

    }

    public static double avg(int[] arr){
        double total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return total / arr.length;
    }

}
