public class Main {
    public static void main(String[] args) {
        var hour = 640;
        var job = 8;
        var employee = hour / job;
        System.out.println("Всего работников в компании – " + employee + " человек");
            var bigEmployee = employee + 94;
            var allEmployee = bigEmployee * job;
            System.out.println("Если в компании работает " + bigEmployee + " человек, то всего " + allEmployee + " часов работы может быть поделено между сотрудниками");
    }
}