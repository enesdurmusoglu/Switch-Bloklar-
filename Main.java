public class Main {
    public static void main(String[] args) {
        char grade = 'E';

        switch (grade){
            case  'A':
                System.out.println("Tebrikler Geçtiniz");
                break;
            case 'B':
                System.out.println("Geçtiniz");
                break;
            case 'C':
                System.out.println("Ortalama İle Geçtiniz");
                break;
            case 'D':
                System.out.println("Dersten Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not");
        }
    }
}