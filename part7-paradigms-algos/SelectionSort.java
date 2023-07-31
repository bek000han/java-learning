import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        
        System.out.println(Arrays.toString(array));
    }
    
    public static int smallest(int[] numbers) {
        int smallestNumber = 2147483647;
        
        for (int number: numbers) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        return smallestNumber;
    }
    
    public static int indexOfSmallest(int [] numbers) {
        int smallestNumber = smallest(numbers);
        int index = 0;
        
        for (int number: numbers) {
            if (number == smallestNumber) {
                return index;
            } else {
                index++;
            }
        }
        return -1; 
    }
    
    public static int indexOfSmallestFrom(int [] numbers, int startIndex) {
        int smallestNumber = 2147483647;
        for (int i = startIndex; i < numbers.length; i++) {
            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
            }
        }
        for (int i = startIndex; i < numbers.length; i++) {
            if (numbers[i] == smallestNumber) {
                return i;
            }
        }
        return -1; 
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}
