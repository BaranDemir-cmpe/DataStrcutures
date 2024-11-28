package btree;

import java.util.ArrayList;

public class BTree {
	BTreeNode root;
        int t;

       BTree(int t) {
            root = null;
            this.t = t;
        }

        void insert(int key) {
            if (root == null) {
                root = new BTreeNode();
                root.keys.add(key);
            } else {
                if (root.keys.size() == 2*t-1) {
                    BTreeNode newRoot = new BTreeNode();
                    newRoot.children.add(root);
                    newRoot.isLeaf = false;
                    splitChild(newRoot, 0);
                    insertNonFull(newRoot, key);
                    root = newRoot;
                } else {
                    insertNonFull(root, key);
                }
            }
        }

        void splitChild(BTreeNode parent, int i) {
            BTreeNode child = parent.children.get(i);
            BTreeNode newChild = new BTreeNode();
            newChild.isLeaf = child.isLeaf;
            newChild.keys.addAll(child.keys.subList(t, 2*t-1));
            if (!child.isLeaf) {
                newChild.children.addAll(child.children.subList(t, 2*t));
            }
            child.keys = new ArrayList<>(child.keys.subList(0, t-1));
            child.children = new ArrayList<>(child.children.subList(0, t));
            parent.keys.add(i, child.keys.get(t-1));
            parent.children.add(i+1, newChild);
        }

        void insertNonFull(BTreeNode node, int key) {
            int i = node.keys.size() - 1;
            if (node.isLeaf) {
                node.keys.add(i+1, key);
            } else {
                while (i >= 0 && key < node.keys.get(i)) {
                    i--;
                }
                i++;
                if (node.children.get(i).keys.size() == 2*t-1) {
                    splitChild(node, i);
                    if (key > node.keys.get(i)) {
                        i++;
                    }
                }
                insertNonFull(node.children.get(i), key);
            }
        }

        void inOrderTraversal(BTreeNode node, ArrayList<Integer> result) {
            if (node == null) {
                return;
            }
            for (int i = 0; i < node.keys.size(); i++) {
                inOrderTraversal(node.children.get(i), result);
                result.add(node.keys.get(i));
            }

    	    inOrderTraversal(node.children.get(node.keys.size()), result);
    }

    ArrayList<Integer> sort(int[] array) {
        for (int key : array) {
            insert(key);
        }
        ArrayList<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }
}
