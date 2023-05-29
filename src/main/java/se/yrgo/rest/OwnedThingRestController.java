package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.yrgo.data.OwnedThingRepository;
import se.yrgo.domain.OwnedThing;

import java.util.List;

@RestController
public class OwnedThingRestController {

    @Autowired
    private OwnedThingRepository data;

    /**
     *
     * @return list of OwnedThings. If nothing in list returns a Http Statuscode 400 and errormessage.
     */
    @RequestMapping("/owned")
    public ResponseEntity allOwnedThings() {
        List<OwnedThing> all = data.findAll();
        if (all.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nothing in list");
        }
        return ResponseEntity.ok(new OwnedThingList(all));
    }

    @RequestMapping(value= "/owned", method= RequestMethod.POST)
    public ResponseEntity createNewOwnedThing(@RequestBody OwnedThing ownedThing) {
        data.save(ownedThing);
        return new ResponseEntity<OwnedThing>(ownedThing, HttpStatus.CREATED);
    }
}



