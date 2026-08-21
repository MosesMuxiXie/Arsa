/*
 * Decompiled with CFR 0.152.
 */
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class akz
implements aay<akw> {
    public static final aao<wx, akz> a = aay.a(akz::a, akz::new);
    private final byte[] b;
    private final byte[] c;

    public akz(SecretKey $$0, PublicKey $$1, byte[] $$2) throws bfc {
        this.b = bfb.a($$1, $$0.getEncoded());
        this.c = bfb.a($$1, $$2);
    }

    private akz(wx $$0) {
        this.b = $$0.b();
        this.c = $$0.b();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
    }

    @Override
    public aba<akz> a() {
        return aku.h;
    }

    @Override
    public void a(akw $$0) {
        $$0.a(this);
    }

    public SecretKey a(PrivateKey $$0) throws bfc {
        return bfb.a($$0, this.b);
    }

    public boolean a(byte[] $$0, PrivateKey $$1) {
        try {
            return Arrays.equals($$0, bfb.b($$1, this.c));
        }
        catch (bfc $$2) {
            return false;
        }
    }
}

