package com.curso.patronesCreacionales.factory;

public class EnemyFactory {

	public Enemy createEnemy(String tipo) {
		if (tipo.equalsIgnoreCase("warrior")) {
			return new Warrior();
		}else if (tipo.equalsIgnoreCase("mage")) {
			return new Mage();
		}
		return null;
	}
}
