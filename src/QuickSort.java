public class QuickSort {
    public int[] sort(int[] nums) {

        if (nums.length == 0 || nums.length == 1) {
            return nums;
        }
        int[] res = change(nums, 0, nums.length - 1);
        return res;
    }

    private int[] change(int[] nums, int start, int end) {
        if (start >= end) {
            return nums;
        } else {
            int pointPos = end;
            pointPos = swap(pointPos, nums, start, end);
            if (end - start == 1) {
                return nums;
            }
            nums = change(nums, start, pointPos - 1);
            nums = change(nums, pointPos + 1, end);
        }

        return nums;
    }
    private int swap(int pointPos, int[] nums, int start, int end) {
        int[] left = new int[end - start];
        int[] right = new int[end - start];
        int indL = 0;
        int indR = 0;

        for (int i = start; i < end; i++) {
            if (pointPos == i) {
                continue;
            }
            if (nums[i] <= nums[pointPos]) {
                left[indL] = nums[i];
                indL++;
            } else {
                right[indR] = nums[i];
                indR++;
            }
        }
        for (int i = 0; i < indL; i++) {
            nums[start + i] = left[i];
        }
        nums[start + indL] = nums[pointPos];
        for (int i = 0; i < indR; i++) {
            nums[start + i + indL + 1] = right[i];
        }
        pointPos = start + indL;
        return pointPos;
    }
}





