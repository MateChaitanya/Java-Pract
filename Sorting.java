/*public class Sorting {
    public static void main(String[] args) {
        int arr[]={5,5,8,2,9,1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                //Bubble Sort
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}*/



public class Sorting {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};  // Unsorted array

        // Selection sort implementation
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIdx = i;
            for (int j = i + 1; j < arr.length-1; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

