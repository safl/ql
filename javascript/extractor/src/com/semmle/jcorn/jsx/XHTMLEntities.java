package com.semmle.jcorn.jsx;

import java.util.LinkedHashMap;
import java.util.Map;

public class XHTMLEntities {
	public static final Map<String, Character> ENTITIES = new LinkedHashMap<>();
	static {
		ENTITIES.put("quot", '\u0022');
		ENTITIES.put("amp", '&');
		ENTITIES.put("apos", '\'');
		ENTITIES.put("lt", '<');
		ENTITIES.put("gt", '>');
		ENTITIES.put("nbsp", '\u00A0');
		ENTITIES.put("iexcl", '\u00A1');
		ENTITIES.put("cent", '\u00A2');
		ENTITIES.put("pound", '\u00A3');
		ENTITIES.put("curren", '\u00A4');
		ENTITIES.put("yen", '\u00A5');
		ENTITIES.put("brvbar", '\u00A6');
		ENTITIES.put("sect", '\u00A7');
		ENTITIES.put("uml", '\u00A8');
		ENTITIES.put("copy", '\u00A9');
		ENTITIES.put("ordf", '\u00AA');
		ENTITIES.put("laquo", '\u00AB');
		ENTITIES.put("not", '\u00AC');
		ENTITIES.put("shy", '\u00AD');
		ENTITIES.put("reg", '\u00AE');
		ENTITIES.put("macr", '\u00AF');
		ENTITIES.put("deg", '\u00B0');
		ENTITIES.put("plusmn", '\u00B1');
		ENTITIES.put("sup2", '\u00B2');
		ENTITIES.put("sup3", '\u00B3');
		ENTITIES.put("acute", '\u00B4');
		ENTITIES.put("micro", '\u00B5');
		ENTITIES.put("para", '\u00B6');
		ENTITIES.put("middot", '\u00B7');
		ENTITIES.put("cedil", '\u00B8');
		ENTITIES.put("sup1", '\u00B9');
		ENTITIES.put("ordm", '\u00BA');
		ENTITIES.put("raquo", '\u00BB');
		ENTITIES.put("frac14", '\u00BC');
		ENTITIES.put("frac12", '\u00BD');
		ENTITIES.put("frac34", '\u00BE');
		ENTITIES.put("iquest", '\u00BF');
		ENTITIES.put("Agrave", '\u00C0');
		ENTITIES.put("Aacute", '\u00C1');
		ENTITIES.put("Acirc", '\u00C2');
		ENTITIES.put("Atilde", '\u00C3');
		ENTITIES.put("Auml", '\u00C4');
		ENTITIES.put("Aring", '\u00C5');
		ENTITIES.put("AElig", '\u00C6');
		ENTITIES.put("Ccedil", '\u00C7');
		ENTITIES.put("Egrave", '\u00C8');
		ENTITIES.put("Eacute", '\u00C9');
		ENTITIES.put("Ecirc", '\u00CA');
		ENTITIES.put("Euml", '\u00CB');
		ENTITIES.put("Igrave", '\u00CC');
		ENTITIES.put("Iacute", '\u00CD');
		ENTITIES.put("Icirc", '\u00CE');
		ENTITIES.put("Iuml", '\u00CF');
		ENTITIES.put("ETH", '\u00D0');
		ENTITIES.put("Ntilde", '\u00D1');
		ENTITIES.put("Ograve", '\u00D2');
		ENTITIES.put("Oacute", '\u00D3');
		ENTITIES.put("Ocirc", '\u00D4');
		ENTITIES.put("Otilde", '\u00D5');
		ENTITIES.put("Ouml", '\u00D6');
		ENTITIES.put("times", '\u00D7');
		ENTITIES.put("Oslash", '\u00D8');
		ENTITIES.put("Ugrave", '\u00D9');
		ENTITIES.put("Uacute", '\u00DA');
		ENTITIES.put("Ucirc", '\u00DB');
		ENTITIES.put("Uuml", '\u00DC');
		ENTITIES.put("Yacute", '\u00DD');
		ENTITIES.put("THORN", '\u00DE');
		ENTITIES.put("szlig", '\u00DF');
		ENTITIES.put("agrave", '\u00E0');
		ENTITIES.put("aacute", '\u00E1');
		ENTITIES.put("acirc", '\u00E2');
		ENTITIES.put("atilde", '\u00E3');
		ENTITIES.put("auml", '\u00E4');
		ENTITIES.put("aring", '\u00E5');
		ENTITIES.put("aelig", '\u00E6');
		ENTITIES.put("ccedil", '\u00E7');
		ENTITIES.put("egrave", '\u00E8');
		ENTITIES.put("eacute", '\u00E9');
		ENTITIES.put("ecirc", '\u00EA');
		ENTITIES.put("euml", '\u00EB');
		ENTITIES.put("igrave", '\u00EC');
		ENTITIES.put("iacute", '\u00ED');
		ENTITIES.put("icirc", '\u00EE');
		ENTITIES.put("iuml", '\u00EF');
		ENTITIES.put("eth", '\u00F0');
		ENTITIES.put("ntilde", '\u00F1');
		ENTITIES.put("ograve", '\u00F2');
		ENTITIES.put("oacute", '\u00F3');
		ENTITIES.put("ocirc", '\u00F4');
		ENTITIES.put("otilde", '\u00F5');
		ENTITIES.put("ouml", '\u00F6');
		ENTITIES.put("divide", '\u00F7');
		ENTITIES.put("oslash", '\u00F8');
		ENTITIES.put("ugrave", '\u00F9');
		ENTITIES.put("uacute", '\u00FA');
		ENTITIES.put("ucirc", '\u00FB');
		ENTITIES.put("uuml", '\u00FC');
		ENTITIES.put("yacute", '\u00FD');
		ENTITIES.put("thorn", '\u00FE');
		ENTITIES.put("yuml", '\u00FF');
		ENTITIES.put("OElig", '\u0152');
		ENTITIES.put("oelig", '\u0153');
		ENTITIES.put("Scaron", '\u0160');
		ENTITIES.put("scaron", '\u0161');
		ENTITIES.put("Yuml", '\u0178');
		ENTITIES.put("fnof", '\u0192');
		ENTITIES.put("circ", '\u02C6');
		ENTITIES.put("tilde", '\u02DC');
		ENTITIES.put("Alpha", '\u0391');
		ENTITIES.put("Beta", '\u0392');
		ENTITIES.put("Gamma", '\u0393');
		ENTITIES.put("Delta", '\u0394');
		ENTITIES.put("Epsilon", '\u0395');
		ENTITIES.put("Zeta", '\u0396');
		ENTITIES.put("Eta", '\u0397');
		ENTITIES.put("Theta", '\u0398');
		ENTITIES.put("Iota", '\u0399');
		ENTITIES.put("Kappa", '\u039A');
		ENTITIES.put("Lambda", '\u039B');
		ENTITIES.put("Mu", '\u039C');
		ENTITIES.put("Nu", '\u039D');
		ENTITIES.put("Xi", '\u039E');
		ENTITIES.put("Omicron", '\u039F');
		ENTITIES.put("Pi", '\u03A0');
		ENTITIES.put("Rho", '\u03A1');
		ENTITIES.put("Sigma", '\u03A3');
		ENTITIES.put("Tau", '\u03A4');
		ENTITIES.put("Upsilon", '\u03A5');
		ENTITIES.put("Phi", '\u03A6');
		ENTITIES.put("Chi", '\u03A7');
		ENTITIES.put("Psi", '\u03A8');
		ENTITIES.put("Omega", '\u03A9');
		ENTITIES.put("alpha", '\u03B1');
		ENTITIES.put("beta", '\u03B2');
		ENTITIES.put("gamma", '\u03B3');
		ENTITIES.put("delta", '\u03B4');
		ENTITIES.put("epsilon", '\u03B5');
		ENTITIES.put("zeta", '\u03B6');
		ENTITIES.put("eta", '\u03B7');
		ENTITIES.put("theta", '\u03B8');
		ENTITIES.put("iota", '\u03B9');
		ENTITIES.put("kappa", '\u03BA');
		ENTITIES.put("lambda", '\u03BB');
		ENTITIES.put("mu", '\u03BC');
		ENTITIES.put("nu", '\u03BD');
		ENTITIES.put("xi", '\u03BE');
		ENTITIES.put("omicron", '\u03BF');
		ENTITIES.put("pi", '\u03C0');
		ENTITIES.put("rho", '\u03C1');
		ENTITIES.put("sigmaf", '\u03C2');
		ENTITIES.put("sigma", '\u03C3');
		ENTITIES.put("tau", '\u03C4');
		ENTITIES.put("upsilon", '\u03C5');
		ENTITIES.put("phi", '\u03C6');
		ENTITIES.put("chi", '\u03C7');
		ENTITIES.put("psi", '\u03C8');
		ENTITIES.put("omega", '\u03C9');
		ENTITIES.put("thetasym", '\u03D1');
		ENTITIES.put("upsih", '\u03D2');
		ENTITIES.put("piv", '\u03D6');
		ENTITIES.put("ensp", '\u2002');
		ENTITIES.put("emsp", '\u2003');
		ENTITIES.put("thinsp", '\u2009');
		ENTITIES.put("zwnj", '\u200C');
		ENTITIES.put("zwj", '\u200D');
		ENTITIES.put("lrm", '\u200E');
		ENTITIES.put("rlm", '\u200F');
		ENTITIES.put("ndash", '\u2013');
		ENTITIES.put("mdash", '\u2014');
		ENTITIES.put("lsquo", '\u2018');
		ENTITIES.put("rsquo", '\u2019');
		ENTITIES.put("sbquo", '\u201A');
		ENTITIES.put("ldquo", '\u201C');
		ENTITIES.put("rdquo", '\u201D');
		ENTITIES.put("bdquo", '\u201E');
		ENTITIES.put("dagger", '\u2020');
		ENTITIES.put("Dagger", '\u2021');
		ENTITIES.put("bull", '\u2022');
		ENTITIES.put("hellip", '\u2026');
		ENTITIES.put("permil", '\u2030');
		ENTITIES.put("prime", '\u2032');
		ENTITIES.put("Prime", '\u2033');
		ENTITIES.put("lsaquo", '\u2039');
		ENTITIES.put("rsaquo", '\u203A');
		ENTITIES.put("oline", '\u203E');
		ENTITIES.put("frasl", '\u2044');
		ENTITIES.put("euro", '\u20AC');
		ENTITIES.put("image", '\u2111');
		ENTITIES.put("weierp", '\u2118');
		ENTITIES.put("real", '\u211C');
		ENTITIES.put("trade", '\u2122');
		ENTITIES.put("alefsym", '\u2135');
		ENTITIES.put("larr", '\u2190');
		ENTITIES.put("uarr", '\u2191');
		ENTITIES.put("rarr", '\u2192');
		ENTITIES.put("darr", '\u2193');
		ENTITIES.put("harr", '\u2194');
		ENTITIES.put("crarr", '\u21B5');
		ENTITIES.put("lArr", '\u21D0');
		ENTITIES.put("uArr", '\u21D1');
		ENTITIES.put("rArr", '\u21D2');
		ENTITIES.put("dArr", '\u21D3');
		ENTITIES.put("hArr", '\u21D4');
		ENTITIES.put("forall", '\u2200');
		ENTITIES.put("part", '\u2202');
		ENTITIES.put("exist", '\u2203');
		ENTITIES.put("empty", '\u2205');
		ENTITIES.put("nabla", '\u2207');
		ENTITIES.put("isin", '\u2208');
		ENTITIES.put("notin", '\u2209');
		ENTITIES.put("ni", '\u220B');
		ENTITIES.put("prod", '\u220F');
		ENTITIES.put("sum", '\u2211');
		ENTITIES.put("minus", '\u2212');
		ENTITIES.put("lowast", '\u2217');
		ENTITIES.put("radic", '\u221A');
		ENTITIES.put("prop", '\u221D');
		ENTITIES.put("infin", '\u221E');
		ENTITIES.put("ang", '\u2220');
		ENTITIES.put("and", '\u2227');
		ENTITIES.put("or", '\u2228');
		ENTITIES.put("cap", '\u2229');
		ENTITIES.put("cup", '\u222A');
		ENTITIES.put("'int'", '\u222B');
		ENTITIES.put("there4", '\u2234');
		ENTITIES.put("sim", '\u223C');
		ENTITIES.put("cong", '\u2245');
		ENTITIES.put("asymp", '\u2248');
		ENTITIES.put("ne", '\u2260');
		ENTITIES.put("equiv", '\u2261');
		ENTITIES.put("le", '\u2264');
		ENTITIES.put("ge", '\u2265');
		ENTITIES.put("sub", '\u2282');
		ENTITIES.put("sup", '\u2283');
		ENTITIES.put("nsub", '\u2284');
		ENTITIES.put("sube", '\u2286');
		ENTITIES.put("supe", '\u2287');
		ENTITIES.put("oplus", '\u2295');
		ENTITIES.put("otimes", '\u2297');
		ENTITIES.put("perp", '\u22A5');
		ENTITIES.put("sdot", '\u22C5');
		ENTITIES.put("lceil", '\u2308');
		ENTITIES.put("rceil", '\u2309');
		ENTITIES.put("lfloor", '\u230A');
		ENTITIES.put("rfloor", '\u230B');
		ENTITIES.put("lang", '\u2329');
		ENTITIES.put("rang", '\u232A');
		ENTITIES.put("loz", '\u25CA');
		ENTITIES.put("spades", '\u2660');
		ENTITIES.put("clubs", '\u2663');
		ENTITIES.put("hearts", '\u2665');
		ENTITIES.put("diams", '\u2666');
	}
}