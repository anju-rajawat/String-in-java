//46. Write a program to First alphabet capital of each word in given string
// public class S46 {
//     public static void main(String[] args) {
//     String s="hello i am java";
//     String a[]=s.split(" "); 
//     int i;
//     // for(i=0;i<a.length;i++){
//     //     a[i].substring(0,1).toUpperCase()+a[i].substring(1,a[i].length());
    
//     //     System.out.println(lete+" "+a[i]);  
//     // }

//     for(String word:a){
//         System.out.print(word.substring(0,1).toUpperCase()+word.substring(1, word.length())+" ");
//     }
//   System.out.println();
//     for(i=0;i<a.length;i++){
//         System.out.print(a[i].substring(0, 1).toUpperCase() + a[i].substring(1) + " ");
//     //   System.out.print(a[i].substring(0, 1)).toUpperCase()+a[i].substring(1,a[i].length());  
//     }
// }
// }


/// 95 smole  and 65 capital
public class S46 {
    public static void main(String[] args) {
    String s="hello i am Java";
    String a[]=s.split(" ");
    int i;
    String ans="";
    for(i=0;i<a.length;i++){
     char ch[]=s.toCharArray();
   //  System.out.println((int)(ch[0]));  //104-32=72

     if(ch[0]>95){     //all are greter then of 95
          
        ch[0]=(char)((int)(ch[0])-32);    
        a[i]=new String(ch);
        ans=ans+a[i]+"";
    }
    System.out.println(ans);
      
  }
    
}
}



class S {
  public static void main(String[] args) {
      String s = "java is simple";
      String a[] = s.split(" ");
      String ans = "";
      for (int i = 0; i < a.length; i++) {
          char ch[] = a[i].toCharArray(); // Get the characters of each word
          if (ch[0] >= 'a' && ch[0] <= 'z') {
              ch[0] = (char) (ch[0] - 32); // Convert first character to uppercase
          }
          ans = ans + new String(ch) + " "; // Append modified word to result
      }
      System.out.println(ans.trim()); // Trim to remove trailing space and print the result
  }
}
