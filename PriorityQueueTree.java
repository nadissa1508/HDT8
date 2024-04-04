/**
 * Universidad del Valle de Guatemala
 * 
 * @author Angie Nadissa Vela López, 23764
 * @description clase con la lógica principal del programa, aqui se realiza la insercion y ordenamiento
 * de los nodos
 * @date última modificación 02/04/2024
 */
import java.util.Vector;

public class PriorityQueueTree implements PriorityQueue<Patient> {
    private Vector<Patient> patientsQueue; // Utilizamos Vector para gestionar la cola con prioridad

    public PriorityQueueTree() {
        patientsQueue = new Vector<>();
    }

    // Insertar un nuevo paciente en la cola con prioridad
    @Override
    public boolean InsertInvariantOrder(Patient patient) {
        patientsQueue.add(patient);
        int index = patientsQueue.size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (patientsQueue.get(index).compareTo(patientsQueue.get(parentIndex)) >= 0) break;
            Patient temp = patientsQueue.get(index);
            patientsQueue.set(index, patientsQueue.get(parentIndex));
            patientsQueue.set(parentIndex, temp);
            index = parentIndex;
        }
        return true;
    }

    // Extraer y devolver el próximo paciente de mayor prioridad
    @Override
    public Patient remove() {
        if (patientsQueue.isEmpty()) return null;
        Patient result = patientsQueue.get(0);
        Patient last = patientsQueue.remove(patientsQueue.size() - 1);
        if (!patientsQueue.isEmpty()) {
            patientsQueue.set(0, last);
            int index = 0;
            while (index < patientsQueue.size() / 2) {
                int leftChild = 2 * index + 1;
                int rightChild = leftChild + 1;
                int minChild = leftChild;
                if (rightChild < patientsQueue.size() && patientsQueue.get(rightChild).compareTo(patientsQueue.get(leftChild)) < 0) {
                    minChild = rightChild;
                }
                if (patientsQueue.get(index).compareTo(patientsQueue.get(minChild)) <= 0) break;
                Patient temp = patientsQueue.get(index);
                patientsQueue.set(index, patientsQueue.get(minChild));
                patientsQueue.set(minChild, temp);
                index = minChild;
            }
        }
        return result;
    }

    // Verificar si la cola con prioridad está vacía
    @Override
    public boolean isEmpty() {
        return patientsQueue.isEmpty();
    }

    // Obtener el tamaño de la cola con prioridad
    @Override
    public int size() {
        return patientsQueue.size();
    }

    // Método para mostrar los pacientes en el orden correcto
    public void showPatients() {
        System.out.println("\nLista de pacientes:");
        while (!isEmpty()) {
            Patient patient = remove();
            System.out.println(patient.getName() + ", " + patient.getSymptom() + ", " + patient.getEmergencyCode());
        }
    }
}
