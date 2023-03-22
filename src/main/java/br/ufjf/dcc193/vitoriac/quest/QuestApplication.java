package br.ufjf.dcc193.vitoriac.quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestApplication.class, args);
		
		Heroi h1 = HeroiFactory.createHeroi("Conan", 1);
		Heroi h2 = HeroiFactory.createHeroi("Marc", 0);
		Missao m1= new Missao();
		m1.setHeroi(h1);
		m1.iniciar();
		m1.concluir();
	}

}
