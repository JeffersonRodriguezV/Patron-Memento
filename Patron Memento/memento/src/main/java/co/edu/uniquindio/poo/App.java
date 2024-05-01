package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto(); // Crear un nuevo editor de texto

        editor.escribirTexto("Hola "); // Escribir "Hola " en el editor
        editor.escribirTexto("mundo!"); // Escribir "mundo!" en el editor

        System.out.println("Texto actual: " + editor.getTexto()); // Imprimir el texto actual: "Hola mundo!"

        editor.deshacer(); // Deshacer la última acción

        System.out.println("Texto después de deshacer: " + editor.getTexto()); // Imprimir el texto después de deshacer: "Hola "

        editor.rehacer(); // Rehacer la última acción deshecha

        System.out.println("Texto después de rehacer: " + editor.getTexto()); // Imprimir el texto después de rehacer: "Hola mundo!"
    }
}
