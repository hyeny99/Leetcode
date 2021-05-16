import java.util.regex.Pattern;

public class ValidNumber {
	public boolean isNumber(String s) {
		//? : 0/1
		//+ : 1 +
		//* : 0 +
		String regex = "^[+-]?(((\\d+\\.\\d*)|(\\.\\d+))|\\d+)([eE][+-]?\\d+)? $";
		/*^(start) [+-]is optional 
		(\\d+\\.\\d*) can be 3., 3.1(at least one integer followed by a decimal point)
		(\\.\\d+) can be .3 (a decimal point followed by at least one integer)
		(\\d+) at least one integer
		Valid decimal numbers/integers
		
		([eE][+-]?\\d+)? optional
		e/E followed by an integerS
		*/
		
		return Pattern.matches(regex, s);
	}

}
