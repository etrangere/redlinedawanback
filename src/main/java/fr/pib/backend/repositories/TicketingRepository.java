package fr.pib.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.pib.backend.beans.Ticketing;

public interface TicketingRepository extends JpaRepository<Ticketing,Long>{

}
