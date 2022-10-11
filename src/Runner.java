public class Runner
{
    public static void main(String[]args)
    {
        String par1 = "I'm a string that will have one substring parameter!";
        String par2 = "I'm a string that will have two substring parameters!";
        String par1Sub = par1.substring(27,31);
        String par2Sub = par2.substring(14,31) + " " + par2.substring(14,18);
        System.out.println(par1Sub);
        System.out.println(par2Sub + "s");
    }
}
