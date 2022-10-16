import java.util.Random;
import java.util.Scanner;

public class Mini4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = scan.nextInt();
        System.out.print("출생월를 입력해 주세요.(mm):");
        int month = scan.nextInt();
        System.out.print("출생일를 입력해 주세요.(dd):");
        int day = scan.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = scan.next();

        Random rnd = new Random();
        int backword = rnd.nextInt(999999 - 111111 + 1) + 111111;
        int yearword = (year / 100) * 100;
        int genderword = 0;
        if (year >= 2020) {
            genderword = gender.equals("m") ? 3 : 4;
        } else if (year < 2020) {
            genderword = gender.equals("m") ? 1 : 2;
        }
        String str = String.format("%d%02d%02d-%d%06d",(year-yearword),month,day,genderword,backword);
        System.out.println(str);
    }
}
