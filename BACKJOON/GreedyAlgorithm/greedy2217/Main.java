package greedy2217;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 문제
 * N(1 ≤ N ≤ 100,000)개의 로프가 있다. 이 로프를 이용하여 이런 저런 물체를 들어올릴 수 있다.
 * 각각의 로프는 그 굵기나 길이가 다르기 때문에 들 수 있는 물체의 중량이 서로 다를 수도 있다.
 * 하지만 여러 개의 로프를 병렬로 연결하면 각각의 로프에 걸리는 중량을 나눌 수 있다. 
 * k개의 로프를 사용하여 중량이 w인 물체를 들어올릴 때, 각각의 로프에는 모두 고르게 w/k 만큼의 중량이 걸리게 된다.
 * 각 로프들에 대한 정보가 주어졌을 때, 이 로프들을 이용하여 들어올릴 수 있는 물체의 최대 중량을 구해내는 프로그램을 작성하시오. 
 * 모든 로프를 사용해야 할 필요는 없으며, 임의로 몇 개의 로프를 골라서 사용해도 된다.
 * 
 * 입력
 * 첫째 줄에 정수 N이 주어진다. 다음 N개의 줄에는 각 로프가 버틸 수 있는 최대 중량이 주어진다. 
 * 이 값은 10,000을 넘지 않는 자연수이다.
 * 
 * 출력
 * 첫째 줄에 답을 출력한다.
 */
public class Main{

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int k = 0; // 로프의 수
		List<Integer> ropesWeight = new ArrayList<Integer>();
		try {
			k = Integer.parseInt(reader.readLine());
			for(int i=0; i < k; i++) {
				ropesWeight.add(Integer.parseInt(reader.readLine()));
			}
		}catch(IOException e) {
			System.out.println("잘못된 입력입니다.");
		}
		
		Collections.sort(ropesWeight, new CompareList());
		
		int w = 0;
		List<Integer> weights = new ArrayList<Integer>();
		
		// 물체의 무게는 k만큼 분할되어 각 로프에 부하를 준다.
		// 주어진 로프를 전부 사용하지 않아도 된다. 
		// 가장 무게를 많이 들수 있는 로프는 하나만 사용이 가능하므로 적정한 무게의 로프를 이용하여 최대의 무게를 찾아야 한다.
		// 예) 1, 2, 3, 4, 5
		for(int i=1; i <= ropesWeight.size(); i++) {
			w = i * ropesWeight.get(i-1);
			weights.add(w);
		}
		Collections.sort(weights, new CompareList());
		System.out.println(weights.get(0));
		
	}
}

class CompareList implements Comparator<Integer>{
	@Override
	public int compare(Integer num1, Integer num2) {
		if(num1 > num2) {
			return -1;
		}else if(num1 < num2) {
			return 1;
		}
		else return 0;
	}
}

