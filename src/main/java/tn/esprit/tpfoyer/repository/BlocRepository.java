package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entity.Bloc;
@Repository
public interface BlocRepository extends JpaRepository<Bloc , Long> {
}
