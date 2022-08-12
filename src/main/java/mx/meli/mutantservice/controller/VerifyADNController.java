package mx.meli.mutantservice.controller;

import lombok.AllArgsConstructor;
import mx.meli.mutantservice.model.entity.VerifyADN;
import mx.meli.mutantservice.model.repository.VerifyADNRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@RestController
@RequestMapping("verify-adn")
public class VerifyADNController {

    private final VerifyADNRepository verifyADNRepository;

    /**
     * Obtener los ADNS verificados
     */
    @GetMapping
    public ResponseEntity<List<VerifyADN>> getAllVerifyAdn() {
        return ResponseEntity.ok().body(StreamSupport.stream(this.verifyADNRepository.findAll().spliterator(), false).collect(Collectors.toList()));
    }
}
