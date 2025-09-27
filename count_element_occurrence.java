//How many times a given number appear?
import java.util.Scanner;

//class contains array and element occurrence finding logic
class ArrayIndex{
    int[] arr;  //instance variable holds the value
    int n;      //size of an array

    //Method to read array size and elements from the user
    void inputArray(Scanner sc){
        System.out.println("Enter the size of an array: ");
        n = sc.nextInt();   //Read the size of an array
        arr = new int[n];   //Initialize an array

        System.out.println("Enter " + n + " elements");
        for(int i=0; i<n; i++){ 
            arr[i] = sc.nextInt();      //Read each element in an array
        }
    }

    //Method to count the same element occurred in an array
    public int countOccurrence(int key){
        int count = 0;
        for(int i=0 ; i<n ; i++){   //Traverse the array
            if(arr[i] == key){      //Check if the current element matches the key
                count++;            //If matches increase the count
            }
        }
        return count;   //Read the count
        }
        
}

public class count_element_occurrence{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Scanner object for the input

        ArrayIndex obj = new ArrayIndex();      //Create an object for ArrayIndex

        obj.inputArray(sc);         //Read array elements from the user

        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();     //Read element to search

        int count = obj.countOccurrence(key);   //Count the appearance of the same element

        //Display result
        if(count > 0){
            System.out.println(key + " appears " + count + " times in an array" );
        }
        else{
            System.out.println(key + " element not found in an array");
        }

        sc.close();     //Close the Scanner to prevent resource leak
    }
}
