package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entity.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository <Etudiant,Long> {
}
