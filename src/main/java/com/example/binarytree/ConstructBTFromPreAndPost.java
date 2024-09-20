package com.example.binarytree;

public class ConstructBTFromPreAndPost {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {

        return dfs(pre,post,0,pre.length-1,0,post.length-1);
    }

    private TreeNode dfs(int[] pre,int[] post,int preS,int preE,int postS,int postE)
    {
        if(preS>preE)
            return null;
        TreeNode root=new TreeNode(pre[preS]);

        if(preS==preE)
            return root;

        int postIdx=postS;

        while(post[postIdx]!=pre[preS+1])
            postIdx++;

        int len=postIdx-postS+1;

        root.left=dfs(pre,post,preS+1,preS+len,postS,postIdx);
        root.right=dfs(pre,post,preS+len+1,preE,postIdx+1,postE);

        return root;
    }
}
