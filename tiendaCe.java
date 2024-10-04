
public class tiendaCe {

    private Celular[] celulares; //Array para almacenar celulares
    private int contadorCelulares; //Contar la cantidad de celulares
    
    
   // Contructor para inicializar el array y el contador
    
   public tiendaCe(int tamaño){
       celulares = new Celular[tamaño];
       contadorCelulares = 0;
   }
   //Método para agregar un celular a la tienda
   
   public void agregarCelular(Celular celular){
       if (contadorCelulares < celulares.length){
           //Agrega el celular al array y aumenta el contador de celulares
           celulares[contadorCelulares]= celular;
           contadorCelulares++;
           System.out.println("Celular agregado:"+ celular.getMarca());
       }else{
           System.out.println("No se puede agregar más celulares.La tienda está llena");
           
       }
   }

    public void eliminarCelular(int indice){
        if (indice >= 0 && indice < contadorCelulares) {
            for (int i = indice; i < contadorCelulares - 1; i++) {
                celulares[i] = celulares[i + 1];
            }
            celulares[contadorCelulares - 1] = null; // Limpia el último elemento
            contadorCelulares--;
            System.out.println("Celular eliminado.");
        } else {
            System.out.println("Índice inválido. No se puede eliminar el celular.");
        }
    }

    // Mostrar celular
    public void mostrarCelular(){
      
        System.out.println("Celulares en la tienda:");
        
        for(int i=0; i<contadorCelulares; i++){
               System.out.println(celulares[i].toString());
           }
       }


    //Método para buscar celular por modelo
    public void buscarPorModelo(String modelo){
        boolean encontrado =false;
        for (int i=0; i< contadorCelulares; i++){
            //Compara el modelo del celular actual con el celular buscado
            //Ignorando mayúsculas
            if(celulares[i].getModelo().equalsIgnoreCase(modelo)){
                System.out.println("Celular encontrado:"+celulares[i]);
                encontrado =true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("El celular no se encuentra en la tienda");
        }
        
    }

    //Eliminar celular por modelo
    public void eliminarPorModelo (String modelo){
        boolean eliminado = false;
        for(int i=0; i<contadorCelulares; i++){
            if (celulares[i].getModelo().equals(modelo)){
                System.out.println("Modelo de celular eliminado:"+celulares[i].getModelo());
                //Desplazar los celulares hacia la izquierda para llenar el espacio vacío
                for (int j=i; j <contadorCelulares -1; j++){
                    celulares[j] = celulares[j+1];
                }
                celulares[contadorCelulares-1]=null; 
                contadorCelulares --;
                eliminado =true;
                break;
            }
        }
        if(!eliminado){
            System.out.println("No se encontró un celular con marca:"+ modelo);
        }
    }
}