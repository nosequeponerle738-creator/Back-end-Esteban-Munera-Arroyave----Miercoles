public class Kilometraje {
private int kilometraje;
private int anosUso;
private double valor;
public Kilometraje(int kilometraje,int anosUso,double valor) {
this.kilometraje=kilometraje;
this.anosUso=anosUso;
this.valor=valor;
}
public int getKilometraje() {
return kilometraje;
}
public int getAnosUso() {
return anosUso;
}
public double getValor() {
return valor;
}
public boolean esSegundaMano() {
return kilometraje>0||anosUso>0;
}
public void mostrarInformacion() {
System.out.println("Kilometraje: "+kilometraje+" km");
System.out.println("Años de uso: "+anosUso);
System.out.println("Valor: $"+valor);
if(esSegundaMano()) {
System.out.println("Estado: Segunda mano");
}else{
System.out.println("Estado: Nueva");
}
}
}