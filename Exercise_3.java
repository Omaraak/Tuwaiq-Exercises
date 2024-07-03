import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

//        //EX1
//        for(int i=1; i<=100; i++){
//            if(i%3 == 0 && i%5 == 0)
//                System.out.println("FizzBuzz");
//            else if(i%3 ==0)
//                System.out.println("Fizz");
//            else if(i%5 ==0)
//                System.out.println("Buzz");
//            else
//                System.out.println(i);
//        }

//        //EX2
//        System.out.println("Enter input: ");
//        String text = scanner.nextLine();
//        String newText="";
//
//        for (int i=text.length()-1; i>=0; i--){
//            newText+=text.charAt(i);
//        }
//        System.out.println(newText);
//
//        //EX3
//        System.out.println("Enter number to calculate the factorial of: ");
//        int userInput = scanner.nextInt();
//        int facNum=1;
//
//        while (userInput != 1){
//            facNum*=userInput;
//            userInput--;
//        }
//        System.out.println(facNum);

//        //EX4
//        int result=1;
//        System.out.println("Enter base number: ");
//        int baseNum = scanner.nextInt();
//
//        System.out.println("Enter power number: ");
//        int powerNum = scanner.nextInt();
//
//        for (int i=1; i<=powerNum ;i++){
//            result*=baseNum;
//        }
//        System.out.println(result);

//        //EX5
//        int osum=0;
//        int esum=0;
//        int userInput=0;
//        do {
//            System.out.println("Enter number or 0 to quite: ");
//            userInput = scanner.nextInt();
//
//            if (userInput%2 == 0)
//                esum+=userInput;
//            else
//                osum+=userInput;
//
//        }while (userInput != 0);
//        System.out.println("the sum od odd numbers: "+osum);
//        System.out.println("The sum of even number: "+esum);

//        //EX6
//        System.out.println("Enter number : ");
//        int userInput = scanner.nextInt();
//
//        String stat = "It is prime number";
//
//        if(userInput>0){
//            for(int i=2; i<userInput; i++){
//                if(userInput%i == 0) {
//                    stat="It is not prime number";
//                    break;
//                }
//            }
//            System.out.println(stat);
//        }
//        else{
//            System.out.println("it is not positive number");
//        }

//        //EX7
//        for (int i=1; i<=4; i++){
//            System.out.println("Week "+i);
//            for(int j=1; j<=7; j++){
//                System.out.println("Day "+j);
//            }
//        }


//        //EX8
//        System.out.println("Enter name: ");
//        String userInput = scanner.nextLine();
//
//        int i = 0;
//        int j = userInput.length()-1;
//        String stat ="palindrome";
//
//        while (i<j){
//            if (userInput.charAt(i) != userInput.charAt(j)) {
//                stat="not palindrome";
//                break;
//            }
//            i++;
//            j--;
//        }
//        System.out.println("It is " + stat);


    }
}
