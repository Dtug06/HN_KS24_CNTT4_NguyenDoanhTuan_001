package HN_KS24_CNTT4_NguyenDoanhTuan_001.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day;
        System.out.print("Nhap so ngay chi tieu: ");
        day = sc.nextInt();

        if (day > 0) {
            ArrayList<Float> list = new ArrayList<>();

            for (int i = 0; i < day; i++) {
                System.out.printf("Day %d: ", i + 1);
                float money = sc.nextFloat();
                list.add(money);
            }
            float sum = 0;
            float max = list.get(0);
            int dayMax = 0;
            float min = list.get(0);
            int dayMin = 0;
            float avg;
            int dayOutOfAvg = 0;
            for (int i = 0; i < list.size(); i++) {

                float value = list.get(i);

                sum += value;

                if (value > max) {
                    max = value;
                    dayMax = i;
                }

                if (value < min) {
                    min = value;
                    dayMin = i;
                }
            }

            avg = sum / list.size();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > avg) {
                    dayOutOfAvg++;
                }
            }

            System.out.printf("Tong chi tieu: %.2f\n", sum);
            System.out.printf("Chi tieu nhieu nhat: %.2f (Ngay %d)\n", max, dayMax + 1);
            System.out.printf("Chi tieu it nhat: %.2f (Ngay %d)\n", min, dayMin + 1);
            System.out.printf("Trung binh chi tieu: %.2f\n", avg);
            System.out.printf("So ngay vuot trung binh: %d\n", dayOutOfAvg);

        } else {
            System.out.println("So luong ngay khong hop le !!!");
        }
    }
}