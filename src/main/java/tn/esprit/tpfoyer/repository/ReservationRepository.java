package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entity.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository <Reservation,String> {
}
