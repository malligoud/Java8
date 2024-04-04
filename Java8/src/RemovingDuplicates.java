import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemovingDuplicates {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("malli","malli","AA","BB","aa","ccc","AA","BB","aa","ccc");
		List<String> ulist=list.stream().distinct().collect(Collectors.toList());
		System.out.println(ulist);
	}

}
