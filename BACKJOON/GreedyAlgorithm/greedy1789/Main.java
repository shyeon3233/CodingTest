package GreedyAlgorithm.src.greedy1789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = 0;
        try{
            n = Long.parseLong(reader.readLine());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        long sum = 0;
        int i = 1;

        while(true){ // 무한 반복
            sum += i;
            if(sum > n) { // sum 값이 n 값보다 커지면 i-- 값이 최대값이 된다.
                i--;
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
