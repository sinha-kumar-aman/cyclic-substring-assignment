import java.util.HashSet;
public class CyclicSubstringMaxSum {
    public static int maxCyclicSubstringSum(String s) {
        int n = s.length();
        String doubled = s + s; 

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int currentSum = 0;
        int maxSum = 0;
      
        for (int right = 0; right < doubled.length(); right++) {
            while (set.contains(doubled.charAt(right))) {
                char leftChar = doubled.charAt(left);
                set.remove(leftChar);
                currentSum -= (leftChar - 'a' + 1);
                left++;
            }
            char currentChar = doubled.charAt(right);
            set.add(currentChar);
            currentSum += (currentChar - 'a' + 1);
            if (right - left + 1 > n) {
                char leftChar = doubled.charAt(left);
                set.remove(leftChar);
                currentSum -= (leftChar - 'a' + 1);
                left++;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        String input = "abca";
        int result = maxCyclicSubstringSum(input);
        System.out.println("Maximum Sum: " + result);
    }
}
