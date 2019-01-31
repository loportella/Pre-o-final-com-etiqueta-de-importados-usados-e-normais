package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Produto;
import entites.ProdutoImportado;
import entites.ProdutoUsado;

public class ExericioF1Produto {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner s=new Scanner(System.in);
		List<Produto> p=new ArrayList<>();
		
		System.out.print("Quantos produtos: ");
		int n=s.nextInt(); int i;
		for(i=1;n!=0;i++) {
			System.out.printf("Produto #%d: \n",i);
			System.out.print("Comum / Importado / Usado (c/i/u)? ");
			char r=s.next().charAt(0);
			while(r=='c'||r=='C'||r=='i'||r=='I'||r=='u'||r=='U') {
				s.nextLine();
				System.out.print("Nome: ");
				String nome=s.nextLine();
				System.out.print("Preço: ");
				Double preco=s.nextDouble();
				if(r=='c'||r=='C') {
					Produto adc=new Produto(nome, preco);
					p.add(adc);
				}else if(r=='i'||r=='I') {
					System.out.print("Taxa: ");
					Double taxa=s.nextDouble();
					Produto adc=new ProdutoImportado(nome, preco, taxa);
					p.add(adc);
				}else if(r=='u'||r=='U') {
					System.out.print("Data de fabricação: ");
					SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy");
					Date f=d.parse(s.next());
					Produto adc=new ProdutoUsado(nome, preco, f);
					p.add(adc);
				}r='@';n--;
			}if(r!='@') {
				System.out.println("Opção invalida: ");i--;
				}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS: ");
		for(Produto x:p) {
			System.out.println(x.etiqueta());
		}
		s.close();
	}

}
