package Stack;

public class Main {
    public static void main(String[] args) {
        String str = "(1 + 2)";
        BalancedExpression ref = new BalancedExpression();
        System.out.println(ref.isBalanced(str));
    }
}