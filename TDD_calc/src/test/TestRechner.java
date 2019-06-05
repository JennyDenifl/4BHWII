package test;

import static org.junit.Assert.*;
import org.junit.Test;

import rechner.NegativeExceptions;
import rechner.Rechner;
import rechner.TooManyArgsExceptions;

public class TestRechner {

	@Test
	public void validInput() throws TooManyArgsExceptions, NumberFormatException, NegativeExceptions{
		assertEquals(8, Rechner.sum("3,5"));
	}
	
	@Test(expected = TooManyArgsExceptions.class)
	public void tooManyArgs() throws TooManyArgsExceptions, NumberFormatException, NegativeExceptions {
		Rechner.sum("3,45,5");
	}
	
	@Test(expected = NumberFormatException.class)
	public void Format() throws NumberFormatException, TooManyArgsExceptions, NegativeExceptions {
		Rechner.sum("3;5");
		Rechner.sum("3, ");
		Rechner.sum(",3");
	}
	
	@Test(expected = NegativeExceptions.class)
	public void Negative() throws NegativeExceptions, TooManyArgsExceptions, NumberFormatException{
		Rechner.sum("-3,5");
		Rechner.sum("3,-5");
		
	}
}
