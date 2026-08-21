/*
 * Decompiled with CFR 0.152.
 */
import java.security.PublicKey;

public class akq
implements aay<ako> {
    public static final aao<wx, akq> a = aay.a(akq::a, akq::new);
    private final String b;
    private final byte[] c;
    private final byte[] d;
    private final boolean e;

    public akq(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    private akq(wx $$0) {
        this.b = $$0.d(20);
        this.c = $$0.b();
        this.d = $$0.b();
        this.e = $$0.readBoolean();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
        $$0.a(this.d);
        $$0.a(this.e);
    }

    @Override
    public aba<akq> a() {
        return aku.c;
    }

    @Override
    public void a(ako $$0) {
        $$0.a(this);
    }

    public String b() {
        return this.b;
    }

    public PublicKey e() throws bfc {
        return bfb.a(this.c);
    }

    public byte[] f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }
}

