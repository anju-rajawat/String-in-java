//32. Write a Java program to print after removing duplicates from a given string
// public class S33 {
//     public static void main(String[] args) {
//      String s="sannnnaaaaa";
//      char a[]=s.toCharArray();
//      int i,j;
//      for(i=0;i<a.length;i++){
//         for(j=i+1;j<a.length;j++){
//             if(a[i]==a[j]){
//             // System.out.print(" "+a[i]);
//             break;
          //  }
            // else{
            //    System.out.print(" "+a[j]); 
//             // }
//         }
//      }
//     }
// }






// 


// public class S33 {
//     public static void main(String[] args) {
//      //String s="removing duplicates";
//      int a[]={2,3,4,2,5,6,2};
//      int i,j;
//      for(i=0;i<a.length;i++){
//         for(j=i+1;j<a.length;j++){
//           if(a[i]==a[j]){
//             System.out.print(" "+a[i]);
//           }  
//         }
//      }
//     }
// }


// public class S33 {
    //     public static void main(String[] args) {
    //         String s = "sannnnaaaaa";
    //         char[] a = s.toCharArray();
    //         int length = a.length;
            
    //         // Check for empty string
    //         if (length == 0) {
    //             System.out.println("String is empty.");
    //             return;
    //         }
            
    //         // Initialize a flag array to keep track of visited characters
    //         boolean[] visited = new boolean[length];
            
    //         // Iterate through each character of the string
    //         for (int i = 0; i < length; i++) {
    //            // System.out.println(!visited[i]);
    //             if (!visited[i]) {
    //                 System.out.println(a[i]); // Print the character if it's not visited yet
    //                 // Mark all occurrences of the current character as visited
    //                 for (int j = i + 1; j < length; j++) {
    //                     if (a[i] == a[j]) {
    //                         visited[j] = true;
    //                     }
    //                 }
                    
    //             }
    //         }
    //         System.out.println(s);
    //     }
    // }

    /*
import javax.sound.midi.Soundbank;

class Doblicate{
        public static void main(String[] args) {
           String s="sannnnaaaaa";
           char a[]=s.toCharArray();
           if(s.length()==0){
            System.out.println("String is empty.");
                 return;}
            int i;     
            for(i=0;i<a.length;i++){
              System.out.println(a[i]);
                 for (int j = i + 1; j <a.length; j++) {
                    if (a[i] == a[j]) {
                     a[j] = 0;
                  }
                 }
                }
                System.out.println(a);
            }     


        }
    

*/


class Student {
  public static void main(String[] args) {
    String str ="programming";
    StringBuilder sb1 = new StringBuilder();
    
    for(int i=0; i<str.length();i++){
      char ch = str.charAt(i);
      int idx = str.indexOf(ch,i+1);
      
      if(idx == -1){
        sb1.append(ch);
      }
      // else{
      //   System.out.println(ch);
      // }
    }
    System.out.println(sb1);
  }
}





