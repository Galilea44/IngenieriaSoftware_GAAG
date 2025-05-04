package mx.unam.aragon.ico.is.computadoraapi;

import mx.unam.aragon.ico.is.computadoraapi.estities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.repositories.ComputadoraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComputadoraapiApplicationTests {
	@Autowired
	private ComputadoraRepository computadoraRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void insertarComputadora(){
		Computadora computadora=new Computadora(0,"Apple", "MacBook Pro M2",null,34000.0f);
		computadoraRepository.save(computadora);
	}
	@Test
	void leerComputadoraPorClave(){
		Long claveTmp=3l;
		Computadora tmp= computadoraRepository.findComputadoraByClave(claveTmp);
		System.out.println(tmp);
	}
	@Test
	public void eliminarComputadora(){
		Long claveTmp=2l;
		computadoraRepository.deleteById(claveTmp);
	}

	@Test
	public void actualizarComputadora(){
		Long claveTmp=6l;
		Computadora tmp= computadoraRepository.findComputadoraByClave(claveTmp);
		tmp.setModelo("patito 3000");
		computadoraRepository.save(
				tmp
		);
	}

}
