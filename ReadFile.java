import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public PriorityQueueTree readPatientsFile(String fileName) {
        PriorityQueueTree patientsPriorityQueue = new PriorityQueueTree();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                // separar informacion paciente
                line = line.trim();//ver si es necesario
                String[] palabras = line.split(",");

                if (palabras.length == 3) {
                    // separar y almacenar datos del paciente
                    Patient patient = new Patient(palabras[0].trim(), palabras[1].trim());
                    String emergencyCode = palabras[2].trim();   

                    // crear nodos y agregarlos a la cola
                    Node<String, Patient> patientNode = new Node<>(emergencyCode, patient);
                    patientsPriorityQueue.InsertInvariantOrder(patientNode);
                } else {
                    System.out.println("Formato de la línea incorrecto: " + line);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error, no se puede leer el archivo" + fileName);
            e.printStackTrace();
        }
        return patientsPriorityQueue;
    }
}