package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import se.yrgo.domain.WantedThing;

public interface WantedThingRepository extends JpaRepository<WantedThing, Long> {
    public WantedThing findByName(String name);
}
