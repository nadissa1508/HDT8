public class Node <K,V>{

    K priority;
    V infoPatient;
    Node<K,V> Left;
    Node<K,V> Right;
    Node<K,V> Parent;

    public Node(K priority, V infoPatient){
        this.priority = priority;
        this.infoPatient = infoPatient;
    }

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

}
