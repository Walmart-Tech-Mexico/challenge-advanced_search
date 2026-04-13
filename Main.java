public class Main {
    public static void main(String[] args) {
        // Reto para el desarrollador:
        // 1. Implementar la función 'buscarProductos' que filtre un array de 'Producto'
        //    basándose en los filtros proporcionados (categoría, precio máximo y marca).
        // 2. La función debe retornar un nuevo array conteniendo solo los productos que
        //    cumplan con todos los filtros.
        // 3. Crear algunos productos de ejemplo y filtros para probar la función.
        // 4. Imprimir los productos resultantes de la búsqueda.

        // Productos de ejemplo (puedes modificarlos o agregar más)
        Producto producto1 = new Producto("Camiseta", 25.0, "Ropa", "Nike");
        Producto producto2 = new Producto("Zapatillas", 70.0, "Calzado", "Adidas");
        Producto producto3 = new Producto("Gorra", 15.0, "Accesorios", "Nike");
        Producto producto4 = new Producto("Pantalones", 50.0, "Ropa", "Adidas");

        Producto[] productos = {producto1, producto2, producto3, producto4};

        // Filtros de ejemplo (puedes modificarlos)
        String categoriaFiltro = "Ropa";
        double precioMaximo = 60.0;
        String marcaFiltro = "Adidas";

        // Llamar a la función 'buscarProductos' (¡debes implementarla!)
        Producto[] productosFiltrados = buscarProductos(productos, categoriaFiltro, precioMaximo, marcaFiltro);

        // Imprimir los productos filtrados
        System.out.println("\nProductos que coinciden con los filtros:");
        for (Producto producto : productosFiltrados) {
            System.out.println(producto);
        }
    }

    // TODO: Implementar esta función
    public static Producto[] buscarProductos(Producto[] productos, String categoria, double precioMaximo, String marca) {
        // Reemplaza esta línea con tu implementación
        return new Producto[0];
    }
}

class Producto {
    private String nombre;
    private double precio;
    private String categoria;
    private String marca;

    public Producto(String nombre, double precio, String categoria, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}