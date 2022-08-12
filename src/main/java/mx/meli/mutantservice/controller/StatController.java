package mx.meli.mutantservice.controller;

import lombok.AllArgsConstructor;
import mx.meli.mutantservice.business.StatService;
import mx.meli.mutantservice.dto.Stats;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/stats")
public class StatController {

    private final StatService statService;

    @GetMapping
    public ResponseEntity<Stats> getStats() {
        return ResponseEntity.ok().body(this.statService.getStats());
    }
}
