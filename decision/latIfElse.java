import java.util.Scanner;
public class latIfElse {
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    String nama;
    int score;

    System.out.print("Masukkan nama : ");
    nama = scan.next();
    System.out.print("Masukkan nilai: ");
    score = scan.nextInt();

    if (score >= 50){
        System.out.println("Selamat, "+nama );
        System.out.println("Nilai kamu bagus!");
        
    }else {
        System.out.println("Bagus, "+nama );
        System.out.println("tingkatkan lagi yaa!");
              
    }
}
    
}
