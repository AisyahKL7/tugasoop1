import java.util.Scanner;
public class latNestedIf {
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    String nama;
    int score;
    int kehadiran;

    System.out.print("Masukkan nama : ");
    nama = scan.next();
    System.out.print("Masukkan nilai: ");
    score = scan.nextInt();
    System.out.print("Masukkan nilai kehadiran: ");
    kehadiran = scan.nextInt();

    if (score >= 50){
        if(kehadiran >= 70){
            System.out.println("Selamat, "+nama );
            System.out.println("Nilai kamu bagus!");
            System.out.println("kehadiran kamu bagus!");
        }else{
            System.out.println("Selamat, "+nama );
            System.out.println("Nilai kamu bagus!");
            System.out.println("Tingkatkan lagi kehadiranmu!");  
        }
    
        

    }else {
       if(kehadiran >= 70){
        System.out.println("Bagus, "+nama );
        System.out.println("tingkatkan lagi yaa!");
        System.out.println("kehadiran kamu bagus!");
       }else{
        System.out.println("Bagus, "+nama );
        System.out.println("tingkatkan lagi yaa!");
        System.out.println("Tingkatkan lagi kehadiranmu!"); 
       }      
    }
}    
}
