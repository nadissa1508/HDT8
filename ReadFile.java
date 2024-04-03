/**
 * Universidad del Valle de Guatemala
 * 
 * @author Angie Nadissa Vela López, 23764
 * @description clase que lee el txt pacientes y crea la cola de prioridad con la informacion del txt
 * @date última modificación 02/04/2024
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    
    /** 
     * @param fileName
     * @return PriorityQueueTree
     */
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
                    Patient patient = new Patient(palabras[0].trim(), palabras[1].trim(), palabras[2].trim()); 
                    patientsPriorityQueue.InsertInvariantOrder(patient);
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