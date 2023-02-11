
public class Medicina {
    private String nombre;
    private String descripcion;
    private String tipo;

    public Medicina(String nombre, String descripcion, String tipoMedicina) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipoMedicina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.nombre).append("\n");
        sb.append("Descripción: ").append(this.descripcion).append("\n");
        sb.append("Tipo: ").append(this.tipo).append("\n");
        return sb.toString();
    }
    
    
    
}
