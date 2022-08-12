package mx.meli.mutantservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Stats {
    private Long countMutantDna;
    private Long countHumanDna;
    private Double ratio;
}
