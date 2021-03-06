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

    public static int[] removeNeg(int[] arr){
        int posNums = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                posNums++;
            }
        }
        int index = 0;
        int[] ans = new int[posNums];
        for(int j = 0; j < arr.length; j++){
            if(arr[j] >= 0){
                ans[index] = arr[j];
                index++;
            }
        }
        return ans;
    }

    public static void duplicates(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
    public static void print10TimesTable(){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
    public static int[][] rowSwap(int[][] arr, int row1, int row2){
        int[] temp = arr[row1];
        arr[row1] = arr[row2];
        arr[row2] = temp;
        return arr;
    }
    public static int[][] transpose(int[][] arr){
        int[][] result = new int[arr[0].length][arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }
    public static void print2DArrayOfInts(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void print1DArrayOfInts(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static String[][] StringCoordinates(int rows, int columns){
        String[][] arr = new String[rows][columns];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = "(" + i + ", " + j + ") ";
            }
        }
        return arr;
    }

}
