package Fun;
import java.util.Scanner;
public class LuckFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name:");
        String name = input.nextLine();
        int number;
        int luck;
        int counter = 0;
        while(true) {
            System.out.println("Enter a Number between 1 -100 ");
            number = input.nextInt();
            if(number >100 || number <1)
                System.out.println("Number exceeds Range");
            else break;
        }
        while(true){
            luck = (int) (Math.random()*100);
            counter++;
            if(luck == number) break;
        }
        System.out.print(name+"'s luck Factor: ");
        if(counter>400)
            System.out.println("TRASH");
        else if(counter>200)
            System.out.println("Worse");
        else if(counter>100)
            System.out.println("Bad");
        else if(counter>75)
            System.out.println("Nothing Special");
        else if(counter>50)
            System.out.println("Normal");
        else if(counter>25)
            System.out.println("Good");
        else if(counter>5)
            System.out.println("Great");
        else if(counter>1)
            System.out.println("Insane");
        else if(counter==1)
            System.out.println("GOD MODE ON");
    }
}
