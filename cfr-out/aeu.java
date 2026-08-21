/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.BitSet;
import org.jspecify.annotations.Nullable;

public class aeu
implements aay<adb> {
    public static final aao<wx, aeu> a = aay.a(aeu::a, aeu::new);
    private final int b;
    private final int c;
    private final aev d;

    public aeu(dvu $$0, fkq $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
        this.b = $$0.h;
        this.c = $$0.i;
        this.d = new aev($$0, $$1, $$2, $$3);
    }

    private aeu(wx $$0) {
        this.b = $$0.l();
        this.c = $$0.l();
        this.d = new aev($$0, this.b, this.c);
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.c(this.c);
        this.d.a($$0);
    }

    @Override
    public aba<aeu> a() {
        return ahz.S;
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

    public aev f() {
        return this.d;
    }
}

