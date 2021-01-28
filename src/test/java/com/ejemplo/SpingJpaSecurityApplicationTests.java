package com.ejemplo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ejemplo.model.Usuario;
import com.ejemplo.repo.IUsuarioRepo;

@SpringBootTest
class SpingJpaSecurityApplicationTests {
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	void crearUsuarioTest() {
		
	Usuario u = new Usuario();
	
	u.setNombre("Pepito");
	u.setClave(encoder.encode("Martin"));
	
	Usuario retorno = repo.save(u);
	
	assertThat(u.getClave()).isEqualToIgnoringCase(retorno.getClave());
	}

}
