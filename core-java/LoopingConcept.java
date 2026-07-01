package practicejava;

public class LoopingConcept {

    public static void main(String[] args) {

        int n = 5;

        // 1. Simple left-aligned triangle
        System.out.println("Pattern 1: Left-aligned triangle");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2. Inverted left-aligned triangle
        System.out.println("\nPattern 2: Inverted triangle");
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 3. Right-aligned triangle (pyramid leaning right)
        System.out.println("\nPattern 3: Right-aligned triangle");
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 4. Pyramid (centered triangle)
        System.out.println("\nPattern 4: Pyramid");
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 5. Number triangle
        System.out.println("\nPattern 5: Number triangle");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}