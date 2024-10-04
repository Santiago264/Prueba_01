
import java.util.Scanner;

public class Tienda_celular {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Bienvenido a la Tienda de celulares" );
        System.out.println("Ingrese la cantidad de celulares en la tienda: ");
        int tamaño = scanner.nextInt();
        scanner.nextLine();
        tiendaCe tienda = new tiendaCe(tamaño);
        
       int opcion;
       do {
           System.out.println("Sistema de la tienda ");
           System.out.println("1. Agregar celular");
           System.out.println("2. Mostrar todos los celulares");
           System.out.println("3. Buscar un celular por su modelo");
           System.out.println("4. Eliminar celular por su modelo");
           System.out.println("5. Salir");
           System.out.println("Seleccione una opción: ");
           opcion = scanner.nextInt();
           scanner.nextLine();
           
           switch (opcion) {
               case 1:
                   //Agregar celular
                   System.out.println("Ingrese el modelo del celular:");
                   String modelo = scanner.nextLine();
                   System.out.println("Ingrese la marca del celular:");
                   String marca = scanner.nextLine();
                   System.out.println("Ingrese el color del celular:");
                   String color= scanner.nextLine();
                   System.out.println("Ingrese la memoria del celular:");
                   String memoriaInput = scanner.nextLine();
                   int memoria = Integer.parseInt(memoriaInput.split(" ")[0]);
                   System.out.println("Ingrese la capacidad de almacenamiento del celular: ");
                   String almacenamientoInput = scanner.nextLine();
                   int almacenamiento = Integer.parseInt(almacenamientoInput.split(" ")[0]); 
                   System.out.println("Ingrese el precio del celular: ");
                   double precio = scanner.nextDouble();
                           
                   Celular celular = new Celular ( modelo, marca,color, memoria, almacenamiento,precio);
                   tienda.agregarCelular(celular);
                   
                   break;
               case 2:
                   //Mostrar los celulares disponibles de la tienda
                   tienda.mostrarCelular();
                   break;
                   
                   
               case 3:
                   //Buscar celular por modelo
                   System.out.println("Ingrese el modelo de celular que desea buscar: ");
                   String modeloBuscar = scanner.nextLine();
                   tienda.buscarPorModelo(modeloBuscar);
                   break;
                   
               case 4:
                   //Eliminar celular por modelo
                   System.out.println("Ingrese el modelo del celular a eliminar:");
                   String modeloEliminar = scanner.nextLine();
                   tienda.eliminarPorModelo(modeloEliminar);
                   break;
                   
               case 5:
                   System.out.println("Saliendo del sistema .....");
                   break;
                   
               default :
                   System.out.println("Opción no válida en el sistema.Ingrese otra opción.");
                   
           }
                         
        } while (opcion !=5);
       
       scanner.close();
           
    }           
               
}

