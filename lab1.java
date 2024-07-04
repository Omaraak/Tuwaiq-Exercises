import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

//        //EX1
//        int add;
//        int subtract;
//        int multiply;
//        int divide;
//        int mod;
//
//        System.out.println("Enter num 1: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Enter num 2: ");
//        int num2 = scanner.nextInt();
//
//        add = num1+num2;
//        subtract = num1-num2;
//        multiply = num1 * num2;
//        divide = num1/num2;
//        mod = num1%num2;
//
//        System.out.println(num1+" + "+num2+" = "+add);
//        System.out.println(num1+" - "+num2+" = "+subtract);
//        System.out.println(num1+" x "+num2+" = "+multiply);
//        System.out.println(num1+" / "+num2+" = "+divide);
//        System.out.println(num1+" mood "+num2+" = "+mod);

//        //EX2
//        System.out.print("Enter a number: ");
//        int userInput = scanner.nextInt();
//
//        for(int i=1; i<=10; i++){
//            System.out.println(userInput + " x " + i + " = " + (i*userInput));
//        }

//        //EX3
//        double area = 0;
//        double perimeter = 0;
//
//        System.out.print("Enter radius: ");
//        double r = scanner.nextDouble();
//
//        perimeter = 2*3.14*r;
//        area = (r*r)*3.14;
//
//        System.out.println("Perimeter"+perimeter);
//        System.out.println("Area is: "+area);

        //EX4
//        double sum=0;
//        System.out.println("Enter the count of numbers: ");
//        int count = scanner.nextInt();
//
//        for (int i=1; i<=count; i++){
//            System.out.println("Enter integer: ");
//            sum+=scanner.nextInt();
//        }
//        System.out.println("The average is: "+sum/count);

//        //EX5
//        boolean condition;
//        System.out.println("Enter first number: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Enter second number: ");
//        int num2 = scanner.nextInt();
//
//        System.out.println("Enter third number: ");
//        int num3 = scanner.nextInt();
//
//        if(num1+num2 == num3){
//            condition=true;
//        }else{
//            condition=false;
//        }
//        System.out.println("The result is: "+condition);

//        //EX6
//        String newText="";
//        System.out.println("Enter the word: ");
//        String text = scanner.nextLine();
//
//        for (int i=text.length()-1; i>=0; i--){
//            newText+=text.charAt(i);
//        }
//        System.out.println(newText);

//        //EX7
//        String stat;
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//
//        if (num%2 == 0){
//            stat="Even";
//        }else{
//            stat="Odd";
//        }
//        System.out.println("The number is: "+stat);

//        //EX8
//        double f;
//        double c;
//
//        System.out.print("Enter the degree in celsius (c): ");
//        c = scanner.nextDouble();
//
//        f = c*9/5+32;
//
//        System.out.println("Temperature in fahrenheit is: "+f);

//        //EX9
//        System.out.println("Enter text: ");
//        String text = scanner.nextLine();
//
//        System.out.println("Enter a number: ");
//        int index = scanner.nextInt();
//
//        System.out.print(text.charAt(index));

//        //Ex10
//        double l,w,area,perimeter;
//
//        System.out.println("Enter the Width: ");
//        w = scanner.nextDouble();
//
//        System.out.println("Enter the length: ");
//        l = scanner.nextDouble();
//
//        area = w*l;
//        perimeter = 2*(w+l);
//
//        System.out.println("The area: "+area);
//        System.out.println("The perimeter: "+perimeter);

//        //EX11
//        System.out.println("Enter the first number: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Enter second number: ");
//        int num2 = scanner.nextInt();
//
//        if(num1 == num2){
//            System.out.println(num1+" = "+num2);
//            System.out.println(num1+" >= "+num2);
//            System.out.println(num1+" <= "+num2);
//        }
//        else
//            System.out.println(num1+" != "+num2);
//
//        if(num1>num2){
//            System.out.println(num1 +" > "+num2);
//            System.out.println(num1 +" >= "+num2);
//        }
//        else if(num1!=num2){
//            System.out.println(num1+" < "+num2);
//            System.out.print(num1+" <= "+num2);
//        }

//        //EX12
//        int h,m,s;
//
//        System.out.println("Enter number of seconds: ");
//        int userinput = scanner.nextInt();
//
//        s = userinput%60;
//        m = (userinput/60)%60;
//        h = (userinput/60/60)%60;
//        System.out.print("After convergent: "+h+":"+m+":"+s);

//        //EX13
//        System.out.println("Enter the first number: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Enter second number: ");
//        int num2 = scanner.nextInt();
//
//        System.out.println("Enter third number: ");
//        int num3 = scanner.nextInt();
//
//        System.out.println("Enter fourth number: ");
//        int num4 = scanner.nextInt();
//
//        if(num1 == num2 && num1 == num3 && num1 == num4){
//            System.out.println("The Number are equals");
//        }else{
//            System.out.println("The number are not equals");
//        }

//        //EX14
//        String stat;
//        System.out.println("Enter a number: ");
//        int num = scanner.nextInt();
//
//        if(num>=0)
//            stat="positive";
//        else
//            stat="negative";
//        System.out.println("The number is: "+stat);

//        //EX15
//        int p_count=0,n_count=0,z_count=0,number;
//        do {
//            System.out.println("Enter a number: ");
//            number = scanner.nextInt();
//
//            if(number == -1){
//                break;
//            }
//
//            if(number == 0){
//                z_count++;
//            } else if (number > 0) {
//                p_count++;
//            }else{
//                n_count++;
//            }
//        }while(true);

//        System.out.println("Number of positive number: "+p_count);
//        System.out.println("Number of zeros: "+z_count);
//        System.out.println("Number of negative numbers: "+n_count);

//        //EX16
//        int num, reversed = 0;
//        System.out.print("Enter a number: ");
//        num = scanner.nextInt();
//
//        while(num != 0) {
//            int digit = num%10;
//            reversed = reversed * 10 + digit;
//            num /= 10;
//        }
//        System.out.print("Reversed Number: " + reversed);
        

//        //EX17
//        int num,max,min;
//
//        System.out.println("Enter a number or 0 to quit");
//        num = scanner.nextInt();
//
//        max = min = num;
//
//        while (true) {
//            System.out.println("Enter a number or 0 to quit");
//            num = scanner.nextInt();
//
//            if(num == 0)
//                break;
//
//            if (num > max)
//                max = num;
//            else
//                min = num;
//        }
//        System.out.println("The largest value: "+max);
//        System.out.println("The smallest value is: "+min);

//        //EX18
//        int counter=0;
//
//        System.out.println("Enter text: ");
//        String text = scanner.nextLine();
//
//        for(int i=0; i<text.length()-1; i++){
//            if(text.charAt(i) == 'a'){
//                counter++;
//            }
//        }
//        System.out.print("Number of 'a' is: "+counter);
    }
}
