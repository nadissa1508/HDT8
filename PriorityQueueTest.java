import org.junit.Test;

public class PriorityQueueTest {

    @Test
    public void testShowPatients() {
        // Crear una instancia de PriorityQueueTree
        PriorityQueueTree priorityQueue = new PriorityQueueTree();

        // Insertar pacientes en el orden especificado
        Patient patient1 = new Patient("Carmen Sarmientos", "dolores de parto", "B");
        Patient patient2 = new Patient("Lorenzo Toledo", "chikunguya", "E");
        Patient patient3 = new Patient("Juan Perez", "fractura de pierna", "C");
        Patient patient4 = new Patient("Maria Ramirez", "apendicitis", "A");

        priorityQueue.InsertInvariantOrder(patient1);
        priorityQueue.InsertInvariantOrder(patient2);
        priorityQueue.InsertInvariantOrder(patient3);
        priorityQueue.InsertInvariantOrder(patient4);

        // Ejecutar el método showPatients()
        priorityQueue.showPatients();
    }
}
