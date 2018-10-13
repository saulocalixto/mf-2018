package br.edu.ifrn.calculadora;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Principal {

	private static ParseTree parse(String programa) {
		final ANTLRInputStream input = new ANTLRInputStream(programa);
		final CalculadoraLexer lexer = new CalculadoraLexer(input);
		final CommonTokenStream tokens = new CommonTokenStream(lexer);
		final CalculadoraParser parser = new CalculadoraParser(tokens);
		return parser.prog();
	}

	public static void main(String... args) throws IOException {
		String programa = "1+2*(3-4)*5/2";
		final ParseTree tree = parse(programa);
		final ParseTreeWalker walker = new ParseTreeWalker();

		// Percorrendo a árvore para avaliar o programa
		final MinhaCalculadora listener = new MinhaCalculadora();
		walker.walk(listener, tree);
		int resultado = listener.resultado();

		// Percorrendo a árvore para gerar um programa em Java
		final MinhaCalculadoraJava listenerJava = new MinhaCalculadoraJava();
		walker.walk(listenerJava, tree);
		String resultadoJava = listenerJava.resultado();

		System.out.println( programa);
		System.out.println("========");
		System.out.println(resultado);
		System.out.println("========");
		System.out.println(resultadoJava);
	}
}
