import java.util.ArrayList;
import java.util.List;

public class PermutationInString {
    private final List<String> answers = new ArrayList<>();

    public List<String> permute(String str, int l, int r) {
        if (l == r)
            answers.add(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
        return answers;
    }

    /**
     * Swap Characters at position
     *
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public boolean checkInclusion(String s1, String s2) {
        List<String> permutationS1 = this.permute(s1, 0, s1.length() - 1);
        for(String s : permutationS1) {
            if (s2.contains(s)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PermutationInString permutation = new PermutationInString();
        System.out.println(permutation.checkInclusion("abcdxabcde", "abcdeabcdx"));

    }
}
