package ODEV9;

public class Functions {
    public static void ValidateNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        try {
            for (int i = 0; i <= numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("Toplam: " + sum);

        } catch (Exception ex) {
            System.out.println("Hata Alındı. " + ex);
        }
    }

    public static void ValidateDivision(int x, int y) {
        try {
            int result = 0;
            result = x / y;
            System.out.println("Sonuç: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Bölen sayı sıfır olamaz!" + ex);
        } catch (Exception ex) {
            System.out.println("Bir hata oluştu. Hata mesajı: " + ex.getMessage());
        }
    }

    public static void ValidateString(String str) {
        try {
            char ch = str.charAt(22);
            System.out.println("İlgili karakter: " + ch);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz indeks kullanıldı.");
        } catch (NullPointerException ex) {
            System.out.println("Hata: Null bir referansa erişim sağlanmıştır. " + ex.getMessage());
        }
    }


}
