/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bxi {
    private final axf a;
    private final List<bxk<?>> b = new ArrayList();
    private final Map<bxe<?>, bxk.b<?>> c = new HashMap();
    private final bxk.a d = new bxk.a();
    private final bxk.d e = new bxk.d();
    private boolean f = true;
    private Set<bxe<?>> g = Set.of();

    public bxi(axf $$0) {
        this.a = $$0;
        for (bxe bxe2 : mi.f) {
            if (bxe2.b() == null) continue;
            this.c.put(bxe2, new bxk.b(bxe2));
        }
        this.b.addAll(this.c.values());
        this.b.add(this.d);
        this.b.add(this.e);
    }

    public void a(bxj $$0) {
        this.g = $$0.b();
        boolean $$1 = this.g.isEmpty();
        if (this.f != $$1) {
            this.f = $$1;
            if ($$1) {
                for (bxk<?> $$2 : this.b) {
                    $$2.a();
                }
            } else {
                this.a();
            }
        }
        if (!this.f) {
            for (bxk<?> $$3 : this.b) {
                $$3.a(this.a);
            }
        }
    }

    private void a() {
        awj $$0 = this.a.p().a;
        $$0.b(this::a);
        for (cgk $$1 : this.a.H()) {
            if (!$$0.c($$1)) continue;
            this.a($$1);
        }
    }

    <T> bxk.b<T> b(bxe<T> $$0) {
        return this.c.get($$0);
    }

    public void a(final eqq $$0) {
        if (this.f) {
            return;
        }
        $$0.a(this.a, new bxh.a(){

            @Override
            public <T> void a(bxe<T> $$02, bxh.b<T> $$1) {
                bxi.this.b($$02).a($$0.f(), $$1);
            }
        });
        $$0.J().values().forEach(this::a);
    }

    public void a(dvu $$0) {
        if (this.f) {
            return;
        }
        for (bxk.b<?> $$1 : this.c.values()) {
            $$1.a($$0);
        }
    }

    public void a(final elb $$0) {
        if (this.f) {
            return;
        }
        $$0.a(this.a, new bxh.a(){

            @Override
            public <T> void a(bxe<T> $$02, bxh.b<T> $$1) {
                bxi.this.b($$02).a($$0.aD_(), $$1);
            }
        });
    }

    public void a(is $$0) {
        if (this.f) {
            return;
        }
        for (bxk.b<?> $$1 : this.c.values()) {
            $$1.a(this.a, $$0);
        }
    }

    public void a(final cgk $$0) {
        if (this.f) {
            return;
        }
        $$0.a(this.a, new bxh.a(){

            @Override
            public <T> void a(bxe<T> $$02, bxh.b<T> $$1) {
                bxi.this.b($$02).a($$0.cY(), $$1);
            }
        });
    }

    public void b(cgk $$0) {
        if (this.f) {
            return;
        }
        for (bxk.b<?> $$1 : this.c.values()) {
            $$1.a($$0);
        }
    }

    public void a(axg $$0, dvu $$1) {
        if (this.f) {
            return;
        }
        for (bxk<?> $$2 : this.b) {
            $$2.a($$0, $$1);
        }
    }

    public void a(axg $$0, cgk $$1) {
        if (this.f) {
            return;
        }
        for (bxk<?> $$2 : this.b) {
            $$2.a($$0, $$1);
        }
    }

    public void a(csy $$0) {
        if (this.f) {
            return;
        }
        this.d.a(this.a, $$0);
        this.e.a(this.a, $$0);
    }

    public void b(is $$0) {
        if (this.f) {
            return;
        }
        this.d.b(this.a, $$0);
    }

    public void c(is $$0) {
        if (this.f) {
            return;
        }
        this.d.a(this.a, $$0);
        this.e.a(this.a, $$0);
    }

    public boolean a(bxe<?> $$0) {
        return this.g.contains($$0);
    }

    public <T> void a(is $$0, bxe<T> $$1, T $$2) {
        if (this.a($$1)) {
            this.a(new dvu($$0), $$1, (aay<? super adb>)new aeb($$0, $$1.a($$2)));
        }
    }

    public <T> void a(is $$0, bxe<T> $$1) {
        if (this.a($$1)) {
            this.a(new dvu($$0), $$1, (aay<? super adb>)new aeb($$0, $$1.a()));
        }
    }

    public <T> void a(cgk $$0, bxe<T> $$1, T $$2) {
        if (this.a($$1)) {
            this.a($$0, $$1, (aay<? super adb>)new aed($$0.aA(), $$1.a($$2)));
        }
    }

    public <T> void a(cgk $$0, bxe<T> $$1) {
        if (this.a($$1)) {
            this.a($$0, $$1, (aay<? super adb>)new aed($$0.aA(), $$1.a()));
        }
    }

    public <T> void b(is $$0, bxe<T> $$1, T $$2) {
        if (this.a($$1)) {
            this.a(new dvu($$0), $$1, (aay<? super adb>)new aee($$1.b($$2)));
        }
    }

    private void a(dvu $$0, bxe<?> $$1, aay<? super adb> $$2) {
        awj $$3 = this.a.p().a;
        for (axg $$4 : $$3.a($$0, false)) {
            if (!$$4.an().contains($$1)) continue;
            $$4.g.b($$2);
        }
    }

    private void a(cgk $$0, bxe<?> $$12, aay<? super adb> $$2) {
        awj $$3 = this.a.p().a;
        $$3.a($$0, $$2, (axg $$1) -> $$1.an().contains($$12));
    }
}

