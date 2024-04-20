public class Telefono extends Articulo implements ObtenerDatos {
   private String tipoPuertoDeCarga;
   private String tipoCamara;

    public Telefono() {
    }


    public Telefono(String tipoPuertoDeCarga, String tipoCamara) {
        this.tipoPuertoDeCarga = tipoPuertoDeCarga;
        this.tipoCamara = tipoCamara;
    }

    public Telefono(String marca, String modelo, String descripcion, double precio, String tipoPuertoDeCarga, String tipoCamara) {
        super(marca, modelo, descripcion, precio);
        this.tipoPuertoDeCarga = tipoPuertoDeCarga;
        this.tipoCamara = tipoCamara;
    }

    public Telefono(Articulo articulo, String tipoPuertoDeCarga, String tipoCamara) {
        super(articulo);
        this.tipoPuertoDeCarga = tipoPuertoDeCarga;
        this.tipoCamara = tipoCamara;
    }

    public String getTipoPuertoDeCarga() {
        return tipoPuertoDeCarga;
    }

    public String getTipoCamara() {
        return tipoCamara;
    }

    public void setTipoPuertoDeCarga(String tipoPuertoDeCarga) {
        this.tipoPuertoDeCarga = tipoPuertoDeCarga;
    }

    public void setTipoCamara(String tipoCamara) {
        this.tipoCamara = tipoCamara;
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
