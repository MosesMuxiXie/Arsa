/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.BitSet;
import org.jspecify.annotations.Nullable;

public class aer
implements aay<adb> {
    public static final aao<xq, aer> a = aay.a(aer::a, aer::new);
    private final int b;
    private final int c;
    private final aeq d;
    private final aev e;

    public aer(eqq $$0, fkq $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
        dvu $$4 = $$0.f();
        this.b = $$4.h;
        this.c = $$4.i;
        this.d = new aeq($$0);
        this.e = new aev($$4, $$1, $$2, $$3);
    }

    private aer(xq $$0) {
        this.b = $$0.readInt();
        this.c = $$0.readInt();
        this.d = new aeq($$0, this.b, this.c);
        this.e = new aev($$0, this.b, this.c);
    }

    @Override
    private void a(xq $$0) {
        $$0.q(this.b);
        $$0.q(this.c);
        this.d.a($$0);
        this.e.a($$0);
    }

    @Override
    public aba<aer> a() {
        return ahz.P;
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

    public aeq f() {
        return this.d;
    }

    public aev g() {
        return this.e;
    }
}

