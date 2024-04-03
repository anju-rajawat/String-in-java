/*13)WAP check if two Strings are anagrams of each other?
(Hint Anagram words: LISTEN - SILENT 
TRIANGLE - INTEGRAL)*/

/*
public class S1 {
  public static void main(String[] args) {
  int a[]={7,5,6,2,4};
  int i,j,temp=0;  
  for(i=0;i<a.length;i++){
   for(j=i+1;j<a.length;j++){
    if(a[i]>=a[j]){
       temp=a[i];
       a[i]=a[j];
       a[j]=temp;
    }
   }
   System.out.println(a[i]);
  
  }
 
}
} */

/* 
public class S1 {
  public static void main(String[] args) {
   String a="LISTEN";
   String b="SILENT";
   char a1[]=a.toCharArray();
   char b1[]=b.toCharArray();
   int i,j;



  
    for(i=0;i<a1.length;i++){
       for(j=i+1;j<a1.length;j++){
        
        if(a1[i]>=a1[j]){
            char temp=a1[i];
            a1[i]=a1[j];
            a1[j]=temp;     
        }  
    }
    System.out.print(" "+a1[i]);
}
System.out.println();

for(i=0;i<b1.length;i++){
    for(j=i+1;j<b1.length;j++){
     
     if(b1[i]>=b1[j]){
         char temp=b1[i];
         b1[i]=b1[j];
         b1[j]=temp;     
     }  
 }
 System.out.print(" "+b1[i]);
}

for(i=0;i<a1.length;i++){
    for(i=0;i<b1.length;i++){
        if(a1[i]==b1[i]){
            System.out.println("anafgram"+a1[i]+""+b1[i]);
         }  
         else{
            System.out.println("not anagram");
         }
        
    }
}


  }    
}
*/









/*
class A{
public static void main(String[] args) {
    String a="LISTEN is";
    String b="SILENT SI";
    a=a.replace(" ","");
    b=b.replace(" ", "");

    a=a.toLowerCase();
    b=b.toLowerCase();

    char a1[]=a.toCharArray();
    char b1[]=b.toCharArray();
    int i,j;
 
 
 
   
     for(i=0;i<a1.length;i++){
        for(j=i+1;j<a1.length;j++){
         
         if(a1[i]>=a1[j]){
             char temp=a1[i];
             a1[i]=a1[j];
             a1[j]=temp;     
         }  
     }
     System.out.print(" "+a1[i]);
 }
 System.out.println();
 
 for(i=0;i<b1.length;i++){
     for(j=i+1;j<b1.length;j++){
      
      if(b1[i]>=b1[j]){
          char temp=b1[i];
          b1[i]=b1[j];
          b1[j]=temp;     
      }  
  }
  System.out.print(" "+b1[i]);
 }

  
 for(i=0;i<a1.length;i++){
     for(i=0;i<b1.length;i++){
         if(a1[i]==b1[i]){
             System.out.println("anafgram"+a1[i]+""+b1[i]);
          }  
          else{
             System.out.println("not anagram");
          }
         
     }
 }
 
 
   }    
 
}*/

import java.util.Arrays;

class A{
    public static void main(String[] args) {
        String s1="LISTEN";
        String s2="SILENT";
       
    // System.out.println(s1==s3);//true

    
    char a1[]=s1.toCharArray();
    char a2[]=s2.toCharArray();

    Arrays.sort(a1);
    Arrays.sort(a2);

   // boolean x=Arrays.equals(a1, a2);
  // boolean x = a1.equals(a2);
//   boolean x = 
//     System.out.println(x);

    // if(a1.equals(a2)){
    //     System.out.println("Anagram ");
    // }else{ 
    //     System.out.println("Not Anagram");
    // }
    

    }
}