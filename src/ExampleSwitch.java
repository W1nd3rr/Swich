
import java.util.Scanner;


public class ExampleSwitch {

    public static void main(String[] args) {
        String ucapan;
        int nilai;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nama");
        ucapan = input.next();
//        System.out.println("Masukkan Nilai Anda");
//        nilai = input.nextInt();
//        if (nilai == 2 )
//        {
//            ucapan = "hallo";
//        }
//        else
//        {
//            ucapan = "punten";
//        }
//        System.out.println(ucapan);
        switch (ucapan) 
        {
            case "A" :
            case "a" :
                System.out.println("Sangat Baik");
                break;
            case "B" :
            case "b" :    
                System.out.println("baik");
                break;
            case "C" :
            case "c" :    
                System.out.println("Kurang");
                break;
            case "D" :
            case "d" :    
                System.out.println("Sangat Kurang");
                break;
            case "E" :
            case "e" :    
                System.out.println("Error");
                break;
            default :
                System.out.println("Mungkin Anda Salah Jurusan");
        }
    }
    
}