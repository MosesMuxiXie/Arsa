/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class agx
implements aay<adb> {
    public static final aao<wx, agx> a = aay.a(agx::a, agx::new);
    private final int b;
    private final int[] c;

    public agx(cgk $$0) {
        this.b = $$0.aA();
        List<cgk> $$1 = $$0.dn();
        this.c = new int[$$1.size()];
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            this.c[$$2] = $$1.get($$2).aA();
        }
    }

    private agx(wx $$0) {
        this.b = $$0.l();
        this.c = $$0.c();
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.a(this.c);
    }

    @Override
    public aba<agx> a() {
        return ahz.aS;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int[] b() {
        return this.c;
    }

    public int e() {
        return this.b;
    }
}

