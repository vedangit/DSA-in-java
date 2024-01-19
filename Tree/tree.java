import java.util.Scanner;

public class tree {

    public tree() {

    }

    private static class node {
        int value;
        node left;
        node right;

        public node(int value) {
            this.value = value;
        }
    }

    private node root;

    // Insertion functions - one driver function and one workhorse function
    // The driver function creates a tree from scratch, then builds the tree recursively from the workhorse function.

    public void populate(Scanner scanner) {
        System.out.println("Enter data for root node : ");
        int value = scanner.nextInt();
        root = new node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, node node) {
        System.out.println("Do you want to enter to the left of " + node.value + " ? (true/false) : ");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        tree tree = new tree();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        tree.populate(new Scanner(System.in));
        tree.display();
    }
}
