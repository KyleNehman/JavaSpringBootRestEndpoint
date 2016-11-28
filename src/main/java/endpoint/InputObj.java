package endpoint;
/*
 * Java translation of groovy derived InputObj class
 * Contains the ability to XOR the base64 string by a costant xorby
 */

public class InputObj extends EvalObj {

    private final int 0x66;
    
    public String xorString() {
	byte bytesToXor[] = base64Str.decodeBase64();
	int numOfBytes = bytesToXor.size();

	// set each byte to itself xor xorBy
	for (int i = 0; i < numOfBytes; i++) {
	    bytesToXor[i] = bytesToXor[i] ^ xorBy;
	}

	return bytesToXor.encodeBase64().toString();
    }
}
