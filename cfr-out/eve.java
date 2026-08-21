/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class eve {
    final evd a;
    private final je<fke.a> b;
    private final euw c;
    private final dxx.f d;
    private final evi e;
    private final evd f;
    private final evd g;
    private final Map<amt<fke.a>, fke> h;
    private final Map<amo, evd> i;

    public static eve a(je.a $$0, amt<euv> $$1, long $$2) {
        return eve.a($$0.b(mj.bl).b($$1).a(), $$0.b(mj.bm), $$2);
    }

    public static eve a(euv $$0, je<fke.a> $$1, long $$2) {
        return new eve($$0, $$1, $$2);
    }

    private eve(euv $$0, je<fke.a> $$1, final long $$2) {
        this.a = $$0.d().a($$2).e();
        this.b = $$1;
        this.f = this.a.a(amo.b("aquifer")).e();
        this.g = this.a.a(amo.b("ore")).e();
        this.h = new ConcurrentHashMap<amt<fke.a>, fke>();
        this.i = new ConcurrentHashMap<amo, evd>();
        this.e = new evi(this, $$0.g(), $$0.l(), this.a);
        final boolean $$3 = $$0.n();
        class A
        implements euj.f {
            private final Map<euj, euj> d = new HashMap<euj, euj>();

            A() {
            }

            private bgr a(long $$0) {
                return new eur($$2 + $$0);
            }

            @Override
            public euj.c a(euj.c $$0) {
                jd<fke.a> $$1 = $$0.b();
                if ($$3) {
                    if ($$1.a(euz.a)) {
                        fke $$22 = fke.a(this.a(0L), new fke.a(-7, 1.0, 1.0));
                        return new euj.c($$1, $$22);
                    }
                    if ($$1.a(euz.b)) {
                        fke $$32 = fke.a(this.a(1L), new fke.a(-7, 1.0, 1.0));
                        return new euj.c($$1, $$32);
                    }
                    if ($$1.a(euz.j)) {
                        fke $$4 = fke.b(eve.this.a.a(euz.j.a()), new fke.a(0, 0.0, new double[0]));
                        return new euj.c($$1, $$4);
                    }
                }
                fke $$5 = eve.this.a($$1.e().orElseThrow());
                return new euj.c($$1, $$5);
            }

            private euj a(euj $$0) {
                if ($$0 instanceof fkb) {
                    fkb $$1 = (fkb)$$0;
                    bgr $$22 = $$3 ? this.a(0L) : eve.this.a.a(amo.b("terrain"));
                    return $$1.a($$22);
                }
                if ($$0 instanceof euk.i) {
                    return new euk.i($$2);
                }
                return $$0;
            }

            @Override
            public euj apply(euj $$0) {
                return this.d.computeIfAbsent($$0, this::a);
            }
        }
        this.c = $$0.i().a(new A());
        euj.f $$4 = new euj.f(this){
            private final Map<euj, euj> a = new HashMap<euj, euj>();

            private euj a(euj $$0) {
                if ($$0 instanceof euk.k) {
                    euk.k $$1 = (euk.k)$$0;
                    return $$1.k().a();
                }
                if ($$0 instanceof euk.m) {
                    euk.m $$2 = (euk.m)$$0;
                    return $$2.l();
                }
                return $$0;
            }

            @Override
            public euj apply(euj $$0) {
                return this.a.computeIfAbsent($$0, this::a);
            }
        };
        this.d = new dxx.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
    }

    public fke a(amt<fke.a> $$0) {
        return this.h.computeIfAbsent($$0, $$1 -> euz.a(this.b, this.a, $$0));
    }

    public evd a(amo $$0) {
        return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
    }

    public euw a() {
        return this.c;
    }

    public dxx.f b() {
        return this.d;
    }

    public evi c() {
        return this.e;
    }

    public evd d() {
        return this.f;
    }

    public evd e() {
        return this.g;
    }
}

