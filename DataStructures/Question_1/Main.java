package btree;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	    int[] array = {5, 9, 1, 3, 2, 8, 4, 7, 6};
	    BTree bTree = new BTree(2);
	    ArrayList<Integer> sortedArray = bTree.sort(array);
	    System.out.println(sortedArray);
	}
	}


