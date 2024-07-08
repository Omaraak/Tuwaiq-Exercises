import java.util.Scanner;

public class Exercise_Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //EX1
        System.out.println("EX1\nEnter first number: ");
        int ex1_num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int ex1_num2 = scanner.nextInt();

        System.out.println("Enter third number: ");
        int ex1_num3 = scanner.nextInt();

        System.out.println("The smallest value is: "+ find_min(ex1_num1,ex1_num2,ex1_num3));

        //EX2
        System.out.println("EX2\nEnter a number: ");
        int ex2_number = scanner.nextInt();
        cheek_number(ex2_number);

        //EX3
        System.out.println("EX3\n 1. A password must have at least eight characters.\n 2. A password consists of only letters and digits.\n 3. A password must contain at least two digits");

        System.out.print("Enter your password: ");
        String ex3_password = scanner.next();

        if(password_validation(ex3_password))
            System.out.println("Password is valid: "+ex3_password);
        else
            System.out.println("Password is not valid: "+ex3_password);
    }
    //EX1
    public static int find_min(int num1, int num2, int num3){
        int min;
        if(num1<num2 && num1<num3)
            min=num1;
        else if(num2<num1 && num2<num3)
            min=num2;
        else
            min=num3;
        return min;
    }
    //EX2
    public static void cheek_number(int num){
        if(num>0)
            System.out.println("Pos");
        else if(num<0)
            System.out.println("Neg");
        else
            System.out.println("Zero");
    }
    //EX3
    public static boolean password_validation(String password){
        String special_characters = "/^!@#$%^&*()_+\\-=[]{};':\"|,.<>/?";
        int num_conter = 0;
        if(password.length()>=8 && !password.contains(special_characters)){
            for(int i = 0; i < password.length(); i++) {
                if(Character.isDigit(password.charAt(i)))
                    num_conter++;
            }
        }
        return num_conter>=2;
    }
}
