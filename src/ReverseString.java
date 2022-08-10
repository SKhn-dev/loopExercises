import java.util.Scanner;

//This program asks user to input text and displays the reserved text
public class ReverseString {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Input a string: ");
        String output="";
        char[] letters=reader.nextLine().toCharArray();
        //loop through the letters and save in a string variable
        String input="";
        for(int i=0;i<=letters.length-1;i++){
            input+=letters[i];
        }
        //loop for reversing the letters
        for(int i=letters.length-1;i>=0;i--){
            output+=letters[i];
        }
        System.out.println(input+" = "+output);
    }
}
