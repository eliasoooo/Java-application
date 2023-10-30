Write a program to display the List of even numbers within user given number.

public class FindEvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 1 ; i <= n ; i++) {

			if(i%2 == 0) {

				System.out.print(i + " ");
				
			}

		}
		sc.close();

	}

}


Write a program to find the maximum of two user given numbers without “if condition”
public class FindMaxWithoutIf {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.printf("Enter the 1st value:");

int n1 = sc.nextInt();

System.out.printf("Enter the 2nd value:");

int n2 = sc.nextInt();

System.out.printf("The maximum value is: %d" , n1 > n2 ? n1 : n2);

sc.close();

}

}


3) Write a program to display if the student has passed the subject by taking SUBJECT and GRADE as input and display if the student had “Excellent”/ “Good” / “Try Harder” comment as output.

public class Grading {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the subject:");

String subject = sc.next();

System.out.print("Enter the Grade:");

char y = sc.next().charAt(0);

switch(y) {

case 'A' :

case 'a':

System.out.println("Excellent");

break;

case 'B':

case 'b':

System.out.println("Good");

break;

case 'C':

case 'c':

System.out.println("Try harder");

default:

System.out.println("Failed");

break;

}

sc.close();

}

}

Write a program to display your own name in a triangular pyramid


public class PatternExercise {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String name = sc.next();

int n = name.length();

for (int i = 1; i <= n; i++) {

for (int space = n - i; space >= 1; space--) {

System.out.print(" ");

}

for (int j = 0; j < i; j++) {

System.out.print(" " + name.charAt(j) + " ");

}

System.out.println();

}

sc.close();

}

}

Write a program to get two input string from user and swap them and print the reverse form of second string in the first place.

public class StringExercise {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String name = sc.nextLine();

String[] n1 = name.split(" ");

int n = n1[1].length();

String reversedString ="";

char ch; // Char to store current string character

for (int i = n - 1; i >= 0; i--) {

ch = n1[1].charAt(i);

reversedString = reversedString + ch; // Append char to end

}

System.out.println(reversedString + " "+ n1[0]);

sc.close();

}

}

6) Write a program to get input from user as a string and print them in mixed case.


public class MixedCaseStringExercise {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String str = sc.next();

char[] ch = new char[str.length()];

for(int i = 0 ;i < str.length(); i ++) {

ch[i] = str.charAt(i);

}

for(int i = 0 ;i < str.length(); i = i + 2) {

// ASCII values from 97 - 122

if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {

ch[i] = Character.toUpperCase(str.charAt(i));

}

// ASCII values from 65 - 91

else if(str.charAt(i) >= 65 && str.charAt(i) <= 91) {

ch[i] = Character.toLowerCase(str.charAt(i));

}

}

System.out.println(ch);

sc.close();

}

}


Write a program to concatenate the user given string and print in a new line if there is punctuation or dot or comma( ;.,) .

public class ConcatenateString {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String str = sc.nextLine();

for (int i = 0; i < str.length(); i++) {

char ch = str.charAt(i);

if (Character.isAlphabetic(ch)) {

System.out.print(ch);

} else if (ch == '.' || ch == ',' || ch == ';') {

System.out.println();

}

}

sc.close();

}

}
