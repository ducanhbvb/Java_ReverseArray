import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Max column:= ");
        int maxColumn = sc.nextInt();
        int[] All_arr = new int[maxColumn];
        for (int i = 0; i < maxColumn; i++) {
            All_arr[i] = (int) (Math.random() * 90 + 10);
            System.out.print(All_arr[i] + " ");
        }
        for (int i = 0, j = maxColumn - 1; i < j; i++, j--) {
            int temp = All_arr[i];
            All_arr[i] = All_arr[j];
            All_arr[j] = temp;
        }
        System.out.println("Arr reverse :");
        for (int i : All_arr) {
            System.out.print(i + " ");
        }
    }
}

