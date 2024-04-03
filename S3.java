public class S3 {
    public static void main(String[] args) {
        String s="$ja!va$&st%art";
        // String rev=s.replaceAll("[^a-z A-Z0-9]", "");
        // System.out.println(rev);
        char a[]=s.toCharArray();
        int i;
        
        for(i=0;i<a.length;i++){
            char str=a[i];
           if((str>='a' && str<='z')||(str>='A' && str<='Z')||(str>=0 && str<=9)){
            System.out.print(" "+str);
           }
           
        }
    }   
}
