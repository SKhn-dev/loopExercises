import java.util.Scanner;

//This program asks user to input a number and displays times table
public class TimesTable {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("What times table would you like?: ");
        int timesTable= reader.nextInt(); //get input from user and stores it to timeTable
        for(int i=1;i<13;i++){ //loop through 12 iterations
            System.out.println(timesTable+" x "+i+" = "+timesTable*i);
        }

    }
}
