package mx.meli.mutantservice.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "verify_dna")
public class VerifyADN {
    @Id
    @Column(name = "id_verify_adn")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVerifyAdn;

    @Column(name = "dna")
    private String dna;

    @Column(name = "is_mutant")
    private boolean mutant;
}
