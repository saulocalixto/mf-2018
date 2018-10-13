import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class MinhaCalculadora extends CalculadoraBaseListener {
	ParseTreeProperty<Integer> values = new ParseTreeProperty<>();

	public void setValue(ParseTree node, int value) {
		values.put(node, value);
	}

	public int getValue(ParseTree node) {
		return values.get(node);
	}

	@Override
	public void exitPar(@NotNull CalculadoraParser.ParContext ctx) {
		int valor = getValue(ctx.expr());
		setValue(ctx, valor);
	}

	@Override
	public void exitNum(@NotNull CalculadoraParser.NumContext ctx) {
		int valor = Integer.parseInt(ctx.INT().getText());
		setValue(ctx, valor);
	}

	private int resposta;

	@Override
	public void exitProg(@NotNull CalculadoraParser.ProgContext ctx) {
		resposta = getValue(ctx.expr());
	}

	@Override
	public void exitOpBin(@NotNull CalculadoraParser.OpBinContext ctx) {
		int esq = getValue(ctx.expr(0));
		int dir = getValue(ctx.expr(1));
		final int valor;
		switch (ctx.op.getText()) {
		case "*":
			valor = esq * dir;
			break;
		case "/":
			valor = esq / dir;
			break;
		case "+":
			valor = esq + dir;
			break;
		default:
			valor = esq - dir;
		}
		setValue(ctx, valor);
	}

	public int resultado() {
		return resposta;
	}
}