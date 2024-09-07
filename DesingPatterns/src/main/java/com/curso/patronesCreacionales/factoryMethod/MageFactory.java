package com.curso.patronesCreacionales.factoryMethod;

public class MageFactory extends EnemyFactory{

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new Mage();
	}

}
