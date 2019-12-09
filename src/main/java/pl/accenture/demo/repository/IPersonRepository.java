package pl.accenture.demo.repository;

import org.springframework.data.repository.CrudRepository;
import pl.accenture.demo.model.Person;

public interface IPersonRepository extends CrudRepository<Person, Long> { }
