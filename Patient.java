/**
 * Universidad del Valle de Guatemala
 * 
 * @author Angie Nadissa Vela López, 23764
 * @description clase que modela un paciente
 * @date última modificación 02/04/2024
 */
public class Patient implements Comparable<Patient> {
    String name;
    String symptom;
    String emergencyCode;

    public Patient(String name, String symptom, String emergencyCode) {
        this.name = name;
        this.symptom = symptom;
        this.emergencyCode = emergencyCode;
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getEmergencyCode() {
        return emergencyCode;
    }

    public void setEmergencyCode(String emergencyCode) {
        this.emergencyCode = emergencyCode;
    }

    @Override
    public int compareTo(Patient other) {
        // Comparar los códigos de emergencia para establecer la prioridad
        return this.emergencyCode.compareTo(other.getEmergencyCode());
    }
}
