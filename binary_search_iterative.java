//Implement binary search without recursion
import java.util.Scanner;

//Class contains the array and multiple elements searching logic
class BinaryLoop{
    int[] arr;      //instance variable holds the value
    int n;          //size of an array

    //Method to read the size and elements from the user
    //Input array(must be sorted)
    void inputArray(Scanner sc){
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();   //Read the size of an array
        arr = new int[n];   //Initialize an array

        System.out.println("Enter " + n + " elements");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();  //Read the array elements
        }
    }

    //Iterative method to perform binary search on an sorted array
    int binarySearch(int key){
        int low = 0 , high = n-1;   //initialize low and high pointers

        //Loop until the search space is valid
        if(low<=high){  
            int mid = (low+high) / 2;   //Find the middle index
            if(arr[mid] == key){        //Check if mid element is the key
                return mid;             //key found, return index
            }
            else if(arr[mid] < key){
                low = mid + 1;          //key is in the right half
            }
            else{
                high = mid - 1;         //key is in the left half
            }
        }
        return -1;      //key not found in an array
    }

}


public class binary_search_iterative{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Scanner object to read input

        BinaryLoop obj = new BinaryLoop();      //create an object for BinaryLoop class

        obj.inputArray(sc);     //Read array elements from the user

        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();     //Enter the element to search as key

        int result = obj.binarySearch(key);     //store the key index if found

        //Display result
        if(result != -1){
            System.out.println("Element " + key + " found at index " + result);
        }
        else{
            System.out.println("Element " + key + " not found in the array");
        }

        sc.close();     //Close the scanner to prevent resouce leak
    }   
}
