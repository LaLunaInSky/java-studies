package multipleClassesInMultiFiles;

import multipleClassesInMultiFiles.model.Person;
import multipleClassesInMultiFiles.service.PersonService;

public class Main {
    public static void main(
        String[] args
    ) {
        PersonService service = new PersonService();

        Person person = service.createdNewPerson();

        IO.println(
            person.printName() + " has been created!"
        );
    }
}