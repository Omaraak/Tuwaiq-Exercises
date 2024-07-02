import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //EX1
        System.out.println("Enter username: ");
        String userName = scanner.nextLine();

        if (userName.equals("Admin"))
            System.out.println("Welcome admin");
        else if (userName.equals("Superuser"))
            System.out.println("Welcome superuser");
        else
            System.out.println("Welcome user");


        //EX2
        System.out.println("Enter a num 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter a num 2: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter a num 3: ");
        int num3 = scanner.nextInt();

        if(num1 > num2 && num1 > num3)
            System.out.println(num1);
        else if(num2 > num1 && num2 > num3)
            System.out.println(num2);
        else
            System.out.println(num3);


        //EX3
        System.out.println("Enter a number (from 1 to 7): ");
        int dayNum = scanner.nextInt();

        switch (dayNum){
            case 1 -> System.out.println("Sun");
            case 2 -> System.out.println("Mon");
            case 3 -> System.out.println("Tue");
            case 4 -> System.out.println("Wed");
            case 5 -> System.out.println("Thu");
            case 6 -> System.out.println("Fri");
            case 7 -> System.out.println("Sat");
        }


        //EX4
        System.out.println("Enter a your marks (from 100): ");
        int grade = scanner.nextInt();

        if (grade>=90 && grade<=100) {
            System.out.println("You will get (A)");
        } else if (grade>=80) {
            System.out.println("You will get (B)");
        } else if (grade>=70) {
            System.out.println("You will get (C)");
        } else if (grade>=60) {
            System.out.println("You will get (D)");
        }else
            System.out.println("You will get (F)");


        //EX5
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if(age<13)
            System.out.println("Child");
        else if(age>=20)
            System.out.println("Adult");
        else
            System.out.println("Teenager");
    }
}
