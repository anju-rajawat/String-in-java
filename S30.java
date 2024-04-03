// 28. Write a Java program to Swap Two Strings without Third String Variable
public class S30 {
    public static void main(String[] args) {
      String s1="java";
      String s2="simple";
      char a[]=s1.toCharArray();
      char b[]=s2.toCharArray();
     int i,j;
     
      for(i=0;i<a.length;i++){
          
        a[i] = (char) (a[i] ^ b[i]);
        b[i] = (char) (a[i] ^ b[i]);
        a[i] = (char) (a[i] ^ b[i]); 
    
    }
    System.out.println(new String(a)+" "+new String(b));
    }
}



class SwapStrings {
  public static void main(String[] args) {
      String str1 = "Hello";
      String str2 = "World";

      System.out.println("Before swapping:");
      System.out.println("str1 = " + str1);
      System.out.println("str2 = " + str2);

      // Swapping without using any inbuilt string methods
      // Using XOR bitwise operation
      str1 = str1 + str2;
      str2 = str1.substring(0, str1.length() - str2.length());
      str1 = str1.substring(str2.length());

      System.out.println("\nAfter swapping:");
      System.out.println("str1 = " + str1);
      System.out.println("str2 = " + str2);
  }
}
