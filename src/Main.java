public class Main {
    public static void main(String[] args) {
        var boxer1 = 78.2;
        var boxer2= 82.7;
        System.out.println("Общий вес боксеров = " + (boxer1 + boxer2) + "кг");
        var raznizaVesa = Math.abs(boxer1-boxer2);
        System.out.println("Разница в весе составляет " + raznizaVesa + "кг");

        raznizaVesa = boxer2-boxer1; //1способ
        System.out.println("Разница в весе составляет " + raznizaVesa + "кг");
        raznizaVesa = boxer2 % boxer1; //2способ
        System.out.println("Разница в весе составляет " + raznizaVesa + "кг");
    }
}