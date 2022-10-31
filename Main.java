import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size;
        System.out.println("Please enter a number n:");
        size= scanner.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println(i+1+"."+" "+"Enter element :");
            int number= scanner.nextInt();
            array[i]=number;

        }
        Arrays.sort(array);
System.out.println("Arrangement :");
           for(int i:array){System.out.println(i);}


    }
}