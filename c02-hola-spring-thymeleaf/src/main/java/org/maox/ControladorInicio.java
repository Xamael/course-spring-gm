package org.maox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String incio()
    {
        log.info("Ejecutando controlador MVC");
        return "index"; // Pagina web index.html en templates
    }
}
