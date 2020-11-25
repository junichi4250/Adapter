package pattern2;

/**
 * アダプター
 * @author jun
 *
 */
public class PrintBanner extends Print{

	private Banner banner;

	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}
	public void printWeaK() {
		showWithParen();
	}
	public void printStrong() {
		showWithAster();
	}
}
