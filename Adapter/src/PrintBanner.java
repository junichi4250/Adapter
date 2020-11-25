
/**
 * アダプター
 * @author jun
 *
 */
public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
	}
	public void printWeaK() {
		showWithParen();
	}
	public void printStrong() {
		showWithAster();
	}
}
