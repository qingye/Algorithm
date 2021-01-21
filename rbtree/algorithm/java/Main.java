package rbtree.algorithm.java;

public class Main {

    public static void main(String[] args) {
        rbTree();
    }

    private static void rbTree() {
        /****************************************
         *
         *           测试数据一
         *
         * 			 33(black)
         * 			/		 \
         * 		14(red)		48(black)
         * 	   /	  \
         * 6(black)	  22(black)
         * 			  /	   \
         * 		 17(red)   28(red)
         *
         ****************************************/
        int[] values = new int[]{
//                33, 22, 48, 14, 6, 28, 17  // 测试数据一

                12, 1, 9, 2, 0, 11, 7, 19, 4, 15, 18, 5, 14, 13, 10, 16, 6, 3, 8, 17  // 测试数据二
        };

        RBTree tree = new RBTree(null);

        // 保持输出与【https://www.cs.usfca.edu/~galles/visualization/RedBlack.html】一致的效果
        tree.setLeftFirst(true);

        for (int value : values) {
            tree.insert(value);
        }

        tree.doPreTravel();
        tree.remove(14);
        tree.doPreTravel();
    }
}