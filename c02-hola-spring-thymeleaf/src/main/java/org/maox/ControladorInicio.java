package org.maox;

import lombok.extern.slf4j.Slf4j;
import org.maox.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@Slf4j
public class ControladorInicio {
    @Value("${index.mensajeApp}")
    private String mensajeApp;

    @GetMapping("/")
    public String incio(Model model) {
        var mensaje = "Hola Mundo con Thymeleaf (pasando información desde el controlador a la vista)";

        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@mail.com");
        persona.setTelefono("666111222");

        var persona2 = new Persona();
        persona2.setNombre("Maria");
        persona2.setApellido("Gomez");
        persona2.setEmail("mgomez@mail.com");
        persona2.setTelefono("50511222");

        //var personas = new ArrayList<Persona>();
        //personas.add(persona);
        //personas.add(persona2);

        var personas = Arrays.asList(persona, persona2);

        log.info("Ejecutando controlador MVC");
        model.addAttribute("MENSAJE", mensaje);
        model.addAttribute("MENSAJEAPP", mensajeApp);
        //model.addAttribute("PERSONA", persona);
        model.addAttribute("PERSONAS", personas);

        return "index"; // Pagina web index.html en templates
    }
}
