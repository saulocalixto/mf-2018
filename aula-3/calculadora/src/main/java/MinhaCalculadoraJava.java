import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class MinhaCalculadoraJava extends CalculadoraBaseListener {
	ParseTreeProperty<String> values = new ParseTreeProperty<>();

	public void setValue(ParseTree node, String value) {
		values.put(node, value);
	}

	public String getValue(ParseTree node) {
		return values.get(node);
	}

	@Override
	public void exitPar(@NotNull CalculadoraParser.ParContext ctx) {
		String valor = getValue(ctx.expr());
		setValue(ctx, valor);
	}

	@Override
	public void exitNum(@NotNull CalculadoraParser.NumContext ctx) {
		setValue(ctx, ctx.INT().getText());
	}

	@Override
	public void exitProg(@NotNull CalculadoraParser.ProgContext ctx) {
		resposta = "public class Calculadora {\n"
				+ "  public static void main(String ... arg) {\n"
				+ "    System.out.println(" + getValue(ctx.expr()) + ");\n"
				+ "  }\n" + "}";
	}

	@Override
	public void exitOpBin(@NotNull CalculadoraParser.OpBinContext ctx) {
		String esq = getValue(ctx.expr(0));
		String dir = getValue(ctx.expr(1));
		final String valor;
		switch (ctx.op.getText()) {
		case "*":
			valor = "(" + esq + " * " + dir + ")";
			break;
		case "/":
			valor = "(" + esq + " / " + dir + ")";
			break;
		case "+":
			valor = "(" + esq + " + " + dir + ")";
			break;
		default:
			valor = "(" + esq + " - " + dir + ")";
		}
		setValue(ctx, valor);
	}

	private String resposta;

	public String resultado() {
		return resposta;
	}
}