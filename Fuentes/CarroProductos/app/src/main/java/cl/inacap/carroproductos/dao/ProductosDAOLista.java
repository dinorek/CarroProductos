package cl.inacap.carroproductos.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.carroproductos.dto.Producto;

public class ProductosDAOLista implements ProductosDAO{
    private List<Producto> productos = new ArrayList<>();
    //Implementar un patron Singleton
    // tienen que tener 3 condiciones
    //1.Contructor de la clase debe ser privado
    private ProductosDAOLista(){
        Producto p = new Producto();
        p.setNombre("Coca Cola Zero");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed fermentum sapien at elit commodo ornare. Mauris et viverra ex, eget vehicula mi. Nunc mi ipsum, egestas sit amet bibendum in, porttitor vel turpis");
        p.setPrecio(1000);
        p.setFoto("https://jumbo.vteximg.com.br/arquivos/ids/222681/1259964.jpg?v=636548056172700000");
        productos.add(p);

        p = new Producto();
        p.setNombre("Centella");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed fermentum sapien at elit commodo ornare. Mauris et viverra ex, eget vehicula mi. Nunc mi ipsum, egestas sit amet bibendum in, porttitor vel turpis");
        p.setPrecio(250);
        p.setFoto("https://www.zancada.com/wp-content/imagenes//imagenescentella.jpg");
        productos.add(p);

        p = new Producto();
        p.setNombre("Cerveza Budweiser");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed fermentum sapien at elit commodo ornare. Mauris et viverra ex, eget vehicula mi. Nunc mi ipsum, egestas sit amet bibendum in, porttitor vel turpis");
        p.setPrecio(1000);
        p.setFoto("https://www.mayoristalaflorida.cl/wp-content/uploads/2020/08/CERVEZA-BUDWEISER-LATA-473-C.C..jpg");
        productos.add(p);
        
    }
    //2.Como atributo de la misma clase debe existir una instancia estatica  de si misma
    private static ProductosDAOLista instancia;
    //3.Metodo estatico que permita el acceso a la unica instancia
    public static ProductosDAOLista getInstance(){
        if(instancia==null){
            instancia = new ProductosDAOLista(); //si la instancia esta vacia crea una nueva en la lista
        }
        return instancia;
    }
    @Override
    public List<Producto> getAll() {
        return productos;
    }

    @Override
    public Producto save(Producto p) {
        productos.add(p);
        return p;
    }
}
