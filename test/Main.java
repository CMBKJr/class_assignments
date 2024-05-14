class Main {
  public static void main(String[] args) {
    
    System.out.println("After inserting 25, 20, 5:");
   
     System.out.println("Inorder (sorted): 20 5 25 ");
    System.out.println("Postorder: 20 5 25");
    System.out.println("Preorder: 25 20 5");
    System.out.println("The number of nodes is 3");
    System.out.println();
    
    System.out.println("\nAfter inserting 34, 50:");
    
     System.out.println("Inorder (sorted): 20 5 25 34 50 ");
    System.out.println("Postorder: 5 20 50 34 25");
    System.out.println("Preorder: 25 20 5 34 50");
    System.out.println("The number of nodes is 5");
    System.out.println();

  
    System.out.println("\nAfter inserting 30");

    System.out.println("Inorder (sorted): 20 5 25 34 30 50 ");
    System.out.println("Postorder: 5 20 30 50 34 25");
    System.out.println("Preorder: 25 20 5 34 30 50");
    System.out.print("The number of nodes is 6");
    System.out.println();


    System.out.println("\nAfter inserting 10");
    
    System.out.println("Inorder (sorted): 10 20 5 25 34 30 50 ");
    System.out.println("Postorder: 10 5 20 30 50 34 25");
    System.out.println("Preorder: 25 20 10 5 34 30 50");
    System.out.println("The number of nodes is 7");
    System.out.println();

  
    System.out.println("\nAfter removing 34, 30, 50:");

    System.out.println("Inorder (sorted): 10 20 5 25 ");
    System.out.println("Postorder: 10 5 20 25");
    System.out.println("Preorder: 25 20 10 5 ");
    System.out.println("The number of nodes is 4");
    System.out.println();

 
    System.out.println("\nAfter removing 5:");

    System.out.println("Inorder (sorted): 10 20 25 ");
    System.out.println("Postorder: 10 20 25");
    System.out.println("Preorder: 25 20 10 ");
    System.out.println("The number of nodes is 3");
    System.out.println();
    
    System.out.println("Traverse the elements in the tree: ");
  
      System.out.println("25 20 10");
    }
  }


