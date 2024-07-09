import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //EX1
        System.out.println("EX1");
        String[] ex1_array = {"cat","dog","red","is","am"};
        int ex1_max = ex1_array[0].length();

        //finding the longest value
        for(String i: ex1_array){
            if(i.length() > ex1_max)
                ex1_max=i.length();
        }
        //printing all occurrences
        for(String i: ex1_array){
            if(i.length() == ex1_max)
                System.out.print("\""+i+"\", ");
        }
        System.out.println("\n");

        //EX2
        System.out.println("EX2");
        Integer[] ex2_array = {1,1,1,3,3,5};
        ArrayList<Integer> ex2_num_to_check = new ArrayList<>();
        int ex2_user_num;

        //Collecting the numbers to check for
        do {
            System.out.println("Enter a number to see if it appeared in the array or '0' to stop: ");
            ex2_user_num = scanner.nextInt();
            if(ex2_user_num != 0)
                ex2_num_to_check.add(ex2_user_num);
        }while(ex2_user_num != 0);

        //Check if the number are in the array
        for(int i: ex2_num_to_check){
            //counter for the current number
            int counter=0;
            for(int j: ex2_array){
                if(i == j)
                    counter++;
            }
            System.out.println(i+" occur "+counter+" times");
        }
        System.out.println();

        //EX3
        int ex3_k;
        Integer[] ex3_array = {1,2,3,4,5,12,33};

        System.out.println("EX3\nEnter the k value");
        ex3_k = scanner.nextInt();

        if(ex3_k>0){
            //sort them from biggest to smallest
            for (int i = 0; i < ex3_array.length - 1; i++) {
                for (int j = 0; j < ex3_array.length - i - 1; j++) {
                    if (ex3_array[j] < ex3_array[j + 1]) {
                        int temp = ex3_array[j];
                        ex3_array[j] = ex3_array[j + 1];
                        ex3_array[j + 1] = temp;
                    }
                }
            }
            for(int i=0; i<ex3_k; i++){
                System.out.print(ex3_array[i]+", ");
            }

            System.out.println("\n");
        }else
            System.out.println("value is not valid");

        //EX4
        System.out.println("EX4");
        int[] ex4_arr = {5,4,3,2,1};

        System.out.println("Array after the reversing: "+Arrays.toString(reversed(ex4_arr))+"\n");

        //EX5
        ArrayList<Integer> ex5_arr = new ArrayList<>();
        int ex5_choice,ex5_check_val;
        String ex5_is_in_the_arr=" is NOT in the array";


        //Print options
        System.out.println("EX5\n1. Add an elements to the array\n2. Display the array\n3. Search for an element within the array\n4. Sort the array from low to high \n5. To Stop");

        do {
            System.out.println("\nEnter your choice: ");
            ex5_choice= scanner.nextInt();

            //add
            if(ex5_choice == 1){
                System.out.println("Enter a value to be added to the array: ");
                ex5_arr.add(scanner.nextInt());
            }
            //display
            else if(ex5_choice == 2){
                System.out.println(ex5_arr);
            }
            //search
            else if(ex5_choice == 3){
                System.out.println("Enter the value:");
                ex5_check_val = scanner.nextInt();

                for(Integer i: ex5_arr){
                    if(i == ex5_check_val){
                        ex5_is_in_the_arr=" is in the array";
                        break;
                    }
                }
                    System.out.println("The value "+ex5_check_val+ex5_is_in_the_arr);
            }
            //sort
            else if(ex5_choice == 4){
                for (int i = 0; i < ex5_arr.size() - 1; i++) {
                    for (int j = 0; j < ex5_arr.size() - i - 1; j++) {
                        if (ex5_arr.get(j) > ex5_arr.get(j+1)) {
                            int temp = ex5_arr.get(j);
                            ex5_arr.set(j, ex5_arr.get(j+1));
                            ex5_arr.set(j+1, temp);
                        }
                    }
                }
                System.out.println("The array after the sorting: "+ex5_arr);
            }else if(ex5_choice != 5)
                System.out.println("Try again");

        }while(ex5_choice!=5);

        //EX6
        int ex6_min,ex6_max,ex6_seq_num;

        //Taking user input
        System.out.println("EX6\nEnter the min val: ");
        ex6_min = scanner.nextInt();

        System.out.println("Enter max val: ");
        ex6_max = scanner.nextInt();

        System.out.println("Enter number of random number to generate: ");
        ex6_seq_num = scanner.nextInt();

        //Calling the method
        generate_random_sequence(ex6_min, ex6_max, ex6_seq_num);

        //EX7
        String password,stat;
        int score=0;

        System.out.println("EX7\nEnter your password");
        password = scanner.next();

        //calculating the score
        score+=check_len(password);
        score+=check_special_char(password);
        score+=check_case_sensitive(password);

        //See if the password is week or strong or moderately strong
        if(score>=8)
            stat="strong";
        else if(score>=5)
            stat="moderately strong";
        else
            stat="week";

        System.out.println("Password is "+stat+" and has score of "+score+"\n");

        //EX8
        System.out.println("EX8");
        fibonacci_sequence(10);

    }
    //EX4
    public static int[] reversed(int[] arr){
        for (int i=0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }

    //EX6
    public static void generate_random_sequence(int min, int max, int seq_num){
        ArrayList<Integer> result = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<seq_num; i++){
            result.add(random.nextInt(min, max));
        }
        System.out.println(result+"\n");
    }

    //EX7
    public static int check_len(String password){
        int score =0;
        if(password.length()>=8)
            score=3;
        else if(password.length()>5)
            score=2;
        return score;
    }
    public static int check_special_char(String password){
        int score = 0;
        String special_characters = "/^!@#$%^&*()_+\\-=[]{};':\"|,.<>/?";
        if(password.contains(special_characters))
            score=2;
        return score;
    }
    public static int check_case_sensitive(String password){
    int score=0, counter_upper=0, counter_lower=0;

    for(int i=0; i<password.length(); i++){
        if(Character.isUpperCase(password.charAt(i)))
            counter_upper++;
        else if(Character.isLowerCase(password.charAt(i)))
            counter_lower++;
    }

    if(counter_upper>0 && counter_lower>0)
        score=3;

    return score;
    }

    //EX8
    public static void fibonacci_sequence(int sequence_length){
        ArrayList<Integer> fib_seq = new ArrayList<>();
        //Adding the first two values
        fib_seq.add(0);
        fib_seq.add(1);
        sequence_length-=1;

        for(int i=0; i<sequence_length-1; i++){
            //calculating the next value
            int next_val = fib_seq.get(i) + fib_seq.get(i + 1);
            //Adding the nex value to the sequence
            fib_seq.add(next_val);
        }
        System.out.println("Fibonacci sequence with "+(sequence_length+1)+" terms: "+fib_seq);
    }
}
