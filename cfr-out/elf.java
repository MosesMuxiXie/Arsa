/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Arrays;
import org.jspecify.annotations.Nullable;

public class elf
extends eku
implements cdp {
    private static final int g = 3;
    private static final int h = 4;
    private static final int[] i = new int[]{3};
    private static final int[] j = new int[]{0, 1, 2, 3};
    private static final int[] k = new int[]{0, 1, 2, 4};
    public static final int b = 20;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    private static final short l = 0;
    private static final byte m = 0;
    private static final yh q = yh.c("container.brewing");
    private jm<dlt> r = jm.a(5, dlt.l);
    int s;
    private boolean[] t;
    private dlp u;
    int v;
    protected final dhv f = new dhv(){

        @Override
        public int a(int $$0) {
            return switch ($$0) {
                case 0 -> elf.this.s;
                case 1 -> elf.this.v;
                default -> 0;
            };
        }

        @Override
        public void a(int $$0, int $$1) {
            switch ($$0) {
                case 0: {
                    elf.this.s = $$1;
                    break;
                }
                case 1: {
                    elf.this.v = $$1;
                }
            }
        }

        @Override
        public int a() {
            return 2;
        }
    };

    public elf(is $$0, eoh $$1) {
        super(eld.m, $$0, $$1);
    }

    @Override
    protected yh k() {
        return q;
    }

    @Override
    public int b() {
        return this.r.size();
    }

    @Override
    protected jm<dlt> g() {
        return this.r;
    }

    @Override
    protected void a(jm<dlt> $$0) {
        this.r = $$0;
    }

    public static void a(dwo $$0, is $$1, eoh $$2, elf $$3) {
        dlt $$4 = $$3.r.get(4);
        if ($$3.v <= 0 && $$4.a(bdy.ay)) {
            $$3.v = 20;
            $$4.h(1);
            elf.a($$0, $$1, $$2);
        }
        boolean $$5 = elf.a($$0.R(), $$3.r);
        boolean $$6 = $$3.s > 0;
        dlt $$7 = $$3.r.get(3);
        if ($$6) {
            boolean $$8;
            --$$3.s;
            boolean bl2 = $$8 = $$3.s == 0;
            if ($$8 && $$5) {
                elf.a($$0, $$1, $$3.r);
            } else if (!$$5 || !$$7.a($$3.u)) {
                $$3.s = 0;
            }
            elf.a($$0, $$1, $$2);
        } else if ($$5 && $$3.v > 0) {
            --$$3.v;
            $$3.s = 400;
            $$3.u = $$7.h();
            elf.a($$0, $$1, $$2);
        }
        boolean[] $$9 = $$3.h();
        if (!Arrays.equals($$9, $$3.t)) {
            $$3.t = $$9;
            eoh $$10 = $$2;
            if (!($$10.b() instanceof dzv)) {
                return;
            }
            for (int $$11 = 0; $$11 < dzv.b.length; ++$$11) {
                $$10 = (eoh)$$10.b(dzv.b[$$11], $$9[$$11]);
            }
            $$0.a($$1, $$10, 2);
        }
    }

    private boolean[] h() {
        boolean[] $$0 = new boolean[3];
        for (int $$1 = 0; $$1 < 3; ++$$1) {
            if (this.r.get($$1).f()) continue;
            $$0[$$1] = true;
        }
        return $$0;
    }

    private static boolean a(dnq $$0, jm<dlt> $$1) {
        dlt $$2 = $$1.get(3);
        if ($$2.f()) {
            return false;
        }
        if (!$$0.a($$2)) {
            return false;
        }
        for (int $$3 = 0; $$3 < 3; ++$$3) {
            dlt $$4 = $$1.get($$3);
            if ($$4.f() || !$$0.a($$4, $$2)) continue;
            return true;
        }
        return false;
    }

    private static void a(dwo $$0, is $$1, jm<dlt> $$2) {
        dlt $$3 = $$2.get(3);
        dnq $$4 = $$0.R();
        for (int $$5 = 0; $$5 < 3; ++$$5) {
            $$2.set($$5, $$4.d($$3, $$2.get($$5)));
        }
        $$3.h(1);
        dlt $$6 = $$3.h().i();
        if (!$$6.f()) {
            if ($$3.f()) {
                $$3 = $$6;
            } else {
                ccy.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            }
        }
        $$2.set(3, $$3);
        $$0.c(1035, $$1, 0);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.r = jm.a(this.b(), dlt.l);
        ccw.a($$0, this.r);
        this.s = $$0.a("BrewTime", (short)0);
        if (this.s > 0) {
            this.u = this.r.get(3).h();
        }
        this.v = $$0.a("Fuel", (byte)0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("BrewTime", (short)this.s);
        ccw.a($$0, this.r);
        $$0.a("Fuel", (byte)this.v);
    }

    @Override
    public boolean b(int $$0, dlt $$1) {
        if ($$0 == 3) {
            dnq $$2 = this.n != null ? this.n.R() : dnq.b;
            return $$2.a($$1);
        }
        if ($$0 == 4) {
            return $$1.a(bdy.ay);
        }
        return ($$1.a(dlx.up) || $$1.a(dlx.xD) || $$1.a(dlx.xG) || $$1.a(dlx.uo)) && this.a($$0).f();
    }

    @Override
    public int[] a(iz $$0) {
        if ($$0 == iz.b) {
            return i;
        }
        if ($$0 == iz.a) {
            return j;
        }
        return k;
    }

    @Override
    public boolean a(int $$0, dlt $$1, @Nullable iz $$2) {
        return this.b($$0, $$1);
    }

    @Override
    public boolean b(int $$0, dlt $$1, iz $$2) {
        if ($$0 == 3) {
            return $$1.a(dlx.uo);
        }
        return true;
    }

    @Override
    protected dhi a(int $$0, ddl $$1) {
        return new dhq($$0, $$1, this, this.f);
    }
}

