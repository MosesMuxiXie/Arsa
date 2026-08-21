/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class fkv
extends fkp<a> {
    protected fkv(eqt $$0) {
        super(dww.a, $$0, new a((Long2ObjectOpenHashMap<eql>)new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
    }

    @Override
    protected int a(long $$0) {
        return this.e($$0, false);
    }

    protected int e(long $$0, boolean $$1) {
        long $$2 = jw.e($$0);
        int $$3 = jw.c($$2);
        a $$4 = $$1 ? (a)this.d : (a)this.c;
        int $$5 = $$4.c.get(jw.f($$2));
        if ($$5 == $$4.b || $$3 >= $$5) {
            if ($$1 && !this.j($$2)) {
                return 0;
            }
            return 15;
        }
        eql $$6 = this.a($$4, $$2);
        if ($$6 == null) {
            $$0 = is.e($$0);
            while ($$6 == null) {
                if (++$$3 >= $$5) {
                    return 15;
                }
                $$2 = jw.a($$2, iz.b);
                $$6 = this.a($$4, $$2);
            }
        }
        return $$6.a(jw.b(is.a($$0)), jw.b(is.b($$0)), jw.b(is.c($$0)));
    }

    @Override
    protected void h(long $$0) {
        long $$2;
        int $$3;
        int $$1 = jw.c($$0);
        if (((a)this.d).b > $$1) {
            ((a)this.d).b = $$1;
            ((a)this.d).c.defaultReturnValue(((a)this.d).b);
        }
        if (($$3 = ((a)this.d).c.get($$2 = jw.f($$0))) < $$1 + 1) {
            ((a)this.d).c.put($$2, $$1 + 1);
        }
    }

    @Override
    protected void i(long $$0) {
        long $$1 = jw.f($$0);
        int $$2 = jw.c($$0);
        if (((a)this.d).c.get($$1) == $$2 + 1) {
            long $$3 = $$0;
            while (!this.b($$3) && this.a($$2)) {
                --$$2;
                $$3 = jw.a($$3, iz.a);
            }
            if (this.b($$3)) {
                ((a)this.d).c.put($$1, $$2 + 1);
            } else {
                ((a)this.d).c.remove($$1);
            }
        }
    }

    @Override
    protected eql g(long $$0) {
        eql $$4;
        eql $$1 = (eql)this.g.get($$0);
        if ($$1 != null) {
            return $$1;
        }
        int $$2 = ((a)this.d).c.get(jw.f($$0));
        if ($$2 == ((a)this.d).b || jw.c($$0) >= $$2) {
            if (this.j($$0)) {
                return new eql(15);
            }
            return new eql();
        }
        long $$3 = jw.a($$0, iz.b);
        while (($$4 = this.a($$3, true)) == null) {
            $$3 = jw.a($$3, iz.b);
        }
        return fkv.a($$4);
    }

    private static eql a(eql $$0) {
        if ($$0.c()) {
            return $$0.b();
        }
        byte[] $$1 = $$0.a();
        byte[] $$2 = new byte[2048];
        for (int $$3 = 0; $$3 < 16; ++$$3) {
            System.arraycopy($$1, 0, $$2, $$3 * 128, 128);
        }
        return new eql($$2);
    }

    protected boolean a(int $$0) {
        return $$0 >= ((a)this.d).b;
    }

    protected boolean m(long $$0) {
        long $$1 = jw.f($$0);
        int $$2 = ((a)this.d).c.get($$1);
        return $$2 == ((a)this.d).b || jw.c($$0) >= $$2;
    }

    protected int n(long $$0) {
        return ((a)this.d).c.get($$0);
    }

    protected int c() {
        return ((a)this.d).b;
    }

    protected static final class a
    extends fkm<a> {
        int b;
        final Long2IntOpenHashMap c;

        public a(Long2ObjectOpenHashMap<eql> $$0, Long2IntOpenHashMap $$1, int $$2) {
            super($$0);
            this.c = $$1;
            $$1.defaultReturnValue($$2);
            this.b = $$2;
        }

        public a a() {
            return new a((Long2ObjectOpenHashMap<eql>)this.a.clone(), this.c.clone(), this.b);
        }

        @Override
        public /* synthetic */ fkm b() {
            return this.a();
        }
    }
}

