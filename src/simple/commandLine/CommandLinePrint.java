package simple.commandLine;

public class CommandLinePrint {

    public static void main (String[] args) {
        // print the command line arguments
        // invoke like: java CommandLine CS111 is so cool
        for (int i = 0; i < args.length; i++ ) {
            System.out.println(args[i]);
        }
    }

}
