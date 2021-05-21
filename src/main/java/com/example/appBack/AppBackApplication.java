package com.example.appBack;


import com.example.appBack.student.domain.Student;
import com.example.appBack.student.domain.StudentJPA;
import com.example.appBack.student.domain.noDatabase.BranchEnum;
import com.example.appBack.student.infraestructure.repository.jpa.StudentRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;

@SpringBootApplication
@EnableSwagger2
@EnableJpaRepositories
public class AppBackApplication implements CommandLineRunner
{
	public static void main(String[] args)
	{
		SpringApplication.run(AppBackApplication.class, args);
	}

	@Autowired
	StudentRepositoryJPA studentRepository;

	@Override
	public void run(String... arg0) throws Exception
	{
		studentRepository.saveAndFlush(new StudentJPA("1", "Carlos", "Garcia", "dam06.2020@gmail.com", "carlosfernando.garci@bosonit.com", "Logroño", 40, "Comentario1", BranchEnum.BACK, true, new Date(2021, 4, 27), new Date(2031,4,27)));

		studentRepository.saveAndFlush(new StudentJPA("2", "Marcos", "Perez", "dam04.2020@gmail.com", "personal@bosonit.com", "Logroño", 40, "Comentario2", BranchEnum.DEVOPS, true, new Date(2021, 4, 27), new Date(2031,4,27)));

		studentRepository.saveAndFlush(new StudentJPA("2", "Luis", "Lopez", "dam05.2020@gmail.com", "personal3@bosonit.com", "Logroño", 40, "3", BranchEnum.FRONT, true, new Date(2021, 4, 27), new Date(2031,4,27)));
	}
}
