import java.util.*;
import java.io.*;

public class Main{
    static int N;
    static int res = -1;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        // 5킬로그램을 가장 많이 가져가는 것이 최대한 적은 봉투 수
        // 따라서 가장 많이 5킬로그램을 가져갈 수 있는 경우의 수에서 점점 줄여나가기
        int fiveNum = N/5;
        int threeNum = 0;

        // 5킬로그램 봉투가 0보다 작을 경우 만족하는 조건이 없으므로 -1 출력
        while(fiveNum>=0){
            int remain = N - (fiveNum*5);

            // 5킬로그램 다 들고 남은 개수가 3킬로그램 단위로 모두 나눌 수 있는 경우 정답 출력
            if(remain%3==0){
                threeNum = remain/3;
                res = fiveNum + threeNum;
                break;
            }

            // 5킬로그램 봉투 개수 줄이기
            fiveNum--;
        }

        System.out.println(res);
    }
}