package what_is_the_flag.kyu7;

import java.math.BigInteger;
import java.security.MessageDigest;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Kata {

	public static final String FLAG = "dflaskjf; klcqwjer9qieiqucwepirom9028905839045809ds8gf[90g8sd[fh8f-[gh8-09wer0=t]mxcvnmz.xvchku9erpiot789-348tipahjrgfkhzxvxmb,mncxmh6t3q90485ut9rsqklgfjkj#Q$YTEWOPJGPOEDSJC)$%#@^*@$%690uiodrj;lstj3;wpiot8ujdfpgioja90-8-0cx8v#KL%J,,.345.3.l0-0----0000-00---0-----0..-.-.--.....--.-.-.----5345..9.........4.....3.........456...4.........3.....2.........7.....3424.......................564...544......4...5.8...9.....6...3.7.........79345.9.565.....1...1.3...7.....1...1.33452.......................013..89345......4......9......732......8........6......8........9......9........846..78654......................698............8...3............6.....098345.....73............6...6............186...........................79843..9879878....6.......7.......8.......5.......8.......6.......9.......9.....12387.....7............................786982..........8........45623..77833...........9...............109841....................345.....723....5...1...6...2...6...3....5......78234.....45....1...8...7...8...2...3....873....4...5...........................4.....7..........1...5............9.4...93459......1...............1...............1............................4.....3..345634..3...7...3........7.5....3455......1.....3.........2.....867843....1............................5321452............1...............1...............1....743745.....1...............1............................2345754..5.....44........6.....354335....3.....13........4.....42........7542345................4....2...533....52...3.....6....2.3..9.....98...1..7.6.....6....7...88.....5....6....9...964....................------0--0-=0-=-0-00000000-00-0-0-000000,0,,0000jasdkl;jferiotupvn23c014985901c79840p72x812m598723189057m2190857mx98012479812798m1407395813479857m2149857198x0579814320758937981982347384957983g";

	// Put the flag in this variable
//	public static final String flag = "FLAG{3341214660270458903528402868523620912228196069584075086834093583043124042415918677256146608538667490249249241741168695242361686427851486146194365084107719766473639653242389920909197468341194464591021483595909458042401970759075698398406952160965903971459570901721396589083452264998860424285622}";
	public static final String flag1 = "FLAG{53459434564327342456454445896377934595651137113345201389345497328689984678654698836098345736618679843987987867858699123877786982845623778339109841345723516263578234451878238734547159493459111433456343737534551328678431532145211174374511234575454463543353134427542345425335236239981766788569964}";
	public static final String flag2 = "FLAG{3341214660270458903528402868523620912228196069584075086834093583043124042415918677256146608538667490249249241741168695242361686427851486146194365084107719766473639653242389920909197468341194464591021483595909458042401970759075698398406952160965903971459570901721396589083452264998860424285622}";
	public static final String flag = "FLAG{20864734708303870633950957513982627895033421072835896623918141149240048144212282811815458010848196125046973222662428035547004808739078346512436075254465759421675240056382994797379223936877944443183857351832590965623764286774237966586518187281907955667215639735464730296053011916615416688948340033718774159147615045179534968939523004471350159931335940452}";


	public static void main(String[] args) {
		var flag1 = "53459434564327342456454445896377934595651137113345201389345497328689984678654698836098345736618679843987987867858699123877786982845623778339109841345723516263578234451878238734547159493459111433456343737534551328678431532145211174374511234575454463543353134427542345425335236239981766788569964";
		var flag2 = "3341214660270458903528402868523620912228196069584075086834093583043124042415918677256146608538667490249249241741168695242361686427851486146194365084107719766473639653242389920909197468341194464591021483595909458042401970759075698398406952160965903971459570901721396589083452264998860424285622";
		var test = new BigInteger(flag1, 16);
		System.out.println(test);
	}

	private String digest(String input) throws Exception {
		var md5 = MessageDigest.getInstance("MD5");
		byte[] digest = md5.digest(input.getBytes(UTF_8));
		StringBuilder sb = new StringBuilder(digest.length * 2);
		for (byte b : digest) sb.append(String.format("%02x", b));
		return sb.toString();
	}

}