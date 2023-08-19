package fr.pib.backend.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import fr.pib.backend.beans.Resources;

public interface ResourcesRepository extends JpaRepository<Resources,Long>{
    List<Resources> findByProjectsId(Long projectId);
}
