/**
 * Universidad del Valle de Guatemala
 * 
 * @author Angie Nadissa Vela López, 23764
 * @description clase que modela los nodos para la lista con prioridad
 * @date última modificación 02/04/2024
 */

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

    
    /** 
     * @return String
     */
    public String getPriority() {
        return priority;
    }

    
    /** 
     * @param priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    
    /** 
     * @return Patient
     */
    public Patient getPatient() {
        return infoPatient;
    }

    
    /** 
     * @param patient
     */
    public void setPatient(Patient patient) {
        this.infoPatient = patient;
    }

    
    /** 
     * @return Node<V>
     */
    public Node<V> getLeft() {
        return Left;
    }

    
    /** 
     * @param left
     */
    public void setLeft(Node<V> left) {
        Left = left;
    }

    
    /** 
     * @return Node<V>
     */
    public Node<V> getRight() {
        return Right;
    }

    
    /** 
     * @param right
     */
    public void setRight(Node<V> right) {
        Right = right;
    }

    
    /** 
     * @return Node<V>
     */
    public Node<V> getParent() {
        return Parent;
    }

    
    /** 
     * @param parent
     */
    public void setParent(Node<V> parent) {
        Parent = parent;
    }

}
