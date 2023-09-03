package goddoni.software.server;

import goddoni.software.server.enumeration.Status;
import goddoni.software.server.model.Server;
import goddoni.software.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.160", "Debian Linux","16 GB", "Personal PC",
					"http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.150", "Ubuntu Linux","36 GB", "Server",
					"http://localhost:8080/server/image/server2.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.140", "Windows XP","24 GB", "Personal PC",
					"http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.130", "MAC OS","128 GB", "Server",
					"http://localhost:8080/server/image/server4.png", Status.SERVER_UP));
		};
	};

}
