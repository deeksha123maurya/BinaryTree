package com.example.binarytree;

public class CheckIfSubTreeIsPresent {
    public static boolean check(TreeNode T,TreeNode S)
    {
        if(T==null && S==null)
            return true;
        if(T==null || S==null)
            return false;

        return T.val==S.val && check(T.left,S.left) && check(T.right,S.right);
    }
    public static boolean isSubtree(TreeNode T, TreeNode S) {
        // add code here.

        if(T==null && S==null)
            return true;
        if(T==null || S==null)
            return false;

        if(T.val==S.val)
        {
            boolean val=check(T,S);
            if(val==true)
                return true;
        }

        return isSubtree(T.left,S) || isSubtree(T.right,S);
    }
}
