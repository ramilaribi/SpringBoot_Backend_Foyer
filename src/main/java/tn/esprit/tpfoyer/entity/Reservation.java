package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    private String idReservation ;
    private Date  anneUniversitaire ;
    private Boolean estValide ;

    @ManyToMany(mappedBy = "reservations")
     private Set<Etudiant> etudiants;
}
