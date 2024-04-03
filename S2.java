// public class S2 {
//     public static void main(String[] args) {
//       int num=122,num2=num,rev=0,rem;
//       while(num!=0){
//         rem=num%10;
//         rev=rev*10+rem;
//         num=num/10;


//       } 
//       System.out.println(rev);
//       if(num2==rev){
//         System.out.println("Number is palindrom");
//       }else{
//         System.out.println("Number is Not palindrom");
//       }
//     }
// }




/*
public class S2 {
    public static void main(String[] args) {
    String rev="NaN";
    String r=rev;
    String a[]=rev.split(" ");
    String rev2="";
    String rev3="";
    int i,j;
    for(i=0;i<a.length;i++){
    rev2=a[i];
    
    for(j=rev2.length()-1;j>=0;j--){
       rev3=rev3+rev2.charAt(j);
    }
        
    }
    System.out.println(rev3+"  "+r);
    if(r.equals(rev)){
        System.out.println("String is palindrom ");
    }
    else{
        System.out.println("String  is not palindrom  ");
    }
    }

} */
 class StringReversal {
    public static void main(String[] args) {
        String str = "nan";
        String str2=str;
        // String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        //System.out.println("Reversed string: " + reversed);
   // }

    // public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        // Initialize a character array to store the reversed string
        char[] reversedArray = new char[length];
        // char[] reversedArray1 = new char[length];

        String g="";
        // Iterate through the original string from end to start
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = charArray[i];
                //  reversedArray1[j]=reversedArray[j];
// 
        }
        System.out.println(reversedArray);

        if(reversedArray.equals(str2))
            {
                System.out.println("p");
            }
            else{
                System.out.println("n");
            }
        // Convert the character array back to string
       // return new String(reversedArray);
    // }
}
 }