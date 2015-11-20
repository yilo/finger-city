package org.racoon.finger.city.jpa;

import org.bouncycastle.crypto.engines.BlowfishEngine;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.encoders.Base64;

import com.mchange.v2.c3p0.jboss.C3P0PooledDataSource;

/**
 * created by f560415, created on Nov 20, 2015
 */
public class EncryptDataSource extends C3P0PooledDataSource {

	private final String encryptKey = "xe$#2123HYS)";

	@Override
	public String getPassword() {
		String password = super.getPassword();
		String decryptedPasswd = null;
		try {
			decryptedPasswd = decrypt(password, encryptKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decryptedPasswd;
	}

	/***
	 * Decode Password
	 */
	private String decrypt(String val, String encryptKey) throws Exception {
		BlowfishEngine engine = new BlowfishEngine();
		PaddedBufferedBlockCipher cipher = new PaddedBufferedBlockCipher(engine);
		StringBuffer result = new StringBuffer();
		KeyParameter key = new KeyParameter(encryptKey.getBytes());
		cipher.init(false, key);
		byte out[] = Base64.decode(val);
		byte out2[] = new byte[cipher.getOutputSize(out.length)];
		int len2 = cipher.processBytes(out, 0, out.length, out2, 0);
		cipher.doFinal(out2, len2);
		String s2 = new String(out2);
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			if (c != 0) {
				result.append(c);
			}
		}
		return result.toString();
	}

	// private String encrypt(String val, String encryptKey) throws Exception {
	// BlowfishEngine engine = new BlowfishEngine();
	// PaddedBufferedBlockCipher cipher = new
	// PaddedBufferedBlockCipher(engine);
	// }
}
