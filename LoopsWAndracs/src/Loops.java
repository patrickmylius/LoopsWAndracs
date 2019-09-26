import java.util.Scanner;


public class Loops {
    public static void main(String[] args) {

        /** Der er 4 slags løækker i Java
         * for, while, do while
         */

        // For loop from 0 till 100
        for (int i = 0; i <= 100; i++) {

        }

        // for loop from -2 till -1000
        for (int i = -2; i >= -1000; i--) {

        }

        // for loop from 42 till and = 77 with 6
        for (int i = 42; i <= 77; i = i + 5)
            System.out.println(i); {

        }

        /* while løkke */
        int w = 0;
        while ( w < 10 ) {
            w = w + 1;
            System.out.println("Uending loop, if not set to stop at 10" + w);
        }
        Scanner input = new Scanner(System.in);
        String besked;
        besked ="";

        while (!besked.equals("stop")) {
            besked = input.nextLine();
            System.out.println(besked + besked);
            /* Aslong as message is not stop, system keeps printing message x 2

             */
        }

        /* Do while loop */
        do {
            System.out.println("Something secret");
        } while (false);

    }
}
