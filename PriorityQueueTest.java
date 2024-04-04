/**
 * Universidad del Valle de Guatemala
 * @author Angie Nadissa Vela López, 23764
 * @description pruebas unitarias
 * @date última modificación 02/04/2024
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PriorityQueueTest {

   @Test
    public void testInsertAndRemove() {
        PriorityQueueTree queue = new PriorityQueueTree();
        assertTrue(queue.isEmpty());

        // Insertar pacientes
        queue.InsertInvariantOrder(new Patient("Maria Ramirez", "apendicitis", "A"));
        queue.InsertInvariantOrder(new Patient("Jamaica Lopez", "OD", "A"));
        queue.InsertInvariantOrder(new Patient("Carmen Sarmientos", "dolores de parto", "B"));
        queue.InsertInvariantOrder(new Patient("Juan Perez", "fractura de pierna", "C"));

        assertFalse(queue.isEmpty());
        assertEquals(4, queue.size());

        // Remover pacientes en orden de prioridad
        assertEquals("Maria Ramirez", queue.remove().getName());
        assertEquals("Jamaica Lopez", queue.remove().getName());
        assertEquals("Carmen Sarmientos", queue.remove().getName());
        assertEquals("Juan Perez", queue.remove().getName());

        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testEmptyQueue() {
        PriorityQueueTree queue = new PriorityQueueTree();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

        // Intentar remover de una cola vacía
        assertNull(queue.remove());
    }

    @Test
    public void testSize() {
        PriorityQueueTree queue = new PriorityQueueTree();
        assertEquals(0, queue.size());

        queue.InsertInvariantOrder(new Patient("Maria Ramirez", "apendicitis", "A"));
        assertEquals(1, queue.size());

        queue.InsertInvariantOrder(new Patient("Jamaica Lopez", "OD", "A"));
        queue.InsertInvariantOrder(new Patient("Carmen Sarmientos", "dolores de parto", "B"));
        assertEquals(3, queue.size());

        queue.remove();
        assertEquals(2, queue.size());
    }
}
