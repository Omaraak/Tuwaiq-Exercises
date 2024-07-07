import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise_4 {
    public static void main(String[] args) {
        //EX1
        ArrayList<Integer> ex1 = new ArrayList<>();
        ex1.add(12);
        ex1.add(10);
        ex1.add(12);
        System.out.println("EX1\n"+(ex1.getFirst() == ex1.getLast()));

        //EX2
        Integer[] ex2 = {1,4,17,7,25,3,100};
        ArrayList<Integer> greaterThenAvg = new ArrayList<>();

        int avg =0;
        for(int i:ex2){
            avg+=i;
        }

        avg/=ex2.length;

        for(int i: ex2){
            if(i>avg)
                greaterThenAvg.add(i);
        }
        System.out.println("EX2\nThe average of the array is "+avg+" And the values that are bigger then the average are: "+greaterThenAvg);

        //EX3
        Integer[] ex3 = {20,30,40};
        if(ex3[0] > ex3[ex3.length-1])
            System.out.println("EX3\nThe larger value between the first and last is: "+ex3[0]);
        else
            System.out.println("EX3\nThe larger value between the first and last is: "+ex3[ex3.length-1]);

        //EX4
        Integer[] ex4 = {1,2,3,4};
        ArrayList<Integer> newArry = new ArrayList<>(List.of(ex4));
        int ex4_temp;

        ex4_temp = newArry.getLast();
        newArry.set(newArry.size()-1, newArry.getFirst());
        newArry.set(0, ex4_temp);

        System.out.println("EX4\nThe original: "+ Arrays.toString(ex4));
        System.out.println("After the change: "+newArry);

        //EX5
        int ex5_temp = 0;
        ArrayList<Integer> ex5 = new ArrayList<>(Arrays.asList(2,3,40,1,5,9,4,10,7));

        System.out.println("EX5\nThe original: "+ex5);

        for(int i=0; i<ex5.size(); i++){
            for(int j=0; j<ex5.size()-i-1; j++){
                if(ex5.get(j)%2 == 0 && ex5.get(j+1)%2 != 0){
                    ex5_temp = ex5.get(j);
                    ex5.set(j, ex5.get(j+1));
                    ex5.set(j+1, ex5_temp);
                }
            }
        }
        System.out.println("After the change: "+ex5);

        //EX6
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        boolean flag=true;

        if (array1.size() == array2.size()) {
            for (int i = 0; i < array1.size(); i++) {
                if (array1.get(i) == array2.get(i)) {
                    continue;
                }else {
                    flag = false;
                    break;
                }
            }
        System.out.println("EX6\n"+flag);
        }else
            System.out.println("The arrays size is not equal.");


    }
}
