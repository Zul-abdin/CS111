package simple.strings;

public class StringMethods {

    public static String replace(String s, String o, String r){
        if(s.indexOf(o) == -1){
            return s;
        } else {
            String pre = new String(s.substring(0, s.indexOf(o)));
            String post = s.substring(pre.length() + o.length());
            s = pre + r + post;
            return replace(s, o, r);
        }
    }
    public static boolean isAnagram(String str1, String str2){
        int index;
        if(str1.length() != str2.length()) return false;
        for(int i = 0;i < str1.length(); i++){
            index = str2.indexOf(str1.charAt(i));
            if(index == -1) {
                return false;
            } else {
                str2 = str2.substring(0, index) + str2.substring(index + 1);
            }
        }
        return true;
    }

    public static String reverse(String str){
        String result = "";
        for(int i = str.length() - 1; i >= 0; i --){
            result += str.charAt(i);
        }
        return result;
    }

}
