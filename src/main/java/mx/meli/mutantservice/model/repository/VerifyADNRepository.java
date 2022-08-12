package mx.meli.mutantservice.model.repository;

import mx.meli.mutantservice.model.entity.VerifyADN;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerifyADNRepository extends CrudRepository<VerifyADN, Integer> {

    long countByMutant(boolean mutant);
}
