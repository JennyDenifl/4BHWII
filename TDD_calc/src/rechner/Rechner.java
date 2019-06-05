/**
 * @author User
 * @version 0.1
 */
package rechner;

public class Rechner {

	/***
	 * @param input: input should be: e,g "4,5"
	 * @return 
	 * @throws NegativeExceptions 
	 * @throws TooManyArgsExceptions
	 * @throws NumberFormatException
	 */
	public static int sum(String input) throws TooManyArgsExceptions, NegativeExceptions {
		String[] seperateedValues = input.split(","); //["4","5"]
		
			if(seperateedValues.length > 2){
				throw new TooManyArgsExceptions();
			}
			
			if(seperateedValues.length < 2){
				throw new NumberFormatException();
			}
			
			for (String i:seperateedValues){
				if(i.contains("-")) {
					throw new NegativeExceptions();
				}
			}
			
			
			return Integer.parseInt(seperateedValues[0]) + Integer.parseInt(seperateedValues[1]);
		
		
	}

}
