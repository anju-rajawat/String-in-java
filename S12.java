public class S12 {
  public static void main(String[] args) {
    String s="67, 89, 23, 67, 12, 55, 66";
    String []num=s.split(", ");
    int sum=0;
    for(String numb:num){
        sum+=Integer.parseInt(numb);
    }
    System.out.println(sum);
  }  
}
