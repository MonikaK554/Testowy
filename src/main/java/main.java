import java.util.Arrays;
import java.util.Scanner;

public class main {

    Scanner scanner = new Scanner(System.in);
    String pesel = scanner.nextLine();


    public boolean peselValidator () {


        System.out.println(Integer.parseInt(pesel.substring(2, 3)) <5);


        return true;
    }


    public static void main(String[] args) {
        main  main = new main();

        main.peselValidator();

    }
}



//|| month == 08