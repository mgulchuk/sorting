import java.util.*;
/**
 * @author Michael Gulchuk
 * @version 1.0
 */
// I dont know how to fix this linter warning I tried renaming multiple times
public class basicSorts {
    private static int[] array;

    /**
     * sorts the array using bubble technique 
     */
    public static void bubbleSort(){
        int num = array.length;
        for(int i = 0; i < num - 1; i++){
            for(int j = 0; j < num - i -1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * sorts the array using selection technique
     */
    public static void selectionSort(){
        int num = array.length;
        for(int i = 0; i < num-1; i++){
            int min = i;
            for(int j = i + 1; j < num; j++){
                if(array[j] < array[min]){
                    min = j;
                }
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    /**
     * sorts the array using insertion technique
     */
    public static void insertionSort(){
        int num = array.length;
        for(int i = 1; i < num; i++){
            for(int j = i; j >= 1; j--){
                if(array[j] < array[j - 1]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }else{
                    break;
                }
            }
        }
    }


    /**
     * prints the array
     */
    public static void print(){
        for (int value : array) {
            System.out.println(value + " ");
        }
    }

    /**
     * @param size size of array
     * @param min minimum value
     * @param max maximum value
     */
    public static void randomArray(int size, int min, int max){
        Random arrayRand = new Random();
        int[] myArray = new int[size];
        for(int i = 0; i < size; i++){
            myArray[i] = min + arrayRand.nextInt(max - min + 1);
        }
        array = myArray;
    }

    /**
     * @param args args is never used
     */
    public static void main(String[] args){
        System.out.println("Bubble sort: ");
        randomArray(10, 0, 100);
        bubbleSort();
        print();
        System.out.println();
        System.out.println("Selection sort: ");
        randomArray(10, 0, 100);
        selectionSort();
        print();
        System.out.println();
        System.out.println("Insertion sort: ");
        randomArray(10, 0, 100);
        insertionSort();
        print();
    }

}

