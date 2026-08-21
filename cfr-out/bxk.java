/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public abstract class bxk<T> {
    protected final bxe<T> a;
    private final Set<UUID> b = new ObjectOpenHashSet();

    public bxk(bxe<T> $$0) {
        this.a = $$0;
    }

    public final void a(axf $$0) {
        for (axg $$12 : $$0.E()) {
            boolean $$2 = this.b.contains($$12.cY());
            boolean $$3 = $$12.an().contains(this.a);
            if ($$3 == $$2) continue;
            if ($$3) {
                this.a($$12);
                continue;
            }
            this.b.remove($$12.cY());
        }
        this.b.removeIf($$1 -> $$0.c((UUID)$$1) == null);
        if (!this.b.isEmpty()) {
            this.b($$0);
        }
    }

    private void a(axg $$0) {
        this.b.add($$0.cY());
        $$0.X().a((dvu $$1) -> {
            if (!$$0.g.h.a($$1.b())) {
                this.a($$0, (dvu)$$1);
            }
        });
        $$0.A().p().a.a($$0, (cgk $$1) -> this.a($$0, (cgk)$$1));
    }

    protected final void a(axf $$0, dvu $$1, aay<? super adb> $$2) {
        awj $$3 = $$0.p().a;
        for (UUID $$4 : this.b) {
            axg $$5;
            ddm ddm2 = $$0.c($$4);
            if (!(ddm2 instanceof axg) || !$$3.a($$5 = (axg)ddm2, $$1.h, $$1.i)) continue;
            $$5.g.b($$2);
        }
    }

    protected final void a(axf $$02, cgk $$1, aay<? super adb> $$2) {
        awj $$3 = $$02.p().a;
        $$3.a($$1, $$2, (axg $$0) -> this.b.contains($$0.cY()));
    }

    public final void a(axg $$0, dvu $$1) {
        if (this.b.contains($$0.cY())) {
            this.b($$0, $$1);
        }
    }

    public final void a(axg $$0, cgk $$1) {
        if (this.b.contains($$0.cY())) {
            this.b($$0, $$1);
        }
    }

    protected void a() {
    }

    protected void b(axf $$0) {
    }

    protected void b(axg $$0, dvu $$1) {
    }

    protected void b(axg $$0, cgk $$1) {
    }

    public static class d
    extends bxk<bhr> {
        public d() {
            super(bxf.k);
        }

        @Override
        protected void b(axg $$02, dvu $$1) {
            axf $$2 = $$02.A();
            csx $$3 = $$2.F();
            $$3.a((jd<cta> $$0) -> true, $$1, csx.b.c).forEach($$22 -> {
                jw $$3 = jw.a($$22.g());
                d.a($$2, $$3, ($$1, $$2) -> {
                    is $$3 = $$1.k();
                    $$0.g.b(new aeb($$3, this.a.a($$2 != false ? bhr.a : null)));
                });
            });
        }

        public void a(axf $$0, csy $$1) {
            this.b($$0, $$1.g());
        }

        public void a(axf $$0, is $$1) {
            this.b($$0, $$1);
        }

        private void b(axf $$0, is $$12) {
            d.a($$0, jw.a($$12), ($$1, $$2) -> {
                is $$3 = $$1.k();
                if ($$2.booleanValue()) {
                    this.a($$0, new dvu($$3), (aay<adb>)new aeb($$3, this.a.a(bhr.a)));
                } else {
                    this.a($$0, new dvu($$3), (aay<adb>)new aeb($$3, this.a.a()));
                }
            });
        }

        private static void a(axf $$0, jw $$1, BiConsumer<jw, Boolean> $$2) {
            for (int $$3 = -1; $$3 <= 1; ++$$3) {
                for (int $$4 = -1; $$4 <= 1; ++$$4) {
                    for (int $$5 = -1; $$5 <= 1; ++$$5) {
                        jw $$6 = $$1.d($$4, $$5, $$3);
                        if ($$0.e($$6.k())) {
                            $$2.accept($$6, true);
                            continue;
                        }
                        $$2.accept($$6, false);
                    }
                }
            }
        }
    }

    public static class a
    extends bxk<bxc> {
        public a() {
            super(bxf.i);
        }

        @Override
        protected void b(axg $$02, dvu $$12) {
            axf $$2 = $$02.A();
            csx $$3 = $$2.F();
            $$3.a((jd<cta> $$0) -> true, $$12, csx.b.c).forEach($$1 -> $$0.g.b(new aeb($$1.g(), this.a.a(new bxc((csy)$$1)))));
        }

        public void a(axf $$0, csy $$1) {
            this.a($$0, new dvu($$1.g()), (aay<adb>)new aeb($$1.g(), this.a.a(new bxc($$1))));
        }

        public void a(axf $$0, is $$1) {
            this.a($$0, new dvu($$1), (aay<adb>)new aeb($$1, this.a.a()));
        }

        public void b(axf $$0, is $$1) {
            this.a($$0, new dvu($$1), (aay<adb>)new aeb($$1, this.a.a($$0.F().d($$1))));
        }
    }

    static class c<T> {
        private final bxh.b<T> a;
        @Nullable T b;

        c(bxh.b<T> $$0) {
            this.a = $$0;
        }

        public @Nullable bxe.b<T> a(bxe<T> $$0) {
            T $$1 = this.a.get();
            if (!Objects.equals($$1, this.b)) {
                this.b = $$1;
                return $$0.a($$1);
            }
            return null;
        }
    }

    public static class b<T>
    extends bxk<T> {
        private final Map<dvu, c<T>> b = new HashMap<dvu, c<T>>();
        private final Map<is, c<T>> c = new HashMap<is, c<T>>();
        private final Map<UUID, c<T>> d = new HashMap<UUID, c<T>>();

        public b(bxe<T> $$0) {
            super($$0);
        }

        @Override
        protected void a() {
            this.b.clear();
            this.c.clear();
            this.d.clear();
        }

        @Override
        protected void b(axf $$0) {
            for (Map.Entry<dvu, c<T>> entry : this.b.entrySet()) {
                bxe.b<T> $$2 = entry.getValue().a(this.a);
                if ($$2 == null) continue;
                dvu $$3 = entry.getKey();
                this.a($$0, $$3, (aay<adb>)new aec($$3, $$2));
            }
            for (Map.Entry<Object, c<T>> entry : this.c.entrySet()) {
                bxe.b<T> $$5 = entry.getValue().a(this.a);
                if ($$5 == null) continue;
                is $$6 = (is)entry.getKey();
                dvu $$7 = new dvu($$6);
                this.a($$0, $$7, (aay<adb>)new aeb($$6, $$5));
            }
            for (Map.Entry<Object, c<T>> entry : this.d.entrySet()) {
                bxe.b<T> $$9 = entry.getValue().a(this.a);
                if ($$9 == null) continue;
                cgk $$10 = Objects.requireNonNull($$0.d((UUID)entry.getKey()));
                this.a($$0, $$10, (aay<adb>)new aed($$10.aA(), $$9));
            }
        }

        public void a(dvu $$0, bxh.b<T> $$1) {
            this.b.put($$0, new c<T>($$1));
        }

        public void a(is $$0, bxh.b<T> $$1) {
            this.c.put($$0, new c<T>($$1));
        }

        public void a(UUID $$0, bxh.b<T> $$1) {
            this.d.put($$0, new c<T>($$1));
        }

        public void a(dvu $$0) {
            this.b.remove($$0);
            this.c.keySet().removeIf($$0::b);
        }

        public void a(axf $$0, is $$1) {
            c<T> $$2 = this.c.remove($$1);
            if ($$2 != null) {
                dvu $$3 = new dvu($$1);
                this.a($$0, $$3, (aay<adb>)new aeb($$1, this.a.a()));
            }
        }

        public void a(cgk $$0) {
            this.d.remove($$0.cY());
        }

        @Override
        protected void b(axg $$0, dvu $$1) {
            c<T> $$2 = this.b.get($$1);
            if ($$2 != null && $$2.b != null) {
                $$0.g.b(new aec($$1, this.a.a($$2.b)));
            }
            for (Map.Entry<is, c<T>> $$3 : this.c.entrySet()) {
                is $$5;
                Object $$4 = $$3.getValue().b;
                if ($$4 == null || !$$1.b($$5 = $$3.getKey())) continue;
                $$0.g.b(new aeb($$5, this.a.a($$4)));
            }
        }

        @Override
        protected void b(axg $$0, cgk $$1) {
            c<T> $$2 = this.d.get($$1.cY());
            if ($$2 != null && $$2.b != null) {
                $$0.g.b(new aed($$1.aA(), this.a.a($$2.b)));
            }
        }
    }
}

