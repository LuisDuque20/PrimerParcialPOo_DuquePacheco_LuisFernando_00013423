import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    static List<Articulo> articulos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opt;
        try{
            do {
                System.out.println("------------------------------------");
                System.out.println("Bienvenido al sistema, ingrese la opcion que desea realizar \n"
                        + "1. Ingresar articulo \n"
                        + "2. Modificar datos \n"
                        + "3. Consultar articulos \n"
                        + "4. Salir \n");
                opt = sc.nextInt();
                sc.nextLine();

                if (opt == 4) {
                    break;
                }

                switch (opt){
                    case 1:
                        try {
                            System.out.println("Que tipo de articulo desea ingresar? \n"
                                    + "1. Laptop \n"
                                    + "2. Telefono \n");
                            opt = sc.nextInt();
                            sc.nextLine();
                            switch (opt){
                                case 1:
                                    Laptop laptop = new Laptop();
                                    System.out.print("Ingrese la marca de la laptop que desea ingresar: ");
                                    laptop.setMarca(sc.nextLine());
                                    System.out.print("Ingrese el modelo de la laptop: ");
                                    laptop.setModelo(sc.nextLine());
                                    System.out.print("Ingrese el tipo de teclado que tiene: ");
                                    laptop.setTipoTeclado(sc.nextLine());
                                    System.out.print("Ingrese el precio por el que se vendera: ");
                                    laptop.obtenerPrecio(sc.nextDouble());
                                    sc.nextLine();
                                    System.out.print("Ingrese la duracion de la bateria: ");
                                    laptop.setDuracionDeBateria(sc.nextInt());
                                    sc.nextLine();
                                    System.out.print("Ingrese una pequeña descripcion del articulo: ");
                                    laptop.ObtenerDescripcion(sc.nextLine());
                                    articulos.add(laptop);
                                    break;
                                case 2:
                                    Telefono telefono = new Telefono();
                                    System.out.print("Ingrese la marca del telefono que desea ingresar: ");
                                    telefono.setMarca(sc.nextLine());
                                    System.out.print("Ingrese el modelo del telefono: ");
                                    telefono.setModelo(sc.nextLine());
                                    System.out.println("Ingrese el tipo de camara que tiene el telefono: ");
                                    telefono.setTipoCamara(sc.nextLine());
                                    System.out.println("Ingrese el tipo de puerto de carga que tiene el telefono: ");
                                    telefono.setTipoPuertoDeCarga(sc.nextLine());
                                    System.out.print("Ingrese el precio por el que se vendera: ");
                                    telefono.obtenerPrecio(sc.nextDouble());
                                    sc.nextLine();
                                    System.out.print("Ingrese una pequeña descripcion del articulo: ");
                                    telefono.ObtenerDescripcion(sc.nextLine());
                                    articulos.add(telefono);
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion valida");
                                    break;
                            }
                        } catch (Exception exception){
                            System.out.println("Ingrese una opcion valida \n");
                        }
                        break;
                    case 2:
                        if (articulos.isEmpty()){
                            System.out.println("No hay articulos en la lista \n");
                        } else {
                            System.out.println("Ingrese el modelo al que desea cambiarle el precio");
                            String model = sc.nextLine();
                            for (Articulo articulo : articulos) {
                                if (articulo.getModelo().equals(model)) {
                                    System.out.println("Ingrese el nuevo precio del modelo");
                                    double nuevoPrecio = sc.nextDouble();
                                    articulo.setPrecio(nuevoPrecio);
                                }
                            }

                        }
                        break;
                    case 3:
                        if (articulos.isEmpty()){
                            System.out.println("No hay articulos en la lista \n");
                        }
                        System.out.println("---Lista de articulos---");
                        for (Articulo articulo : articulos) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Marca: " + articulo.getMarca());
                            System.out.println("Modelo: " + articulo.getModelo());
                            System.out.println("Precio: " + articulo.getPrecio());
                            System.out.println("Descripcion: " + articulo.getDescripcion());
                        }
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida \n");
                        break;
                }
            } while (opt != 4);
        }catch (Exception exception){
            System.out.println("Ingrese una opcion valida \n");
        }

    }
}