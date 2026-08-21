/*
 * Decompiled with CFR 0.152.
 */
import java.security.SignatureException;

@FunctionalInterface
public interface bgv {
    public void update(a var1) throws SignatureException;

    @FunctionalInterface
    public static interface a {
        public void update(byte[] var1) throws SignatureException;
    }
}

