package com.wdcode.financeiro.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import com.wdcode.financeiro.model.Lancamento;
import com.wdcode.financeiro.repository.Lancamentos;
import com.wdcode.financeiro.util.JpaUtil;

@ManagedBean
@ViewScoped
public class ConsultaLancamentosBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Lancamento> lancamentos;
	
	public void consultar() {
		EntityManager manager = JpaUtil.getEntityManager();
		Lancamentos lancamentos = new Lancamentos(manager);
		this.lancamentos = lancamentos.todos();
		manager.close();
		
	}
	
	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
	
	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}

}
