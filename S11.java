/*11) Input name of a person and count how many vowels it contains. Use String class methods.*/

import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of person ");
        String name=sc.next().toLowerCase();
        int vovel=0;
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
          if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'){
            vovel++;
          }
        }
  System.out.println(vovel);
    }
}
