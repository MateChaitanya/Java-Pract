import java.util.Scanner;

/*public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[]= new int[size];


        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            
        }


        //output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
            
        }
    }
    
}*/



/* 
//Find the maximum & minimum number in an array of integers. 
public class Arrays{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int [size];

        //input
        for (int i = 0; i < size; i++) {
            numbers[i]= sc.nextInt();
            
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min) {
                min = numbers[i];
                
            }

            if (numbers[i]>max){
                max = numbers[i];
            }
            
        }
        System.out.println("Largest Numbers :" + max);
        System.out.println("Smallest Numbers :" + min);

    }
}
*/

/* 
//Find index of element in given array
public class Arrays {
    public static int LinearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = LinearSearch(numbers, key);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
*/

/* 

//LINEAR SEARCH
//Find the largestNumber in given array
public class Arrays{
    public static int getLargest (int numbers[]) {
        int Largest = Integer.MIN_VALUE; //-infinity 
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (Largest < numbers[i]) {
                Largest = numbers[i];
                
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
                
            }
        }
        System.out.println("Smallest value is :" + smallest);
        return Largest;
    }

    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        System.out.println("Largest value is : " + getLargest(numbers));
    }
}
*/
/* 
//BINARY SEARCH

public class Arrays{
    public  static int binarysearch(int numbers[] ,int key ){
        int start =0 , end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end)/2;

            if (numbers[mid]==key) {
                return mid;
            }
            if (numbers[mid]< key) {
                start = mid+1;
                
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key = 19 ;

        System.out.println("Index for key is :" + binarysearch(numbers, key));
    }
}

*/

/* 
//Reverse the array 

public class Arrays{
    public static void Reverse(int numbers[]){
        int first=0,last=numbers.length-1;
        while (first<last) {
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;

            
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        Reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]+"");
        }
        System.out.println();
    }
}

*/


/* //Print Subarrays

public class Arrays{
    public static void printSubarrays( int numbers[]){
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10};
        printSubarrays(numbers);
    }
}

*/

/* 
//Bubble Sort 

public class Arrays{
    public static void bubblesort(int arr[]){
        for (int turn = 0; turn < arr.length-1; turn++) {
            for (int j = 0; j < arr.length-1-turn; j++) {
                if (arr[j]>arr[j+1]) {
                    //Swaping 
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={ 5,4,1,3,2};
        bubblesort(arr);
        printArr(arr);
    }
}

*/

/* 

// Java program for implementation of Selection Sort
import java.io.*;

// Class to implement Selection Sort
public class Arrays {
	
	// Method to perform selection sort on an array
	void sort(int arr[]) {
		// Get the length of the array
		int n = arr.length;

		// One by one move the boundary of the unsorted subarray
		for (int i = 0; i < n-1; i++) {
			// Find the index of the minimum element in the unsorted array
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				// Compare elements and update min_idx if a smaller element is found
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first element in the unsorted array
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	// Method to print the elements of an array
	void printArray(int arr[]) {
		int n = arr.length;
		// Loop through the array and print each element
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Driver code to test the SelectionSort class
	public static void main(String args[]) {
		// Create an instance of SelectionSort class
		Arrays ob = new Arrays();

		// Sample array to test the sorting algorithm
		int arr[] = {64,25,12,22,11};

		// Call the sort method to sort the array
		ob.sort(arr);

		// Print the sorted array
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
/* This code is contributed by Rajat Mishra*/


