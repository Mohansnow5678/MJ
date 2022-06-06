package chap5;

public class StringDemo {

	public static void main(String[] args) {
	 String str=new String("hello");
	 String str2="hello";
	 
	 System.out.println(str==str2);
	 System.out.println(str.equals(str2));
	 
	 if(str.equals(str2)) {
		 
		 System.out.println("Both are equal...");
	 }
		
String v=String.format("My name is ..%s","MJ");	
	
System.out.println(v);

v=String.format("My name is is....:%s and my age.....:%d","David",20);
System.out.println(v);


v=String.format("My name is is ..%s and my age is..%d and my weight is..%f","mj",23,78.9f);


System.out.println(v);

System.out.printf("My name is is ..:%s and my age is..:%d and my weight is..:%f","Billa",23,78.5f);

System.out.println("\n");

      //substring

String g1="javapoint";
System.out.println(g1.substring(2,4));
System.out.println(g1.substring(2));

     //Endswith
String g2="javapoint";
System.out.println(g2.endsWith("t"));
System.out.println(g2.endsWith("point"));

 ///JOIN

String joinString3=String.join("Welcome", "javapoint");

System.out.println(joinString3);




System.out.printf("%.2f",100.23434343f);


System.out.println();



String txt = "Please  locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); 







System.out.printf("\n %-20s %-20s %-20s", "Column1","Column2","Column3");

System.out.printf("\n %-20s %-20s %-30s", "SNo","Name","Company");
System.out.printf("\n %-20s %-20s %-20s", "100","Ramu","Anound Technologies");


System.out.printf("\n  %20s %20s %20s","Dude","PUMP","MOTOR ");






//concat()

	
String s1="java string";    
    s1.concat("is immutable");    
  System.out.println(s1);    
s1=s1.concat(" is immutable so assign it explicitly");    
System.out.println(s1);    
	

String t1="javatpoint is a very good website";  
String replaceString=t1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
System.out.println(replaceString);  











	
	
	}}
