import java.util.Random;
import java.util.Scanner;

public class swissArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr;
        int[] arr1 = new int[10];
        arr = createRandom();
        for (int element:arr
             ) {
            System.out.print(element+ " ");
        }
        System.out.println("\n"+ "mang moi la");
        int j=0;
        for (int i = arr.length-1;i>=0; i--) {
            arr1[j]=arr[i];
            j++;
        }
        for (int element1:arr1
        ) {
            System.out.print(element1+ " ");
        }

    }
    private static int[] createRandom() {
        Random rd = new Random(100);
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr1[i] = rd.nextInt(100);
        }
        return arr1;
    }
}
