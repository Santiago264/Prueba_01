public class Celular {
    private String modelo;
    private String marca;
    private String color;
    private int memoria;
    private int almacenamiento;
    private double precio;

   
    
    //Constructor para inicializar los atributos
    public Celular ( String modelo, String marca, String color, int memoria, int almacenamiento, double precio){
        this.modelo = modelo;
        this.marca= marca;
        this.color = color;
        this.memoria = memoria;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
        
    }
    //Getters para acceder a los atributos
    public String getModelo(){
        return modelo;        
    }
    
    public String getMarca(){
        return marca;
    }
     public String getColor(){
         return color;
     }
     
    public int getMemoria(){
         return memoria;
     }
    public int getAlmacenamiento(){
         return almacenamiento;
     }
    public double getPrecio(){
         return precio;
     }
     
    public String categorizarCelular(){
        if ((memoria >= 2 && memoria <= 4) && (almacenamiento >= 8 && almacenamiento <= 32)) {
            return "Gama Baja";
        } else if (memoria == 4 && (almacenamiento >= 64 && almacenamiento <= 128)) {
            return "Gama Media";
        } else if (memoria >= 8 && (almacenamiento >= 128 && almacenamiento <= 1024)) {
            return "Gama Alta";
        } else {
            return "Categoría Desconocida";
        }
    }
     
      @Override
    public String toString() {
        return String.format(
            "Detalles del equipo: \n" +
            "Modelo: %s \n" +
            "Marca: %s \n" +
            "Color: %s \n" +
            "Memoria: %d GB\n" +
            "Almacenamiento: %d GB\n" +
            "Categoría: %s \n",
            modelo, marca, color, memoria, almacenamiento, categorizarCelular()
        );
    }
}

