/*
안지기
대선시뮬레이션
 */
import java.util.Random;

public class Mini6 {
    public static void main(String[] args){

        Random rnd = new Random();
        String[] name = {"이재명", "윤석열", "심상정", "안철수"};
        int[] count = {0, 0, 0, 0}; // 0, 1, 2, 3
        int voteCount = 0;
        double vote = 100000;
        for (int i = 1; i <= vote; i++) {
            int number = rnd.nextInt(4-0) + 0;
            voteCount ++;
            String title = String.format("\n[투표진행율]: %04.2f%%, %d명 투표 => %s", ((double) i / vote) * 100, voteCount, name[number]);
            System.out.println(title);
            for (int j = 0; j < name.length; j++) {
                if (j == number){
                    count[j]++;
                }
                String info = String.format("[기호:%d] %s: %05.02f%%, (투표수: %d)",j+1, name[j], ((double) count[j] / vote)*100, count[j]);
                System.out.println(info);
            }
        }
        int max = 0;
        int maxvalue = 0;
        for (int i = 0; i < count.length; i++) {
            if ( max < count[i]) {
                max = count[i];
                maxvalue = i;
            }
        }
        String end = String.format("[투표결과] 당선인: %s", name[maxvalue]);
        System.out.println(end);
    }
}
