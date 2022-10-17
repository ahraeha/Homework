import java.time.LocalDate;
import java.util.Scanner;
public class Mini5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = in.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = in.nextInt();
        LocalDate ld = LocalDate.of(year, month, 1);
        int dayOfWeek = ld.getDayOfWeek().getValue();
        int lastday = ld.lengthOfMonth();

        StringBuilder sb = new StringBuilder();
        System.out.println("\n");
        String head = String.format("[%d년 %02d월]", year, month);
        System.out.println(head);
        System.out.println("일\t"+"월\t"+"화\t"+"수\t"+"목\t"+"금\t"+"토\t");

        int count = 0;
        for (int i = 0; i < dayOfWeek; i++) {
            sb.append("\t");
            count ++;

        }
        for (int i = 1; i <= lastday; i++) {
            if(count % 7 == 0) {
                sb.append("\n");
            }
            sb.append(String.format("%02d\t", i));
            count ++;
        }
        System.out.println(sb.toString());
    }
}
