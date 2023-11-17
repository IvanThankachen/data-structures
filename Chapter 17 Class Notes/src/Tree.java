import java.util.List;
import java.util.ArrayList;

/**
    A tree in which each node has an arbitrary number of children.
*/
public class Tree
{
    
    static class Node
    {
        

        /**
            Computes the size of the subtree whose root is this node.
            @return the number of nodes in the subtree
        */
        public int size()
        {
            return 0;
        }
    }

    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public Tree(Object rootData)
    {
        
    }

    /**
        Adds a subtree as the last child of the root.
    */
    public void addSubtree(Tree subtree)
    {
        
    }

    /**
        Computes the size of this tree.
        @return the number of nodes in the tree
    */
    public int size() 
    {
        return this.root.size();
    }

    public interface Visitor
    {
        //The visit method id called for each visited node.
        //@param data: the data of the node being visited.
        void visit (Object data);

    }
    //Traverse this tree in preorder.
    //@param v: the visior to be invoked at each node 
    public void preorder(Visitor v)
    {
        Tree.preorder(this.root,v);
    }

    private static void preorder(Node n, Visitor v)
{
    if(n == null)
    {
        return;
    }
    v.visit(v);

    for(Node child: n.children)
    {
        Tree.preorder(child,v);
    }
}
    // Additional methods will be added in later sections.
}
