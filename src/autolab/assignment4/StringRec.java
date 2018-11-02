package autolab.assignment4;

public class StringRec {

    public static String decompress(String compressedText){

        if(compressedText.length() == 0){
            return "";
        } else if (compressedText.length() == 1) {
            return  compressedText.substring(0,1);
        } else {
            char index0 = compressedText.charAt(0);
            int numericIndex0 = Character.getNumericValue(index0);
            char index1 = compressedText.charAt(1);

            if (numericIndex0 == 0 && Character.isDigit(index0)) {
                return decompress(compressedText.substring(2));
            } else if (Character.isDigit(index0)) {
                return index1 + decompress( numericIndex0 - 1 + compressedText.substring(1));
            } else {
                return index0 + decompress(compressedText.substring(1));
            }
        }

    }

}
