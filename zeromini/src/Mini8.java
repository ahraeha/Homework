/*
안지기
과세금액계산프로그램
 */
import java.util.Scanner;

public class Mini8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("연소득을 입력해 주세요.:");
        long yearWork = in.nextLong();

        int[] taxBase = {12, 34, 42, 62, 150, 200, 500}; // 과세표준_계산시 1,000,000 곱하기
        int[] tax = {6, 15, 24, 35, 38, 40, 42, 45}; // 세율
        double[] deAmount = {1.08, 5.22, 14.9, 19.4, 25.4, 35.4, 65.4}; // 누진공제차감 금액 계산시 1,000,000 곱하기

        long copyYearWork = yearWork; // 누진공제금액계산시
        int count = 0; // 횟수 체크
        int unit = 1000000; // 1,000,000 단위

        // 카운트 체크
        while (yearWork > 0) {
            yearWork -= (taxBase[count] * unit);
            count ++;
        }
        yearWork += (taxBase[count-1] * unit);


        long money = 0; // 금액계산
        long change = 0; // 잔돈
        long amount = 0; // 누적금액

        long decrement = 0; //누진공제계산
        decrement = (long) ((long) (copyYearWork * tax[count-1]* 0.01) - (deAmount[count-2])*unit); // 금액 * 세율 - 누진공제

        for (int i = 1; i <= count; i++) {
            if (count-1 == 0){
                money = (long) (yearWork * (tax[0] * 0.01));
                String str = String.format("%10d * %2d%% = %10d", yearWork, tax[0], money);
                System.out.println(str);
            } else if (count > i){
                money = (long) (taxBase[i-1] * (tax[i-1] * 0.01) * unit);
                amount += (long) (taxBase[i-1] * (tax[i-1] * 0.01) * unit);
                String str = String.format("%10d * %2d%% = %10d", taxBase[i-1]*unit, tax[i-1], money);
                System.out.println(str);

            } else if (count == i){
                change = (long) (yearWork * (tax[i-1] * 0.01));
                String str = String.format("%10d * %2d%% = %10d", yearWork, tax[i-1], change);
                System.out.println(str);
            }

        }

        String taxMoney = String.format("\n[세율에 의한 세금]:\t\t\t%10d", amount+change);
        String deduction = String.format("[누진공제 계산에 의한 세금]:\t%10d", decrement);
        System.out.println(taxMoney);
        System.out.println(deduction);
    }
}
