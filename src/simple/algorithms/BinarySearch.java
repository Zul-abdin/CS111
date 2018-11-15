package simple.algorithms;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while(firstIndex <= lastIndex){
            int midIndex = (firstIndex + lastIndex) / 2;
            int midNum = arr[midIndex];

            if(midNum == target){
                return midNum;

            } else if (midNum < target){
                firstIndex = midIndex + 1;

            } else {
                lastIndex = midIndex - 1;
            }
        }
        return -1;

    }

}
