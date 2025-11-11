
public class CountingSortDescending {

    static void countingSort(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int[] output = new int[arr.length];
        int index = 0;

        for (int i = max; i >= 0; i--) {
            while (count[i] > 0) {
                output[index++] = i;
                count[i]--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 9, 1, 4, 6, 2, 8 };

        System.out.println("Data sebelum diurutkan:");
        for (int num : arr)
            System.out.print(num + " ");

        countingSort(arr);

        System.out.println("\n\nData setelah diurutkan (dari besar ke kecil):");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
