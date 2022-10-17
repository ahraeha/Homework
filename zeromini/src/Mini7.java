/*
안지기
로또당첨프로그램
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mini7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int buy = in.nextInt();
        int[][] page = new int[10][6];
        int[] open = new int[6];

        Random rnd = new Random();

        for (int i = 0; i < buy; i++) {
            for (int j = 0; j < 6; j++) {
                int number = rnd.nextInt(45 - 1) + 1; // 번호 넣기
                page[i][j] = number;
                for (int k = 0; k < j; k++) { // 중복제거
                    if (page[i][j] == page[i][k]){
                        j--;
                        break;
                    }
                }
            }
        }
        //내가산거 정렬
        for (int i = 0; i < buy; i++) {
            String str = String.format("%c\t", (char)65 + i);
            System.out.print(str);
            Arrays.sort(page[i]);
            for (int j = 0; j < 6; j++) {
                if( j == 5){
                    String buyingNumber = String.format("%02d\n", page[i][j]);
                    System.out.print(buyingNumber);
                } else {
                    String buyingNumber = String.format("%02d,", page[i][j]);
                    System.out.print(buyingNumber);
                }
            }
        }


        System.out.print("\n[로또 발표]\n\t");
        for (int i = 0; i < 6; i++) {
            int number = rnd.nextInt(45 - 1) + 1;
            open[i] = number;
            for (int j = 0; j < i; j++) {
                if (open[i] == open[j]){
                    i--;
                }
            }
        }
        //중복제거
        for (int i = 0; i < 1; i++) {
            Arrays.sort(open);
        }

        for (int i = 0; i < 6; i++) {
            if( i == 5){
                String openNumber = String.format("%02d\n", open[i]);
                System.out.print(openNumber);
            } else {
                String openNumber = String.format("%02d,", open[i]);
                System.out.print(openNumber);
            }
        }

        int count = 0;
        System.out.println("\n[내 로또 결과]");
        for (int i = 0; i < buy; i++) {
            String str = String.format("%c\t", (char)65 + i);
            System.out.print(str);
            count = 0;
            for (int j = 0; j < 6; j++) {
                if (open[j] == page[i][j]){
                    count ++;
                }
                if( j == 5){
                    String buyingNumber = String.format("%02d => %d개 일치\n", page[i][j], count);
                    System.out.print(buyingNumber);
                } else {
                    String buyingNumber = String.format("%02d,", page[i][j]);
                    System.out.print(buyingNumber);
                }
            }
        }
    }
}
