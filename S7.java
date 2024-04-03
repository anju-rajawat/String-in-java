/*7)WAP to remove the duplicate letters from given String.
	Sample Input: “aabbccddd”
	Output: “abcd”
*/
public class S7 {
   public static void main(String[] args) {
    String s="aabbcddd";
    String s1=" ";
    int i;
    

    for(i=0;i<s.length();i++){
        char c=s.charAt(i);
           if(s1.indexOf(c)==-1){
               s1+=c;
           }

        
        }
System.out.println(s1);
        
       }


    }
       

