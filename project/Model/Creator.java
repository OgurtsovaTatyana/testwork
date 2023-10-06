package Model;
import java.time.LocalDate;

public abstract class Creator {

    protected abstract Animal createNewPet(PetType type);

    public Animal createPet(PetType type, String name, LocalDate date) {

        Animal pet = createNewPet(type);
        pet.setName(name);
        pet.setBirthday(date);
        return pet;
    }
}