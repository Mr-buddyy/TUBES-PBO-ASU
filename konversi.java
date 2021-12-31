import java.util.Scanner;

public class konversi{
    static Scanner sekener = new Scanner(System.in);
    public static Celcius celcius = new Celcius();
    public static double suhuawal;
    
    static void loop(){
        System.out.println("==========");
        System.out.print("Lagi ?(Y/T) : ");
        String loop = sekener.next();
        if(loop.equalsIgnoreCase("Y")){
            menumain();
        }else if (loop.equalsIgnoreCase("T")){
            System.out.println("Sampai jumpa");
        }else{
            System.out.println("Jawaban anda ngawur! Ulangi!");
            loop();
        }
    }
    static void menumain(){
        System.out.println("===Daftar suhu===");
        System.out.print("Masukkan suhu awal (misal : 100 C): ");
        suhuawal = sekener.nextDouble();
        char satuan = sekener.next().charAt(0);

    
        switch (Character.toUpperCase(satuan)){
            case 'C':
            System.out.println("Farenheit : " + celcius.Farenheit());
            System.out.println("Kelvin : " + celcius.Kelvin());
            System.out.println("Reamur : " + celcius.Reamur());
            loop();
            break;
            case 'F':
            System.out.println("Celcius");
            System.out.println("Kelvin");
            System.out.println("Reamur");
            loop();
            break;
            case 'K':
            System.out.println("Farenheit");
            System.out.println("Celcius");
            System.out.println("Reamur");
            loop();
            break;
            case 'R':
            System.out.println("Celcius");
            System.out.println("Farenheit");
            System.out.println("Kelvin");
            loop();
            break;
        }
    }
    public static void main(String[] args) {
    menumain();
    }
}