package com.pabloluiz.cursomc.domain;

import java.time.LocalDate;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pabloluiz.cursomc.domain.enums.EstadoPagamento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dataVencimento;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dataPagamento;
	
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, LocalDate dataVencimento, LocalDate dataPagamento) {
		super(id, estado, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	
}
