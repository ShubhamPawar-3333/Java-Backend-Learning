import java.util.Scanner;

public class InputOutput{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        String fullName = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Are you happy today? True/False: ");
        boolean mood = sc.nextBoolean();

        System.out.println();

        System.out.print("Name: "+ fullName + "\nAge: " + age + "\nSalary" + salary + "\nHappy?: " + mood);
        sc.close();

    }
}