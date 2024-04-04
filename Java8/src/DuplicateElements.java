import java.util.*;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(12,12,11,13,33,32,43,43,55,65,11);
		Set<Integer> set=new HashSet<>();
		list.stream().filter(n->!set.add(n)).forEach(System.out::println);

	}

}
