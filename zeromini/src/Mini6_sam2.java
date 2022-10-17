import java.util.Random;

public class Mini6_sam2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();

        int count1 = 0; // 기호1 득표
        int count2 = 0; // 기호2 득표
        int count3 = 0; // 기호3 득표
        int count4 = 0; // 기호4 득표
        int vote = 100000; // 투표권
        int voteCount = 0; // 투표수
        String str = "";

        for (int i = 0; i < vote; i++) {
            int play = rnd.nextInt(4 - 0) + 0;
            voteCount++;

            if (play == 1) {
                count1++;
                str = "이재명";
            } else if (play == 2) {
                count2++;
                str = "윤석열";
            } else if (play == 3) {
                count3++;
                str = "심상정";
            } else {
                count4++;
                str = "안철수";
            }
            double total = ((double) voteCount / (double) vote) * 100;
            double no1 = ((double) count1 / (double) vote) * 100;
            double no2 = ((double) count2 / (double) vote) * 100;
            double no3 = ((double) count3 / (double) vote) * 100;
            double no4 = ((double) count4 / (double) vote) * 100;

            sb.append(String.format("[투표진행율]: %.2f%%, %d명 투표 => %s\n", total, voteCount, str));
            sb.append(String.format("[기호:1] 이재명: %.2f%%, (투표수: %d)\n", no1, count1));
            sb.append(String.format("[기호:2] 윤석열: %.2f%%, (투표수: %d)\n", no2, count2));
            sb.append(String.format("[기호:3] 심상정: %.2f%%, (투표수: %d)\n", no3, count3));
            sb.append(String.format("[기호:4] 안철수: %.2f%%, (투표수: %d)\n\n", no4, count4));

        }
        int max = count1;
        String name = "";
        if (count2 > max) {
            max = count2;
            name = "윤석열";
        } else if (count3 > max) {
            max = count3;
            name = "심상정";
        } else if (count4 > max) {
            max = count4;
            name = "안철수";
        } else {
            name = "이재명";
        }
        sb.append(String.format("[투표결과] 당선인: %s", name));
        System.out.println(sb.toString());
    }
}
