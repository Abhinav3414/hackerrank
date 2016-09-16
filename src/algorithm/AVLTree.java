package algorithm;

class Node
{
	int key, height;
	Node left, right;
	
	Node(int n)
	{
		key=n;
		height=1;
	}
}
public class AVLTree 
{
	static Node root;
	
	// utility function for height
	int height(Node n)
	{
		if(n==null)
			return 0;
		else
			return n.height;
	}

	//utility function for max of 2 integers
	int max(int a, int b)
	{
		return(a>b)?a:b;
	}
	
	//function to rotate right with x as root
	Node rightRotate(Node x)
	{
		Node y=x.left;
		Node T2=y.right;
		
		//rotate
		
		y.right=x;
		x.left=T2;
		
		//update heights
		y.height=max(height(y.left),height(y.left) +1 ) ;
		x.height=max(height(x.left),height(x.left) +1 ) ;
		
		// new root
		return y;
	}
	
	//function to rotate left with x as root
		Node leftRotate(Node x)
		{
			Node y=x.right;
			Node T2=y.left;
			
			//rotate
			
			y.left=x;
			x.right=T2;
			
			//update heights
			y.height=max(height(y.left),height(y.left) +1 ) ;
			x.height=max(height(x.left),height(x.left) +1 ) ;
			
			// new root
			return y;
		}
	
	// Get Balance factor of Node n
		int getBalance(Node n)
		{
			if(n==null)
				return 0;
			else
			{
				return height(n.left) - height(n.right);
			}
		}
		
		// insert function
		
		Node insert(Node node, int key)
		{
			// BST insert
			if(node==null)
				return (new Node(key));
			
			if(key<node.key)
			{
				node.left= insert(node.left,key);
			}
			else
			{
				node.right= insert(node.right,key);
			}
			
			//update height
			node.height= max(height(node.left), height(node.right))+1;
			
			//Get Balance Factor
			
			int balance =getBalance(node);
			
			if(balance>1 && key<node.left.key)
			{
				return rightRotate(node);
			}
			if(balance>1 && key>node.left.key)
			{
				node.left=leftRotate(node.left);
				return rightRotate(node);
			}
			if(balance<-1 && key<node.right.key)
			{
				node.right=rightRotate(node.right);
				return leftRotate(node);
			}
			if(balance<-1 && key>node.right.key)
			{
				return leftRotate(node);
			}
			
			return node;
			
			
		}




		void preOrderTraversal(Node n)
		{
			if(n!=null)
			{
				System.out.println(n.key + " ");
				preOrderTraversal(n.left);
				preOrderTraversal(n.right);
			}
		}

		 public static void main(String[] args) {
		        AVLTree tree = new AVLTree();
		         
		        /* Constructing tree given in the above figure */
		        root = tree.insert(root, 10);
		        root = tree.insert(root, 20);
		        root = tree.insert(root, 30);
		        root = tree.insert(root, 40);
		        root = tree.insert(root, 50);
		        root = tree.insert(root, 25);
		 
		        /* The constructed AVL Tree would be
		             30
		            /  \
		          20   40
		         /  \     \
		        10  25    50
		        */
		        System.out.println("The preorder traversal of constructed tree is : ");
		        tree.preOrderTraversal(root);
		    }








}




