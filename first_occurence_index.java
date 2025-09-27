//Return the index of the first occurrence of an element
import java.util.Scanner;

//Class contains array and search logic
class IndexSearch{

    int[] arr;  //instance variable holds the value
    int n;      //size of an array

    //Method to read array size and elements from the user
    void indexArray(Scanner sc){
        System.out.println("Enter the size of an array: ");
        n = sc.nextInt();      //Read size of an array
        arr = new int[n];      //Initialize the array

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();      //Read each element in an array
        }
    }
    
    //Method to find the index of the first occurence of the given key
    public int findIndex(int key){
        for(int i = 0; i<n; i++){   //Traverse the array
            if(arr[i] == key){      //Check if current element matches the key
                return i;           //Return the index if found
            }
        }
        return -1;              //Return -1 if element is not found
    }

}

public class first_occurence_index{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Scanner object for input

        IndexSearch obj = new IndexSearch();    //create an object for IndexSearch

        obj.indexArray(sc);     //Read array elements from the user

        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();     //Read elements to search

        int index = obj.findIndex(key); //Find the index of the first occurrence

        //Display result
        if(index != -1){
            System.out.println("The first occurrence of " + key + " is at: " + index);
        }
        else{
            System.out.println( key +" does not exist in the array.");
        }
        sc.close();     //Close the scanner to prevent resource leak
    }
    
}
