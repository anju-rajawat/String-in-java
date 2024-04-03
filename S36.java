//35. Write a Java program to find maximum between two string
// public class S36 {
//     public static void main(String[] args) {
//      String s="java";
//      String s1="java is";

//      int comp=s.compareTo(s1);
//      if(comp>0){
//         System.out.println("Maximum string: " + s);
//      }else if(comp<0){
//         System.out.println("Maximum string: " + s1);
//      }else{
//         System.out.println("Both strings are equal");
//      }
     
//     }
// }



// view dilevery boy profile
//order traking



public class S36 {
    public static void main(String[] args) {
     String s="java is";
     String s1="java is";
     s.replace(" ","");
     s1.replace(" ","");
     int i = s.length();
     int j = s1.length();
     System.out.println(i+" "+j);
    // System.out.println(i +""+j);
     if(i<j){
        System.out.println("j is greater then i");
     }
     if(i>j){
        System.out.println("i is greater then j");
     }else{
        System.out.println("both are eqal");
     }
     
     
    }
}
