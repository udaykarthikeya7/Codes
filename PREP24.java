import java.util.*;

public class PREP24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            List<List<Integer>> permutations = findUniquePermutations(A);
            System.out.println(permutations.size());
            StringBuilder sb = new StringBuilder();
            for (List<Integer> permutation : permutations) {
                for (int num : permutation) {
                    sb.append(num).append(" ");
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }

        scanner.close();
    }

    private static List<List<Integer>> findUniquePermutations(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), results);
        return results;
    }

    private static void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> results) {
        if (current.size() == nums.length) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.add(nums[i]);
            backtrack(nums, used, current, results);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
