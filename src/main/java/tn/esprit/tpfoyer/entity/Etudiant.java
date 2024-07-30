package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
   @Id
   @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private long idEtudiant ;
    private String nomEt ;
    private String prenomEt ;
    private long cin ;
    private String ecole ;
    private Date dateNaissance ;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
