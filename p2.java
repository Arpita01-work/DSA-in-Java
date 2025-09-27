//Return the index of the first occurrence of an element
import java.util.Scanner;

//Class contains array and search logic
class IndexSearch{

    int[] arr;  //instance variable holds the value
    int n;      //size of an array

    void indexArray(Scanner sc){
        System.out.println("Enter the size of an array: ");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    }

    public int findIndex(int key){
        for(int i = 0; i<n; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

}

public class p2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IndexSearch obj = new IndexSearch();

        obj.indexArray(sc);

        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();

        int index = obj.findIndex(key);

        if(index != -1){
            System.out.println("The first occurrence of " + key + " is at: " + index);
        }
        else{
            System.out.println( key +" does not exist in the array.");
        }
        sc.close();
    }
    
}
