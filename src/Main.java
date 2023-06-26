import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] testArray = readIntegers();
        System.out.println(Arrays.toString(testArray));

        int min = findMin(testArray);
        System.out.println("The minimum element is " + min);

    }

    public static int[] readIntegers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] split = input.split(",");
        int[] values = new int[split.length];

        for(int i = 0; i < values.length; i++){
            values[i] = Integer.parseInt(split[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array){

        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }




}
