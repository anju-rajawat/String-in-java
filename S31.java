//30. Write a Java program How to search a word inside a string? 
public class S31 {
  public static void main(String []args){
    String s="search a word";
    char a[]=s.toCharArray();
    int i;
    int ind=s.indexOf("word");
       
        if(ind==-1){
        System.out.println("Not found");
       }   else{
        System.out.println("fount");
       }

     
    }
    
} 