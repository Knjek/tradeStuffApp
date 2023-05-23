package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.yrgo.data.PersonRepository;
import se.yrgo.domain.Person;

import java.util.List;

@RestController
public class PersonRestController {

    @Autowired
    private PersonRepository data;

    /**
     *
     * @return list of persons. If nothing in list returns a Http Statuscode 400 and errormessage.
     */
    @RequestMapping("/persons")
    public ResponseEntity allPersons() {
        List<Person> all = data.findAll();
        if (all.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nothing in list");
        }

        return ResponseEntity.ok(new PersonList(all));
    }

    @RequestMapping(value= "/persons", method= RequestMethod.POST)
    public ResponseEntity createNewPerson(@RequestBody Person person) {
        data.save(person);
        return new ResponseEntity<Person>(person, HttpStatus.CREATED);
    }
}

