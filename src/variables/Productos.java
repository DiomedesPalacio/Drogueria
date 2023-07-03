
package variables;

// Clase padre de productos 

public class Productos{
    
    private int id;   
    private String codigo;
    private String nombre;
    private String tipo;
    private String presentecion;
    private int cantidad;
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPresentecion() {
        return presentecion;
    }

    public void setPresentecion(String presentecion) {
        this.presentecion = presentecion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
