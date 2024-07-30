package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entity.Universite;
@Repository
public interface UniversiteRepository extends JpaRepository<Universite , Long> {
}
