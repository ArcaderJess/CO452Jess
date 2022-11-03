package Week3;

import java.util.ArrayList;

public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();  
     Student nick = new Student(12345578, "Nick");
     //nick.print();

     Student jess = new Student( 22212392, "Jess");
     //jess.print();

     Student euan = new Student(22212345, "Euan");
     //euan.print();


    ArrayList<Student> students = new ArrayList<Student>();
     students.add(nick);
     students.add(jess);
     students.add(euan);

     for(Student student : students)
     {
        student.print();
     }

}
}
