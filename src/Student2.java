import java.util.Scanner;
public class Student2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**Student Details**");
        System.out.print("Name:");
          String name= sc.nextLine();
        System.out.print("House Number:");
        int Number = sc.nextInt();
        System.out.print("Road:");
       String rd = sc.next();

        System.out.print("Post Code:");
        String pc = sc.next();
        System.out.print("Mobile no.:");
        long mo = sc.nextLong();
    }
}
