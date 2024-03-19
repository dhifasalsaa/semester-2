import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
 public static void main(String[] args) {
  String Name;
  String TanggalLahir;
  String Jeniskelamin;
  String Umur;
  Scanner objInput = new Scanner(System.in);

  System.out.print("Masukkan Nama Anda : ");
  Name = objInput.nextLine();
  System.out.print("Masukkan Tanggal Lahir Anda :");
  TanggalLahir = objInput.nextLine();
  System.out.print("Masukkan Jenis kelamin Anda :");
  Jeniskelamin = objInput.nextLine();
  System.out.print("Masukan Umur Anda :");
  Umur = objInput.nextLine();

  System.out.print("Nama : " + Name);
  System.out.print("TanggalLahir : " + TanggalLahir);
  System.out.print("Jeniskelamin : " + Jeniskelamin);
  System.out.print("Umur: " + Umur);

        }
    }
