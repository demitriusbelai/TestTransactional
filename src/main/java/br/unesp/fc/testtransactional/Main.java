package br.unesp.fc.testtransactional;

import br.unesp.fc.testtransactional.data.Usuario;
import br.unesp.fc.testtransactional.repositories.UsuarioRepository;
import static java.lang.System.exit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackageClasses=Main.class)
@EnableJpaRepositories(basePackageClasses=Main.class)
public class Main implements CommandLineRunner {

    public static void main(String[] args) throws Exception {
        //disabled banner, don't want to see the spring logo
        SpringApplication app = new SpringApplication(Main.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
        Usuario u = usuarioRepository.findOne(1);
        u.setNome("Teste");
        usuarioRepository.save(u);
        u = usuarioRepository.findByEmail("ccc@gmail.com");
        exit(0);
    }

}
