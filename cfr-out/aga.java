/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.shorts.ShortIterator
 *  it.unimi.dsi.fastutil.shorts.ShortSet
 */
import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class aga
implements aay<adb> {
    public static final aao<wx, aga> a = aay.a(aga::a, aga::new);
    private static final int b = 12;
    private final jw c;
    private final short[] d;
    private final eoh[] e;

    public aga(jw $$0, ShortSet $$1, eqr $$2) {
        this.c = $$0;
        int $$3 = $$1.size();
        this.d = new short[$$3];
        this.e = new eoh[$$3];
        int $$4 = 0;
        ShortIterator shortIterator = $$1.iterator();
        while (shortIterator.hasNext()) {
            short $$5;
            this.d[$$4] = $$5 = ((Short)shortIterator.next()).shortValue();
            this.e[$$4] = $$2.a(jw.a($$5), jw.b($$5), jw.c($$5));
            ++$$4;
        }
    }

    private aga(wx $$0) {
        this.c = (jw)jw.f.decode($$0);
        int $$1 = $$0.l();
        this.d = new short[$$1];
        this.e = new eoh[$$1];
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            long $$3 = $$0.m();
            this.d[$$2] = (short)($$3 & 0xFFFL);
            this.e[$$2] = dzq.k.a((int)($$3 >>> 12));
        }
    }

    @Override
    private void a(wx $$0) {
        jw.f.encode($$0, this.c);
        $$0.c(this.d.length);
        for (int $$1 = 0; $$1 < this.d.length; ++$$1) {
            $$0.a((long)dzq.j(this.e[$$1]) << 12 | (long)this.d[$$1]);
        }
    }

    @Override
    public aba<aga> a() {
        return ahz.aw;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public void a(BiConsumer<is, eoh> $$0) {
        is.a $$1 = new is.a();
        for (int $$2 = 0; $$2 < this.d.length; ++$$2) {
            short $$3 = this.d[$$2];
            $$1.d(this.c.d($$3), this.c.e($$3), this.c.f($$3));
            $$0.accept($$1, this.e[$$2]);
        }
    }
}

