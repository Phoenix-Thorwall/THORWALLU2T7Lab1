import java.util.Scanner;
public class Runner
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter First String: ");
        String firStr = scan.nextLine();
        int firStrLen = firStr.length();
        System.out.println("String Length: " + firStrLen);

        if (firStrLen % 2 == 0)
        {
            System.out.println("First Half: " + firStr.substring(0, firStrLen / 2));
            System.out.println("Second Half: " + firStr.substring(firStrLen / 2));
        }
        else
        {
            System.out.println("First Half: " + firStr.substring(0, firStrLen / 2));
            System.out.println("Second Half: " + firStr.substring(firStrLen / 2));
        }

        System.out.println("Enter Second String: ");



    }

}
