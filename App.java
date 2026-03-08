import java.util.Scanner;
public class App { 
 public static void main(String[] args) {
Scanner in = new Scanner(System.in);  

//instansiasi objek bernama m1 
Mobil m1 = new Mobil(); 

m1.setMerk("Toyota");  
m1.setNopol("AB 1231 UA");  
m1.setWarna("Merah");
m1.setKecepatan(50); 
m1.hitungJarakTempuh(2);
m1.tampilKecepatanMeterPerDetik();

System.out.print("Masukkan Merk Mobil: ");
String merk = in.nextLine();

System.out.print("Masukkan Nomor Polisi: ");
String nopol = in.nextLine();

m1.setMerk(merk);
m1.setNopol(nopol);

m1.display(); 
System.out.println("---------------");  

//instansiasi objek bernama m2 
Mobil m2 = new Mobil();  
  
m2.setMerk("Mitsubishi");  
m2.setNopol("N 1134 AG");  
m2.setWarna("Biru"); 
m2.setKecepatan(100); 
m2.hitungJarakTempuh(4);
m2.tampilKecepatanMeterPerDetik();
m2.display(); 

System.out.println("---------------");  
System.out.println("Atribut pada objek m1 diubah."); 

//mengubah warna dari objek m1 
m1.setWarna("Hijau");  
  
//menampilkan hasil perubahan  
m1.display();

System.out.println("---------------");  
System.out.println("Atribut pada objek m2 diubah."); 

//mengubah warna dari objek m2
m2.setWarna("Pink");

//menampilkan hasil perubahan objek m2
m2.display();
    }
}