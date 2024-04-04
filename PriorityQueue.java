/**
 * Universidad del Valle de Guatemala
 * 
 * @author Angie Nadissa Vela López, 23764
 * @description interfaz para la cola por prioridad
 * @date última modificación 02/04/2024
 */

public interface PriorityQueue<T> {
    boolean InsertInvariantOrder(T element);
    T remove();
    boolean isEmpty();
    int size();
}

