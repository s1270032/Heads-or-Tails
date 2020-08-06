import java.util.Random;
import java.util.Scanner;

class Coin{
    public static void main(String args[]){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

     System.out.println("Who are you?");
     String user = scan.nextLine();
     System.out.println("Hello,"+user+"!");
        
        System.out.println("Tossing a coin...");

        int head=0;
        int tail=0;

        for(int i=1;i<4;i++){
            int coin = rand.nextInt(5);
            if(coin/2==0){
                System.out.println("Round "+i+": Heads");
                head++;
            } else {
                System.out.println("Round "+i+": Tails");
                tail++;
            }
        }

        System.out.println("Heads: "+head+",Tails: "+tail);
        
        scan.close();
        
    }
}