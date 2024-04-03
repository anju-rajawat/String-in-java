//40. Write a Java program to Count Number of Uppercase and Lowercase letters
public class S40 {
    public static void main(String[] args) {
    String s1="Java Is Simple";
    char a[]=s1.toCharArray();
    int i;
    int Upercount=0;
    int LoverCount=0;
    for(i=0;i<a.length;i++){
    char ch=s1.charAt(i);
    // if(ch<95){
        if(ch>='A' && ch<='Z' && ch<95){
        
         Upercount++;
        
        //System.out.print(" "+ch);
        
        
    }
    else if(ch>='a' && ch<='z'){
        LoverCount++;
    //System.out.print(" "+ch);
    }
        
    } 
    System.out.println(Upercount);
    System.out.println(LoverCount);
     
    }
}
