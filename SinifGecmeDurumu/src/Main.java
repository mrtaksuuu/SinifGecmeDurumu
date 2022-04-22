import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,sum;

        Scanner kb =new Scanner(System.in);

        System.out.println("Matematik notunu giriniz:");
        mat= kb.nextInt();
        if(mat>=0 && mat<=100 ){
        }

        System.out.println("Fizik notunu giriniz:");
        fizik= kb.nextInt();
        if(fizik>=0 && fizik<=100){
        }

        System.out.println("Türkçe notunu giriniz:");
        turkce= kb.nextInt();
        if(turkce>=0 && turkce<=100){
        }

        System.out.println("Kimya notunu giriniz:");
        kimya= kb.nextInt();
        if(kimya>=0 && kimya<=100){
        }

        System.out.println("Müzik notunu giriniz:");
        muzik= kb.nextInt();
        if(muzik>=0 && muzik<=100){
        }
        sum = mat + fizik + turkce + kimya + muzik;
        double average = sum / 5;
        if(average>=55){
            System.out.println("Sınıfı geçtiniz.");
        }else{
            System.out.println("Sınıfta kaldınız!");
        }
        System.out.println("Ortalamanız:"+average);
    }

}