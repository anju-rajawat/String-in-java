//49. Write a program to Check given strings are Anagram or not
public class S49 {
   public static void main(String[] args) {
    String s1="lis  ten";
    String s2="silenT";
     s1=s1.toLowerCase();
     s2=s2.toLowerCase();
    
     s1=s1.replaceAll(" ", "");
     s2=s2.replaceAll(" ", "");

    char a1[]=s1.toCharArray();
    char a2[]=s2.toCharArray();
    
    int i,j;

    for(i=0;i<a1.length;i++){
        for(j=i+1;j<a1.length;j++){
            if(a1[i]>=a1[j]){
                char temp=a1[i];  
                a1[i]=a1[j];
                a1[j]=temp;

            }
        }
       // System.out.println(a1[i]);
    
    }

    for(i=0;i<a2.length;i++){
        for(j=i+1;j<a2.length;j++){
        if(a2[i]>=a2[j]){
            char temp=a2[i];
            a2[i]=a2[j];
            a2[j]=temp;
        }

        }
     //   System.out.println(a2[i]);
    }

    for(i=0;i<a1.length;i++){
        for(i=0;i<a2.length;i++){
            if(a1[i]==a2[i]){
                System.out.println("String is anagram");
            }
            else{
                System.out.println("not gram");
            }
        }
    }

   }    
}
