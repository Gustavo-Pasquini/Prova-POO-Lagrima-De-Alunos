package unicesumar.provapoolagrimadealunos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unicesumar.provapoolagrimadealunos.models.EstudanteModel;
import unicesumar.provapoolagrimadealunos.services.EstudanteService;

import java.util.List;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudanteModel) {
        return estudanteService.criarEstudante(estudanteModel);
    }

    @GetMapping
    public List<EstudanteModel> listarEstudantes() {
        return estudanteService.listarEstudantes();
    }

    @GetMapping(path = "/{id}")
    public EstudanteModel buscarEstudantePorId(@PathVariable Long id) {
        return estudanteService.buscarEstudantePorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deletarEstudantePorId(@PathVariable Long id) {
        estudanteService.deletarEstudantePorId(id);
    }

}
