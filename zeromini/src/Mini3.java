import java.util.Scanner;
public class Mini3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = in.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int enterTime = in.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String nationalMerit = in.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String welfareCard = in.next();

        int ticket = 10000;
        if ( age < 3) {
            ticket = 0;
        } else if (nationalMerit.equals("y") || welfareCard.equals("y")) {
            ticket = 8000;
        } else if ( age < 13 || enterTime >= 17) {
            ticket = 4000;
        }

        System.out.println("입장료: "+ticket);
    }
}


/*
1. 입력내용은 나이, 입장시간, 국가유공자 여부, 복지카드 여부 순으로 입력.
2. 조건
   - 3세미만이면 무료입장
   - 복지카드와 국가유공자의 경우 일반 할인 적용
   - 13세미만이면 특별 할인 적용
   - 17시 이후에 입장하면 특별할인 적용
3. 기본 입장료 : 10,000 원
    특별할인 : 4,000원
    일반할인 : 8,000원
 */