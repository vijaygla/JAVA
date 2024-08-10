// MID TERM PRACTICE QUESTION 
/*
Q1. Take an input n which is size of array then n more inputs the values
in array then find the square of special elements.
An element nums[i] of nums is called special if i divides n, i.e. n %
i == 0.
Return the sum of the squares of all special elements of nums.

Example 1:
Input:
4
1 2 3 4
Output: 21
*/
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         // input size of array
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         // input element of array
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         // checking the special element
//         int ans =0;
//         for(int i=0;i<n;i++){
//             int l=arr.length;
//             if(l % (i+1) == 0){
//                 ans+=arr[i]*arr[i];
//             }
//         }
//         System.out.print("Sum_of_all_special_element:"+ans);
//     }
// }







/*
Q2)Print Characters
Amy is a high school student who is passionate about coding. One day,
her computer science teacher gives the class an assignment to print
all the characters of a given string in separate lines.
Amy immediately gets to work and writes a simple program. However, she
feels that her solution is too basic and wants to find a more
efficient way to solve the problem.
Can you help Amy by writing a program that prints all the characters
of a given string in separate lines.
Input Format
Input contains a String. Constraints 1<=str.length<=10000
Output Format
Print each character in different line
Sample Input 0
string
Sample Output 0
S
t
r
i
n
g 
*/

// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.next();
//         for(int i=0;i<s.length();i++){
//             // charAt function use to print the charcter of String
//             System.out.println(s.charAt(i));
//         }
//     }
// }







/*
Q3)Is It Equal?
Once there was a girl named Sarah who loved to write poetry. She had a
habit of writing down her thoughts in a notebook whenever she felt
inspired. One day, while she was working on a new piece, she accidentally
spilled her coffee on the notebook.
Desperate to salvage her work, she decided to copy the poem onto a new
page.
However, when she finished rewriting it, she noticed that there were a
few discrepancies between the original version and the new one. She
wondered if she had missed anything while transcribing the poem.
Help Sarah and write a program that checks if two strings are
identical or not.
Input Format
First line contains string s1.
Second line contains string s2.
Constraints
1 <= string1.length() <= 100000
5
1 <= string2.length() <= 100000
Output Format
Return A boolean value
Sample Input 0
COLLEGE
COLLEGE
Sample Output 0
true 
*/

// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         // Enter String_1:
//         String s1=sc.next();
//         // Enter String_2:
//         String s2=sc.next();
//         // equals is use to check string are equal or not 
//         if(s1.equals(s2)){
//         System.out.print("true");
//         }else{
//         System.out.print("false");
//         }
//     }
// }






/*
Q4) Palindrome String
You have been given a String S. You need to find and print whether
this string is a palindrome or not. If yes, print "YES" (without
quotes), else print "NO" (without quotes). Input Format
The first and only line of input contains the String S. The String
shall consist of lowercase English alphabets only.
Output Format
Print the required answer on a single line.
Constraints
1≤|S|≤100
Note:-String S consists of lowercase English Alphabets only.
7
Sample Input
aba
Sample Output
YES 
*/

// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter any word:");
//         String str =sc.next();
//         String rev="";
//         str =str.toLowerCase();
//         int n=str.length();
//         for(int i=0;i<n;i++){
//             rev = str.charAt(i) +rev;
//         }
//         if(str.equals(rev)){
//             System.out.print("Palindrome");
//         }else{
//             System.out.print("Not Palindrome");
//         }
//     }
// }






/*
Q5)Print Indices of Vowels 
Maggie is a language enthusiast who loves exploring the intricacies of 
different languages. One day, while studying English, she comes across 
a coding challenge that involves printing the indices of vowels in a 
given string. 
Maggie is determined to solve the challenge and begins working on the 
problem. 
Help Maggie and write a program that prompts the user to input a 
string, and then scans the string for vowels while keeping track of 
the indices. Whenever you find a vowel, print the index. 
Input Format 
Input contains a String str. 
Constraints 
1 <= str.length() <= 10^4 
Output Format 
Return An series of integer numbers in a single line. 
Sample Input 0 
aqua 
Sample Output 0 
0 2 3 
Explanation 0 
at index 0 we have a 
at index 2 we have 
at index 3 we have a 
 Input Output
Hello 1 4
University 0 2 4 7
Water 1 3
Programming 2 5 8
Section 1 4 5
// */
// import java.util.*;
// public class practice {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter any string:");
//         String s=sc.next();
//         int n=s.length();
//         System.out.println("Index of vowel in given string:");
//         for(int i=0;i<n;i++){
//             char ch = s.charAt(i);
//             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//                 System.out.println(i+" ");
//             }
//         }
//     }
// }





/*
Q6)Toggle String 
You have been given a String S consisting of uppercase and lowercase 
English alphabets. You need to change the case of each alphabet in 
this String. That is, all the uppercase letters should be converted to 
lowercase and all the lowercase letters should be converted to 
uppercase. You need to then print the resultant String to output. 
Input Format 
The first and only line of input contains the String S 
Output Format 
Print the resultant String on a single line. 
Constraints 
1≤|S|≤100 
where S denotes the length of string S. 
Sample Input:-abcdE 
10 
Sample Output:-ABCDe 
Test cases:- 
Input Output 
String STRIng 
bcdEFrTuv BCDefRtUV 
Hello hELLO 
Gla GLA 
AppLE aPPle 
// */
// import java.util.*;
// public class practice {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter any string:");
//         String s=sc.nextLine();
//         sc.close();
//         // toggle of string means convertion from lower case to upper case and vice versa
//         int n=s.length();
//         String str="";
//         for(int i=0;i<n;i++){
//             char ch =s.charAt(i);
//             if(Character.isLowerCase(ch)){
//                 str = str+Character.toUpperCase(ch);
//             }else{
//                 str= str +Character.toLowerCase(ch);
//             }
//         }
//         System.out.println("After Toggle:"+str);
//     }
// }







/*
Q7)Search Character 
Given a small case character ch and an array containing only the small 
case alphabets, you have to print the index if the character ch is 
present in the array. If no such character found print -1. 
Input Format 
●An Character ch 
●An integer value representing size of array 
●n character value representing elements of array. 
Constraints 
●'a'<=ch<='z' 
●1<=n<=100000 
●'a'<=arr[i]<='z' 
Output Format 
A Character value 
Sample Input 0 
c 5 
a b c d e 
Sample Output 0 
2 
Explanation 0 
since d is just greater than the c in the given array. 
Test Case:- 
Input Output
d 
6 
a b c f d e 
4 
// */
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter any character:");
//         char ch = sc.next().charAt(0);
//         System.out.print("Enter size of String array:");
//         int n=sc.nextInt();
//         System.out.print("Enter any string:");
//         String arr = sc.next();
//         sc.close();
//         int index=-1;
//         System.out.print("Index of given character "+ch+" = ");
//         for(int i=0;i<n;i++){
//             if(arr.charAt(i)==ch){
//                 index=i;
//             }
//         }
//         System.out.print(index);
//     }
// }








/*
Q9)Count Words 
Samantha was a college student majoring in English literature. One 
day, her professor assigned the class a writing exercise where they 
had to write a short story. Samantha was 
13 
 
excited about the challenge, but she wasn't sure how to keep track of 
the word count as she wrote. 
Can you create a program that can count the number of words present in 
Samantha's short story? 
Input Format 
Input contains a String str. 
Constraints 
1<=Str.length()<=100000 
Output Format 
Return An integer value. 
Sample Input 0 
Welcome to GLA 
Sample Output 0 
3 
Explanation 0 
3 words are present in string i.e welcome, to, GLA. 
Test Case:- 
Input Output 
Welcome to Gla university 4 
I am btech student 4 
Hello coder 2 
Dsa is necessary for placement 5 
The quick brown fox jumps over 
the lazy dogs 
9 
// */
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter any string to check number of word:");
//         String s=sc.nextLine();
//         sc.close();
//         int count=1;
//         int n=s.length();
//         for(int i=0;i<n-1;i++){
//             if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
//                 count++;
//             }
//         }
//         System.out.print("Number of word="+count);
//     }
// }







/*
Q10)Count Vowel 
In the magical kingdom of Lingua, where words held immense power, there 
lived a young linguist named Ava. One day, Ava embarked on a quest to 
count the vowels in a mysterious sentence said to unlock hidden 
treasures. The sentence was inscribed on an ancient scroll, and its 
vowels were said to be the key to finding the kingdom's greatest secret. 
Can you help Ava decipher the sentence and uncover the hidden riches of 
Lingua? 
Input Format 
Input contains a Sentence str. 
Constraints 
Sentence str containing only the small case alphabet. 
Sample Input 0 
hello how are you 
Expected Output 0 
7
Explanation: 
In this test case, the input sentence contains 7 vowels ('e', 'o', 
'o', 'a', 'e', 'o', 'u').
// */
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter any String:");
//         String s=sc.nextLine();
//         s=s.toLowerCase();
//         int n=s.length();
//         sc.close();
//         int count =0;
//         for(int i=0;i<n;i++){
//             char c=s.charAt(i);
//             if(c =='a' || c=='e' || c=='i' || c=='o' || c=='u'){
//                 count++;
//             }
//         }
//         System.out.print("No.of vowels="+count);
//     }
// }





/*
Q11)Strings-Remove Duplicates 
Take as input S, a string. Write a function that removes all 
consecutive duplicates. Print the value returned. 
Input Format 
String 
Constraints 
A string of length between 1 to 1000 
Output Format 
String 
Sample Input 
aabccba 
Sample Output 
abcba 
Explanation 
For the given example, "aabccba", Consecutive Occurrence of a is 2, b 
is 1, and c is 2. After removing all of the consecutive occurrences, 
the Final ans will be : - "abcba". 
*/
// import java.util.*;
// public class practice{
//     public static void main(String args []){
//         Scanner sc=new Scanner(System.in);
//         String str =sc.nextLine();
//         sc.close();
//         StringBuffer sb =new StringBuffer();
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             int index = str.indexOf(ch,i+1);
//             if(index==-1){     // check next charcter is same or not 
//                 sb.append(ch);
//             }
//         }
//         System.out.print(sb);
//     }
// }




