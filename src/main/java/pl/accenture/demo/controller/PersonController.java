package pl.accenture.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.accenture.demo.model.Person;
import pl.accenture.demo.repository.IPersonRepository;

@RestController
public class PersonController {
    @Autowired
    private IPersonRepository personRepository;

    @GetMapping("/person")
    public Iterable<Person> personIterable() { return personRepository.findAll(); }
}
