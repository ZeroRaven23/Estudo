package exercicio;

import java.util.Scanner;
import java.awt.*;
import java.text.DecimalFormat;

import javax.swing.*;
//cavina
public class ExP {

	static int nump = 99; //esse seria o numero principal.
	static int mes, ano, dias;
	static double r, r1,r2,r3,r4,r5,r6, total; // 'r' para resutados
	static double i,i1,i2,i3, salario, valor; // 'i' geralmente vai ser usado para numeros
	static double brancos, nulos, validos;
	static double brancosR,nulosR, validosR;
	static int horas, minutos, segundos;
    static int nConver;
	private static String entradaI2,entradaI,entradaI1,entradaP,entradaI3,entradaI4;// entrada de strings
	static String s,s1,s2,s3; // Classe usada para strings em meio ao codigo
	static char c,c1,c2,c3; // usado para char
	


	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		UIManager um = new UIManager();
		UIManager.put("OptionPane.messageForeground", Color.black);
//bem começo estou fazendo entradaP ser executada como um painel.
	// quando executado ele pedira para voce colocar um numero
		entradaP = JOptionPane.showInputDialog(null, 
				"Digite qual de nosso serviços deseja consultar:\n"
				+ "1) Ano\n"
				+ "2) Salario\n"
				+ "3) Votos\r\n"
				+ "4) Custo de fabrica\r\n"
				+ "5) Revendendor\r\n"
				+ "6) Celsius\r\n"
				+ "7) Media Ponderada\r\n"
				+ "8) Maior 10\r\n"
				+ "9) Positivo ou negativo\r\n"
				+ "10) Maças\r\n"
				+ "11) Media aritmética\r\n"
				+ "12) Votar no ano\r\n"
				+ "13) Maior\r\n"
				+ "14) Ordem crescente\r\n"
				+ "15) Xadrez\r\n"	

				+"\n\n\n"
				+ "95) Pagina 02\r\n"
				+ "99) Saida ", "Seleção Pg 01",JOptionPane.INFORMATION_MESSAGE);
		nump = Integer.parseInt(entradaP);
		//aqui teremos uma conversao de string para int, sendo assim o numero que antes seria uma
		//string se torna um int.
		System.out.println(nump);
		if(nump == 95) {//aqui checamos se é 95 no numPrincipal.
			UIManager.put("OptionPane.messageForeground", Color.black);
			entradaP = JOptionPane.showInputDialog(null, 
					"Digite qual de nosso serviços deseja consultar:\n"
					+ "16) Trabalho mensal\r\n" //22
					+ "17) Massa corporia \r\n"
					+ "18) Comissao Salario \r\n" 
					+ "19) Consultar Saldo\r\n"
					+ "20) Estoque \r\n" //26
					+ "21) Maior entre 3 \r\n"
					+ "22) Soma dos 3 maiores \r\n"
					+ "23) Ordem 3  \r\n"
					+ "24) Triangulo \r\n"
					+ "25) Gols de time \r\n"
					+ "26) Maior, igual ou menor \r\n"
					+ "27) A, B, C \r\n"
					+ "28) Posto de gasolina \r\n"
					+ "29) Homem e mulher \r\n"
					+ "30) Kg de frutas \r\n"
					+"\n\n\n"
					+ "0) Pagina principal \r\n"
					+ "96) Pagina 03\r\n"
					+ "99) Saida","Seleção Pg 02",JOptionPane.INFORMATION_MESSAGE);
			nump = Integer.parseInt(entradaP);
			System.out.println(nump);
			}
				
		if(nump == 96) {
				UIManager.put("OptionPane.messageForeground", Color.black);
				entradaP = JOptionPane.showInputDialog(null, 
						"Digite qual de nosso serviços deseja consultar:\n"
						+ "31) Verificação de usuario. \r\n" //38
						+ "32) Preço unitario.\r\n"
						+ "33) Media de aproveitamento \r\n" 
						+ "34) Aposentaria \r\n"
						+ "35) Triangulos... \r\n" 
						+ "36) Divisão For \r\n"
						+ "37) Divisão While \r\n"
						+ "38) Duas Avaliações \r\n"
						+ "39) Crescente 1 a 10 \r\n"
						+ "40) Decrescente 1 a 10 \r\n"//51
						+ "41)  \r\n"
						+ "42)  \r\n"
						+ "43)  \r\n"
						+ "44)  \r\n"
						+ "45)  \r\n"
						+"\n\n\n"
						+ "0) Pagina principal \r\n"
						+ "97) Pagina 04\r\n"
						+ "99) Saida","Seleção Pg 03",JOptionPane.INFORMATION_MESSAGE);
				nump = Integer.parseInt(entradaP);
				System.out.println(nump);
			
			if(nump == 0) {//aqui vemos se o numero é igual a 0 fazendo assim voltar para a main
				main(null);
			}else if(nump == 99) {
				System.exit(0);//aqui checa se é 99 se for ele fecha
			}else {
				funcao();//se não for ele vai para função
			}
		}else if(nump == 99) {
			System.exit(0);//aqui estou verificando a parte do 96
		}else {
			funcao();// e chamando a função
		}
		}
	/*
"JOptionPane.showInputDialog" esse serve para voce mostrar uma mensagem e depois colocar numero ou palavra.
	sendo assim facilmente sendo comparado ao scanner
	
"JOptionPane.showMessageDialog" de vez mostrar no console ele faz aquela tela com a mensagem que dejesar
"JOptionPane.showMessageDialog(null,mensagem ou variavel,"Algo que queria aparecer em cima", JOptionPane.ERROR_MESSAGE)
show message é util para fazer um mini programa, junto ao show input
	
usei varias logicas que aprendemos com o jailson algumas deixei comentadas
qualquer duvida podera recorrer a mim.
	
	 	entradaI = JOptionPane.showInputDialog("Digite quantos anos voce tem? ");
	 	o entradaI é uma string que recebe o que usuario digite sendo numero ou palavra
	 	existem diversas forma de converter string para algo como char, double ou int
	 	boolean voce não consegue converter e char é escolhido a letra.
		ano = Integer.parseInt(entradaI); sempre uso essa mesma sintese de converter
	 */
	public static void funcao() throws InterruptedException {
		
		UIManager.put("OptionPane.messageForeground", Color.black);
		DecimalFormat df = new DecimalFormat("#.#"); // isso daqui é usado para deixar valores quebrados com o tantos de casas 
		//que desejar tipo "#.###" ou "#.######"
		
		
		switch(nump){//aqui estou usando switch para verificar
	    case 1:// todos os exercicios tem seu numero
		entradaI = JOptionPane.showInputDialog("Digite quantos anos voce tem? ");
		ano = Integer.parseInt(entradaI);
		entradaI1 = JOptionPane.showInputDialog("Digite quantos meses na sua idade você tem?? ");
		mes = Integer.parseInt(entradaI1);
		entradaI2 = JOptionPane.showInputDialog("Digite quantos dias na sua idade você tem? ");
		dias = Integer.parseInt(entradaI2);
		r = ano * 365;
		r1 = mes * 30;
		r2 = dias + r + r1;
		JOptionPane.showMessageDialog(null,"Você tem "+ r2 + " Dias vivos");
		main(null);//antes do break, ele volta para a main e depois da um break
		break;
		
		case 2:
			entradaI = JOptionPane.showInputDialog("Digite seu salario atual: ");
			salario = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite seu reajuste: ");
			i = Integer.parseInt(entradaI1);
			r = salario * (i / 100);
			r1 = salario + r;
			JOptionPane.showMessageDialog(null, r1 + " Esse é seu novo salario");
			main(null);
		break;
		case 3:
			entradaI = JOptionPane.showInputDialog("Digite numero de votos brancos: ");
			brancos  = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite numero de votos nulos: ");
			nulos = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite numero de votos válidos: ");
			validos = Integer.parseInt(entradaI2);
			
			total = brancos + nulos + (validos);
			brancosR = brancos / total * (100);
			nulosR = nulos / total * (100);
			validosR = validos / total * (100);
			JOptionPane.showMessageDialog(null, total + " Numero total de eleitores\n"
					+df.format(brancosR) +"%"+ " Numero de eleitores nulos\n"
					+df.format(nulosR) +"%"+ " Numero de eleitores brancos\n"
					+df.format(validosR) +"%"+ " Numero de eleitores validos\n"
					);
			main(null);
			break;
		case 4:
			i = 28; i2 = 45;
			r1 = 1+(i/100);	
			r2 = 1+(i2/100);
			entradaI = JOptionPane.showInputDialog("Digite o valor do carro: ");
			valor  = Integer.parseInt(entradaI);
			r = r2 * (valor * r1);
			JOptionPane.showMessageDialog(null, r + " Valor total do carro");
			main(null);
			break;
		case 5:
		i3 = 400; // valor fixo carro
		entradaI = JOptionPane.showInputDialog("Digite o valor do salario: ");
		i = Integer.parseInt(entradaI);
		entradaI1 = JOptionPane.showInputDialog("Digite quantos carros vendeu: ");
		i1 = Integer.parseInt(entradaI1);
		r = i1 * i3; r1 = i + r;
		JOptionPane.showMessageDialog(null, r1 + " Seu salario final");
		main(null);
		break;
		case 6:
			entradaI = JOptionPane.showInputDialog("Digite a temperatura em F: ");
			i = Integer.parseInt(entradaI);
			i1 = (i - 32) / 1.8 ;
			JOptionPane.showMessageDialog(null, i1 + "C° Temperatura em Celsius");
			main(null);
			break;
		case 7:
			entradaI = JOptionPane.showInputDialog("Digite a Nota 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite a Nota 2: ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite a Nota 3: ");
			i2 = Integer.parseInt(entradaI2);
			r = 2; r1 = 3; r2 = 5; r3 = 10;
			i3 = (i*r)+(i1*r1)+(i1*r2); total = i3 / r3;
			JOptionPane.showMessageDialog(null, total + " Sua media.");
			main(null);
			break;
			
		case 8:
			entradaI = JOptionPane.showInputDialog("Digite seu valor: ");
			i = Integer.parseInt(entradaI);
			if(i > 10) {
				JOptionPane.showMessageDialog(null, "Esse numero é maior que 10.");
				
			}else if(i == 10) {
				JOptionPane.showMessageDialog(null, "Seu numero é 10.");
				
			}else {
				JOptionPane.showMessageDialog(null, "Seu numero é menor que 10.");
	  			}
			main(null);
			break; 
		
		case 9:
			entradaI = JOptionPane.showInputDialog("Digite seu valor: ");
			i = Integer.parseInt(entradaI);
			if(i > 0) {
				JOptionPane.showMessageDialog(null, "Esse numero é positivo.");
			}else if(i < 0) {
				JOptionPane.showMessageDialog(null, "Seu numero é negativo.");
			}else if(i == 0){
				JOptionPane.showMessageDialog(null, "Seu numero é 0.");
			}
			main(null);
		break;
		case 10://16
			entradaI = JOptionPane.showInputDialog("Digite Quantas maçâs: ");
			i = Integer.parseInt(entradaI);
			if(i >= 12) {
				i2 = i * 1;
				JOptionPane.showMessageDialog(null, "O tanto de maças foi "+ i 
						+ " Seu total foi R$"+i2);
			}else if(i < 12) {
				i1 = i * 1.3;
				JOptionPane.showMessageDialog(null, "O tanto de maças foi "+ 
				i+ " Seu total foi R$"+i1);
			}
			main(null);
		break;
		case 11: //media
			entradaI = JOptionPane.showInputDialog("Digite a Nota 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite a Nota 2: ");
			i1 = Integer.parseInt(entradaI1);
			i2 = (i + i1);i3 = i2/2;
			JOptionPane.showMessageDialog(null,i3 + " Sua nota");
		main(null);
		break;
		case 12:
			ano = 2021;
			entradaI = JOptionPane.showInputDialog("Digite ano de nascimento: ");
			i = Integer.parseInt(entradaI);
			i1 = 2021 - i; 
			if(i1 <= 18) {
				JOptionPane.showMessageDialog(null, i1 + " Você não podera votar");
			}else if(i1 >= 18) {
				JOptionPane.showMessageDialog(null, i1 + " Você  podera votar");

			}
		main(null);
		break;
		case 13:
			entradaI = JOptionPane.showInputDialog("Digite o primeiro valor:  ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite o segundo valor: ");
			i1 = Integer.parseInt(entradaI1);
			if(i > i1) {
				JOptionPane.showMessageDialog(null, i + " é maior que o segundo");
			}else {
				JOptionPane.showMessageDialog(null, i1 + " é menor");

			}
		main(null);
		break;
		case 14:
			entradaI = JOptionPane.showInputDialog("Digite o primeiro valor:  ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite o segundo valor: ");
			i1 = Integer.parseInt(entradaI1);
			if(i > i1) {
				JOptionPane.showMessageDialog(null, i1 + " / " + i);
			}else if(i1 > i) {
				JOptionPane.showMessageDialog(null, i + " / " + i1);
			}
		main(null);
		break;		
		case 15:
			entradaI = JOptionPane.showInputDialog("Digite a hora inicial:  ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite a hora finalizada: ");
			i1 = Integer.parseInt(entradaI1);
			i2 = i1 - i;
			JOptionPane.showMessageDialog(null, i2 + " foi o tempo decorrido");
		main(null);
		break;
	
		case 16:
			horas = 40;
			entradaI = JOptionPane.showInputDialog("Digite o salario:  ");
			salario = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite o tempo de trabalho:  ");
			i = Integer.parseInt(entradaI1);
			//System.out.println(salario + " / "+ i);
			i1 = i - 40; r1 = i1 * 1.50; r2 = r1 + salario;
			//System.out.println(r1 +" / "+ i1);
			if(i > 40) {
			JOptionPane.showMessageDialog(null, r2 + " Esse sera seu salario com horas extras");
			}else {
			JOptionPane.showMessageDialog(null, "Horas extras insufiencientes ");
			}
		main(null);
		break;
		
		case 17:
		entradaI = JOptionPane.showInputDialog("Digite o seu nome:  ");
		s1 = entradaI;
		entradaI1 = JOptionPane.showInputDialog("Sexo M ou F?"); 
		 c = entradaI1.charAt(0);
		entradaI2 = JOptionPane.showInputDialog("Digite sua altura : EX 1.90 ");
		i1 = Double.parseDouble(entradaI2);
		entradaI3 = JOptionPane.showInputDialog("Digite seu peso: ");
		i2 = Integer.parseInt(entradaI3);
		System.out.println(c);
		if(c == 'M') {
			r = i2/(i1*i1);
			System.out.println(r + " / " + r1);
			JOptionPane.showMessageDialog(null, "Peso ideal " + df.format(r) + " " + s1);
		}else if (c == 'F') {
			r = i2 / (i1*i1);
			System.out.println(r + " / " + r1);
			JOptionPane.showMessageDialog(null, "Peso ideal " + df.format(r) + " " + s1);
		}else {
			JOptionPane.showMessageDialog(null, "Digite um sexo valido...");
			main(null);
		}
		main(null);
		break;
		
		case 18:
			//i1 = i - 40; r1 = i1 * 1.50; r2 = r1 + salario;
		entradaI = JOptionPane.showInputDialog("Digite a Salario fixo:  ");
		i = Integer.parseInt(entradaI);
		entradaI1 = JOptionPane.showInputDialog("Digite a valor de vendas:  ");
		i1 = Integer.parseInt(entradaI1);
		if(i1 <= 1500) {
			i3 = 1.03; r = i1 * i3;	r1 = r + i;
			System.out.println(i1 + "\n" + r +"\n" + r1 + " <");
			JOptionPane.showMessageDialog(null, r1 + " Seu salario com o valor das vendas");
		}else if(i1 >= 1500) {
			i3 = 1.05; r = i1 * i3;	r1 = r + i;
			System.out.println(i1 + "\n" + r + "\n" + r1 + " >");
			JOptionPane.showMessageDialog(null, r1 + " Seu salario com o valor das vendas");
		}
		main(null);
		break;

		case 19: //25
		entradaI = JOptionPane.showInputDialog("Digite sua conta:  ");
		s = entradaI;
		entradaI1 = JOptionPane.showInputDialog("Digite seu saldo:  ");
		i1 = Integer.parseInt(entradaI1);
		entradaI2 = JOptionPane.showInputDialog("Digite seu debito:  ");
		i2 = Integer.parseInt(entradaI2);
		entradaI3 = JOptionPane.showInputDialog("Digite seu credito:  ");
		i3 = Integer.parseInt(entradaI3);
		r = i1 - i2 + i3;
		if(r >= 0) {
			JOptionPane.showMessageDialog(null, s + " Seu saldo é positivo " + "R$"+ r);
		}else {
			JOptionPane.showMessageDialog(null, s + "Seu saldo negativo" + "R$"+ r);
		}
		
		main(null);
		break;
		
		case 20:
			entradaI = JOptionPane.showInputDialog("Digite quantidade Atual:  ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite quantidade Maxima:  ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite quantidade Mínima:  ");
			i2 = Integer.parseInt(entradaI2);
			r = (i1 - i2)/2;
			if(r >= i) {
				JOptionPane.showMessageDialog(null, "Estoque atual esta suficiente, não devera comprar mais.");
			}else {
				JOptionPane.showMessageDialog(null, "Estoque esta insufieciente efetuar compra.");
			}
		main(null);
		break;
		
		case 21:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 1: ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite valor 1:  ");
			i2 = Integer.parseInt(entradaI2);
			r = Math.max(i,i1); r1 = Math.max(r,i2); // aqui é usado para verificar o Maior
			JOptionPane.showMessageDialog(null, r1 +" Esse é o maior valor");
		main(null);
		
		break;
		
		case 22:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 1: ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite valor 1:  ");
			i2 = Integer.parseInt(entradaI2);
			r = Math.max(i,i1); r1 = Math.max(r,i2); r2 = r1 + r;
			JOptionPane.showMessageDialog(null, r2 +" Esse é a soma dos maiores valores");
		main(null);
		break;
		
		case 23://30
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite valor 3:  ");
			i2 = Integer.parseInt(entradaI2);
			
			if(i > i1 && i > i2) {
				//System.out.println("a");
			r = Math.max(i,i1); r1 = Math.max(i1,i2); r2 = Math.min(i,i2);
			JOptionPane.showMessageDialog(null, r2 +" , " + r1 + " , " + r);
			}else if(i1 > i && i1 > i2) {
				//System.out.println("b");
				r = Math.min(i,i1); r1 = Math.max(i1,i2); r2 = Math.max(i,i2);
			JOptionPane.showMessageDialog(null, r +" , " + r2 +" , " + r1);
			}else if(i2 > i && i2 > i1) {
				//System.out.println("c");
				r = Math.min(i,i1); r1 = Math.min(i1,i2); r2 = Math.max(i,i2);
			JOptionPane.showMessageDialog(null, r +" , " + r1 + " , " + r2);
			}
		main(null);
		break;
		
		case 24:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);//A
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			i1 = Integer.parseInt(entradaI1);//B
			entradaI2 = JOptionPane.showInputDialog("Digite valor 3:  ");
			i2 = Integer.parseInt(entradaI2);//C
			r = i + i1;	r2 = i1 + i2; r1 = i + i2;
			if(i < r2) {// A > BC
			if(i1 < r1) {// B > AC
			if(i2 < r) {// C > AB
			JOptionPane.showMessageDialog(null, "Pode ser um triangulo");
			}}}else {
				JOptionPane.showMessageDialog(null, "Não pode ser um triangulo");
			}
		main(null);
		break;
		
		case 25:
			entradaI = JOptionPane.showInputDialog("Digite o nome da equipe 1: ");
			s = entradaI;
			entradaI1 = JOptionPane.showInputDialog("Digite o nome da equipe 2: ");
			s1 = entradaI1;
			entradaI2 = JOptionPane.showInputDialog("Digite o tanto de gols da " + s + ":");
			i = Integer.parseInt(entradaI2);
			entradaI3 = JOptionPane.showInputDialog("Digite o tanto de gols da " + s1 + ":");
			i1 = Integer.parseInt(entradaI3);
			r = Math.max(i,i1); r1 = Math.min(i1, i);
			if(r > r1) {
				JOptionPane.showMessageDialog(null, s + " Foi o vencedor com " + r + " Gols");
			}else if(r1 > r) {
				JOptionPane.showMessageDialog(null, s1 + " Foi o vencedor com " + r1 + " Gols");
			}
		main(null);
		break;
		
		case 26:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			i1 = Integer.parseInt(entradaI1);
			if(i == i1) {
				JOptionPane.showMessageDialog(null, "Ambos são valores iguais");
			}else if(i > i1) {
				JOptionPane.showMessageDialog(null, "Primeiro valor é maior");	
			}else if (i < i1) {
				JOptionPane.showMessageDialog(null, "Segundo valor é maior");	
			}
		main(null);
		break;
		
		case 27:
			entradaI = JOptionPane.showInputDialog("Digite valor X: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor Y: ");
			i1 = Integer.parseInt(entradaI1);
			i2 = (i*i1) + 5;
			if(i2 <= 0) {
				c = 'A';	
			}else if(i2 <= 100) {
				c = 'B';
			}else{
				c = 'C';
			}
			JOptionPane.showMessageDialog(null, i2 + " " + c);
		main(null);
		break;
		
		case 28://35
			entradaI = JOptionPane.showInputDialog("Digite qual o tipo de combustivel\n"
					+ "Sendo 'A' álcool e 'G' Gasolina:");
			c = entradaI.charAt(0);
			entradaI1 = JOptionPane.showInputDialog("Digite o tanto de litros de "+ c + " :");
			i = Integer.parseInt(entradaI1);
			if(c == 'G') {
				if(i > 20) {
					i2 = 0.06; i3 = 3.30; 
					r = i * i3; r1 = r * i2; r2 = r - r1;
					//System.out.println(i2 + " " + i3 + " "+ r +" " + r1 +" " + i2+" " + r2);
					JOptionPane.showMessageDialog(null, df.format(r2) + " Esse seria o tanto de litros em reias");
				}else if (i <= 20) {
					i2 = 0.04; i3 = 3.30; 
					r = i * i3; r1 = r * i2; r2 = r - r1;
					//System.out.println(i2 + " " + i3 + " "+ r +" "+ r1 +" " + i2+" " + r2);
					JOptionPane.showMessageDialog(null, df.format(r2) + " Esse seria o tanto de litros em reias");
				}
				
			}else if(c == 'A') {
				if(i > 20) {
					i2 = 0.05; i3 = 2.90; 
					r = i * i3; r1 = r * i2; r2 = r - r1;
					JOptionPane.showMessageDialog(null, df.format(r2) + " Esse seria o tanto de litros em reias");
				}else if(i <= 20) {
					i2 = -.03; i3 = 2.90; 
					r = i * i3; r1 = r * i2; r2 = r - r1;
					JOptionPane.showMessageDialog(null, df.format(r2) + " Esse seria o tanto de litros em reias");
				}
			}
		main(null);
		break;
		
		case 29:
			entradaI = JOptionPane.showInputDialog("Digite a idade da homem 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite a idade da homem 2: ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite a idade da mulher 1: ");
			i2 = Integer.parseInt(entradaI2);
			entradaI3 = JOptionPane.showInputDialog("Digite a idade da mulher 2: ");
			i3 = Integer.parseInt(entradaI3);
			r = Math.max(i,i1); r1 = Math.min(i2,i3); r2 = r1 + r;
			r3 = Math.min(i,i1); r4 = Math.max(i2, i3); r5 = r3 + r4;
			JOptionPane.showMessageDialog(null, r5 + " Soma das idades Homem mais novo com a mulher mais velha\n" 
			+ r2 + "Soma das idades Homem mais velho com a mulher mais nova\n");		
		main(null);
		break;
		
		case 30://37
			entradaI2 = JOptionPane.showInputDialog("Digite se gostaria de morangos ou maças\n"
					+ "'M' maças, 'O' Morangos ");
			c = entradaI2.charAt(0);
			if(c == 'M') {
				entradaI = JOptionPane.showInputDialog("Digite Kg maças: ");
				i = Integer.parseInt(entradaI);
			if(i <= 5) {
			    i3 = 1.80; r = i * i3;
			    System.out.println("<= maças");
			    JOptionPane.showMessageDialog(null, r + " Total a pagar pelas maças");
			}else if (i > 5) {
				 i3 = 1.50; r = i * i3;
				 System.out.println("> maças " + r);
			} 
			}else if(c == 'O') {
				entradaI = JOptionPane.showInputDialog("Digite Kg morangos: ");
				i1 = Integer.parseInt(entradaI1);
			if(i1 <= 5) {
				i3 = 2.50; r = i * i3;
				JOptionPane.showMessageDialog(null, r + " Total a pagar pelos os morangos");
			}else if (i1 > 5) {
				i3 = 2.20; r = i * i3;

			}
			}	
			if (i > 8 || r >= 25.00) {
				i2 = 0.10; r1 = r * i2; r2 =  i2 - r1 ;
				JOptionPane.showMessageDialog(null, r2 + " Total a pagar pelas maças");
			}else if(i1 > 8 || r >= 25.00) {
				i2 = 0.10;  r1 = r * i2; r2 =  i2 - r1 ;
				JOptionPane.showMessageDialog(null, r2 + " Total a pagar pelas morangos");
			}
		main(null);
		break;
		case 31:
			entradaI = JOptionPane.showInputDialog("Digite a senha do administrador: ");
			i = Integer.parseInt(entradaI);
			if(9999 != i) {
				UIManager.put("OptionPane.messageForeground", Color.red);
				JOptionPane.showMessageDialog(null, "Usuario incorreto"
						,"Alerta", JOptionPane.ERROR_MESSAGE);
			}else if(9999 == i) {
				JOptionPane.showMessageDialog(null, "Bem-vindo Admin");
			}
		main(null);
		break;
		case 32://40
			entradaI = JOptionPane.showInputDialog("Digite o nome do produto: ");
			s = entradaI;
			entradaI1 = JOptionPane.showInputDialog("Digite quantos adquiridos: ");
			i = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite o preço unitario: ");
			i1 = Integer.parseInt(entradaI2);
			r =i*i1;
			if(i <= 5) {
				i2 = 0.02; r1 = i2 * r; r2 =  r - r1 ;
				System.out.println(r1 +" "+ r2 +" "+ i2+" "+ r);
				JOptionPane.showMessageDialog(null, "O preço total é de " + r2 + " De " + s 
						+ " E foi adquiridos " + i);
			}else if(i > 5 && i <= 10) {
				i2 = 0.03; r1 = i2 * r; r2 =  r - r1 ;
				JOptionPane.showMessageDialog(null, "O preço total é de " + r2 + " De " + s 
						+ " E foi adquiridos " + i);
			}else if (i > 10) {
				i2 = 0.05; r1 = i2 * r; r2 =  r - r1;
				JOptionPane.showMessageDialog(null, "O preço total é de " + r2 + " De " + s 
						+ " E foi adquiridos " + i);
			}

			
		main(null);
		break;
		case 33:
			entradaI = JOptionPane.showInputDialog("Digite Nota 1 : ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite Nota 2: ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite Nota 3: ");
			i2 = Integer.parseInt(entradaI2);
			r = (i + (i1*2)+(i2*3)); r1 = (i+i1+i2); r3 = r1 / 3;
			r4 = r + r3; r2 = r4/7;
			if(r >= 9.0) {
				JOptionPane.showMessageDialog(null,"Conceito A");
			}else if(r >= 7.5 && r< 9) {
				JOptionPane.showMessageDialog(null,"Conceito B");
			}else if(r >= 6 && r < 7.5) {
				JOptionPane.showMessageDialog(null,"Conceito C");
			}else if(r < 6) {
				JOptionPane.showMessageDialog(null,"Conceito D");
			}
		main(null);
		break;
		case 34:
			entradaI = JOptionPane.showInputDialog("Digite seu id : ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite sua idade: ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite seu tempo trabalhado: ");
			i2 = Integer.parseInt(entradaI2);
			if(i1 >= 65) {
				JOptionPane.showMessageDialog(null,"Pode se aposentar " + i + " \nIdade 	"
						+i1 +" \nTempo trabalhado " + i2 );
			}else if(i2 >= 30) {
				JOptionPane.showMessageDialog(null,"Pode se aposentar " + i + " \nIdade "
						+i1 +" \nTempo trabalhado " + i2 );
			}else if(i1 >= 60 && i2 >= 25) {
				JOptionPane.showMessageDialog(null,"Pode se aposentar " + i + " \nIdade "
						+i1 +" \nTempo trabalhado " + i2 );
				}else {
				JOptionPane.showMessageDialog(null,"Não pode se aposentar " + i);
			}
		main(null);
		break;
		case 35://43
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);//A
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			i1 = Integer.parseInt(entradaI1);//B
			entradaI2 = JOptionPane.showInputDialog("Digite valor 3:  ");
			i2 = Integer.parseInt(entradaI2);//C
			r = i + i1;	r2 = i1 + i2; r1 = i + i2;
			if(i < r2 && i2 < r && i1 < r1) {// A > BC // B > AC // C > AB
			if(i == i1 && i1 == i2) {
			System.out.println("A");
			JOptionPane.showMessageDialog(null, "Pode ser um Triângulo Equilátero");
			}else if(i == i1 || i1 == i2 || i3 == i){
				System.out.println("B");
				JOptionPane.showMessageDialog(null, "Pode ser um Triângulo Isósceles ");
			}else{
				System.out.println("C");
				JOptionPane.showMessageDialog(null, "Pode ser um Triângulo Escaleno ");}
			}else{
			JOptionPane.showMessageDialog(null, "Não pode ser um Triângulo ");
			System.out.println("E");
			}
			
		main(null);
		break;
		case 36:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			i1 = Integer.parseInt(entradaI1);
			if(i1 == 0) {
			for(i2 = 0;i2 == 0; i2++) {
			i2--;
			JOptionPane.showMessageDialog(null,"Digite um valor valido",
					"Error",JOptionPane.ERROR_MESSAGE, null );

			System.out.println(i1);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			i1 = Integer.parseInt(entradaI1);
			if(i1 != 0) { break;}}}
			if(i1 != 0) {
			r = i/i1;
			JOptionPane.showMessageDialog(null,r + " " + "Sua divisao");
			}
		main(null);
		break;
		case 37:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			i1 = Integer.parseInt(entradaI1);
			if(i1 == 0) {
				i2 = 0;
			while(i2 == 0) {
		    i2++;i2--;
			JOptionPane.showMessageDialog(null,"Digite um valor valido",
					"Error",JOptionPane.ERROR_MESSAGE, null );
			System.out.println(i1);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			i1 = Integer.parseInt(entradaI1);
			if(i1 != 0) { break;}}}
			if(i1 != 0) {
			r = i/i1;
			JOptionPane.showMessageDialog(null,r + " " + "Sua divisao");
			}	
		main(null);
		break;
		case 38: //48
			for(i2 = 1;i2 > 0; i2++) {System.out.println(i2);
			if(i2 > 2) {
			entradaI2 = JOptionPane.showInputDialog("Deseja continuar? S/N");
			c = entradaI2.charAt(0);
			if(c =='S') {
				i2 = 0;	continue;
			}else if(c == 'N') {break;}}
			JOptionPane.showMessageDialog(null,"Digite as notas da :"+ i2+"°");
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			i1 = Integer.parseInt(entradaI1);
			if(i1 < 0 || i1 > 10) {
			i2--;
			JOptionPane.showMessageDialog(null, "Digite um valor valido");
			continue;
			}if(i1 >= 0 || i1 <= 11 ) {
				r = (i + i1)/2;	
				JOptionPane.showMessageDialog(null, "Sua media foi " + r);continue;}
			}
		main(null);
		break;
		
		
		case 39:

	      		for(i2= 0;i2 > -1; i2++) {
			    Thread.sleep(1000);
			    System.out.println(i2);
				if(i2 >= 2) {
					break;
				}}
		main(null);
		break;
		case 40: //51	
			for(i2 = 10;i2 >= 0; i2--) {
			    Thread.sleep(1000);
			    System.out.println(i2);
				if(i2 <= 1) {
					break;
					}}
		main(null);
		break;
		case 41:
			for(i2 = 100;i2 >= 0; i2++) {
			    Thread.sleep(1000);
			    System.out.println(i2);
				if(i2 >= 110) {
					break;
					}}
		main(null);
		break;
		case 42:
			

		main(null);
		break;
		case 43:

		main(null);
		break;
		case 44:

		main(null);
		break;
		case 45:

		main(null);
		break;
		
		default:
			run();
	}
	}

	public static void run() throws InterruptedException{

		
		UIManager um = new UIManager();
		UIManager.put("OptionPane.messageForeground", Color.red);
		Font serifFont = new Font("Serif", Font.BOLD, 12);
			JOptionPane.showMessageDialog(null , "Error\n"
					+ "Error\n"+ "Error\n"+ "Error\n"
			+ "Coloque um numero valido. . . .",  "Error", JOptionPane.ERROR_MESSAGE);
			main(null);
		}
	
}




/*
		case :

		main(null);
		break;
 */