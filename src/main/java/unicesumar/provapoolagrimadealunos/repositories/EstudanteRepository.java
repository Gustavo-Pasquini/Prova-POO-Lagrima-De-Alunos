package unicesumar.provapoolagrimadealunos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unicesumar.provapoolagrimadealunos.models.EstudanteModel;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {
}
