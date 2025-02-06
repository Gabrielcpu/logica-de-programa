package JavaCore.ZZKJUnit.Service;


import JavaCore.ZZKJUnit.Dominio.Person;

import java.util.Objects;

public class PersonService {
    public boolean isAdull(Person person) {
        Objects.requireNonNull(person, "Person can´t be null");
        return person.getAge() >= 18;
    }
}

