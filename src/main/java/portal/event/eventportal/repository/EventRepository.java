package portal.event.eventportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portal.event.eventportal.domain.Event;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer> {
}
