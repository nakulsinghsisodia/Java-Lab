public class ReverseWordsWithBuilder {
    public static void main(String[] args) {
        String sentence = "Hello World Java";
        String[] words = sentence.split(" ");

        System.out.println("Reversed words:");

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();  // reverses the word
            System.out.print(sb + " ");
        }
    }
}

output: Reversed words:
olleH dlroW avaJ 
