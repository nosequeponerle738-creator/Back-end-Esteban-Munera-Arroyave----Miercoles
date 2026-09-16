public class Main {
public static void main(String[] args) {
Concecionario concecionario=new Concecionario();
Motos moto1=new Motos("Yamaha","MT-03","321 cc","Azul");
Kilometraje kilometraje1=new Kilometraje(15000,2,18000000);
Motos moto2=new Motos("Honda","CB 190R","184 cc","Rojo");
Kilometraje kilometraje2=new Kilometraje(500,0,14000000);
Motos moto3=new Motos("Suzuki","GSX 150","147 cc","Negro");
Kilometraje kilometraje3=new Kilometraje(35000,5,9000000);
concecionario.agregarMoto(moto1,kilometraje1);
concecionario.agregarMoto(moto2,kilometraje2);
concecionario.agregarMoto(moto3,kilometraje3);
concecionario.mostrarMotos();
concecionario.mostrarPromedios();
concecionario.buscarMotosMuchoKilometraje(20000);
concecionario.buscarMotosConMuchosAnos(3);
}
}