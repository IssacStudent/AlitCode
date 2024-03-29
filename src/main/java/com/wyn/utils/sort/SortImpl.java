package com.wyn.utils.sort;

public class SortImpl {

    public static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int tmp = nums[min];
            nums[min] = nums[i];
            nums[i] = tmp;
        }
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public static void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            //取出一个认为未排序的i
            int tmp = nums[i];
            int j;
            //一直往前走，直到找到一个比tmp小的
            for (j = i - 1; j >=0 && nums[j] > tmp; j--) {
                //该操作本质上是不断后移
                nums[j + 1] = nums[j];
            }
            //最后把tmp放到它该放的位置
            nums[j + 1] = tmp;
        }
    }

    public static void doQuickSort(int[] nums) {
        doQuickSort(nums, 0, nums.length - 1);
    }
    private static void doQuickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int index = nums[i];
        while (i < j) {
            while (i < j && nums[j] >= index) {
                j--;
            }
            if (i < j) {
                nums[i++] = nums[j];
            }
            while (i < j && nums[i] < index) {
                i++;
            }
            if (i < j) {
                nums[j--] = nums[i];
            }
        }
        nums[i] = index;
        doQuickSort(nums, start, i - 1);
        doQuickSort(nums, i + 1, end);
    }

    private static int heapSize;

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void buildMaxHeap(int[] nums) {
        for (int i = (nums.length / 2) - 1; i >= 0; i--) {
            heapify(nums, i);
        }
    }

    private static void heapify(int[] nums, int i) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;
        if (left < heapSize && nums[left] > nums[largest]) {
            largest = left;
        }
        if (right < heapSize && nums[right] > nums[largest]) {
            largest = right;
        }
        if (i != largest) {
            swap(nums, largest, i);
            heapify(nums, largest);
        }
    }

    public static void heapSort(int[] nums) {
        heapSize = nums.length;
        buildMaxHeap(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, i, 0);
            heapSize--;
            heapify(nums, 0);
        }
    }

}
