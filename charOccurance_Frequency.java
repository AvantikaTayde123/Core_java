public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        findCharacterFrequency(str);
    }

    public static void findCharacterFrequency(String str) {
        int[] freq = new int[256]; // Array for all ASCII characters

        // Count frequencies
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Print only non-zero frequencies
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}
