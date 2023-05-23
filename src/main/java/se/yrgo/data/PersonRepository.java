package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import se.yrgo.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    public Person findByName(String name);
}
