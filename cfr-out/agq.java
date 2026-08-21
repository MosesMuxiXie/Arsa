/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class agq
implements aay<adb> {
    public static final aao<wx, agq> a = aay.a(agq::a, agq::new);
    private final int b;
    private final int c;

    public agq(cgk $$0, @Nullable cgk $$1) {
        this.b = $$0.aA();
        this.c = $$1 != null ? $$1.aA() : 0;
    }

    private agq(wx $$0) {
        this.b = $$0.readInt();
        this.c = $$0.readInt();
    }

    @Override
    private void a(wx $$0) {
        $$0.q(this.b);
        $$0.q(this.c);
    }

    @Override
    public aba<agq> a() {
        return ahz.aL;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }
}

