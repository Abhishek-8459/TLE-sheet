import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColumnCollisions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of columns
        int[] c = new int[n]; // Number of objects in each column
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        List<List<Integer>> heights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> column = new ArrayList<>();
            for (int j = 0; j < c[i]; j++) {
                column.add(scanner.nextInt());
            }
            heights.add(column);
        }

        int minCollisions = calculateMinCollisions(n, c, heights);
        System.out.println(minCollisions);
    }

    private static int calculateMinCollisions(int n, int[] c, List<List<Integer>> heights) {
        int collisions = 0;

        // Move the leftmost column to the right
        for (int i = 0; i < heights.get(0).size(); i++) {
            int height = heights.get(0).get(i);
            if (heights.get(1).contains(height)) {
                collisions++;
            }
        }

        // Move the rightmost column to the left
        for (int i = 0; i < heights.get(n - 1).size(); i++) {
            int height = heights.get(n - 1).get(i);
            if (heights.get(n - 2).contains(height)) {
                collisions++;
            }
        }

        // For the middle columns, we need to decide the direction to minimize collisions
        for (int i = 1; i < n - 1; i++) {
            int leftCollisions = 0;
            int rightCollisions = 0;

            // Calculate collisions if column moves left
            for (int j = 0; j < heights.get(i).size(); j++) {
                int height = heights.get(i).get(j);
                if (heights.get(i - 1).contains(height)) {
                    leftCollisions++;
                }
            }

            // Calculate collisions if column moves right
            for (int j = 0; j < heights.get(i).size(); j++) {
                int height = heights.get(i).get(j);
                if (heights.get(i + 1).contains(height)) {
                    rightCollisions++;
                }
            }

            // Choose the direction with fewer collisions
            collisions += Math.min(leftCollisions, rightCollisions);
        }

        return collisions;
    }
}
