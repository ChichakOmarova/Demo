package Exceptionhometasks;

public class Task3{
    public static void main(String[] args) {
        Object hesab = null;

        try {

            hesabBalansiniYoxla(hesab);

        } catch (NullPointerException e) {
            System.out.println("Xəta: Hesab məlumatı tapılmadı. Dəstək xidməti ilə əlaqə saxlayın.");
        }
    }

    public static void hesabBalansiniYoxla(Object hesab) {

        System.out.println("Hesab məlumatı: " + hesab.toString());
    }
}
