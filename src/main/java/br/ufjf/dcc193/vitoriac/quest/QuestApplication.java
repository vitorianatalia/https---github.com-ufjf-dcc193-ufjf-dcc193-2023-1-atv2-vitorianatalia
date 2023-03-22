package br.ufjf.dcc193.vitoriac.quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestApplication.class, args);
		
		Guerreiro g1 = new Guerreiro("Conan");

		Missao m1= new Missao();
		m1.setGuerreiro(g1);
		m1.iniciar();
		m1.concluir();
	}

}
