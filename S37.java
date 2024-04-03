//36. Write a Java program How to check Palindrome String
public class S37{
    public static void main(String[] args) {
     String s="nan";
     String a[]=s.split(" "); 
     String rev="";   
     String rev2="";
     String rev3="";
     String or=s;
     int i,j;

     for(i=0;i<a.length;i++){
        rev=a[i];
       for(j=rev.length()-1;j>=0;j--){
        rev2=rev2+rev.charAt(j);
       }
       
       rev3=rev3+rev2+" ";
    
       
     }
     System.out.println(rev3);
    
    
     if(rev2.equals(s)){
        System.out.println("palindrom");
     }else{
        System.out.println("not palindrom");
     }
    }
}
