//this is challenge 2
package ispychallenge2;

import java.util.Scanner;

public class ISpyChallenge2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the word: ");
        String word = scan.next();
        System.out.println(isPalindrome(word.replaceAll(" ", "")));
    }
    public static boolean isPalindrome(String word){
        int last = word.length()-1;
        String begin;
        String end;
        for(int x=0;x<word.length()/2-1;x++){
            //to ignore cases
            begin = Character.toString(word.charAt(x)).toLowerCase();
            end = Character.toString(word.charAt(last-x)).toLowerCase();
            if(!begin.equals(end))
                return false;
        }
        return true;
    }
    
}
