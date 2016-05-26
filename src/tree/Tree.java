/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Tree {
     static String search = "notfound";   
        static BinaryTree t = new BinaryTree();
        static int id = -1;
    /**
     * @param args the command line arguments
     */
    
    /**
     *
     */
    public  static void performall() throws SQLException, ClassNotFoundException{
        t.insertRoot(4);
        t.insertLeft(4, 5);
        t.insertRight(4, 6);
        t.insertLeft(5, 2);
        t.insertRight(5, 3);
        t.insertLeft(2, 9);
        t.insertRight(2, 10);

        t.insertLeft(3, 11);
        t.insertRight(3, 12);

        t.insertLeft(6, 1);
        t.insertRight(6, 8);

        t.insertLeft(1, 15);
        t.insertRight(1, 20);

        t.insertLeft(8, 30);
        t.insertRight(8, 31);
        
        // System.out.println("height of tree= "+t.getheight(t.root));
        //System.out.println("Inorder Tree Traversal");
        //t.printTree(t.root);

       // System.out.println("\nDepth Tree is >>>>> \n");
        //  t.FindDepth(t.root);
        //  System.out.println(BinaryTree.f);

//==========================================================
//============================== Fig 1=============================
//     
//BinaryTree t=new BinaryTree();
//     t.insertRoot(4);
//     t.insertLeft(4, 5);
//     t.insertRight(4, 6);    
//     t.insertLeft(5,4);
//     t.insertRight(5, 6);    
//     t.insertLeft(4, 3);
//    t.insertRight(4, 2);
//     t.printTree(t.root);
//=================================Fig 2===============
//        BinaryTree t=new BinaryTree();
//     t.insertRoot(4);
//     t.insertLeft(4, 5);
//     t.insertRight(4, 6);    
//     
//     t.insertLeft(6,4);
//     t.insertRight(6, 6);    
//     t.insertLeft(4, 3);
//     t.insertRight(4, 2);
//    t.printTree(t.root);
        //====================================================
        //==============================fig 3===================
//       BinaryTree t=new BinaryTree();
//     t.insertRoot(4);
//     t.insertLeft(4, 5);
//     t.insertRight(4, 2);    
//     
//     t.insertLeft(5,4);
//     t.insertRight(5, 6);    
//    
//     t.insertRight(4, 3);
//     t.insertRight(3, 4);
//    t.insertRight(4, 11);
//     t.printTree(t.root);
//==================================fig 4===========================        
//          BinaryTree t=new BinaryTree();
//         t.insertRoot(4);
//         t.insertLeft(4, 4);
//         t.insertLeft(4, 3);
//        t.insertLeft(3, 4);
//        t.insertLeft(4, 2);
//        t.insertLeft(2, 4);
//        t.insertLeft(4, 5);
//         t.printTree(t.root);
//================================================= 
//        BinaryTree t=new BinaryTree();
//        t.insertRoot(5);
//        t.insertLeft(5,2);
//        t.insertRight(5, 3);
//        t.insertLeft(2,4);
//        t.insertRight(2, 6);
//        t.insertLeft(3,1);
//        t.insertRight(3, 7);
       // GUI g = new GUI(t.getheight(t.root));
       // g.display(t.root);
       // g.showGui();
        
//*********************************** JDBC *********************************/
            
            String name =JOptionPane.showInputDialog("Enter Student Name To Search ...");
            //Connection
             Class.forName("com.mysql.jdbc.Driver");
             Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu","root","3");
                         // Connection mycon2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu","root","1994");

             Statement st = mycon.createStatement();

           // Statement st1 = mycon.createStatement();
            String select = "select * from student where name='"+name+"'";
             ResultSet rs = st.executeQuery(select);
             while(rs.next()){
                id=rs.getInt(1);
             }
        
        
////*********************************** depth *********************************/
//        System.out.println(" ");
//        System.out.println(" ");
//        System.out.println("Your Search path and Result");
//
//        Node n1=t.root;
//        Stack<Node> list1 = new Stack<Node>();
//        Stack<Node> other1 = new Stack<Node>();
//        other1.add(n1);
//        list1.add(n1.right);
//        list1.add(n1.left);
//        while (!list1.isEmpty()) {   //      other.size()!=dd
//            Node x = list1.pop();
//            other1.add(x);
//            if (x.right != null ) {
//                list1.add(x.right);
//            }
//            if (x.left != null ) {
//                list1.add(x.left);
//            }
//        }
//         System.out.println("id is "+ id);
//      //  System.out.print(n1.data + " ");
//        for (int c = 0; c <= other1.indexOf(other1.lastElement()); c++) {
//            int e=other1.elementAt(c).data;
//           // System.out.print(other1.elementAt(c).data + " ");
//           
//           
//             String selectdata = "select * from student where id="+e;
//             ResultSet rsdata = st.executeQuery(selectdata);
//             while(rsdata.next()){
//                 System.out.println("id ="+rsdata.getInt(1)+" Name ="+rsdata.getString(2));
//             
//           
//            if(e == id){
//                System.out.println("--------------------------------------------");
//               System.out.println(name +" Found ");
//                System.out.println("Age ="+rsdata.getString(3));
//                System.out.println("Adress ="+rsdata.getString(4));
//                System.out.println("Phone ="+rsdata.getString(5));
//                System.out.println("Class ="+rsdata.getString(6));
//                System.out.println("Email ="+rsdata.getString(7));
//               return;
//            }
//            
//             
//             
//             }
//             
//        }
//
    }
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//       pTwoChildNode left=new pTwoChildNode(5);
//       pTwoChildNode right=new pTwoChildNode(4);
//       pTwoChildNode root=new pTwoChildNode(1);
//       root.setLeft(left);
//       root.setRight(right);
//       System.out.println("left node value="+root.getLeft());
//       System.out.println("right node value="+root.getRight());
//       System.out.println("root value="+root);
//       ===========================================================
//      ============================================================        
//      pTwoChildNode two=new pTwoChildNode(2);
//      pTwoChildNode five=new pTwoChildNode(5);
//      pTwoChildNode six=new pTwoChildNode(6);
//      pTwoChildNode seven=new pTwoChildNode(7);
//      
//      pTwoChildNode three=new pTwoChildNode(3);
//      three.setLeft(two);
//      three.setRight(five);
//      
//      pTwoChildNode four=new pTwoChildNode(4);
//      four.setLeft(six);
//      four.setRight(seven);
//      
//      pTwoChildNode root=new pTwoChildNode(1);
//      root.setLeft(three);
//      root.setRight(four);
//     System.out.println("left node value="+root.getLeft());
//       System.out.println("right node value="+root.getRight());
//       System.out.println("root value="+root);
//  =================================================================
//  ========================================================

        BinaryTree t = new BinaryTree();
        t.insertRoot(4);
        t.insertLeft(4, 5);
        t.insertRight(4, 6);
        t.insertLeft(5, 2);
        t.insertRight(5, 3);
        t.insertLeft(2, 9);
        t.insertRight(2, 10);

        t.insertLeft(3, 11);
        t.insertRight(3, 12);

        t.insertLeft(6, 1);
        t.insertRight(6, 8);

        t.insertLeft(1, 15);
        t.insertRight(1, 20);

        t.insertLeft(8, 30);
        t.insertRight(8, 31);
        // System.out.println("height of tree= "+t.getheight(t.root));
        //System.out.println("Inorder Tree Traversal");
        //t.printTree(t.root);

       // System.out.println("\nDepth Tree is >>>>> \n");
        //  t.FindDepth(t.root);
        //  System.out.println(BinaryTree.f);

//==========================================================
//============================== Fig 1=============================
//     
//BinaryTree t=new BinaryTree();
//     t.insertRoot(4);
//     t.insertLeft(4, 5);
//     t.insertRight(4, 6);    
//     t.insertLeft(5,4);
//     t.insertRight(5, 6);    
//     t.insertLeft(4, 3);
//    t.insertRight(4, 2);
//     t.printTree(t.root);
//=================================Fig 2===============
//        BinaryTree t=new BinaryTree();
//     t.insertRoot(4);
//     t.insertLeft(4, 5);
//     t.insertRight(4, 6);    
//     
//     t.insertLeft(6,4);
//     t.insertRight(6, 6);    
//     t.insertLeft(4, 3);
//     t.insertRight(4, 2);
//    t.printTree(t.root);
        //====================================================
        //==============================fig 3===================
//       BinaryTree t=new BinaryTree();
//     t.insertRoot(4);
//     t.insertLeft(4, 5);
//     t.insertRight(4, 2);    
//     
//     t.insertLeft(5,4);
//     t.insertRight(5, 6);    
//    
//     t.insertRight(4, 3);
//     t.insertRight(3, 4);
//    t.insertRight(4, 11);
//     t.printTree(t.root);
//==================================fig 4===========================        
//          BinaryTree t=new BinaryTree();
//         t.insertRoot(4);
//         t.insertLeft(4, 4);
//         t.insertLeft(4, 3);
//        t.insertLeft(3, 4);
//        t.insertLeft(4, 2);
//        t.insertLeft(2, 4);
//        t.insertLeft(4, 5);
//         t.printTree(t.root);
//================================================= 
//        BinaryTree t=new BinaryTree();
//        t.insertRoot(5);
//        t.insertLeft(5,2);
//        t.insertRight(5, 3);
//        t.insertLeft(2,4);
//        t.insertRight(2, 6);
//        t.insertLeft(3,1);
//        t.insertRight(3, 7);
        GUI g = new GUI(t.getheight(t.root));
        g.display(t.root);
        g.showGui();
        
//*********************************** JDBC *********************************/
            int id = 0;
            String name =JOptionPane.showInputDialog("Enter Student Name To Search ...");
            //Connection
             Class.forName("com.mysql.jdbc.Driver");
             Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu","root","3");
                         // Connection mycon2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu","root","1994");

             Statement st = mycon.createStatement();

            Statement st1 = mycon.createStatement();
            String select = "select * from student where name='"+name+"'";
             ResultSet rs = st.executeQuery(select);
             while(rs.next()){
                id=rs.getInt(1);
             }
        
        
        
//*********************************** depth *********************************/
/*
System.out.println(" ");
        System.out.println(" ");
        System.out.println("Your Search path and Result");

      Node n1=t.root;
        Stack<Node> list1 = new Stack<Node>();
        Stack<Node> other1 = new Stack<Node>();
        other1.add(n1);
        list1.add(n1.right);
        list1.add(n1.left);
        while (!list1.isEmpty()) {   //      other.size()!=dd
            Node x = list1.pop();
            other1.add(x);
            if (x.right != null ) {
                list1.add(x.right);
            }
            if (x.left != null ) {
                list1.add(x.left);
            }
        }
         System.out.print("id is "+ id);
      //  System.out.print(n1.data + " ");
        for (int c = 0; c <= other1.indexOf(other1.lastElement()); c++) {
            int e=other1.elementAt(c).data;
           // System.out.print(other1.elementAt(c).data + " ");
           
           
             String selectdata = "select * from student where id="+e;
             ResultSet rsdata = st.executeQuery(selectdata);
             while(rsdata.next()){
                 System.out.println("id ="+rsdata.getInt(1)+" Name ="+rsdata.getString(2));
             
           
            if(e == id){
                System.out.println("--------------------------------------------");
               System.out.println(name +" Found ");
                System.out.println("Age ="+rsdata.getString(3));
                System.out.println("Adress ="+rsdata.getString(4));
                System.out.println("Phone ="+rsdata.getString(5));
                System.out.println("Class ="+rsdata.getString(6));
                System.out.println("Email ="+rsdata.getString(7));
               return;
            }
            
             
             
             }
             
        }

        */     
        /*  ---------- Student Tabel
        

'1', 'mohamed khaskia', /
'2', 'ahmed kamal', /
'3', 'ibraheem ali', /
'4', 'amal mahmoud', /
'5', 'Eslam ibraheem', 
'6', 'mohamed mahmoud', 
'7', 'kamal amr', 
'8', 'amr kamal', 
'9', 'khaled gamal', 
'10', 'Mustafa ali', 
'11', 'amira ahmed', 
'12', 'omnia gamal', 
'13', 'tamer hosni', 
'14', 'Amro Diab', 
'15', 'tarek soubhi', 
'16', 'salah ahmed',
'17', 'mabrouk ali', 
'18', 'abdElhamid ahmed', 
'19', 'mohamed khaskia',
'20', 'petter petter',
'30', 'nader ali', 
'31', 'nermeen mahmoud', 
'32', 'Mustafa badr', 

        
        */
        
        
        
        
/*
        //====================  limited depth  ===================================
        System.out.println(" ");
        Node n = t.root;
        String s = JOptionPane.showInputDialog("please inter the level for the limited depth search (from 0 to " + (t.getheight(n) - 1) + ")");
        Integer limiting = Integer.parseInt(s);
        System.out.println("limited depth search with w= " + limiting + "  is:");
        Stack<Node> list = new Stack<Node>();
        Stack<Node> other = new Stack<Node>();
        list.add(n);
        while (!list.isEmpty()) {   //      other.size()!=dd
            Node x = list.pop();
            if (limiting >= t.getheight(n)) {
                System.out.println("the value you enterd is bigger than the height of the tree");
                break;
            }
            other.add(x);
            //System.out.println(t.getheight(n) + "-" + t.getheight(x.right) + "==" + (t.getheight(n) - t.getheight(x.right)));
            if (x.right != null && t.getheight(n) - t.getheight(x.right) <= limiting) {
                list.add(x.right);
            }
            if (x.left != null && t.getheight(n) - t.getheight(x.left) <= limiting) {
                list.add(x.left);
            }
        }
        if (limiting < t.getheight(n)) {
            for (int c = 0; c <= other.indexOf(other.lastElement()); c++) {

                System.out.print(other.elementAt(c).data + " ");

            }
        }
*/
/*
        //========================iterative search=======================================        
        System.out.println(" ");
        System.out.println("iterative search is:");
Node n = t.root;
        n = t.root;

        Stack<Node> list11 = new Stack<Node>();
        Stack<Node> other11 = new Stack<Node>();

        list11.add(n);

        while (!list11.isEmpty()) {   //      other.size()!=dd
            Node x = list11.pop();
            other11.add(x);

            if (x.right != null) {

                list11.add(x.right);
            }
            if (x.left != null) {
                list11.add(x.left);
            }
        }

        System.out.println(other11.indexOf(other11.lastElement()));
        for (int level = 0; level <= t.getheight(n) - 1; level++) {
            System.out.print("level " + level + " is:  ");
            for (int c = 0; c <= other11.indexOf(other11.lastElement()); c++) {
                if (level >= (t.getheight(n)) - (t.getheight(other11.elementAt(c)))) {
                    System.out.print(other11.elementAt(c).data + " ");
                }
            }
            System.out.println(" ");
        }
    
*/

}
}
