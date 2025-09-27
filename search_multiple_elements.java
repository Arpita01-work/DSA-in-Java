//Search for multiple numbers in the same array
import java.util.Scanner;

//Class contains the array and multiple elements searching logic
class MultiSearch{
    int[] arr;  //intance variable holds the value
    int n;      //size of an array

    //Method to read the array size and elements from the user
    void inputArray(Scanner sc){
        System.out.println("Enter the size of an array ");
        n = sc.nextInt();      //Read the size of an array  
        arr = new int[n];      //Initialize an array

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();      //Read the array elements
        }
    }

    //Method to search if the element exist in an array
    boolean search (int key){
        for(int i = 0; i<n ; i++){  //Traverse the array
            if(arr[i] == key){      //Check if the current element matches the key
                return true;        //If matches return true
            }
        }
        return false;   //If element not matches return false
    }
}

public class search_multiple_elements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Scanner object for the input

        MultiSearch obj = new MultiSearch();    //Create an object for MultiSearch class

        obj.inputArray(sc);     //Read array elements from the user

        System.out.println("Enter how many numbers you want to search: ");
        int q = sc.nextInt();       //Enter the number of keys you want to search

        for(int i = 0; i<q ; i++){
            System.out.println("Enter number " + ( i + 1 ) + " to search: ");
            int key = sc.nextInt();     //Enter the particular key you want to search

            //Display result
            if(obj.search(key)){
                System.out.println(key + " exist in the array");
            }
            else{
                System.out.println(key + " does not exist in the array");
            }
        }
        sc.close();     //Close the Scanner to prevent resource leak
    }
}
