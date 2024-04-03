/*8) WAP to find out total occurrence of each letter in string.
	 Sample Input: “aabbccddd”
	 Output:a- 2 times
			b- 2 times
			c- 2 times
			d- 3 times


public class S8{
    public static void main(String[] args) {
        String s="aabbccddd";
        char a[]=s.toCharArray();
        int c=0,i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<=a.length;j++){
                if(a[i]==a[j]){
                    c++;
                }
                
                else{
                    break;
                }
            
            }   

            System.out.println(a[i]+" "+c);
            i+=(c-1);
             
            
        }
    }
}
*/

/**
 * S8
 */
public class S8 {
  public static void main(String[] args) {
   String s1="aabbccddd";
   char a[]=s1.toCharArray();
    int i,j;
   for(i=0;i<a.length;i++){
     int count=1;
     boolean flag =true;
     for(j=i-1;j>=0;j--){
        if(a[i]==a[j]){
            flag=false;
            break;

              }
     }

     if(flag){

     for(j=i+1;j<a.length;j++){
       if(a[i]==a[j]){
        count++;
       }

    }
    System.out.println(count+"-"+a[i]);
     
     }
     
   }  
  }
    
}





/**
 * S8 
 */
//  class Accorance {
//    public static void main(String[] args) {
//     String s1="“aabbccddd";
//     char a[]=s1.toCharArray();

//      int i,j,c=0;
//      for(i=0;i<a.length;i++){
//         for(j=0;j<=a.length;j++){
//             if(a[i]==a[j]){
//               c++;  
              
//             }else{
//                  break;
//             }
//         }
//         System.out.println(a[i]+" "+c);
//         i+=(c-1); 
//      }
       
//    }
    
// }