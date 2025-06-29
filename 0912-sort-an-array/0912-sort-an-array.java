import java.util.Arrays;

class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quicksort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = right;
        int pivotValue = arr[pivot];
        int pivotFinalIndex = left;

        for (int i = left; i < right; i++) {
            if (arr[i] < pivotValue) {
                int temp = arr[i];
                arr[i] = arr[pivotFinalIndex];
                arr[pivotFinalIndex] = temp;
                pivotFinalIndex++;
            }
        }

        // Swap pivot into its correct place
        int temp = arr[pivotFinalIndex];
        arr[pivotFinalIndex] = arr[pivot];
        arr[pivot] = temp;

        // Uncomment this line if you want to see steps:
        // System.out.println(Arrays.toString(arr));

        quicksort(arr, left, pivotFinalIndex - 1);
        quicksort(arr, pivotFinalIndex + 1, right);
    }
}
