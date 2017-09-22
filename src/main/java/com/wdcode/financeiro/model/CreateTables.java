package com.wdcode.financeiro.model;

import javax.persistence.Persistence;

public class CreateTables {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("financeiro");
	}
}
