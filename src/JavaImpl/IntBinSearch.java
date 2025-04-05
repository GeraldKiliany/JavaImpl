package javaimpl;

public class IntBinSearch {

    public static boolean BinarySearch(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + ((right - left) / 2); // prevent possible int overflow of left + right divided by 2
            if (target == arr[mid]){
                return true; // could also return index in other implementations
            }
            else if (target < arr[mid]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        return false;
    }

    // Returns index of target or -1 if not found in the array
    public static int BinarySearchForInd(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while (left<= right){

            int mid = left + ((right - left) / 2);
            if (target == arr[mid]){
                return mid;
            }
            else if (target < arr[mid]){
                right = mid - 1; //move right end, ans would be in left half so continue to search left
            }
            else {
                left = mid + 1;
            }
        }
        return -1; //invalid index if not found
    }
}
