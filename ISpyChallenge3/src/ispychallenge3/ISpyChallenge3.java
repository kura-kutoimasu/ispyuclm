package ispychallenge3;

import java.util.Scanner;


public class ISpyChallenge3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nah = "";
        int count = 0;
        int[] coins = {200,100,50,20,10,5 ,2  ,1  };
        int[] counts ={0  ,0  ,0 ,0 ,0 ,0 ,0  ,200};
        int sum = 0;
        int current = 0;
        int value = 200;
        while(counts[0]==0){
            print(counts);
            System.out.println();
            counts[7] -= coins[6];
            counts[6]++;

            if(counts[7]<=0)
                break;
            count++;
        }
        while(counts[0]==0){
            print(counts);
            System.out.println();
            counts[6] -= coins[5];
            counts[5]++;

            if(counts[6]<=0)
                break;
            count++;
        }
        while(counts[0]==0){
            print(counts);
            System.out.println();
            counts[5] -= coins[4];
            counts[4]++;

            if(counts[5]<=0)
                break;
            count++;
        }

        System.out.println(count);
    }
    
    public static void print(int[] array){
        for(int x=0;x<array.length;x++){
            System.out.print(array[x]+ " ");
        }
    }
    
}
