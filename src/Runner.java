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

        System.out.println("First Half: " + firStr.substring(0, firStrLen / 2));
        System.out.println("Second Half: " + firStr.substring(firStrLen / 2));

        System.out.print("Enter Second String: ");
        String secStr = scan.nextLine();
        int secStrLen = secStr.length();

        if (firStrLen > secStrLen)
        {
            System.out.println(firStr + " is longer");
        }
        else if (secStrLen > firStrLen)
        {
            System.out.println(secStr + " is longer");
        }
        else if (secStrLen == firStrLen)
        {
            System.out.println("Both strings are the same length!");
        }


        if (firStr.compareTo(secStr) <= -1)
        {
            System.out.println(firStr + " is first alphabetically");
        }
        else if (firStr.compareTo(secStr) >= 1)
        {
            System.out.println(secStr + "is first alphabetically");
        }
        else if (firStr.equals(secStr))
        {
            System.out.println("The strings are the same");
        }


        if (firStr.indexOf(secStr) == -1)
        {
            System.out.println(secStr + " is NOT found in " + firStr);
        }
        else
        {
            System.out.print(secStr + " is found in " + firStr + " at index " + firStr.indexOf(secStr));
        }
    }
}
