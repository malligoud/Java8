import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Mallikarjuna";
		Map<Character,Long> count= str.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(count);
		
		//.forEach((character,frequency) -> System.out.ptintln(character+":"+frequency));

	}

}
