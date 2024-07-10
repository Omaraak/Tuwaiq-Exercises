import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exceptions {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        //EX1
        int ex1_num1,ex1_num2,ex1_add,ex1_subtract,ex1_multiply,ex1_divide,ex1_mod;
        try {
            System.out.println("Enter num 1: ");
            ex1_num1 = scanner.nextInt();

            System.out.println("Enter num 2: ");
            ex1_num2 = scanner.nextInt();

            ex1_add = ex1_num1 + ex1_num2;
            ex1_subtract = ex1_num1 - ex1_num2;
            ex1_multiply = ex1_num1 * ex1_num2;
            ex1_divide = ex1_num1 / ex1_num2;
            ex1_mod = ex1_num1 % ex1_num2;

            System.out.println(ex1_num1 + " + " + ex1_num2 + " = " + ex1_add);
            System.out.println(ex1_num1 + " - " + ex1_num2 + " = " + ex1_subtract);
            System.out.println(ex1_num1 + " x " + ex1_num2 + " = " + ex1_multiply);
            System.out.println(ex1_num1 + " / " + ex1_num2 + " = " + ex1_divide);
            System.out.println(ex1_num1 + " mood " + ex1_num2 + " = " + ex1_mod);
        }catch(ArithmeticException e){
            System.out.println("EX1 ArithmeticException");
        }catch (InputMismatchException e){
            System.out.println("EX1 InputMismatchException");
        }

        //EX2
        int ex2_userInput;
        try {
            System.out.print("Enter a number: ");
            ex2_userInput = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(ex2_userInput + " x " + i + " = " + (i * ex2_userInput));
            }
        }catch(InputMismatchException e){
            System.out.println("EX2 InputMismatchException");
        }

        //EX3
        double ex3_area=0, ex3_perimeter=0, ex3_r;

        try {
            System.out.print("Enter radius: ");
            ex3_r = scanner.nextDouble();

            ex3_perimeter = 2 * 3.14 * ex3_r;
            ex3_area = (ex3_r * ex3_r) * 3.14;

            System.out.println("Perimeter"+ex3_perimeter);
            System.out.println("Area is: "+ex3_area);
        }catch(InputMismatchException e){
            System.out.println("EX3 InputMismatchException");
        }

        //EX4
        double ex4_sum=0;
        int ex4_count;

        try {
            System.out.println("Enter the count of numbers: ");
            ex4_count = scanner.nextInt();

            for (int i = 1; i <= ex4_count; i++) {
                System.out.println("Enter integer: ");
                ex4_sum += scanner.nextInt();
            }
            System.out.println("The average is: " + ex4_sum / ex4_count);
        }catch (InputMismatchException e){
            System.out.println("EX4 InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println("EX4 ArithmeticException");
        }finally {
            System.out.println("EX4 finally");
        }

        //EX5
        boolean ex5_condition;
        int ex5_num1,ex5_num2,ex5_num3;

        try {
            System.out.println("Enter first number: ");
            ex5_num1 = scanner.nextInt();

            System.out.println("Enter second number: ");
            ex5_num2 = scanner.nextInt();

            System.out.println("Enter third number: ");
            ex5_num3 = scanner.nextInt();

            ex5_condition = ex5_num1 + ex5_num2 == ex5_num3;
            System.out.println("The result is: " + ex5_condition);
        }catch (InputMismatchException e){
            System.out.println("EX5 InputMismatchException");
        }

        //EX6
        String ex6_text,ex6_newText="";

        try {
            System.out.println("Enter the word: ");
            ex6_text = scanner.nextLine();

            for (int i = ex6_text.length() - 1; i >= 0; i--) {
                ex6_newText += ex6_text.charAt(i);
            }
            System.out.println(ex6_newText);
        }catch (InputMismatchException e){
            System.out.println("EX6 InputMismatchException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("EX6 IndexOutOfBoundsException");
        }catch (NullPointerException e){
            System.out.println("EX6 NullPointerException");
        }

        //EX7
        String ex7_stat;
        int ex7_num;

        try {
            System.out.print("Enter a number: ");
            ex7_num = scanner.nextInt();

            if (ex7_num % 2 == 0) {
                ex7_stat = "Even";
            } else {
                ex7_stat = "Odd";
            }
            System.out.println("The number is: " + ex7_stat);
        }catch (InputMismatchException e){
            System.out.println("EX7 InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println("EX7 ArithmeticException");
        }

        //EX8
        double ex8_f,ex8_c;

        try {
            System.out.print("Enter the degree in celsius (c): ");
            ex8_c = scanner.nextDouble();

            ex8_f = ex8(ex8_c);

            System.out.println("Temperature in fahrenheit is: " + ex8_f);
        }catch (InputMismatchException e){
            System.out.println("EX8 InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println("EX8 throw ArithmeticException");
        }

        //EX9
        String ex9_text;
        int ex9_index;
        try {
            System.out.println("Enter text: ");
            ex9_text = scanner.nextLine();

            System.out.println("Enter a number: ");
            ex9_index = scanner.nextInt();

            System.out.print(ex9_text.charAt(ex9_index));
        }catch (InputMismatchException e){
            System.out.println("EX9 InputMismatchException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("EX9 IndexOutOfBoundsException");
        }

        //Ex10
        double l,w,area,perimeter;

        try {
            System.out.println("Enter the Width: ");
            w = scanner.nextDouble();

            System.out.println("Enter the length: ");
            l = scanner.nextDouble();

            area = w * l;
            perimeter = 2 * (w + l);

            System.out.println("The area: " + area);
            System.out.println("The perimeter: " + perimeter);
        }catch (InputMismatchException e){
            System.out.println("EX10 InputMismatchException");
        }

        //EX11
        int ex11_num1,ex11_num2;

        try {
            System.out.println("Enter the first number: ");
            ex11_num1 = scanner.nextInt();

            System.out.println("Enter second number: ");
            ex11_num2 = scanner.nextInt();

            if (ex11_num1 == ex11_num2) {
                System.out.println(ex11_num1 + " = " + ex11_num2);
                System.out.println(ex11_num1 + " >= " + ex11_num2);
                System.out.println(ex11_num1 + " <= " + ex11_num2);
            } else
                System.out.println(ex11_num1 + " != " + ex11_num2);

            if (ex11_num1 > ex11_num2) {
                System.out.println(ex11_num1 + " > " + ex11_num2);
                System.out.println(ex11_num1 + " >= " + ex11_num2);
            } else if (ex11_num1 != ex11_num2) {
                System.out.println(ex11_num1 + " < " + ex11_num2);
                System.out.print(ex11_num1 + " <= " + ex11_num2);
            }
        }catch (InputMismatchException e){
            System.out.println("EX11 InputMismatchException");
        }

        //EX12
        int ex12_user_input;

        try {
            System.out.println("Enter number of seconds: ");
            ex12_user_input = scanner.nextInt();

            ex12(ex12_user_input);
        }catch(InputMismatchException e){
            System.out.println("EX12 InputMismatchException");
        }


        //EX13
        try {
            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.println("Enter third number: ");
            int num3 = scanner.nextInt();

            System.out.println("Enter fourth number: ");
            int num4 = scanner.nextInt();

            if (num1 == num2 && num1 == num3 && num1 == num4) {
                System.out.println("The Number are equals");
            } else {
                System.out.println("The number are not equals");
            }
        }catch(InputMismatchException e){
            System.out.println("EX13 InputMismatchException");
        }

        //EX14
        String stat;
        int num;

        try {
            System.out.println("Enter a number: ");
            num = scanner.nextInt();

            if (num >= 0)
                stat = "positive";
            else
                stat = "negative";
            System.out.println("The number is: " + stat);
        }catch(InputMismatchException e){
            System.out.println("EX14 InputMismatchException");
        }

        //EX15
        int p_count=0,n_count=0,z_count=0,number;

        try {
            do {
                System.out.println("Enter a number: ");
                number = scanner.nextInt();

                if (number == -1) {
                    break;
                }

                if (number == 0) {
                    z_count++;
                } else if (number > 0) {
                    p_count++;
                } else {
                    n_count++;
                }
            } while (true);
        }catch(InputMismatchException e){
            System.out.println("EX15 InputMismatchException");
        }

        System.out.println("Number of positive number: "+p_count);
        System.out.println("Number of zeros: "+z_count);
        System.out.println("Number of negative numbers: "+n_count);

        //EX16
        try {
            int ex16_num, ex16_reversed = 0;
            System.out.print("Enter a number: ");
            ex16_num = scanner.nextInt();

            while (ex16_num != 0) {
                int digit = ex16_num % 10;
                ex16_reversed = ex16_reversed * 10 + digit;
                ex16_num /= 10;
            }
            System.out.print("Reversed Number: " + ex16_reversed);
        }catch (InputMismatchException e){
            System.out.println("EX16 InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println("EX16 ArithmeticException");
        }


        //EX17
        int ex17_num,ex17_max,ex17_min;

        try {
            System.out.println("Enter a number or 0 to quit");
            ex17_num = scanner.nextInt();
            ex17_max = ex17_min = ex17_num;

            while (true) {
                System.out.println("Enter a number or 0 to quit");
                ex17_num = scanner.nextInt();

                if(ex17_num == 0)
                    break;

                if (ex17_num > ex17_max)
                    ex17_max = ex17_num;
                else
                    ex17_min = ex17_num;
        }
        System.out.println("The largest value: "+ex17_max);
        System.out.println("The smallest value is: "+ex17_min);
        }catch (InputMismatchException e){
            System.out.println("EX17 InputMismatchException");
        }

        //EX18
        int ex18_counter=0;
        String ex18;

        try {
            System.out.println("Enter text: ");
            ex18 = scanner.nextLine();

            for (int i = 0; i < ex18.length() - 1; i++) {
                if (ex18.charAt(i) == 'a') {
                    ex18_counter++;
                }
            }
            System.out.print("Number of 'a' is: " + ex18_counter);
        }catch (InputMismatchException e){
            System.out.println("EX18 InputMismatchException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("EX18 IndexOutOfBoundsException");
        }
    }
    //EX8
    public static double ex8(double ex8_c) throws ArithmeticException{
        if(ex8_c == 0)
            throw new ArithmeticException();
        return ex8_c * 9 / 5 + 32;
    }
    //EX12
    public static void ex12(int ex12_user_input) throws ArithmeticException{
        int ex12_h,ex12_m,ex12_s;

        ex12_s = ex12_user_input%60;
        ex12_m = (ex12_user_input/60)%60;
        ex12_h = (ex12_user_input/60/60)%60;
        System.out.print("After convergent: "+ex12_h+":"+ex12_m+":"+ex12_s);
    }

}
