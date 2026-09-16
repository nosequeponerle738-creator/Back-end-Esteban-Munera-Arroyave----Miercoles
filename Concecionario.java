import java.util.ArrayList;
public class Concecionario {
private ArrayList<Motos> motos;
private ArrayList<Kilometraje> kilometrajes;
public Concecionario() {
motos=new ArrayList<>();
kilometrajes=new ArrayList<>();
}
public void agregarMoto(Motos moto,Kilometraje kilometraje) {
motos.add(moto);
kilometrajes.add(kilometraje);
}
public void mostrarMotos() {
for(int i=0;i<motos.size();i++) {
System.out.println("--- MOTO "+(i+1)+" ---");
motos.get(i).mostrarInformacion();
kilometrajes.get(i).mostrarInformacion();
}
}
public double calcularPromedioKilometraje() {
if(kilometrajes.isEmpty()) {
return 0;
}
int suma=0;
for(Kilometraje kilometraje:kilometrajes) {
suma+=kilometraje.getKilometraje();
}
return (double)suma/kilometrajes.size();
}
public double calcularPromedioAnosUso() {
if(kilometrajes.isEmpty()) {
return 0;
}
int suma=0;
for(Kilometraje kilometraje:kilometrajes) {
suma+=kilometraje.getAnosUso();
}
return (double)suma/kilometrajes.size();
}
public void mostrarPromedios() {
System.out.println("--- PROMEDIOS ---");
System.out.println("Promedio de kilometraje: "+calcularPromedioKilometraje()+" km");
System.out.println("Promedio de anos de uso: "+calcularPromedioAnosUso());
}
public void buscarMotosMuchoKilometraje(int kilometrajeMinimo) {
System.out.println("--- MOTOS CON MUCHO KILOMETRAJE ---");
for(int i=0;i<motos.size();i++) {
if(kilometrajes.get(i).getKilometraje()>=kilometrajeMinimo) {
System.out.println(motos.get(i).getMarca()+" "+motos.get(i).getModelo()+" - "+kilometrajes.get(i).getKilometraje()+" km");
}
}
}
public void buscarMotosConMuchosAnos(int anosMinimos) {
System.out.println("--- MOTOS CON MUCHOS AÑOS DE USO ---");
for(int i=0;i<motos.size();i++) {
if(kilometrajes.get(i).getAnosUso()>=anosMinimos) {
System.out.println(motos.get(i).getMarca()+" "+motos.get(i).getModelo()+" - "+kilometrajes.get(i).getAnosUso()+" años");
}
}
}
}