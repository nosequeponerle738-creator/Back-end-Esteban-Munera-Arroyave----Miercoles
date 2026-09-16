public class Motos {
private String marca;
private String modelo;
private String cilindrada;
private String color;
public Motos(String marca,String modelo,String cilindrada,String color) {
this.marca=marca;
this.modelo=modelo;
this.cilindrada=cilindrada;
this.color=color;
}
public String getMarca() {
return marca;
}
public String getModelo() {
return modelo;
}
public String getCilindrada() {
return cilindrada;
}
public String getColor() {
return color;
}
public void mostrarInformacion() {
System.out.println("Marca: "+marca);
System.out.println("Modelo: "+modelo);
System.out.println("Cilindrada: "+cilindrada);
System.out.println("Color: "+color);
}
}