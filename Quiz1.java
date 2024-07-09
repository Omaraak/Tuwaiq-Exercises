import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Q1 Write a Java program that accept three numbers from the user and print the largest number .
        int q1_num1,q1_num2,q1_num3,q1_max;

        System.out.println("Q1\nEnter the first number: ");
        q1_num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        q1_num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        q1_num3 = scanner.nextInt();

        if(q1_num1>=q1_num2 && q1_num1>=q1_num3)
            q1_max = q1_num1;
        else if(q1_num2>=q1_num1 && q1_num2>=q1_num3)
            q1_max = q1_num2;
        else
            q1_max = q1_num3;

        System.out.println("The largest value is: "+q1_max+"\n");


        //Q2 Write a Java program that accept a String and a number from the user,then print the character in the given index .
        String q2_string;
        int q2_number;

        System.out.println("Q2\nEnter a string: ");
        q2_string = scanner.next();

        System.out.println("Enter index to retrieve the latter: ");
        q2_number = scanner.nextInt();

        if(q2_number>q2_string.length())
            System.out.println("The index is out of bound"+"\n");
        else
            System.out.println(q2_string.charAt(q2_number)+"\n");


        //Q3 Write a program to enter the numbers till the user wants and at the end it should display the sum entered .
        System.out.println("Q3");
        int q3_sum=0;
        int q3_number;

        do {
            System.out.println("Enter a number or '0' to quit: ");
            q3_number = scanner.nextInt();

            q3_sum+=q3_number;

        }while(q3_number != 0);
        System.out.println("The sum is: "+q3_sum+"\n");

        //Q4 Write a Java program to find positive and negative numbers of a given array:
        Integer[] q4_array = {10, -21 , 30, 31, -25};
        System.out.println("Q4");

        for(int i=0; i<q4_array.length; i++){
            if(q4_array[i]>0)
                System.out.println(" "+q4_array[i]+" is a positive number");
            else
                System.out.println(q4_array[i]+" is a negative number");
        }
        System.out.println();

        //Q5 Write a Java program to find a shortest word of a given array:
        String[] q5_array = {"Tuwaiq","Bootcamp","Student","JAVA"};
        String q5_shortest_word = q5_array[0];
        for(String i: q5_array){
            if(i.length()<q5_shortest_word.length())
                q5_shortest_word = i;
        }
        System.out.println("Q5\nThe shortest string is: "+q5_shortest_word+"\n");
    }
}