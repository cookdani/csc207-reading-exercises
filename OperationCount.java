Exercise (Operation Count)
    Consider the following method:
public static int max(int[] arr) {
    if (arr.length == 0) {
        throw new IllegalArgumentException();
        // ignore this case
    } else {
        int ret = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ret < arr[i]) {
                ret = arr[i];
            }
        }
        return ret;
    }
}
/*
Relevant input: arr
operations to count: arr.lengt == 0 and ret = arr[i]
worst case: arr.length operations
best case: arr.length == 0; 1 operation
average case: if we assume that the array is non-empty, the average case is the worst case, with arr.length operations
