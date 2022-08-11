package mx.meli.mutantservice.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mx.meli.mutantservice.business.MutantService;
import mx.meli.mutantservice.dto.HumanADNRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/mutant")
public class MutantController {

    private final MutantService mutantService;

    /**
     * Detectar si un ADN humano enviado es mutante o no
     */
    @PostMapping
    public ResponseEntity validADNIsMutant(@Valid @RequestBody HumanADNRequest humanADNRequest) {
        log.info("request POST /mutant, request: {}", humanADNRequest.toString());
        if (this.mutantService.isMutantADN(humanADNRequest)) {
            return ResponseEntity.ok().body("ADN Mutant");
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }
}
