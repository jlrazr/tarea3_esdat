public class Libro {

    private int id;
    private String nombre;
    private int anio;

    public Libro(int id, String nombre, int anio) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Nombre: " + nombre + ", Año: " + anio;
    }
}