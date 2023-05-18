package fr.pib.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.pib.backend.beans.Time_lines;

public interface TimeLinesRepository extends JpaRepository<Time_lines,Long> {

}
