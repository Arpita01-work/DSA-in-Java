//Check if an element exist in the array
import java.util.Scanner;

//Class that contains array and search logic
class ArraySearch{
    int[] arr;  //instance variable holds the value
    int n;  //size of an array

    //Method to take input
    void inputArray(Scanner sc){
        System.out.println("Enter the size of an array: ");
        n = sc.nextInt();
        arr = new int[n];   //allocate memory

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i<n ; i++){  //accept all the array elements
            arr[i] = sc.nextInt();
        }
    }

    boolean search(int key){
        for(int i = 0 ; i<n ; i++){
            if(arr[i] == key){  //check if the array element is equal to the key(the value to search)
                return true;
            }
        }
        return false;
    }
}

public class search_element_in_array{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArraySearch obj = new ArraySearch();    //object of class ArraySearch

        obj.inputArray(sc);

        //Enter the element want to search
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();

        if(obj.search(key)){
            System.out.println("YES");  //print yes if the key exist
        }
        else{   
            System.out.println("NO");   //print no if the key do not exist
        }
    }
}

/*Complexity:
Time: O(n) (need to scan through the entire array in worst case)
Space: O(1) (only a few variables used)*/