import java.util.Scanner;

public class w {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice");
            System.out.println("1 :Ensert data");
            System.out.println("2 :update data");
            System.out.println("3 :Delete data");
            int ch= sc.nextInt();
            
            switch(ch){
                case 1:
                   
                   System.out.println("1 :Ensert data");
                 break;
                case 2:
                  System.out.println("2 :update data");
                  break;
                case 3:
                    System.out.println("3 :Delete data");
                  break;
                default:
                    System.out.println("rong input ");            
                        
            }
           break;    
            
        }
    }
    
}
