package com.hr.regex.practice;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchAnythingButNewline {

	public static void main(String[] args) {
		Tester tester = new Tester();
		tester.checker("^.{3}\\..{3}\\..{3}\\..{3}$");      	//MatchAnythingButNewline					-	abc.def.ghi.jkl
		//tester.checker("^\\d{2}\\D\\d{2}\\D\\d{4,}$");   			//MatchDigitsNonDigits  					-	12 11 15, 122 23 56
		//tester.checker("^\\S{2,}\\s\\S{2}\\s\\S{2,}$"); 			//MatchWhitespaceNonWhitespaceCharacter 	- 	XXxXXxXX (X-non whitespace, x-whitespace)
		//tester.checker("^\\w{3,}\\W{1,}\\w{1,10}\\W{1,}\\w{3}$"); //Matching Word & Non-Word Character      	- 	xxxXxxxxxxxxxxXxxx (X-Non word, x-word)
		//tester.checker("^\\d\\w{4}\\.$"); 						//Matching Start & End						-  	Xxxxx. (X-digit, x-word)


        //tester.checker("hackerrank"); 							/Matching Specific String-Introduction
		//tester.checker("^\\w{3,4}\\W+\\w+\\W+\\w+$");
		
		//Character Class - []
		//In the context of a regular expression (RegEx), a character class is a set of characters enclosed within square brackets that allows you to match one character in the set.
		//tester.checker("^[123][120][xs0][30Aa][xsu](\\.|\\,)$");  	  // Matching Specific Characters
		//tester.checker("^\\D[^aeiou][^bcDF]\\S[^ABCDEF][^(\\.|\\,)]$"); // Excluding Specific Characters
		//tester.checker("^[a-z][1-9][^a-z][^A-Z][A-Z].*$"); 			  // Matching Character Ranges

		//Repetitions
		//tester.checker("^[a-zA-Z02468]{40}[13579\\s]{5}$");       //Matching {x} Repetitions
		//tester.checker("^\\d{1,2}[A-Za-z]{3,}\\.{0,3}$"); 		//Matching {x, y} Repetitions
		//tester.checker("^\\d{2,}[a-z]*[A-Z]*$");					//Matching Zero Or More Repetitions
		//tester.checker("^\\d+[A-Z]+[a-z]+$"); 					//Matching One Or More Repetitions
		//tester.checker("^[A-Za-z]*s$"); 							//Matching Ending Items

		//Grouping and Capturing
		//tester.checker("^\\b[AEIOUaeiou][A-Za-z]*\\b$");          //Matching Word Boundaries
		//tester.checker("^.*(ok){3,}.*$"); 						//Capturing & Non-Capturing Groups
        //tester.checker("^(Mr|Mrs|Ms|Dr|Er)\\.[A-Za-z]{1,}$");     //Alternative Matching
		
		//Backreferences
		//Backreferences To Failed Groups
	}
}

class Tester {

	public void checker(String pattern){

		Scanner sc = new Scanner(System.in);
		String testString = sc.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(testString);
//		while (m.find()) {
//			count++;
//		}
		boolean match = m.matches();
		System.out.format("%s", match);
		sc.close();
	}   

}

//IMP
//The dot (.) matches anything (except for a newline).
//The expression \d matches any digit [ - ].
//The expression \D matches any character that is not a digit.
//The expression \s matches any whitespace character [ \r\n\t\f ]. - \r=carriage return(few space before paragraph), \n=new line, \t=tab, \f=form feed - This is called form feed, is used to indicate to a printer that it should start a new page.
//The expression \S matches any non-white space character.
//The expression \w matches any word character. - Word characters include alphanumeric characters (a-zA-Z0-9) and underscores (_).
//The ^ symbol matches the position at the start of a string. - Pattern ^123 TestString 1235 -> matches 123 from start
//The ^ symbol matches the position at the start of a string. - Pattern 123$ TestString 5123 -> matches 123 from end
//The character class [ ] matches only one out of several characters placed inside the square brackets.
//The negated character class [^] matches any character that is not in the square brackets.
//The tool {x} will match exactly x repetitions of character/character class/groups.
//The {x,y} tool will match between  and  (both inclusive) repetitions of character/character class/group.
	//For Example:
	//
	//		w{3,5} : It will match the character w , 3 or 5 times.
	//		[xyz]{5,} : It will match the character x, y or z, 5 or more times.
	//		\d{1,4} : It will match any digits 1, 2, 3, or 4 times.
//The * tool will match zero or more repetitions of character/character class/group.
//The + tool will match one or more repetitions of character/character class/group.
//The $ boundary matcher matches an occurrence of a character/character class/group at the end of a line.
//\b assert position at a word boundary.
//
//		Three different positions qualify for word boundaries :
//		► Before the first character in the string, if the first character is a word character.
//		► Between two characters in the string, where one is a word character and the other is not a word character.
//		► After the last character in the string, if the last character is a word character.