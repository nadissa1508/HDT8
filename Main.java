public class Main {
    public static void main(String[] args) {
        ReadFile reader = new ReadFile();
        PriorityQueueTree patientsPriorityQueue = reader.readPatientsFile("pacientes.txt");
        System.out.println("\n\nEMERGENCIAS");
        System.out.println("\nLista de pacientes a atender:\n");
        patientsPriorityQueue.showPatients();
    }
}