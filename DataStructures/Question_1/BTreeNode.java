package btree;
import java.util.ArrayList;

public class BTreeNode {
	ArrayList<Integer> keys;
    ArrayList<BTreeNode> children;
    boolean isLeaf;

    BTreeNode() {
     keys = new ArrayList<>();
     children = new ArrayList<>();
     isLeaf = true;
    }
    
  }


