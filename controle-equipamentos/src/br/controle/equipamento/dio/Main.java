package br.controle.equipamento.dio;

import java.time.LocalDate;

import br.controle.equipamento.dio.dominio.Celular;
import br.controle.equipamento.dio.dominio.Maquineta;

public class Main {

	public static void main(String[] args) {
		
		Celular celular1 = new Celular(" teste de imei 1"," Vermelho"," Vivo", 15, LocalDate.now(), LocalDate.of(2022, 12, 31));
		//Maquineta maquineta1 = new Maquineta("lllp44521","123465","Claro");
				
		System.out.println("Cadastro celulares ");
		System.out.println(celular1);
		
		System.out.printf("Total de %.0f meses restantes %n",celular1.calcularPeriodo() );
		//System.out.println(celular1.calcularPeriodo());
		
		//System.out.println(maquineta1);	
		
		
		System.out.println("------------");
		
		celular1.setDescricao("teste descricao");
		System.out.println(celular1.getDescricao());

	}

}
