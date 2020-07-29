package com.ynz.democonfigproperties.aircraft;

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
    public JetFighter getF15() {
        return f15;
    }

    @GetMapping("f16")
    public JetFighter getF16() {
        return f16;
    }
}
