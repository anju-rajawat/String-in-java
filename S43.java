// 42. Write a program to Replace string with another string in java using String.replace() method
public class S43 {
    public static void main(String[] args) {
    String s= "java";
    int aa=13;
    String s11 = s.replace(s, aa);
    String s1="hello";
    String a=s.replace(s,s1);
    System.out.println(s.replace(s,s1));
     System.out.println(s);
    char g=((char)aa);
    System.out.println( s.replace(s1, g));
    }
}
