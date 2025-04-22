public class Race { // класс гонка.
    String leader = ""; // имени leader присваиваем изначальное значение
    int distance = 0; // имени distance присваиваем изначальное значение

    public  int formulaDistance(Car car) { // метод формула дистанции с параметром класса Car  и имени car
        int distance = 24 * car.speed; // формула дистанции.
        return distance; // возвращаем полученные вычесления
    }

    public  String currentLeader(Car car) { // конструктор текущего лидера с параметрами
        int newDistance = formulaDistance(car); // новой дистанции присваиваем формулу
        if (this.distance < formulaDistance(car)) { // условие если текущая дистанция меньше формулы дистанции
            this.leader = car.name; // то, текущего лидера присваиваем названию машины
            this.distance = newDistance; // то текущую дистанцию присваиваем к новой дистанции
        }
        return leader; // возвращаем лидера.
    }
}