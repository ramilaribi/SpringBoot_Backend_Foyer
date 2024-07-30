package tn.esprit.tpfoyer.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private long idBloc ;
    private String nomBloc ;
    private long capaciteBloc ;


    @JsonIgnore
    @ManyToOne
    Foyer foyer ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Chambre> chambres ;


}
