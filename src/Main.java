public class Main {
    public static void main(String[] args) {
        // Parte 1
        System.out.println("ahora llamaremos a sumita");
        int sumado=sumita(5, 8, 10);
        System.out.println(sumado);

        //parte 2
        autito miCoche = new autito(3,"rojo");
        System.out.println(miCoche.color);
        System.out.println(miCoche.puertas);
        miCoche.incr_puertas();
        System.out.println(miCoche.puertas);
    }

    // Funcion para Parte 1
    public static int sumita(int x, int y, int z){
        return  x+y+z;
    }
}
// clase parte 2
class autito{
    int puertas;
    String color;
    autito(int cant_puertas, String color_auto){
        puertas = cant_puertas;
        color = color_auto;
    }
    void incr_puertas(){
        this.puertas=this.puertas+1;
    }

}
