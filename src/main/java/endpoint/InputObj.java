package endpoint;
/*
 * Java translation of groovy derived InputObj class
 * Contains the ability to XOR the base64 string by a costant xorby
 */

import java.util.Base64;

public class InputObj extends EvalObj {

    private final byte xorBy = 0x66;
    
    public String xorString() {
	byte bytesToXor[] = Base64.getDecoder().decode(base64Str);
	int numOfBytes = bytesToXor.length;

	// set each byte to itself xor xorBy
	for (int i = 0; i < numOfBytes; i++) {
	    bytesToXor[i] = (byte) (bytesToXor[i] ^ xorBy);
	}

	return Base64.getEncoder().encodeToString(bytesToXor);
   }
}
