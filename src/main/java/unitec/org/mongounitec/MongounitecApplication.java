package unitec.org.mongounitec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongounitecApplication implements CommandLineRunner{
@Autowired RepositorioMensajito repomensa;
	public static void main(String[] args) {
		SpringApplication.run(MongounitecApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        Mensajito mensa=new Mensajito("Actual","segundo","Actualizado");
        
        repomensa.save(mensa);
        
        System.out.println("Mensaje guardado");
    }
}
