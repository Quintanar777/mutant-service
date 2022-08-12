package mx.meli.mutantservice.business;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mx.meli.mutant.exception.MutanManagerException;
import mx.meli.mutant.service.MutantManager;
import mx.meli.mutantservice.dto.HumanADNRequest;
import mx.meli.mutantservice.exception.MutantServiceException;
import mx.meli.mutantservice.model.entity.VerifyADN;
import mx.meli.mutantservice.model.repository.VerifyADNRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class MutantService {

    private final MutantManager mutantManager;
    private final VerifyADNRepository verifyADNRepository;

    /**
     * Valida si el ADN enviado en el array de String, es Mutante
     *
     * @param humanADNRequest el request
     */
    public boolean isMutantADN(final HumanADNRequest humanADNRequest) throws MutantServiceException {
        boolean isMutant = false;
        try {
            isMutant = this.mutantManager.isMutant((humanADNRequest.getAdn().toArray(String[]::new)));
            log.info("is Mutant? {}", isMutant);
            saveVerifyDNA(humanADNRequest.getAdn().toString(), isMutant);
            return isMutant;
        } catch (MutanManagerException e) {
            throw new MutantServiceException(e);
        }
    }

    private void saveVerifyDNA(String adn, boolean isMutant) {
        VerifyADN verifyADN = new VerifyADN();
        verifyADN.setDna(adn);
        verifyADN.setMutant(isMutant);
        this.verifyADNRepository.save(verifyADN);
    }
}
