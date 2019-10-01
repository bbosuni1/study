package workshop2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		int[] arr = {70, 50, 100, 20, 40, 60, 10, 80, 90, 30};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList()); 
		// java8 이후 asList 방법이 안된다는 내용을 찾아서 다른 방법으로 해봄
		// 이해당 방법에 대한 공부가 필요함.
		
		Collections.sort(list);	// 오름차순 정렬
		Collections.reverse(list); // 뒤집어서 내림차순으로
		
		for ( int p : list) {
			System.out.println(p);
		}
		
		// List cityList = Stream.of().collect(Collectors.toList());

	
		
	}

}
