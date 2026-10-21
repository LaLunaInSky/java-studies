package multipleClassesInMultiFiles.service;

import multipleClassesInMultiFiles.model.Person;

public class PersonService extends Person {
    public PersonService() {
        super();
    }

    public Person createdNewPerson() {
        IO.println(
            "Person created inside PersonService"
        );

        return new PersonService();
    }
}
