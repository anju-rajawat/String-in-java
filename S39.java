//39. Write a Java program to Given string Convert Uppercase to Lowercase
public class S39 {
    public static void main(String[] args) {
        String s = "JAVA IS SIMPLE";
        String a[] = s.split(" ");
        String d ="";
        StringBuilder as=new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            char ch[] = a[i].toCharArray(); // Get the characters of each word
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] >= 'A' && ch[j] <= 'Z') {
                    ch[j] = (char) (ch[j] + 32);
                   d=ch[j]+"";
               
                }
                as.append(ch[j]); 

                System.out.print(" "+d);
               
            }
            as.append(" ");
            String an=new String(d);
             System.out.println(an.replaceAll(an, " "));
            System.out.println(as);
           
           
        }
        // System.out.println(ans.toString().trim()); // Trim to remove trailing space and print the result
    }
}
