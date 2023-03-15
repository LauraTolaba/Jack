package ClaseyObjetos;

public class Clase {
    public static void main(String[] args){
        auto auto1= new auto( );
        System.out.println();
    }


}

class auto {
    //Atributos
      private int puertas;
      private String color;
      private String modelo;
      private String Marca;
      private boolean usado;
      public auto(){int puertas, String Marca, String modelo, String color);
        usado=false;

      }

    public int getPuertas() {
        return puertas;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public boolean isUsado() {
        return usado;
    }
}