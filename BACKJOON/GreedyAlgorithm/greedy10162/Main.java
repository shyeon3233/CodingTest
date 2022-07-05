package GreedyAlgorithm.src.greedy10162;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3개의 시간 조절용 버튼 A, B, C
A = 5, B = 1, C = 10
냉동음식 조리시간 T초
(A * n1) + (B * n2) + (C * n3) = T
n1 + n2 + n3 = minimum
떨어지지 않는 수는 -1
 */
public class Main {
    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int T = Integer.parseInt(reader.readLine());
            if(T % 10 != 0)
            {
                System.out.println(-1);
                return;
            }
            int[] answer = Microwave.timeCalculate(T);

            for(int i=0; i < answer.length; i++){
                System.out.printf("%d ", answer[i]);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }

}

class Microwave{
    final static int A = 300;
    final static int B = 60;
    final static int C = 10;

    public static int[] timeCalculate(int T){
        int[] buttons = new int[]{A, B, C};
        int[] answer = new int[buttons.length];

        for(int i=0; i < buttons.length; i++){
            if(T / buttons[i] == 0){
                continue;
            }
            switch(i){
                case 0:
                    answer[i] = T / buttons[i];
                    T %= buttons[i];
                    break;
                case 1:
                    answer[i] = T / buttons[i];
                    T %= buttons[i];
                    break;
                case 2:
                    answer[i] = T / buttons[i];
                    T %= buttons[i];
                    break;
            }

        }
        return answer;
    }



}
