/*) WAP to find word of maximum length in given String.
	Sample Input: “Dear Student, you have need to work hard”
	Output: “Student”
*/

// public class S9 {
//   public static void main(String[] args) {
//   String s="Dear Student hard";
//   //String a[]=s.split(" ");
//   String word="",lword=" ";
//   int len=s.length();
//   int leng=0,i,m=0;
//    for(i=0;i<len;i++){
//       char ch=s.charAt(i);
//       if(ch!=' '){
//         word+=ch;
//     }
//     else{
//       if(word.length()>lword.length()){
//         lword=word;
//         word="";
//       }
//     }
//   }
       
//   System.out.print(lword);
//   System.out.println();
//    System.out.print("length "+lword.length());
  
//   }    
// }




/**
 * S9
 */
class S9 {
   public static void main(String[] args) {
    String s1="Dear Student, you have need to work hard";
    char a[]=s1.toCharArray();
    int i,j;
    String word="",lword=" ";
    for(i=0;i<a.length;i++){
    char c=s1.charAt(i);
       if(c!=' '){
        word+=c;
       } 

      
    }
    System.out.println(word.length());
  

   }
  
}