import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }

    static class binaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }


        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }

        public static void inorder(Node root){
            if(root==null){
                return;
            }
           
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

        }

        public static void postorder(Node root){
            if(root==null){
                return;
            }
           
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");

        }

        //Level Order Traversal
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }

            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right !=null){
                        q.add(currNode.right);
                    }
                }
            }
        }



        public static int height(Node root){
            if(root==null){
                return 0;
            }

            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh, rh)+1;

             
        }


        


        public static int count(Node root){
            if(root==null){
                return 0;
            }

            int leftCount=count(root.left);
            int rightCount=count(root.right);
            return leftCount+rightCount+1;


        }


        public static int sum(Node root){
            if(root==null){
                return 0;
            }
            int leftSum=sum(root.left);
            int rightSum=sum(root.left);
            return leftSum+rightSum+root.data;
        }


        public static int diameter(Node root){
            if(root==null){
                return 0;
            }

            int leftDiam=diameter(root.left);
            int leftHt=height(root.left);
            int rightDiam=diameter(root.right);
            int rightHt=height(root.right);

            int selfDiam=leftHt+rightHt+1;
            return Math.max(selfDiam,Math.max(rightDiam, leftDiam));
        }







    }

    public static void main(String []args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildTree(nodes);
        
        System.out.println(tree.sum(root));
    }
}