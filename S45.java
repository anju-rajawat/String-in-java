//45. Write a program to Compare the strings using equals(), compareTo() and == operator
public class S45 {
  public static void main(String[] args) {
  String s1="java";

  String s2=new String("java");
  String s3="java";
  System.out.println(s1==s2);  //false
  System.out.println(s1.equals(s2)); //true
  System.out.println(s1.compareTo(s2));  // true 0 and false 1 also work like equels method    
  System.out.println(s1==s3);   // true
  
  }    
}
