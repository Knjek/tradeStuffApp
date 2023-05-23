package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import se.yrgo.domain.OwnedThing;

public interface OwnedThingRepository extends JpaRepository<OwnedThing, Long> {
    public OwnedThing findByName(String name);
}
