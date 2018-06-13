
public class Staticexample {
 static int var;
 static int var2;
 static
 {
	 var=10;
	 System.out.println("Inside static block  "+var);
 }
 static
 {
	 var2=11;
	 System.out.println("Inside second static block  "+var2);
 }
 Staticexample()
 {
	 System.out.print("Inside constructor");
 }
 public static void main(String[] args)
 {
	Staticexample s=new Staticexample();
 }
}
