public class Moto {

    String marca;
    String modelo;
    String cilindrada;
    String color;

    public void MostrarInformacion() {
        System.out.println("Marca: " + marca);

        System.out.println("Modelo: " + modelo);

        System.out.println("Cilindrada: " + cilindrada);

        System.out.println("Color: " + color);
    }

    public void Encender() {
        System.out.println("La moto esta encendida");
    }

    public static void main(String[] args) {

        Moto moto = new Moto();

        moto.marca = "Yamaha";
        moto.modelo = "MT-03";
        moto.cilindrada = "321 cc";
        moto.color = "Azul";

        moto.MostrarInformacion();
        moto.Encender();
    }
}