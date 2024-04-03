//10) WAP to count the word whose first letter is vowel.
public class S10 {
  public static void main(String[] args) {
    String s="Dear Student hard Anjali";
    char a[]=s.toCharArray();
     int i,vovelcount=0;
    for(i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'){
          vovelcount++;
        }
    }
    System.out.println(vovelcount);
  }    
}
