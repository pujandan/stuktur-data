
public class MergeSortDescending {

    static void mergeSort(int[] arr) {
        if (arr.length <= 1)
            return;

        int mid = arr.length / 2;

        int[] left = new int[mid];

        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left);

        mergeSort(right);

        merge(arr, left, right);
    }

    static void merge(int[] arr, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 45, 12, 78, 34, 90, 23, 56, 11 };

        System.out.println("Data sebelum diurutkan:");
        for (int num : arr)
            System.out.print(num + " ");

        mergeSort(arr);

        System.out.println("\n\nData setelah diurutkan (dari besar ke kecil):");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
