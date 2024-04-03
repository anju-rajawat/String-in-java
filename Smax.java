/*
 *9) WAP to find word of maximum length in given String.
	Sample Input: “Dear Student, you have need to work hard”
	Output: “Student”
*/
// class MaxLengthWord {
//     public static void main(String[] args) {
//         String inputString = "Dear Student, you have need to work hard";
//         String[] words = inputString.split("\\s+"); // Split the string into words
        
//         String maxWord = "";
//         int maxLength = 0;
        
//         for (String word : words) {
//             // Check if the current word's length is greater than the maximum length found so far
//             if (word.length() > maxLength) {
//                 maxLength = word.length();
//                 maxWord = word;
//             }
//         }
        
//         System.out.println("Word with maximum length: " + maxWord);
//     }
// }




class MaxLengthWord {
    public static void main(String[] args) {
        String inputString = "Dear Student, you have need to work hard mynameispagl";
        String[] words = inputString.split("\\s+"); // Split the string into words
        
        String maxWord = "";
        int maxLength=0;
        
        for (int word=0;word<words.length;word++) {
            // Check if the current word's length is greater than the maximum length found so far
            if (words[word].length() > maxLength) {
               // if(7>maxLength){
                System.out.println(words[word].length());
                maxLength = words[word].length();
                maxWord = words[word];
                System.out.println(maxWord);

            }
        }
        
        System.out.println("Word with maximum length: " + maxWord);
    }
}


/*
 public class MinLengthWord {
    public static void main(String[] args) {
        String inputString = "This is a sample string with words of different lengths";
        String[] words = inputString.split("\\s+"); // Split the string into words
        
        String minWord = "";
        int minLength = Integer.MAX_VALUE;
        
        for (String word : words) {
            // Check if the current word's length is less than the minimum length found so far
            if (word.length() < minLength) {
                minLength = word.length();
                minWord = word;
            }
        }
        
        System.out.println("Word with minimum length: " + minWord);
    }
}

*/