package com.example.binarytree;

public class ConstructBinaryTreeStringBracketRepresentation {
    static int start = 0;

    public static TreeNode treeFromString(String s) {
        // code here
        start = 0;
        if (s == null || s.length() == 0)
            return null;

        return solve(s);
    }

    public static TreeNode solve(String s) {
        if (start >= s.length())
            return null;

        boolean neg = false;

        if (s.charAt(start) == '-') {
            neg = true;
            start++;
        }

        int num = 0;

        while (start < s.length() && Character.isDigit(s.charAt(start))) {
            int digit = Character.getNumericValue(s.charAt(start));
            num = num * 10 + digit;
            start++;
        }

        if (neg == true)
            num = -num;
        TreeNode root = new TreeNode(num);

        if (start >= s.length())
            return root;

        if (start < s.length() && s.charAt(start) == '(') {
            start++;
            root.left = solve(s);
        }

        if (start < s.length() && s.charAt(start) == ')') {
            if (s.charAt(start - 1) == '(') {
                start++;
                return null;
            }
            start++;
            return root;
        }

        if (start < s.length() && s.charAt(start) == '(') {
            start++;
            root.right = solve(s);
        }

        if (start < s.length() && s.charAt(start) == ')') {
            if (s.charAt(start - 1) == '(') {
                start++;
                return null;
            }
            start++;
            return root;
        }


        return root;
    }
}
