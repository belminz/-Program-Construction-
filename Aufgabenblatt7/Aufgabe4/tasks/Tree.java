/*
    Aufgabe 4) Bäume

    In der Klasse IntTree haben Sie eine Baumimplementierung gegeben, die einen
    sortierten Binärbaum abbildet. Jede Veränderung des Baumes durch eine
    Methode muss gewährleisten, dass dieser sortiert bleibt. Dazu sollen Sie
    folgende zusätzliche Methoden implementieren:

    - add:              Fügt einen Knoten in den Baum ein. Werden folgende
    (bereits gegeben)   Elemente {12,4,6,15,1,13,5,14} nacheinander in den Baum
                        eingefügt, wird folgender Baum aufgebaut:
                                                 12
                                              /      \
                                            4         15
                                          /   \      /
                                         1     6   13
                                              /      \
                                             5        14
    - countNodes:       Liefert die Anzahl aller Knoten im Baum zurück. Wird
                        ohne Parameter aufgerufen.
    - countLeaves:      Liefert die Anzahl der Blattknoten zurück. Wird ohne
                        Parameter aufgerufen.
    - height:           Liefert die Höhe des Baumes zurück. Der leere Baum hat
                        die Höhe 0. Hat der Baum nur einen Knoten (Wurzel), dann
                        hat er die Höhe 1. Mit jeder zusätzlichen Stufe von
                        Nachfolgern erhöht sich die Höhe um 1. Der oben gezeigte
                        Baum hat die Höhe 4.
    - printLeaves:      Diese Methode gibt die Elemente der Blätterknoten aus,
                        wobei das linke Blatt immer vor dem rechten Blatt
                        ausgegeben wird. Verwenden Sie an entsprechender Stelle
                        für die Ausgabe -> System.out.println(this.elem);
    - printInOrderUp:   Diese Methode gibt alle Elemente in aufsteigender
                        Reihenfolge aus.
                        Verwenden Sie an entsprechender Stelle für die
                        Ausgabe -> System.out.println(this.elem);
    - printInOrderUpSub:Diese Methode gibt alle Elemente eines Teilbaums in
                        aufsteigender Reihenfolge aus. Dazu wird der Methode ein
                        Element übergeben, welches dem Wurzelknoten des
                        Teilbaums entspricht. Nun wird der komplette Teilbaum
                        inklusive Wurzel ausgegben. Verwenden Sie an
                        entsprechender Stelle für die
                        Ausgabe -> System.out.println(this.elem);
    - printPostOrder:   Diese Methode gibt alle Elemente in der sogenannten
                        Post-Order aus. Die Post-Order für den oben abgebildeten
                        Baum ergibt folgende Reihenfolge (1,5,6,4,14,13,15,12).
                        Verwenden Sie an entsprechender Stelle für die
                        Ausgabe -> System.out.println(this.elem);
    - printPreOrder:    Diese Methode gibt alle Elemente in der sogenannten
                        Pre-Order aus. Die Pre-Order für den oben abgebildeten
                        Baum ergibt folgende Reihenfolge (12,4,1,6,5,15,13,14).
                        Verwenden Sie an entsprechender Stelle für die
                        Ausgabe -> System.out.println(this.elem);

    Zusatzfragen:
    1. Wie könnte man vorgehen, wenn man einen Knoten in den Baum einfügen
       möchte. Reicht es, den Knoten einzuhängen, oder müssen zusätzliche
       Operationen durchgeführt werden?

*/
public class Tree {

    class Node {

        private Node left = null;
        private Node right = null;
        private int element;

        public Node(int element) {
            this.element = element;

        }

        public void add(int elem) {

            if (elem < element) {
                if (left == null) {
                    left = new Node(elem);
                } else {
                    left.add(elem);
                }
            } else {
                if (right == null) {
                    right = new Node(elem);
                } else {
                    right.add(elem);
                }
            }
        }

        public String toString() {
            String rez = Integer.toString(element);
            if (left != null) {
                rez = left + "," + rez;
            }
            if (right != null) {
                rez += "," + right;
            }
            return rez;
        }

        int countNodes() {
            if (left == null && right == null) { //only root exist
                return 1;
            }
            int count = 1;
            if (left != null) {
                count += left.countNodes();
            }
            if (right != null) {
                count += right.countNodes();
            }
            return count;
        }

        public int countLeaves() {
            if (left == null && right == null) {
                return 1;
            } else {
                int count = 0;
                if (left != null) {
                    count += left.countLeaves();
                }
                if (right != null) {
                    count += right.countLeaves();
                }
                return count;
            }
        }

        int height () {
            int leftPartofTree=0;
            int RightPartofTree=0;
            if (left==null && right== null) {
                return 1;
            } else {
                if (left!=null ) {
                    leftPartofTree=left.height();
                }
                if (right!=null) {
                    RightPartofTree=right.height();
                }
            }
            return leftPartofTree>RightPartofTree ? leftPartofTree+1 : RightPartofTree+1;
        }

        public void printLeaves() {
            if (left!=null) {
                if (left.left == null && left.right == null) {
                    System.out.print(left.element + " ");
                }else {
                    left.printLeaves();
                }
            }
            if (right!=null) {
                if (right.left==null && right.right==null) {
                    System.out.print(right.element+" ");
                } else {
                    right.printLeaves();
                }
            }
            if (left==null && right==null) {
                System.out.println(root.element);
            }

        }
         /*
     - printInOrderUp:   Diese Methode gibt alle Elemente in aufsteigender
                        Reihenfolge aus.
                        Verwenden Sie an entsprechender Stelle für die
                        Ausgabe -> System.out.println(this.elem);
     */
         void printInOrderUp() {
             if (left!=null) {
                 left.printInOrderUp();
             }
             System.out.print(element+ " "); //=this.element
             if (right!=null) {
                 right.printInOrderUp();

             }

         }


         /*
          - printPostOrder:   Diese Methode gibt alle Elemente in der sogenannten
                        Post-Order aus. Die Post-Order für den oben abgebildeten
                        Baum ergibt folgende Reihenfolge (1,5,6,4,14,13,15,12).
                        Verwenden Sie an entsprechender Stelle für die
                        Ausgabe -> System.out.println(this.elem);
          */
         void printPostOrder() {
             if (left!=null) {
                 left.printPostOrder();
             }
             if (right!=null) {
                 right.printPostOrder();
             }
             System.out.print(element +" ");
         }

         /*
         - printPreOrder:    Diese Methode gibt alle Elemente in der sogenannten
                        Pre-Order aus. Die Pre-Order für den oben abgebildeten
                        Baum ergibt folgende Reihenfolge (12,4,1,6,5,15,13,14).
                        Verwenden Sie an entsprechender Stelle für die
                        Ausgabe -> System.out.println(this.elem);

          */
         void printpreOrder() {
             System.out.print(element+ " ");
             if (left!=null) {
                 left.printpreOrder();
             }
             if (right!=null) {
                 right.printpreOrder();
         }
         }
         /*
         - printInOrderUpSub:Diese Methode gibt alle Elemente eines Teilbaums in
        aufsteigender Reihenfolge aus. Dazu wird der Methode ein
        Element übergeben, welches dem Wurzelknoten des
        Teilbaums entspricht. Nun wird der komplette Teilbaum
        inklusive Wurzel ausgegben. Verwenden Sie an
        entsprechender Stelle für die
        Ausgabe -> System.out.println(this.elem); */

         void printInOrderUpSub( int elem) {
             if (elem==element) {
                printInOrderUp();
             }
             if (element<elem) {
                 right.printInOrderUpSub(elem);
             }
             if (element>elem) {
                 left.printInOrderUpSub(elem);
             }
         }
    }





    private Node root = null;

    public void add(int elem) {
        if (root == null) {
            root = new Node(elem);
        } else {
            root.add(elem);

        }
    }

   // - countNodes:       Liefert die Anzahl aller Knoten im Baum zurück. Wird
 //   ohne Parameter aufgerufen.

    int countNodes () {
        if (root==null) {
          return  0;
        } else {
            return root.countNodes();
        }
    }
   //  - countLeaves:      Liefert die Anzahl der Blattknoten zurück. Wird ohne
  //  Parameter aufgerufen.
    int countLeaves() {
        if (root==null) {
            return 0;
        } else {
            return root.countLeaves();
        }
    }
 /*   - height:           Liefert die Höhe des Baumes zurück. Der leere Baum hat
    die Höhe 0. Hat der Baum nur einen Knoten (Wurzel), dann
    hat er die Höhe 1. Mit jeder zusätzlichen Stufe von
    Nachfolgern erhöht sich die Höhe um 1. Der oben gezeigte
    Baum hat die Höhe 4.*/
    int height () {
        if (root==null) {
            return 0;
        }else {
            return root.height();
        }
    }




    public String toString() {
        if (root==null) {
            return null;
        } else {
            return root.toString();
        }
    }
    /* - printLeaves:      Diese Methode gibt die Elemente der Blätterknoten aus,
    wobei das linke Blatt immer vor dem rechten Blatt
    ausgegeben wird. Verwenden Sie an entsprechender Stelle
    für die Ausgabe -> System.out.println(this.elem); */
    public void printLeaves() {
        if (root!=null) {
            root.printLeaves();
        }
    }

       public void printInOrderUp () {
            if (root!=null)  {
                root.printInOrderUp();
            }
        }

        void printPostOrder() {
            if (root != null) {
                root.printPostOrder();
            }
        }

        void printpreOrder () {
            if (root != null) {
                root.printpreOrder();
            }
        }

    void printInOrderUpSub (int elem) {
        if (root!=null) {
            root.printInOrderUpSub(elem);
        }
    }



    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(12);
        tree.add(4);
       tree.add(6);
       tree.add(15);
       tree.add(1);
       tree.add(13);
       tree.add(5);
       tree.add(14);



       //tree.printLeaves();
       // tree.printInOrderUp();
    //    System.out.println(tree); // inOrderUp mittels ToString.
      //  tree.printPostOrder();
     //   tree.printpreOrder();
        tree.printInOrderUpSub(4);



      //  System.out.println(tree);
       // System.out.println(tree.countNodes());
       // System.out.println(tree.height());

    }
}


