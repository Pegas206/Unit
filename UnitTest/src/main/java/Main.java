import ru.netology.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //заполняем очередь посетителями
        Queue<Person> queue = new LinkedList<>(generateClients());
        //Изъятие посетителя и проверка на наличие билетов
        //Если есть то отнимаем оди и помещаем в конец очереди
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            int bilet = person.getBilet();
            if (bilet > 0) {
                --bilet;
                System.out.printf("%s %s прокатился на аттракционе, у него осталось %d билет(а/ов)\n", person.getName(), person.getSurname(), person.getBilet());
                person.setBilet(bilet);
                queue.add(person);
            }
        }
    }

    //Генерация пользователей
    private static List<Person> generateClients() {
        return List.of(
                new Person("Петр", "Пупкин", 3)

        );


    }
}
