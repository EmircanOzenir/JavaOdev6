import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, vucutKitleEndeksi;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Boyunuzu Metre Cinsinden Giriniz: ");
        boy = input.nextDouble();
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen Kilonuzu Giriniz: ");
        kilo = inp.nextDouble();

        vucutKitleEndeksi = kilo/(boy*boy);
        System.out.print("Vucut Kitle Endeksiniz: " +vucutKitleEndeksi);
    }
}
