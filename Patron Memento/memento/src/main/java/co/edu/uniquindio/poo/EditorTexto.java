package co.edu.uniquindio.poo;

import java.util.Stack;

// Clase que representa el editor de texto
public class EditorTexto {

    private String texto; // Texto actual
    private Stack<Memento> historialDeshacer; // Pila para el historial de deshacer
    private Stack<Memento> historialRehacer; // Pila para el historial de rehacer

    // Constructor para inicializar el editor de texto
    public EditorTexto() {
        this.texto = ""; // Inicializar el texto como vacío
        this.historialDeshacer = new Stack<>(); // Inicializar la pila de deshacer
        this.historialRehacer = new Stack<>(); // Inicializar la pila de rehacer
    }

    // Método para escribir texto en el editor
    public void escribirTexto(String texto) {
        historialDeshacer.push(new Memento(this.texto)); // Guardar el estado actual en el historial de deshacer
        this.texto += texto; // Agregar el texto nuevo al texto actual
        historialRehacer.clear(); // Limpiar el historial de rehacer cuando se realiza una nueva acción
    }

    // Método para deshacer la última acción
    public void deshacer() {
        if (!historialDeshacer.isEmpty()) { // Verificar si hay elementos en el historial de deshacer
            historialRehacer.push(new Memento(this.texto)); // Guardar el estado actual en el historial de rehacer
            this.texto = historialDeshacer.pop().getTexto(); // Restaurar el estado anterior del historial de deshacer
        }
    }

    // Método para rehacer la última acción deshecha
    public void rehacer() {
        if (!historialRehacer.isEmpty()) { // Verificar si hay elementos en el historial de rehacer
            historialDeshacer.push(new Memento(this.texto)); // Guardar el estado actual en el historial de deshacer
            this.texto = historialRehacer.pop().getTexto(); // Restaurar el estado anterior del historial de rehacer
        }
    }

    // Método para obtener el texto actual
    public String getTexto() {
        return texto;
    }


    
}
