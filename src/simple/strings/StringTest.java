package simple.strings;

public class StringTest {

    public static void main(String[] args) {
        String a = new String("Goodbye");
        String b = ourToUpperCase(a);
        String c = new String("Goodbye");
        String d = "Hello";
        String e = "Hello";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b)); // Will be false
        System.out.println(a == c); //Will be false
        System.out.println(d == e); //Will be true
        System.out.println(letterCount("goodbye", 'o'));
        System.out.println(letterCount("goodbye", 'a'));
    }

    //Returns str in full upper-case
    public static String ourToUpperCase (String str){
        String result = ""; //declare an empty string
        //traverse st, add each char to result in upper-case format
        for ( int i = 0; i <= str.length() - 1; i ++){
            char c = str.charAt(i); // gets char at index i
            result += Character.toUpperCase(c); //appends upper-case version of c to result
        }
        return result;
    }
    //returns # of c chars in str
    public static int letterCount (String str, char c){
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0; i <= str.length() - 1; i++){
            if(str.charAt(i) == Character.toLowerCase(c)){
                count++;
            }
        }
        return count;
    }

}
