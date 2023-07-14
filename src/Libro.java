public class Libro {

    private int id;
    private String nombre;
    private int anho;

    public Libro(int id, String nombre, int anho) {
        this.id = id;
        this.nombre = nombre;
        this.anho = anho;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnho() {
        return anho;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Nombre: " + nombre + ", Año: " + anho;
    }
}