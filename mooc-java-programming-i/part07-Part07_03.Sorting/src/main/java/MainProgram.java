
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        int min = array[0];
        
        for(int cmp: array){
            if(cmp < min){
                min = cmp;
            }
        }
        
        return min;
    }
    
    public static int smallest(int[] array, int startIndex){
        int min = array[startIndex];
        
        for(int i = startIndex; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        
        return min;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = smallest(array);
        int index = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == smallest){
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        
        int smallest = smallest(array, startIndex);
        int index = 0;
        
        for(int i = startIndex; i < array.length; i++){
            if(array[i] == smallest){
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            if(indexOfSmallestFrom(array,i) != i){
                swap(array,i,indexOfSmallestFrom(array,i));
            }
            System.out.println(Arrays.toString(array));
        }
    }
    
}
