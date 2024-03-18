
import java.util.Scanner;
public class Week5_task2 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter an year beetween 1800 - 3000: ");
        int year = input.nextInt();

        if(year >3000 || year < 1800)
        {
            System.out.println("Invalid Year Re-enter");
        }
        else if (year>1584 && (year % 4 == 0 || year % 4 == 0 && year % 100 != 0)) {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }
        input.close();
    }
}
