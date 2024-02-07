public class reversevowels {

    public static String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int n = s.length();
        int start = 0;
        int end = n-1;


        while(start<end){
            while(!isVowel(word[start])){
                start++;
            }

            while(!isVowel(word[end])){
                end--;
            }

            if(start<end){
                swap(word, start, end);
                start++;
                end--;
            }

        }

        return new String(word);
}


    public static boolean isVowel(char c){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                return true;
            }

            return false;
    
    }

    public static void swap(char[] word, int start, int end ){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("Vedangi"));
    }
}
