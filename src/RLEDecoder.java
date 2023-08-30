
public class RLEDecoder {

	    public static String decode(String compressed) {
	        StringBuilder result = new StringBuilder();
	        int count = 0;

	        for (int i = 0; i < compressed.length(); i++) {
	            char currentChar = compressed.charAt(i);
	            if (Character.isDigit(currentChar)) {
	                count = count * 10 + (currentChar - '0');
	            } else {
	                // Adiciona o caractere 'count' vezes à string descomprimida
	                for (int j = 0; j < count; j++) {
	                    result.append(currentChar);
	                }
	                count = 0; // Reinicia a contagem
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String compressed = "13A3H2E1M";
	        String decompressed = decode(compressed);
	        System.out.println(decompressed);
	    }
	}

