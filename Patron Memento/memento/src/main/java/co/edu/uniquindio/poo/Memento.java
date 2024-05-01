package co.edu.uniquindio.poo;

// Clase que representa el estado del texto en un momento dado
public class Memento {

    private String texto;

    // Constructor para crear un nuevo objeto Memento con el texto dado
    public Memento(String texto) {
        this.texto = texto;
    }

    // Método para obtener el texto almacenado en el Memento
    public String getTexto() {
        return texto;
    }

    
}
