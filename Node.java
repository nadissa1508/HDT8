public class Node <V>{

    String priority;
    Patient infoPatient;
    Node<V> Left;
    Node<V> Right;
    Node<V> Parent;

    public Node(String priority, Patient infoPatient){
        this.priority = priority;
        this.infoPatient = infoPatient;
    }
    public Node(Patient infoPatient) {
        this.infoPatient = infoPatient;
        this.priority = infoPatient.getEmergencyCode();
    }

    public String getPriority() {
        return priority;
    }

    public void setPritority(String priority) {
        this.priority = priority;
    }

    public Patient getPatient() {
        return infoPatient;
    }

    public void setPatient(Patient patient) {
        this.infoPatient = patient;
    }

    public Node<V> getLeft() {
        return Left;
    }

    public void setLeft(Node<V> left) {
        Left = left;
    }

    public Node<V> getRight() {
        return Right;
    }

    public void setRight(Node<V> right) {
        Right = right;
    }

    public Node<V> getParent() {
        return Parent;
    }

    public void setParent(Node<V> parent) {
        Parent = parent;
    }

}
