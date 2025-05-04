package mx.unam.aragon.ico.is.computadoraapi.repositories;

import mx.unam.aragon.ico.is.computadoraapi.estities.Computadora;
import org.springframework.data.repository.CrudRepository;


public interface ComputadoraRepository extends CrudRepository<Computadora, Long> {
    public Computadora findComputadoraByClave(Long clave);
}
