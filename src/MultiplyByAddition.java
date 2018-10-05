public class MultiplyByAddition {
    public static void main(String[] args) {

        int product = 0;

        System.out.println("Gimme A");
        int a = IO.readInt();

        System.out.println("Gimme B");
        int b = IO.readInt();

        for(int i = a; i > 0; i--){
            product += b;
        }
        IO.outputIntAnswer(product);
    }
}
