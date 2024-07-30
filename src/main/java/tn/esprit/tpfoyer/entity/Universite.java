package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private long idUniversite ;
    private String nomUniversite ;
    private String adresse ;


    @OneToOne
    private Foyer foyer;


}
