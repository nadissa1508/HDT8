public class Node <K,V>{

    K priority;
    V infoPatient;
    Node<K,V> Left;
    Node<K,V> Right;
    Node<K,V> Parent;

    public K getPriority() {
        return priority;
    }

    public void setPritority(K priority) {
        this.priority = priority;
    }

    public V getInfoPatient() {
        return infoPatient;
    }

    public void setInfoPatient(V infoPatient) {
        this.infoPatient = infoPatient;
    }

    public Node<K, V> getLeft() {
        return Left;
    }

    public void setLeft(Node<K, V> left) {
        Left = left;
    }

    public Node<K, V> getRight() {
        return Right;
    }

    public void setRight(Node<K, V> right) {
        Right = right;
    }

    public Node<K, V> getParent() {
        return Parent;
    }

    public void setParent(Node<K, V> parent) {
        Parent = parent;
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

    public void swap(Node raiz, Node nuevaRaiz){

    }

    //metodo para comparar prioridad del paciente
    public void compareTo(){

    }

}
