
//in this we have to pass string or value in the command prompt.
public class CommandLineArgument {
    public static void main(String[] args) {
        int s = 0;
        for(int i= 0; i<args.length; i++){
            // System.out.println(args[i]);      // for print the string in the output.

            //using wrapper calss for adding the numbers. In this the number are passing as string so we are converting string into the integer number(by using wrapper class function:- parseXxx() ).
             s = s + Integer.parseInt(args[i]);
        }
        System.out.println("Sum is:- "+ s);
    }
}