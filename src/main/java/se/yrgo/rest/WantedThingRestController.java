package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.yrgo.data.WantedThingRepository;
import se.yrgo.domain.WantedThing;

import java.util.List;

@RestController
public class WantedThingRestController {

    @Autowired
    private WantedThingRepository data;

    /**
     *
     * @return list of wanted things. If nothing in list returns a Http Statuscode 400 and errormessage.
     */
    @RequestMapping("/wants")
    public ResponseEntity allWantedThings() {
        List<WantedThing> all = data.findAll();
        if (all.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nothing in list");
        }

        return ResponseEntity.ok(new WantedThingList(all));
    }

    @RequestMapping(value= "/wants", method= RequestMethod.POST)
    public ResponseEntity createNewWantedThing(@RequestBody WantedThing wantedThing) {
        data.save(wantedThing);
        return new ResponseEntity<WantedThing>(wantedThing, HttpStatus.CREATED);
    }
}

