package eskenar_ikizzkenar_cesitkenar;
import java.util.Scanner;
/*
Adım 1: Başla 
Adım 2: Kullancıdan kenar1 , kenar2 ve kenar3 uzunluklarını al
Adım 3: Eğer kenar1==kenar2 && kenar1==kenar3 --> Eşkaner üçgen yaz
Adım 4: Eğer kenar1==kenar2 || kenar1==kenar3 --> İkizkenar üçgen yaz
Adım 5: Değilse Çeşitkenar üçgen yaz.
Adım 6: Bitir.
*/

public class Eskenar_ikizzkenar_cesitkenar {

  // Klavyeden üç kenarı girilen üçgenin eşkenar , ikizkenar veya çeşitkenar olduğunu yazdıran program . 
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen Birinci Kenarı Giriniz :");
        int kenar1 = input.nextInt();
        
        System.out.print("Lütfen İkinci Kenarı Giriniz :");
        int kenar2 = input.nextInt();
        
        System.out.print("Lütfen Üçüncü Kenarı Giriniz :");
        int kenar3 = input.nextInt();
        
        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("Eşkenar Üçgendir .");
        }
        else if(kenar1 == kenar2 || kenar1 == kenar3) {
            System.out.println("İkizkenar Üçgendir .");
        }
        else {
            System.out.println("Çeşitkenar Üçgendir .");
        }
    }
    
}
