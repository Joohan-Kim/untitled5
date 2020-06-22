/*Joohan Kim
Import Scanner
Create scanner object
Create variable for number of words
make do loop
create print staement for user of how many words they want to print
define from 1-10
then create code so user can print the word
create for loop to control the wordamount
create if statement
create for loop even Index
create for loop odd Index
create return method
 */
import java.util.Scanner;

public class string {
    // this sets up the scanner
    public static Scanner Keyboard = new Scanner (System.in);
    public static void main(String[] args) { //main
        int wordAmount;
        // this loop asks for the number of words and makes sure it's between 1 and 10
        do {
            //print statement and scanner object  for how many words for user
            System.out.println("How many words will you type?");
                    wordAmount=  Keyboard.nextInt();
        }
        while (wordAmount < 1 || wordAmount> 10);
// creates a system for word typed
        for (int method = 1; method <= wordAmount; method++) {
            // print statemment for user
            System.out.println("Print the Word");
            String Wordcount = Keyboard.next();
            if (Wordcount .length() >= 2) {
                String words = result(Wordcount);
                System.out.println(words);
            }
        }
    }
    public static String result (String wordinput){
        StringBuilder evenword=new StringBuilder();
        StringBuilder oddword= new StringBuilder();
        int wordlength=  wordinput.length();
        //for loop for even index
        for (int evenIndex=0; evenIndex<=wordlength-1;evenIndex=evenIndex+2){
            char resultchar= wordinput.charAt(evenIndex);
            evenword.append(resultchar);
        }
        //for loop for odd index
        for (int oddIndex=1; oddIndex<=wordlength-1; oddIndex=oddIndex+2){
            char resultchar= wordinput.charAt(oddIndex);
            oddword.append(resultchar);
        }
        //return statement
        return evenword + " " + oddword;
    }
}