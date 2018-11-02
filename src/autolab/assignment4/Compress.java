package autolab.assignment4;

public class Compress {

    public  static  String compress ( String original){

        int count = 1;
        char letter;
        String result = "";

        for(int i = 0; i < original.length(); i++){
            letter = original.charAt(i);
            if(i < original.length() - 1){
                if( original.charAt(i) == original.charAt(i + 1) ){
                    count++;
                } else if (count == 1) {
                    result += letter;
                } else {
                    result += String.valueOf(count) + letter;
                    count = 1;
                }
            } else if(count == 1) {
                result += letter;
            } else {
                result += String.valueOf(count) + letter;
            }
        }

        return result;

    }

}
