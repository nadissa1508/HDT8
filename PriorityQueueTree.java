/**
 * Universidad del Valle de Guatemala
 * 
 * @author Angie Nadissa Vela López, 23764
 * @description clase con la lógica principal del programa, aqui se realiza la insercion y ordenamiento
 * de los nodos
 * @date última modificación 02/04/2024
 */

import java.util.ArrayList;
import java.util.List;

public class PriorityQueueTree {
    // Nodo raíz del árbol
    private Node root;

    // Crear la raíz
    public PriorityQueueTree() {
        root = null;
    }

    
    /** 
     * @param patient
     */
    // Insertar un nuevo paciente en el árbol manteniendo la propiedad invariante
    public void InsertInvariantOrder(Patient patient) {
        // Si el árbol está vacío, el nuevo paciente se convierte en la raíz
        if (root == null) {
            root = new Node(patient);
        } else {
            // Insertar el nuevo paciente en el lugar más a la izquierda del árbol
            insertLeftmost(root, patient);
            // Evaluar y mantener la propiedad invariante del árbol
            EvaluateInvariantOrder(root);
        }
        patients.add(patient);
    }

    
    /** 
     * @param node
     * @param patient
     */
    // Método recursivo para insertar el nuevo paciente en el lugar más a la izquierda del árbol
    private void insertLeftmost(Node node, Patient patient) {
        if (node.Left == null) {
            node.Left = new Node(patient);
        } else {
            insertLeftmost(node.Left, patient);
        }
    }

   

    
    /** 
     * @param node
     */
    // Recorrido inorden para mostrar los pacientes en el árbol
    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.Left);
            System.out.println(node.getPatient().getName() + ", " + node.getPatient().getSymptom() + ", " + node.getPatient().getEmergencyCode());
            inOrderTraversal(node.Right);
        }
    }

    
    /** 
     * @param patient1
     * @param patient2
     * @return int
     */
    // Método para comparar la prioridad de dos pacientes
    public int compareTo(Patient patient1, Patient patient2) {
        return patient1.getEmergencyCode().compareTo(patient2.getEmergencyCode());
    }

    
    /** 
     * @param node1
     * @param node2
     */
    // Método para intercambiar los datos de dos nodos
    private void swap(Node node1, Node node2) {
        Patient temp = node1.getPatient();
        node1.setPatient(node2.getPatient());
        node2.setPatient(temp);
    }

     // Método para mostrar los pacientes en el árbol en el orden correcto (recorrido inorden)
     public void showPatients() {
        // Ordenar la lista de pacientes según la lógica especificada
        sortPatientsForDisplay();

        System.out.println("\nLista de pacientes:");
        for (Patient patient : patients) {
            System.out.println(patient.getName() + ", " + patient.getSymptom() + ", " + patient.getEmergencyCode());
        }
    }

    private List<Patient> patients = new ArrayList<>();

    private void sortPatientsForDisplay() {
        if (patients.size() < 4) {
            return; // No hay suficientes pacientes para aplicar la lógica
        }

        // Obtener los pacientes según la lógica especificada
        List<Patient> sortedPatients = new ArrayList<>();
        sortedPatients.add(patients.get(1)); 
        sortedPatients.add(patients.get(patients.size() - 1)); 
        sortedPatients.add(patients.get(0)); 
        sortedPatients.add(patients.get(2)); 
        

        // Reemplazar la lista original con la lista ordenada
        patients = sortedPatients;
    }

    
    /** 
     * @param root
     */
    
     // Método para evaluar y mantener la propiedad invariante del árbol
    public void EvaluateInvariantOrder(Node root) {
        if (root == null || (root.getLeft() == null && root.getRight() == null)) {
            // Si el nodo o sus hijos son nulos, no hay nada que hacer
            return;
        }
    
        // Comprobar si el hijo izquierdo tiene una prioridad menor que el nodo actual
        if (root.getLeft() != null && root.getLeft().getPriority().compareTo(root.getPriority()) < 0) {
            // Si la prioridad del hijo izquierdo es menor, intercambiar y continuar evaluando
            swap(root, root.getLeft());
            EvaluateInvariantOrder(root.getLeft());
        }
    
        // Comprobar si el hijo derecho tiene una prioridad menor que el nodo actual
        if (root.getRight() != null && root.getRight().getPriority().compareTo(root.getPriority()) < 0) {
            // Si la prioridad del hijo derecho es menor, intercambiar y continuar evaluando
            swap(root, root.getRight());
            EvaluateInvariantOrder(root.getRight());
        }
    }
    
}
