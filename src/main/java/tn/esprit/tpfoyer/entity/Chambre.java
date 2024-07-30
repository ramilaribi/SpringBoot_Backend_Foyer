package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private long idChambre ;
    private long numeroChambre ;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC ;

    @ManyToOne
    Bloc bloc ;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations ;

}
