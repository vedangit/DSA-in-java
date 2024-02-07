public class reversewords {
    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i>=0; i--){
            int sub = i;
            while(i>=0 && s.charAt(i)!= ' '){
                i--;
            }

            String word = s.substring(i+1, sub+1);
            if(word.equals("")){
                continue;
            }
            sb.append(word).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello from the other side"));
    }
}
