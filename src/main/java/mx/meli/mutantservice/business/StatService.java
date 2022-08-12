package mx.meli.mutantservice.business;

import lombok.AllArgsConstructor;
import mx.meli.mutantservice.dto.Stats;
import mx.meli.mutantservice.model.repository.VerifyADNRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StatService {

    private final VerifyADNRepository verifyADNRepository;

    /**
     * Obtener estadisticas
     */
    public Stats getStats() {
        long countMutant = this.verifyADNRepository.countByMutant(true);
        long countHuman = this.verifyADNRepository.countByMutant(false);
        double ratio = countHuman > 0 ? countMutant / countHuman : 0;
        return Stats.builder()
                .countMutantDna(countMutant)
                .countHumanDna(countHuman)
                .ratio(ratio)
                .build();
    }
}
