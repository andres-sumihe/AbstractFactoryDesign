import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Scanner Scan = new Scanner(System.in);
        int Menu = 0;
        int angkaDesimal;
        int pilihanlanjutan;
        while(Menu == 0 ){

            System.out.println("=====================================================");
            System.out.println("     Konversi Desimal ke Biner/Oktal/Hexadesimal     ");
            System.out.println("=====================================================");
            System.out.println("1. Desimal ---> Biner");
            System.out.println("2. Desimal ---> Hexadesimal");
            System.out.println("3. Desimal ---> Oktal");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan Konversi Anda : ");
            int pilihan = Scan.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Angka Desimal Anda : ");
                    angkaDesimal = Scan.nextInt();
                    Convert shape1 = shapeFactory.getShape("BINARY");
                    shape1.convert(angkaDesimal);
                    System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (0)");
                    pilihanlanjutan = Scan.nextInt();
                    if(pilihanlanjutan == 1){
                        break;
                    }else{
                        return;
                    }
                case 2:
                    System.out.print("Masukkan Angka Desimal Anda : ");
                    angkaDesimal = Scan.nextInt();
                    Convert shape2 = shapeFactory.getShape("HEX");
                    shape2.convert(angkaDesimal);
                    System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                    pilihanlanjutan = Scan.nextInt();
                    if(pilihanlanjutan == 1){
                        break;
                    }else{
                        return;
                    }
                case 3:
                    System.out.print("Masukkan Angka Desimal Anda : ");
                    angkaDesimal = Scan.nextInt();
                    Convert shape3 = shapeFactory.getShape("OCTAL");
                    shape3.convert(angkaDesimal);
                    System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                    pilihanlanjutan = Scan.nextInt();
                    if(pilihanlanjutan == 1){
                        break;
                    }else{
                        return;
                    }
                case 4 :
                    System.out.println("Terima Kasih Telah Menggunakan Program Ini");
                    return;
                default:
                    System.out.println("Pilihan Tidak Ada.");
                    break;
            }
        }
    }
}
