package JavaCore.ZZKJUnit.Teste;

import JavaCore.ZZKJUnit.Dominio.Person;
import JavaCore.ZZKJUnit.Service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonServiceTeste01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is Adult?'{}'",personService.isAdull(person));
    }
}
