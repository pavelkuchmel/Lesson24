public class Main {
    public static void main(String[] args) {
        BST<Integer> test = new BST<>();
        test.add(8);
        test.add(5);
        test.add(10);
        test.add(6);
        test.add(9);
        test.add(12);
        test.inorder();
        System.out.println(test.contains(7));
        test.delete(9);
        test.preorder();
    }
}
