public class loopInvariant{

    public static int max(int[] arr) {
        int ret = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ret) {
                ret = arr[i];
            }
        }
        return ret;
    }
    public static void main(String[] args){
        //testing:
        int[] arr = {1,2,3,-10, 200};
        System.out.printf("%d\n", max(arr));
    }
}
/*
An appropriate loop invariant for max in terms of ret is:

ret is the smallest value in the array through the entries in the array that have been visited.

Does the max function enforce this loop invariant properly:

Yes.
1. Entering the loop, ret = arr[0], so ret is the smallest  value in the array that has been visited since only the 0th entry in the array has been visited and ret = arr[0].

2. At the end of iteration of the loop: on the i'th iteration of the loop, if arr[i] is a smaller value than ret, then ret is set equal to arr[i] so that ret is the smallest value through the i'th entry in arr. Therefore, at the end of every iteration, ret is always the smallest value in arr, up to i entries.

3. After execution, ret is the smallest value in arr through arr.length entries; thus the entire array has been visited, and ret is the smallest value in the arr.


*/
