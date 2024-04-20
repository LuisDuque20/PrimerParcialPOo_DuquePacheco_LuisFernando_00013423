public abstract class Articulo {
    protected String marca;
   protected String modelo;
   protected String descripcion;
    protected double precio;
    public Articulo(){

    }
    public Articulo(String marca, String modelo, String descripcion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Articulo(Articulo articulo){
        articulo.descripcion = descripcion;
        articulo.marca = marca;
        articulo.modelo = modelo;
        articulo.precio = precio;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }


}
