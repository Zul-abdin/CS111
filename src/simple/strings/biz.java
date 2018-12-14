package simple.strings;

/*
 * For Question 14 on Final Review by Joseph
 */
public class biz {

    public static String bizarre(String str){
        if(str.indexOf(" ") == -1){
            if(str.length() % 2 == 0){
                return (StringMethods.reverse(str));
            } else {
                return str;
            }
        }
        int index = str.indexOf(" ");
        String sub = str.substring(0, index);
        if(sub.length() % 2 == 0){
            return StringMethods.reverse(sub) + " " + bizarre(str.substring(index + 1, str.length()));
        } else {
            return sub + " " + bizarre(str.substring(index + 1, str.length()));
        }
    }

}
