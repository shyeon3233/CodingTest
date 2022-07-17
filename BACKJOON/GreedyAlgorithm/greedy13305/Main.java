package GreedyAlgorithm.src.greedy13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//    static int n = 0; // 도시의 수
//    static List<Integer> distances = new ArrayList<>();
//    static List<Integer> oils = new ArrayList<>();
//    public static void main(String[] args){
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        try{
//            n = Integer.parseInt(reader.readLine());
//            String distance = reader.readLine();
//            String oil = reader.readLine();
//            reader.close();
//
//            for(int i=0; i < n; i++) // 메모리를 많이 잡아 먹고 시간이 오래 걸린다.
//            {
//                if(i < n-1)
//                    distances.add(Integer.parseInt(distance.split(" ")[i]));
//                oils.add(Integer.parseInt(oil.split(" ")[i]));
//            }
//
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println(solution());
//
//    }
    static int n = 0; // 도시의 수
    static List<String> distances;
    static List<String> oils;
    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            n = Integer.parseInt(reader.readLine());
            String distance = reader.readLine();
            String oil = reader.readLine();
            reader.close();

//            if(Integer.parseInt(distance.split(" ")[0]) <= 1) {
//            }
            distances = new ArrayList<String>(Arrays.asList(distance.split(" ")));
            oils = new ArrayList<String>(Arrays.asList(oil.split(" ")));


        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(solution());

    }

    static long solution(){
        long answer = 0;
        int oil = Integer.parseInt(oils.get(0));

        for(int i=0; i < distances.size(); i++){
            answer += (long)oil * Integer.parseInt(distances.get(i));
            if(oil > Integer.parseInt(oils.get(i+1))){
                oil = Integer.parseInt(oils.get(i+1));
            }
        }

        return answer;
    }
}