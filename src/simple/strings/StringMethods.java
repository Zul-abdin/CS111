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

}
