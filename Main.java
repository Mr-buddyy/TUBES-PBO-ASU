import java.util.Scanner;

public class Main { 
    public static int[] array=new int[1];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Celcius celcius = new Celcius();
        Farenheit farenheit = new Farenheit();
        Kelvin kelvin = new Kelvin();
        Reamur reamur = new Reamur();

        int pilih;
        do {
            System.out.println("|=============================|");
            System.out.println("|\t\t Konversi Suhu \t\t  |");
            System.out.println("|=============================|");
            System.out.println("[1] Konversikan dari Celcius");
            System.out.println("[2] Konversikan dari Kelvin");
            System.out.println("[3] Konversikan dari Farenheit");
            System.out.println("[4] Konversikan dari Reamur");
            System.out.println("[5] Keluar");
            System.out.print("Masukan Pilihan Anda : ");
            pilih=input.nextInt();
            System.out.println("|=============================|");
            switch (pilih){
                case 1:
                    System.out.print("Masukan Besar Suhu : ");
                    for (int i = 0; i < array.length; i++){
                        array[i]=input.nextInt();
                    }
                    System.out.println(array[0]+" Celcius = "+ celcius.Kelvin()+" Kelvin");
                    System.out.println(array[0]+" Celcius = "+ celcius.Farenheit()+" Farenheit");
                    System.out.println(array[0]+" Celcius = "+ celcius.Reamur()+" Reamur");
                    break;
                case 2:
                    System.out.print("Masukan Besar Suhu : ");
                    for (int i = 0; i < array.length; i++){
                        array[i]=input.nextInt();
                    }
                    System.out.println(array[0]+" Kelvin = "+ kelvin.Celcius()+" Celcius");
                    System.out.println(array[0]+" Kelvin = "+ kelvin.Farenheit()+" Farenheit");
                    System.out.println(array[0]+" Kelvin = "+ kelvin.Reamur()+" Reamur");
                    break;
                case 3:
                    System.out.print("Masukan Besar Suhu : ");
                    for (int i = 0; i < array.length; i++){
                        array[i]=input.nextInt();
                    }
                    System.out.println(array[0]+" Farenheit = "+ farenheit.Celcius()+" Celcius");
                    System.out.println(array[0]+" Farenheit = "+ farenheit.Kelvin()+" Kelvin");
                    System.out.println(array[0]+" Farenheit = "+ farenheit.Reamur()+" Reamur");
                    break;
                case 4:
                    System.out.print("Masukan Besar Suhu : ");
                    for (int i = 0; i < array.length; i++){
                        array[i]=input.nextInt();
                    }
                    System.out.println(array[0]+" Reamur = "+ reamur.Celcius()+" Celcius");
                    System.out.println(array[0]+" Reamur = "+ reamur.Kelvin()+" Kelvin");
                    System.out.println(array[0]+" Reamur = "+ reamur.Farenheit()+" Farenheit");
                    break;
                case 5:
                    System.exit(0);
            }
        }while (pilih !=5);
    }
}

