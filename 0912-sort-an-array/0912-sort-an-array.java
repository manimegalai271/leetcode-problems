import java.util.Random;

class Solution {
    Random rand = new Random();

    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quicksort(int[] arr, int left, int right) {
        if (left >= right) return;

        // Choose random pivot index between left and right
        int pivotIndex = left + rand.nextInt(right - left + 1);

        // Swap pivot with right
        swap(arr, pivotIndex, right);

        int pivot = arr[right];
        int pivotFinal = left;

        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, pivotFinal);
                pivotFinal++;
            }
        }

        swap(arr, pivotFinal, right); // Place pivot correctly

        quicksort(arr, left, pivotFinal - 1);
        quicksort(arr, pivotFinal + 1, right);
    }

    private void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
