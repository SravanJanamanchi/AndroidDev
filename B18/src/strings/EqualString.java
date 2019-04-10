package strings;

public class EqualString {
public static void main(String args[]){  
String s1="sravan";  
String s2="sravan";  
String s3="SRAVAN";  
String s4="Java";  
System.out.println(s1.equals(s2));//true because content and case is same  
System.out.println(s1.equals(s3));//false because case is not same  
System.out.println(s1.equals(s4));//false because content is not same  
}}  
