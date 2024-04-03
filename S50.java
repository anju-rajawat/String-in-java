//50. Write a program to separate all tokens (words) using StringTokenizer

import java.util.StringTokenizer;

public class S50 {
  public static void main(String[] args) {
    String token="Hello, how are you?";
    StringTokenizer t=new StringTokenizer(token," ");
    while (t.hasMoreTokens()) {
        System.out.println(t.nextToken());
        
    }


  }    
}
