//this is challenge 1
package ispychallenge;

import java.util.Scanner;
public class ISpyChallenge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long sum = 0;
        for(int x=1;x<1000;x++){
            if((x%3==0) || (x%5==0)){
                sum+=x;
            }
        }
        System.out.println(sum);
    }
    
}
