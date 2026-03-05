package HN_KS24_CNTT4_NguyenDoanhTuan_001.Bai3;
import java.util.Scanner;
import java.util.Stack;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("So khong hop le!");
            return;
        }
        Stack<Integer> stack = new Stack<>();

        int temp = n;
        while (temp > 0) {

            int du = temp % 2;
            stack.push(du);
            temp = temp / 2;
        }
        System.out.print("Dang nhi phan cua "+ n +" la: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}