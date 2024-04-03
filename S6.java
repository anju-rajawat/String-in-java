/*6) Write a java program to find all possible palindrome of given String.
	Sample Input: “aaabbbacccababacccaabb”
*/
/*public class S6 {
public static void main(String[] args) {
    String s="aaabbbacccababacccaabb";
    //String s="abba";
    
    String ar[]=s.split(" ");
    String rev1=" ";String rev2=" ";
    int i,j;
    for(i=0;i<ar.length;i++){
        String rev=ar[i];
        for(j=rev.length()-1;j>=0;j--){
            rev1=rev1+rev.charAt(j);
        }
        
        rev2=rev2+rev1+" ";
    }
    System.out.print(rev2);
    System.out.println();
    
     char ar1[]=s.toCharArray();
     char ar2[]=rev2.toCharArray();
     boolean f=false;
     for(i=0;i<ar1.length;i++){
        for(j=0;j<ar2.length;j++){
           if(ar1[i]==ar2[j]){
             f=true;
             break;   
          }
        }
        
     }
     if(f==true){
           System.out.println("palindorm");

        }
        else{
            System.out.println("noty ");
        }
        
     }
}    
*/

/**
 * S6
 */
public class S6 {
   public static void main(String[] args) {
    // String s1="aaabbbacccababacccaabb";
    String s1="dkmjid";
    String a[]=s1.split(" ");
    String word=" ";
    String rev="";
    String rev2="";
    int i,j;
    for(i=0;i<a.length;i++){
        word=a[i];
        for(j=word.length()-1;j>=0;j--){
          rev=rev+word.charAt(j);
        }
       
    System.out.println(rev);
    
    
    
}
 boolean flag=false;
char a2[]=s1.toCharArray();
char a1[]=rev.toCharArray();
     for(i=0;i<a2.length;i++){
        for(j=0;i<a1.length;j++){
            if(a1[j]==a2[i]){
               flag=true;
               break;
            }
        }
     }
     if(flag==true)
       System.err.println("Plaindrom");
      else
         System.out.println("not palindrom"); 
   }
    
}
