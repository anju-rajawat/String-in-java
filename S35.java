//34. Write a Java program to reverse words in a given string
public class S35 {
    public static void main(String[] args) {
      String  s="reverse words";
      String splil[] =s.split(" ");
      int i,j;
      String rev="";
      String rev2="";
      
      for(i=0;i<splil.length;i++){
      
        rev=rev+splil[i];
      String wor="";
      for(j=rev.length()-1;j>0;j--){
        wor=wor+rev.charAt(j);
      }
        rev2=rev2+wor+" ";
      
    }
    System.out.print(" "+rev2);
    
    }
}
