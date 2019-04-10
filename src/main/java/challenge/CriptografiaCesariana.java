package challenge;

public class CriptografiaCesariana implements Criptografia {

	@Override
	public String criptografar(String texto) {
		if (texto==null) throw new NullPointerException();
		if (texto.trim().isEmpty()) throw new IllegalArgumentException();
		texto = texto.toLowerCase();
		String textoCriptografado = "";
		char ch;
		for (int i = 0; i < texto.length(); i++) {
			ch = texto.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch + 3);
				textoCriptografado += ch;
				continue;
			}
			if (ch == 'x') ch = 'a';
			if (ch == 'y') ch = 'b';
			if (ch == 'z') ch = 'c';
			textoCriptografado += ch;
		}
		return textoCriptografado;
	}

	@Override
	public String descriptografar(String texto) {
		if (texto==null) throw new NullPointerException();
		if (texto.trim().isEmpty()) throw new IllegalArgumentException();
		texto = texto.toLowerCase();
		String textoDescriptografado = "";
		char ch;
		for (int i = 0; i < texto.length(); i++) {
			ch = texto.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 3);
				textoDescriptografado += ch;
				continue;
			}
			if (ch == 'a') ch = 'x'; 
			if (ch == 'b') ch = 'y'; 
			if (ch == 'c') ch = 'z'; 
			textoDescriptografado += ch;
		}
		return textoDescriptografado;
	}
}
