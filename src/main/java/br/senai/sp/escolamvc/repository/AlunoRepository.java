package br.senai.sp.escolamvc.repository;

import br.senai.sp.escolamvc.model.Aluno;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository  extends JpaRepository<Aluno, Long> {

    List<Aluno> findAlunosByNomeContaining(String nome);

    Aluno findAlunoByCpf(String cpf);
}
