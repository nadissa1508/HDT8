/**
 * Universidad del Valle de Guatemala
 * 
 * @author Angie Nadissa Vela López, 23764
 * @description clase que funciona como interfaz para que el usuario vea la lista de pacientes
 * @date última modificación 02/04/2024
 */

public class Main {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        ReadFile reader = new ReadFile();
        PriorityQueueTree patientsPriorityQueue = reader.readPatientsFile("pacientes.txt");
        System.out.println("\n\nEMERGENCIAS");
        System.out.println("\nLista de pacientes a atender:\n");
        patientsPriorityQueue.showPatients();
    }
}