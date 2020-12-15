package org.maox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String incio()
    {
        log.info("Ejecutando controlador Rest");
        return "Hola mundo con Spring 3";
    }
}
