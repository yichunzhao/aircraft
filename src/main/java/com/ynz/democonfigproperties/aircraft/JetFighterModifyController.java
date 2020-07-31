package com.ynz.democonfigproperties.aircraft;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * here it throws Spring MethodArgumentNotValidException, if the RequestBody is invalid.
 */

@RestController
@RequestMapping("jet")
public class JetFighterModifyController {

    @PostMapping
    public ResponseEntity<JetFighter> createJetFighter(@Valid @RequestBody JetFighter fighter) {
        return ResponseEntity.ok().body(fighter);
    }
}
