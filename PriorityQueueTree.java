import org.w3c.dom.Node;

public class PriorityQueueTree{
    
     //nodo raiz del árbol
     private Node<String, Patient> root;

     //creamos la raiz
     public PriorityQueueTree() {
         root = null;
     }

     public void EvaluateInvariantOrder(Node<K,V> root){
        if(root.getLeft() == null && root.getRight() == null){
            return;
        }

        if(root.getRight() != null){
            if((root.getLeft().getPritority() < root.getPritority()) && (root.getRight().getPritority() < root.getPritority()) ){
                if(root.getLeft().getPritority() < root.getRight().getPritority()){
                    swap(root, root.getLeft());
                    EvaluateInvariantOrder(root.getLeft());
                }else{
                    swap(root, root.getRight());
                    EvaluateInvariantOrder(root.getRight());
                }
            }else{
                if((root.getLeft().getPritority() < root.getPritority()) || (root.getRight().getPritority() < root.getPritority()) ){
                    if(root.getLeft().getPritority() < root.getPriority()){
                        swap(root, root.getLeft());
                        EvaluateInvariantOrder(root.getLeft());
                    }else{
                        swap(root, root.getRight());
                        EvaluateInvariantOrder(root.getRight());
                    }
                }else{
                    return;
                }
            }          
        }else{
            return;
        }
    }

    public void InsertInvariantOrder(Node<K,V> root){

    }

    public void swap(Node root, Node newRoot){
        Node aux = root;
        root.setInfoPatient(newRoot.getInfoPatient());
        root.setLeft(newRoot.getLeft());
        root.setRight(newRoot.getRight());
        root.setParent(newRoot.getParent());
        root.setPritority(newRoot.getPriority());
         
        newRoot.setInfoPatient(aux.getInfoPatient());
        newRoot.setLeft(aux.getLeft());
        newRoot.setRight(aux.getRight());
        newRoot.setParent(aux.getParent());
        newRoot.setPritority(aux.getPriority());
    }

    //metodo para comparar prioridad del paciente
    public void compareTo(){

    }

}