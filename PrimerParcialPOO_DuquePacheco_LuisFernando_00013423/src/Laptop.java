public class Laptop extends Articulo implements ObtenerDatos{
    private int duracionDeBateria;
    private String tipoTeclado;

    public Laptop(){}
    public Laptop(Articulo articulo,int duracionDeBateria, String tipoTeclado) {
        super(articulo);
        this.duracionDeBateria = duracionDeBateria;
        this.tipoTeclado = tipoTeclado;
    }

    public int getDuracionDeBateria() {
        return duracionDeBateria;
    }

    public void setDuracionDeBateria(int duracionDeBateria) {
        this.duracionDeBateria = duracionDeBateria;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }

    @Override
    public void obtenerPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void ObtenerDescripcion(String descripcion) {
       this.descripcion = descripcion;
    }
}
