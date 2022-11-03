package Week1;

import helpers.InputReader;
public class Week1 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        String name = InputReader.getString("Enter your name > ");
        int id = InputReader.getInt("Enter your ID > ");
        System.out.println("Hello " + name);
        System.out.println("ID " + id);

        int length = InputReader.getInt("Enter Length > ");
        int height = InputReader.getInt("Enter Height > ");
        int Perimeter = (length + height) * 2;
        System.out.println("Result = " + Perimeter);

        double Number1 = InputReader.getDouble("Enter 1st Number > ");
        double Number2 = InputReader.getDouble("Enter 2nd Number > ");
        double Average = (Number1 + Number2) / 2;
        System.out.println("Result = " + Average);

        int Numbera = InputReader.getInt("Enter 1st Number > ");
        int Numberb = InputReader.getInt("Enter 2nd Number > ");

        System.out.println("Numbera" + Numbera);
        System.out.println("Numberb " + Numberb);

        int temp = Numbera;
        Numbera = Numberb;
        Numberb = temp;

        System.out.println("Numbera " + Numbera);
        System.out.println("Numberb " + Numberb);

        double total = 0;
        int count = 1;
        int amount = 5;
        
        while(count <= amount)
        {
            total = total + InputReader.getDouble("Enter number " + count + ": ");
            count = count + 1;
        }
         double average = total / amount;
         System.out.println("Average is " + average);

         int age = InputReader.getInt("Please Enter your age > ");
         final int Current_Year = 2022;
         int yearofbirth = Current_Year;
         System.out.println("Year of Birth is " + yearofbirth);
    } 
}
