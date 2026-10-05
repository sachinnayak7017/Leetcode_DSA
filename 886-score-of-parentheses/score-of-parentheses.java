class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                stack.push(0);
            } else {

                int A = stack.pop();

                int score;

                if (A == 0) {
                    // ()
                    score = 1;
                } else {
                    // (A)
                    score = 2 * A;
                }

                int previous = stack.pop();

                // AB
                stack.push(previous + score);
            }
        }

        return stack.pop();
    }
}