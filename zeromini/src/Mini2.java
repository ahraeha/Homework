import java.util.Scanner;

public class Mini2 {
    public static void main(String[] args){

        System.out.println("[캐시백 계산]");
        Scanner in = new Scanner(System.in);
        System.out.print("결제 금액을 입력해 주세요.(금액):");

        int pay = in.nextInt();
        int payBack;

        if ( pay >= 3000) {
            payBack = 300;
        } else if ((pay >= 2000) && (pay < 3000)) {
            payBack = 200;
        } else if ((pay >= 1000) && (pay < 2000)) {
            payBack = 100;
        } else {
            payBack = 0;
        }
        String str = String.format("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", pay, payBack);
        System.out.println(str);

    }

}


