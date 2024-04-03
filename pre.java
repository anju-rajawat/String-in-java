// public class pre {
//    public static void main(String[] args) {
//    String s="nan";
//    String s1=s;
//    String a[]=s.split(" ");
//    String rev="";
//    String rev1="";
//    String rev3="";
//    int i,j;
//    for(i=0;i<a.length;i++){
//     rev=a[i];
//     for(j=rev.length()-1;j>=0;j--){
//      rev1=rev1+rev.charAt(j);
//     }
//     rev3=rev3+rev1+"";
//    } 
//    System.out.print(" "+rev3);
//    System.out.println(s1);
//   if(s1.equals(rev3)){
//    System.out.println("Palindrom");
//   }else{
//    System.out.println("Not Palindrom");
//   }


// }   
// }

/**
 * pre
 */
// public class pre {

//    public static void main(String[] args) {
//       String s="nan";
//    String s1=s;
//    String a[]=s.split(" ");
//    String rev="";
//    String rev1="";
//    String rev3="";
//    int i,j;
//    for(i=0;i<a.length;i++){
//     rev=a[i];
//     for(j=rev.length()-1;j>=0;j--){
//      rev1=rev1+rev.charAt(j);
//     }
  
//    } 

//    if(rev1.equals(s))
//       {
//          System.out.println("p");
//       }
//    else{
//       System.out.println("n");
//    }
//    }
// }



/**
 * pre
 */
// public class pre {
//   public static void main(String[] args) {
//    String s="java is simple";
//    String a[]=s.split(" ");
//    int i;
//    String ans="";
//    for(i=0;i<a.length;i++){
//       char ch[]=s.toCharArray();
//       if(ch[0]>95){
//         ch[0]=(char)((int)ch[0]-32);
//         a[i]=new String(ch);
//         ans=ans+a[i]+" ";

//       }
//       System.out.println(ans);
   
//    }
   
//   }
   
// }



/**
 * pre
 */
public class pre {
  public static void main(String[] args) {
   String s="java";
   
   char a[]=s.toCharArray();
  int i,j;
   for( i=0; i<a.length; i++){
      //System.out.println(a[i]);
      for( j=1; j<i; j++){
          if(a[i]>=a[j]){ 
         char tem;
         tem=a[i];
          a[i]=a[j];
          a[j]=tem;
          }
        
       }
       System.out.println(a[i]);
   }
   }
}





