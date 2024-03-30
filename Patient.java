public class Patient{
    String name;
    String symptom;
    String emergencyCode; //esta es la prioridad

    public Patient(String name, String symptom, String emergencyCode) {
        this.name = name;
        this.symptom = symptom;
        this.emergencyCode = emergencyCode;
    }

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


}