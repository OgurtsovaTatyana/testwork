
import Model.*;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <Animal> myFarm = new PetRepository();
        PetController controller = new PetController(myFarm);
        new ConsoleMenu (controller).start();
    }
}   