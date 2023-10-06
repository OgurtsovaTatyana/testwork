
import java.util.List;
import java.util.Scanner;
import Model.*;

public class ConsoleView implements View <Animal> {

    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in, "ibm866");
    }

    @Override
    public String getName() {
        System.out.printf("Имя: ");
        return in.nextLine();
    }

    @Override
    public String getBirthday() {
        System.out.printf("Введите дату рождения в формате 'dd.mm.yyyy': ");
        return in.nextLine();
    }

    @Override
    public <T> void printAll (List <T> list, Class <T> PetClass) {
        System.out.print("Питомник:");
        if (list.isEmpty())
            System.out.println("список пуст");
        else {
            if (PetClass == Animal.class)
                System.out.println("\n          Наши питомцы:");
            for (T item : list) {
                System.out.println(item);              
            }
        }
    }
    
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}