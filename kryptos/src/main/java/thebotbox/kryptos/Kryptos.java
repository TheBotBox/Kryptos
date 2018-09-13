package thebotbox.kryptos;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */

public final class Kryptos {

    public static final String CIPHER_4(String message, String key_4) throws Exception {
        if (key_4.length() != 4)
            throw new RuntimeException("Secret key should be 4 characters only");
        KryptFactory mFactory = new KryptFactory(key_4);
        return mFactory.bytesToHex(mFactory.encrypt(message));
    }

    public static final String DECIPHER_4(String message, String key_4) throws Exception {
        if (key_4.length() != 4)
            throw new RuntimeException("Secret key should be 4 characters only");
        KryptFactory mFactory = new KryptFactory(key_4);
        return new String(mFactory.decrypt(message));
    }

    public static final String CIPHER_16(String message, String key_16) throws Exception {
        if (key_16.length() != 16)
            throw new RuntimeException("Secret key should be 16 characters only");
        KryptFactory mFactory = new KryptFactory(key_16);
        return mFactory.bytesToHex(mFactory.encrypt(message));
    }

    public static final String DECIPHER_16(String message, String key_16, String iv) throws Exception {
        if (key_16.length() != 16)
            throw new RuntimeException("Secret key should be 4 characters only");
        KryptFactory mFactory = new KryptFactory(key_16);
        return new String(mFactory.decrypt(message));
    }
}
