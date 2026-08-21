/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class ajv
implements aay<aib> {
    public static final aao<wx, ajv> a = aay.a(ajv::a, ajv::new);
    private final int b;
    private final String c;
    private final boolean d;

    public ajv(int $$0, String $$1, boolean $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    private ajv(wx $$0) {
        this.b = $$0.l();
        this.c = $$0.p();
        this.d = $$0.readBoolean();
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.a(this.c);
        $$0.a(this.d);
    }

    @Override
    public aba<ajv> a() {
        return ahz.cl;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public @Nullable dvo a(dwo $$0) {
        cgk $$1 = $$0.a(this.b);
        if ($$1 instanceof dgn) {
            return ((dgn)$$1).e();
        }
        return null;
    }

    public String b() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }
}

