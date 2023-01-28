package day16_collectionmap;

public class EnumRunner {
    public static void main(String[] args) {
        Level oyun=Level.MEDIUM;

        switch(oyun){
            case LOW:
                System.out.println("Kolay Seviye Bir Pyun");
                break;
            case MEDIUM:
                System.out.println("Orta Seviye Bir Oyun");
                break;
            case HIGH:
                System.out.println("Zor Seviye Bir Oyun");
                break;
        }
    }
}
