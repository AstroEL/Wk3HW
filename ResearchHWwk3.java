
public class ResearchHWwk3 {

	public static void main(String[] args) {
		String passwordGuess = "calvineatsboogers";
		String passwordAnswer = "CalvinEatsBoogers";
		String trimMePls = "    I need some trimming              ";
		
		
		boolean isItRight = passwordGuess.equals(passwordAnswer);
		System.out.println(isItRight);
		System.out.println(passwordGuess.length());
		System.out.println(trimMePls.toUpperCase());
		System.out.println(trimMePls.trim());
		System.out.println("\nPassword Guess is Empty: " + passwordGuess.isEmpty());
		System.out.println(passwordAnswer.equalsIgnoreCase(passwordGuess));
				
	}
/*
 * Research - look up the javadocs for String and Array. 
 * Select five methods from each and write about 1) what the method signatures are; 
 * 2) what the method does; 3) and why would it be useful/how could it be used.
 * 
 * 
 * 
 * ---------------------------------- String --------------------------------------
 * 
 * 		equals(Object anObject)
 * 			This is an API method that compares one object to another and returns a 
 * 			boolean response of true or false whether they are equal or not. 
 *
 *			This could be used to compare two statements or strings/objects instead
 *			of using the primitive == for data comparison. Like comparing two names 					
 *
 * 		length()
 * 			This method will return the int length of the string - or in other words
 * 			exactly how many characters are used. 
 * 
 * 			This can be used for all kinds of cool sorting applications, or I see
 * 			it also useful to gate text input where the known number of characters
 * 			is a limit (i.e. LIMIT 200 CHARACTERS MAX).
 * 
 * 		toUpperCase()
 * 			This method converts all elements of the string to upper-case characters.
 * 
 * 			I can see this being very useful in expressing importance or warning
 * 			for certain prompts that might be repeatedly triggered. Other than that, 
 * 			I can only think of how this method is a beneficial shortcut for on-the-fly
 * 			formatting options.
 * 
 * 		trim()
 * 			Returns a string that is the same as the original string minus the 
 * 			whitespace before and after the values of the string. 
 * 
 * 			Useful for formatting to keep a text block or section of text aligned, 
 * 			also could be useful in a password application where spaces might be entered
 * 			and affect the comparison because of extra spaces/units of unicode. 
 * 
 * 		isEmpty()
 *			This method returns a boolean response - and only returns true if the 
 *			length() = 0. 
 *
 *			This could be used to identify whether or not a user input field has been 
 *			filled or not in order to trigger another action (prompt, switch, etc.) 		 
 * 
 * 
 * 		equalsIgnoreCase(String anotherString)
 * 			This method compares two strings ignoring the case and provides a boolean
 * 			true or false response if they are equal. 
 * 
 * 			This would be extra useful in a situation where a password is required
 * 			but not necessarily the security of a case sensitive one. Or in comparing 
 * 			user input answers to key where case sensitivity wouldn't be as big of 
 * 			a factor
 * 
 * ----------------------------------- Array --------------------------------------
 * 
 *		sort(int[] a)
 *			This method sorts the specified array of int's into ascending order
 *
 * 			I can imagine there are many situations where sorting an array of numbers
 * 			in ascending order could be beneficial for data analysis, or even 
 * 			just generically behind the scenes as a shortcut to sort/filter various inputs,
 * 			this method - like most of these other api methods - can be used with other
 * 			types of primitive data types as well as objects as long as it is expressed
 * 			correctly.
 * 
 * 		toString(int[] a)
 * 			This method returns a array of int's as a string. 
 * 
 *  		This could be used to print out arrays in a string format to then 
 *  		manipulate the data as a string/object?  Not sure, but that was my
 *  		creative guess. 
 *  
 * 		binarySearch(long[] a, long key)
 * 			This method searches a specified array for the identified key value using 
 * 			the binary search algorithm. The array must be sorted prior to making this call. 
 * 
 * 			This could be useful to find specific combinations of data amidst large amounts
 * 			of data stored in arrays. 
 * 
 * 		equals(int[] a, int [] b)
 * 			This method, like the equals() method for the string previously mentioned is 
 * 			used to compare equality of two arrays of which data type is specified in the 
 * 			method signature - here we've got int's. 
 * 
 * 			Again useful to find matching datasets - to find regularities in incoming data or 
 * 			to match like recurrences etc. 
 * 
 * 		fill(int[] a, int fromIndex, int toIndex, int val)
 * 			This method assigns the specified int value to each element in the specified 
 * 			array of ints - starting from the fromIndex and ending at the toIndex. 
 * 
 * 			This could be used to fill created arrays with data in a fast and efficient and 
 * 			systematic manner. 
 * 
 * 		copyOf(int[] original, int newLength)
 * 			This method copies the specified array, truncating or padding with 0's if 
 * 			necessary so the copy has the specified length.
 * 
 * 			I can see this method being especially useful if certain experiments or tests
 * 			need to be performed on a data set - with this method it would be fast and 
 * 			simple to copy the said data set and run the tests without risking damage or 
 * 			corruption to the original before pushing and finalizing. 
 * 
 * 
 * 
 */

}
