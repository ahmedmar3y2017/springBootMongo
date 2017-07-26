package springbootmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springbootmongo.Mongo.user;
import springbootmongo.Mongo.userRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


    @Autowired
    userRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        for (user user : userRepository.findAll()) {
            System.out.println(user);
        }

        System.out.println(userRepository.findById("200").getUsername());


    }
}
