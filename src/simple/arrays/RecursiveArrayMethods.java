package simple.arrays;

public class RecursiveArrayMethods {

    public static int recSum(int[] arr, int length){

        if(length == 1){
            return arr[0];
        } else {
            return arr[length - 1] + recSum(arr, length - 1);
        }
    }
    //Ask Daniel about this, might just be V1 .... maybe (index - 1) in line 19?
    public static int recSumV2(int[] arr, int index){

        if(index == arr.length){
            return 0;
        } else {
            return arr[index] + recSum(arr, index + 1);
        }
    }

    public static int findMax(int[] arr, int length){
        if(length == 1) return arr[0];

        int maxExcludingLastItem = findMax(arr, length - 1);

        if(arr[length - 1] > maxExcludingLastItem){
            return arr[length - 1];
        } else {
            return maxExcludingLastItem;
        }
    }
}
