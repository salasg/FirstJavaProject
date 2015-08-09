public class java_1 {

/** 

* Multi line or Block comments 

**/

//Function in which control comes for the first time

public static void main(String[] args) { 

//Single line comment 

System.out.println("Hello World"); // prints Hello World
System.out.println("TEP Selenium");

//short cut to print 'System.out.println();' --> Syso <Ctrl> + <space bar>

 

//Difference between println & print statements

System.out.println("1st Line"); 

System.out.println("2nd Line"); 

System.out.println("3rd Line"); 

System.out.print("1st Line"); 

System.out.print("2nd Line"); 

System.out.println("3rd Line"); 

 

//Data type in Java

byte aa = 127; //Max -> (2^7) -1 

byte bb = -128; //Min -> (-2^7)

byte a1 = 127, b1 = -128; 

System.out.println("byte value of a = "+aa); 

System.out.println("byte value of b = "+bb); 

System.out.println("byte value of a1 = "+a1+ " & byte value of b1 = "+b1); 

 

short s= 32767, r = -32768; // Max -> (2^15)-1 & Min -> (-2^15)

System.out.println("Short value of s = "+s+" & Short value of r = "+r); 

 

int i = 2147483647, j= - 2147483648; // Max -> (2^31)-1 & Min -> (-2^31)

System.out.println("int value of i = "+i+" & int value of j = "+j); 

i = 100; j= 200; 

System.out.println("int value of i = "+i+" & int value of j = "+j); 

 

double l = 123.4; 

System.out.println("double value of l = "+l); 

l=10; //long, double, float can also sort int

System.out.println("double value of l = "+l); 

 

float m = 234.5f; 

System.out.println("float value of m = "+m); 

m = m+i; //adding float + int

System.out.println("m + i = "+m); 

 

char letterA ='A'; 

System.out.println("char value of letterA = "+letterA); 

boolean one = true; 

System.out.println("boolean value of one = "+one); 

System.out.println("!boolean value of one = "+!one); 

 

//Type casting adding float, double & storing int

i = (int) (m+l); 

System.out.println("i = "+i); 

//The Relational Operators

int a = 10; 

int b = 20; 

System.out.println("a == b = " + (a == b)); 

System.out.println("a != b = " + (a != b)); 

System.out.println("a > b = " + (a > b)); 

System.out.println("a < b = " + (a < b)); 

System.out.println("b >= a = " + (b >= a)); 

System.out.println("b <= a = " + (b <= a)); 

 

//If else condition

int x = 100; 

int y = 200; 

if(x>y) 

{ 

 System.out.println("X is the greatest "+x); 

} 

 else

 { 

 System.out.println("Y is the greatest "+y); 

 } 

//If, else if, else condition

int x1=100; 

int y1=200; 

int z1=300; 

if(x1>y1 & x1>z1) { 

 System.out.println("x1 is greatest "+x1); 

} else if (y1>z1) { 

 System.out.println("y1 is the greatest " +y1); 

} else { 

 System.out.println("z1 is the greatest " +z1); 

 } 

//String - not a data type, its a in build class

 String str = "Java & Selenium learning "; 

 } 

}