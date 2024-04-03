/*5) Write a java program to reverse each word of String.
	Sample Input: “Java Is Plateform Independent”
	Output: “avaJ sI mrofetalP tnednepednI”
*/
/*
class S{
    public static void main(String[] args) {
      String s1="Java Is Plateform Independent";
       System.out.println(s1);

      String a[]=s1.split(" ");
      String rev1=" ";
      String rev2=" ";
       int i,j;
      for(i=0;i<a.length;i++){
        String rev=a[i];
      for(j=rev.length()-1;j>=0;j--){
         rev1=rev1+rev.charAt(j);
      }
     rev2=rev2+rev1+"";
    }
    System.out.println();
   System.out.print(" "+rev2);
      
   }
    }


*/

import java.util.Scanner;

/**
  * S5
  */
 public class S5 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("ENter String");
    String s1=s.nextLine();
    String a[]=s1.split(" ");
    String words="";
    int i,j;
    for(i=0;i<a.length;i++){
      words=a[i];
      String rev="";
      for(j=words.length()-1;j>=0;j--){
        rev=rev+words.charAt(j);
      }
      System.out.println(rev);
    }

  }
  
 }