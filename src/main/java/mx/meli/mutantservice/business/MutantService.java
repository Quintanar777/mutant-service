package mx.meli.mutantservice.business;

import lombok.AllArgsConstructor;
import mx.meli.mutant.service.MutantManager;
import mx.meli.mutantservice.dto.HumanADNRequest;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MutantService {

    private final MutantManager mutantManager;

    /**
     * Valida si el ADN enviado en el array de String, es Mutante
     *
     * @param humanADNRequest el request
     */
    public boolean isMutantADN(HumanADNRequest humanADNRequest) {
        return this.mutantManager.isMutant((humanADNRequest.getAdn().toArray(String[]::new)));
    }
}
