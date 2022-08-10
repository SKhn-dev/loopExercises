
import java.util.Scanner;

//This program ask user to enter the number and displays the sum
// .e.g. if user enters 3 it will display 6: 1+2+3
public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        //int sumTo=reader.nextInt();
        String stringSumTo = reader.nextLine();
        int count = 1, result = 0;
        if (!stringSumTo.equals("")) {
            int sumTo=Integer.parseInt(stringSumTo);
            String output = "";
            while (count <= sumTo) {
                result += count;
                if (count == sumTo)
                    output += count + "=";
                else output += count + "+";
                count++;
            }
            System.out.println(output + result);
        } else {
            System.out.println("Not valid Input");
        }

    }
}

