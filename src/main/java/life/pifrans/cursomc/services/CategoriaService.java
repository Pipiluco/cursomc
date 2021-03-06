package life.pifrans.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import life.pifrans.cursomc.domain.Categoria;
import life.pifrans.cursomc.repositories.CategoriaRepository;
import life.pifrans.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repository;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
