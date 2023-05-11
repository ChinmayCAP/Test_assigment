import java.util.Arrays;

public class zig_zag {
    public static int[] zigzag(int[] seq) {
        //Sort the sequence in descending order
        Arrays.sort(seq);
        reverse(seq);
        int n = seq.length;

        // Create an empty array to store the zigzag pattern
        int[] zigzagSeq = new int[n];

        //Fill the zigzag seq by alternating between the first and last elements of sorted seq
        for (int i = 0, j = n - 1, k = 0; i <= j; k++) {
            if (k % 2 == 0) {
                zigzagSeq[k] = seq[i];
                i++;
            } else {
                zigzagSeq[k] = seq[j];
                j--;
            }
        }

        return zigzagSeq;
    }

    private static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] seq = {1, 2, 3, 4, 5};
        int[] zigzagSeq = zigzag(seq);
        System.out.println(Arrays.toString(zigzagSeq));
    }
}
