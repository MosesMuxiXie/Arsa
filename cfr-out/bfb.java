/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Longs
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  it.unimi.dsi.fastutil.bytes.ByteArrays
 */
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.bytes.ByteArrays;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bfb {
    private static final String h = "AES";
    private static final int i = 128;
    private static final String j = "RSA";
    private static final int k = 1024;
    private static final String l = "ISO_8859_1";
    private static final String m = "SHA-1";
    public static final String a = "SHA256withRSA";
    public static final int b = 256;
    private static final String n = "-----BEGIN RSA PRIVATE KEY-----";
    private static final String o = "-----END RSA PRIVATE KEY-----";
    public static final String c = "-----BEGIN RSA PUBLIC KEY-----";
    private static final String p = "-----END RSA PUBLIC KEY-----";
    public static final String d = "\n";
    public static final Base64.Encoder e = Base64.getMimeEncoder(76, "\n".getBytes(StandardCharsets.UTF_8));
    public static final Codec<PublicKey> f = Codec.STRING.comapFlatMap($$0 -> {
        try {
            return DataResult.success((Object)bfb.b($$0));
        }
        catch (bfc $$1) {
            return DataResult.error($$1::getMessage);
        }
    }, bfb::a);
    public static final Codec<PrivateKey> g = Codec.STRING.comapFlatMap($$0 -> {
        try {
            return DataResult.success((Object)bfb.a($$0));
        }
        catch (bfc $$1) {
            return DataResult.error($$1::getMessage);
        }
    }, bfb::a);

    public static SecretKey a() throws bfc {
        try {
            KeyGenerator $$0 = KeyGenerator.getInstance(h);
            $$0.init(128);
            return $$0.generateKey();
        }
        catch (Exception $$1) {
            throw new bfc($$1);
        }
    }

    public static KeyPair b() throws bfc {
        try {
            KeyPairGenerator $$0 = KeyPairGenerator.getInstance(j);
            $$0.initialize(1024);
            return $$0.generateKeyPair();
        }
        catch (Exception $$1) {
            throw new bfc($$1);
        }
    }

    public static byte[] a(String $$0, PublicKey $$1, SecretKey $$2) throws bfc {
        try {
            return bfb.a($$0.getBytes(l), $$2.getEncoded(), $$1.getEncoded());
        }
        catch (Exception $$3) {
            throw new bfc($$3);
        }
    }

    private static byte[] a(byte[] ... $$0) throws Exception {
        MessageDigest $$1 = MessageDigest.getInstance(m);
        for (byte[] $$2 : $$0) {
            $$1.update($$2);
        }
        return $$1.digest();
    }

    private static <T extends Key> T a(String $$0, String $$1, String $$2, a<T> $$3) throws bfc {
        int $$4 = $$0.indexOf($$1);
        if ($$4 != -1) {
            int $$5 = $$0.indexOf($$2, $$4 += $$1.length());
            $$0 = $$0.substring($$4, $$5 + 1);
        }
        try {
            return $$3.apply(Base64.getMimeDecoder().decode($$0));
        }
        catch (IllegalArgumentException $$6) {
            throw new bfc($$6);
        }
    }

    public static PrivateKey a(String $$0) throws bfc {
        return bfb.a($$0, n, o, bfb::b);
    }

    public static PublicKey b(String $$0) throws bfc {
        return bfb.a($$0, c, p, bfb::a);
    }

    public static String a(PublicKey $$0) {
        if (!j.equals($$0.getAlgorithm())) {
            throw new IllegalArgumentException("Public key must be RSA");
        }
        return "-----BEGIN RSA PUBLIC KEY-----\n" + e.encodeToString($$0.getEncoded()) + "\n-----END RSA PUBLIC KEY-----\n";
    }

    public static String a(PrivateKey $$0) {
        if (!j.equals($$0.getAlgorithm())) {
            throw new IllegalArgumentException("Private key must be RSA");
        }
        return "-----BEGIN RSA PRIVATE KEY-----\n" + e.encodeToString($$0.getEncoded()) + "\n-----END RSA PRIVATE KEY-----\n";
    }

    private static PrivateKey b(byte[] $$0) throws bfc {
        try {
            PKCS8EncodedKeySpec $$1 = new PKCS8EncodedKeySpec($$0);
            KeyFactory $$2 = KeyFactory.getInstance(j);
            return $$2.generatePrivate($$1);
        }
        catch (Exception $$3) {
            throw new bfc($$3);
        }
    }

    public static PublicKey a(byte[] $$0) throws bfc {
        try {
            X509EncodedKeySpec $$1 = new X509EncodedKeySpec($$0);
            KeyFactory $$2 = KeyFactory.getInstance(j);
            return $$2.generatePublic($$1);
        }
        catch (Exception $$3) {
            throw new bfc($$3);
        }
    }

    public static SecretKey a(PrivateKey $$0, byte[] $$1) throws bfc {
        byte[] $$2 = bfb.b($$0, $$1);
        try {
            return new SecretKeySpec($$2, h);
        }
        catch (Exception $$3) {
            throw new bfc($$3);
        }
    }

    public static byte[] a(Key $$0, byte[] $$1) throws bfc {
        return bfb.a(1, $$0, $$1);
    }

    public static byte[] b(Key $$0, byte[] $$1) throws bfc {
        return bfb.a(2, $$0, $$1);
    }

    private static byte[] a(int $$0, Key $$1, byte[] $$2) throws bfc {
        try {
            return bfb.a($$0, $$1.getAlgorithm(), $$1).doFinal($$2);
        }
        catch (Exception $$3) {
            throw new bfc($$3);
        }
    }

    private static Cipher a(int $$0, String $$1, Key $$2) throws Exception {
        Cipher $$3 = Cipher.getInstance($$1);
        $$3.init($$0, $$2);
        return $$3;
    }

    public static Cipher a(int $$0, Key $$1) throws bfc {
        try {
            Cipher $$2 = Cipher.getInstance("AES/CFB8/NoPadding");
            $$2.init($$0, $$1, new IvParameterSpec($$1.getEncoded()));
            return $$2;
        }
        catch (Exception $$3) {
            throw new bfc($$3);
        }
    }

    static interface a<T extends Key> {
        public T apply(byte[] var1) throws bfc;
    }

    public record b(long b, byte[] c) {
        private final long b;
        private final byte[] c;
        public static final b a = new b(0L, ByteArrays.EMPTY_ARRAY);

        public b(wx $$0) {
            this($$0.readLong(), $$0.b());
        }

        public boolean a() {
            return this.c.length > 0;
        }

        public static void a(wx $$0, b $$1) {
            $$0.b($$1.b);
            $$0.a($$1.c);
        }

        public byte[] b() {
            return Longs.toByteArray((long)this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "salt;signature", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "salt;signature", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "salt;signature", "b", "c"}, this, $$0);
        }

        public long c() {
            return this.b;
        }

        public byte[] d() {
            return this.c;
        }
    }

    public static class c {
        private static final SecureRandom a = new SecureRandom();

        public static long a() {
            return a.nextLong();
        }
    }
}

