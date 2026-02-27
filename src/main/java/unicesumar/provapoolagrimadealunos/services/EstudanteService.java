package unicesumar.provapoolagrimadealunos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import unicesumar.provapoolagrimadealunos.models.EstudanteModel;
import unicesumar.provapoolagrimadealunos.repositories.EstudanteRepository;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudante) {
        return estudanteRepository.save(estudante);
    }

    public List<EstudanteModel> listarEstudantes() {
        return estudanteRepository.findAll();
    }

    public EstudanteModel buscarEstudantePorId(Long id) {
        return estudanteRepository.findById(id).orElse(null);
    }

    public void deletarEstudantePorId(Long id) {
        estudanteRepository.deleteById(id);
    }

}
