package com.ynz.democonfigproperties.aircraft;

import com.ynz.democonfigproperties.aircraft.dto.JetFighterDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aircraft")
@RequiredArgsConstructor
public class AirCraftController {
    @Qualifier("f15")
    private final JetFighter f15;

    @Qualifier("f16")
    private final JetFighter f16;

    @GetMapping("f15")
    public JetFighterDTO getF15() {
        return mapToDTO(f15);
    }

    @GetMapping("f16")
    public JetFighterDTO getF16() {
        return mapToDTO(f16);
    }

    private JetFighterDTO mapToDTO(JetFighter fighter) {
        return JetFighterDTO.builder().engine(fighter.getEngine()).range(fighter.getRange())
                .speed(fighter.getSpeed()).weight(fighter.getWeight()).build();
    }
}
