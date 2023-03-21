import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fizik,kimya,mat,turkce,muzik;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Matematik notu:");
        mat = scanner.nextInt();

        while (mat>100 || mat<0){
            System.out.println("Lütfen geçerli  not giriniz !");
            System.out.println("Matematik notu:");
            mat = scanner.nextInt();
        }


        System.out.print("Fizik notu:");
        fizik = scanner.nextInt();

        while ((fizik>100 || fizik<0)){
            System.out.println("Lütfen geçerli  not giriniz !");

            System.out.print("Fizik notu:");
            fizik = scanner.nextInt();
        }

        System.out.print("Kimya notu:");
        kimya = scanner.nextInt();

      while ((kimya>100 || kimya<0)){
          System.out.println("Lütfen geçerli  not giriniz !");

            System.out.print("Kimya notu:");
            kimya = scanner.nextInt();
        }

        System.out.print("Türkçe notu:");
        turkce = scanner.nextInt();

       while ((turkce>100 || turkce<0)){
           System.out.println("Lütfen geçerli  not giriniz !");

            System.out.print("Türkçe notu:");
            turkce = scanner.nextInt();
        }


            System.out.print("Müzik notu:");
            muzik = scanner.nextInt();

        while ((muzik>100 || muzik<0)){
            System.out.println("Lütfen geçerli  not giriniz !");

            System.out.print("Müzik notu:");
            muzik = scanner.nextInt();

        }




        double ortalama = (fizik + kimya + turkce + muzik + mat)/5;

        if (ortalama>55){
            System.out.println("Tebrikler sınıfı geçtiniz ");
        }
        else System.out.println("Üzgünüz kaldınız ");



    }
}