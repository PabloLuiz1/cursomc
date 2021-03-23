package com.pabloluiz.cursomc.domain.enums;

import lombok.Getter;

@Getter

public enum EstadoPagamento {
	PENDENTE (1, "Pendente"), 
	QUITADO (2, "Quitado"),
	CANCELADO (3, "Cancelado");
	
	private int codigo;
	private String descricao;
	
	private EstadoPagamento(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static EstadoPagamento toEnum(Integer codigo) {
		if (codigo == null)
			return null;
		
		for (EstadoPagamento e : EstadoPagamento.values()) {
			if (codigo.equals(e.getCodigo()))
				return e;
		}
		
		throw new IllegalArgumentException("Id inválido: " + codigo);
	}
}
