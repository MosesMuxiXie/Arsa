/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;

public abstract sealed class esj
extends Enum<esj> {
    public static final /* enum */ esj a = new esj(){

        @Override
        public void a(axf $$0, esk $$1, List<cyb> $$2, int $$3, is $$4) {
            is $$5 = new is(0, 128, 0);
            for (cyb $$6 : $$2) {
                $$6.a($$5);
            }
            $$1.a(b);
        }
    };
    public static final /* enum */ esj b = new esj(){

        @Override
        public void a(axf $$0, esk $$1, List<cyb> $$2, int $$3, is $$4) {
            if ($$3 < 100) {
                if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
                    $$0.c(3001, new is(0, 128, 0), 0);
                }
            } else {
                $$1.a(c);
            }
        }
    };
    public static final /* enum */ esj c = new esj(){

        @Override
        public void a(axf $$0, esk $$1, List<cyb> $$2, int $$3, is $$4) {
            boolean $$7;
            int $$5 = 40;
            boolean $$6 = $$3 % 40 == 0;
            boolean bl2 = $$7 = $$3 % 40 == 39;
            if ($$6 || $$7) {
                int $$9 = $$3 / 40;
                List<ezh.a> $$8 = ezh.a($$0);
                if ($$9 < $$8.size()) {
                    ezh.a $$10 = $$8.get($$9);
                    if ($$6) {
                        for (cyb $$11 : $$2) {
                            $$11.a(new is($$10.a(), $$10.d() + 1, $$10.b()));
                        }
                    } else {
                        int $$12 = 10;
                        for (is $$13 : is.c(new is($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new is($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                            $$0.a($$13, false);
                        }
                        $$0.a(null, (double)((float)$$10.a() + 0.5f), (double)$$10.d(), (double)((float)$$10.b() + 0.5f), 5.0f, dwo.a.b);
                        faw $$14 = new faw(true, (List<ezh.a>)ImmutableList.of((Object)$$10), new is(0, 128, 0));
                        exx.L.a($$14, $$0, $$0.p().g(), bgr.a(), new is($$10.a(), 45, $$10.b()));
                    }
                } else if ($$6) {
                    $$1.a(d);
                }
            }
        }
    };
    public static final /* enum */ esj d = new esj(){

        @Override
        public void a(axf $$0, esk $$1, List<cyb> $$2, int $$3, is $$4) {
            if ($$3 >= 100) {
                $$1.a(e);
                $$1.h();
                for (cyb $$5 : $$2) {
                    $$5.a((is)null);
                    $$0.a((cgk)$$5, $$5.dP(), $$5.dR(), $$5.dV(), 6.0f, dwo.a.a);
                    $$5.aC();
                }
            } else if ($$3 >= 80) {
                $$0.c(3001, new is(0, 128, 0), 0);
            } else if ($$3 == 0) {
                for (cyb $$6 : $$2) {
                    $$6.a(new is(0, 128, 0));
                }
            } else if ($$3 < 5) {
                $$0.c(3001, new is(0, 128, 0), 0);
            }
        }
    };
    public static final /* enum */ esj e = new esj(){

        @Override
        public void a(axf $$0, esk $$1, List<cyb> $$2, int $$3, is $$4) {
        }
    };
    private static final /* synthetic */ esj[] f;

    public static esj[] values() {
        return (esj[])f.clone();
    }

    public static esj valueOf(String $$0) {
        return Enum.valueOf(esj.class, $$0);
    }

    public abstract void a(axf var1, esk var2, List<cyb> var3, int var4, is var5);

    private static /* synthetic */ esj[] a() {
        return new esj[]{a, b, c, d, e};
    }

    static {
        f = esj.a();
    }
}

