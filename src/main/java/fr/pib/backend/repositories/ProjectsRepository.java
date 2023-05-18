package fr.pib.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.pib.backend.beans.Projects;

public interface ProjectsRepository extends JpaRepository<Projects,Long>{

}
