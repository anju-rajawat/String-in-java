//37. Write a Java program to check if the letter 'x' is present in the word 'String Exercises'
// public class S38 {
//     public static void main(String[] args) {
//       int a[]={3,54,6,78};
//       int i,j;
//       int num=78;
//       int flag=0;
      
//       for(i=0;i<a.length;i++){
//         if(a[i]==num){
//          flag=1;
//          j=a[i];
//          System.out.println(j); 
    
//          break;
//         } 
//        }

//  if(flag==1){
//     System.out.println("number is present");
// }else{
//     System.out.println("num is not present");


//  }

//     }
// }




public class S38 {
    public static void main(String[] args) {
   String s="java is simple";
   char a[]=s.toCharArray();
   int i;
   char find='m'; 
   char s1; 
   boolean  flag=false;
   for(i=0;i<a.length;i++){
    if(a[i]==find){
      flag=true;
      s1=a[i]; 
      System.out.println(s1);
      break;

    }
   }


   if(flag==true){
    System.out.println("Character is present");
   }else{
    System.out.println("Character is not present");
   }
 }

}