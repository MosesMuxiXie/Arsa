/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class gv {
    public static final int a = Integer.MAX_VALUE;
    public static final BiConsumer<ftm, List<? extends cgk>> b = ($$0, $$1) -> {};
    private static final esw<cgk, ?> c = new esw<cgk, cgk>(){

        @Override
        public cgk a(cgk $$0) {
            return $$0;
        }

        @Override
        public Class<? extends cgk> a() {
            return cgk.class;
        }
    };
    private final int d;
    private final boolean e;
    private final boolean f;
    private final List<Predicate<cgk>> g;
    private final @Nullable cq.b h;
    private final Function<ftm, ftm> i;
    private final @Nullable fth j;
    private final BiConsumer<ftm, List<? extends cgk>> k;
    private final boolean l;
    private final @Nullable String m;
    private final @Nullable UUID n;
    private final esw<cgk, ?> o;
    private final boolean p;

    public gv(int $$0, boolean $$1, boolean $$2, List<Predicate<cgk>> $$3, @Nullable cq.b $$4, Function<ftm, ftm> $$5, @Nullable fth $$6, BiConsumer<ftm, List<? extends cgk>> $$7, boolean $$8, @Nullable String $$9, @Nullable UUID $$10, @Nullable cgu<?> $$11, boolean $$12) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
        this.k = $$7;
        this.l = $$8;
        this.m = $$9;
        this.n = $$10;
        this.o = $$11 == null ? c : $$11;
        this.p = $$12;
    }

    public int a() {
        return this.d;
    }

    public boolean b() {
        return this.e;
    }

    public boolean c() {
        return this.l;
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        return this.p;
    }

    private void e(ed $$0) throws CommandSyntaxException {
        if (this.p && !$$0.d().hasPermission(bbr.e)) {
            throw eq.f.create();
        }
    }

    public cgk a(ed $$0) throws CommandSyntaxException {
        this.e($$0);
        List<? extends cgk> $$1 = this.b($$0);
        if ($$1.isEmpty()) {
            throw eq.d.create();
        }
        if ($$1.size() > 1) {
            throw eq.a.create();
        }
        return $$1.get(0);
    }

    public List<? extends cgk> b(ed $$0) throws CommandSyntaxException {
        this.e($$0);
        if (!this.e) {
            return this.d($$0);
        }
        if (this.m != null) {
            axg $$1 = $$0.m().aj().a(this.m);
            if ($$1 == null) {
                return List.of();
            }
            return List.of($$1);
        }
        if (this.n != null) {
            for (axf $$2 : $$0.m().P()) {
                cgk $$3 = $$2.d(this.n);
                if ($$3 == null) continue;
                if (!$$3.ay().a($$0.w())) break;
                return List.of($$3);
            }
            return List.of();
        }
        ftm $$4 = this.i.apply($$0.e());
        fth $$5 = this.a($$4);
        if (this.l) {
            Predicate<cgk> $$6 = this.a($$4, $$5, null);
            if ($$0.g() != null && $$6.test($$0.g())) {
                return List.of($$0.g());
            }
            return List.of();
        }
        Predicate<cgk> $$7 = this.a($$4, $$5, $$0.w());
        ObjectArrayList $$8 = new ObjectArrayList();
        if (this.d()) {
            this.a((List<cgk>)$$8, $$0.f(), $$5, $$7);
        } else {
            for (axf $$9 : $$0.m().P()) {
                this.a((List<cgk>)$$8, $$9, $$5, $$7);
            }
        }
        return this.a($$4, (List)$$8);
    }

    private void a(List<cgk> $$0, axf $$1, @Nullable fth $$2, Predicate<cgk> $$3) {
        int $$4 = this.f();
        if ($$0.size() >= $$4) {
            return;
        }
        if ($$2 != null) {
            $$1.a(this.o, $$2, $$3, $$0, $$4);
        } else {
            $$1.a(this.o, $$3, $$0, $$4);
        }
    }

    private int f() {
        return this.k == b ? this.d : Integer.MAX_VALUE;
    }

    public axg c(ed $$0) throws CommandSyntaxException {
        this.e($$0);
        List<axg> $$1 = this.d($$0);
        if ($$1.size() != 1) {
            throw eq.e.create();
        }
        return $$1.get(0);
    }

    public List<axg> d(ed $$0) throws CommandSyntaxException {
        ObjectArrayList $$9;
        this.e($$0);
        if (this.m != null) {
            axg $$1 = $$0.m().aj().a(this.m);
            if ($$1 == null) {
                return List.of();
            }
            return List.of($$1);
        }
        if (this.n != null) {
            axg $$2 = $$0.m().aj().b(this.n);
            if ($$2 == null) {
                return List.of();
            }
            return List.of($$2);
        }
        ftm $$3 = this.i.apply($$0.e());
        fth $$4 = this.a($$3);
        Predicate<cgk> $$5 = this.a($$3, $$4, null);
        if (this.l) {
            axg $$6;
            cgk cgk2 = $$0.g();
            if (cgk2 instanceof axg && $$5.test($$6 = (axg)cgk2)) {
                return List.of($$6);
            }
            return List.of();
        }
        int $$7 = this.f();
        if (this.d()) {
            List<axg> $$8 = $$0.f().a($$5, $$7);
        } else {
            $$9 = new ObjectArrayList();
            for (axg $$10 : $$0.m().aj().t()) {
                if (!$$5.test($$10)) continue;
                $$9.add($$10);
                if ($$9.size() < $$7) continue;
                return $$9;
            }
        }
        return this.a($$3, (List)$$9);
    }

    private @Nullable fth a(ftm $$0) {
        return this.j != null ? this.j.c($$0) : null;
    }

    private Predicate<cgk> a(ftm $$0, @Nullable fth $$12, @Nullable dgz $$2) {
        ObjectArrayList $$9;
        boolean $$5;
        boolean $$4;
        boolean $$3 = $$2 != null;
        int $$6 = ($$3 ? 1 : 0) + (($$4 = $$12 != null) ? 1 : 0) + (($$5 = this.h != null) ? 1 : 0);
        if ($$6 == 0) {
            List<Predicate<cgk>> $$7 = this.g;
        } else {
            ObjectArrayList $$8 = new ObjectArrayList(this.g.size() + $$6);
            $$8.addAll(this.g);
            if ($$3) {
                $$8.add($$1 -> $$1.ay().a($$2));
            }
            if ($$4) {
                $$8.add($$1 -> $$12.c($$1.dj()));
            }
            if ($$5) {
                $$8.add($$1 -> this.h.e($$1.g($$0)));
            }
            $$9 = $$8;
        }
        return bhs.a($$9);
    }

    private <T extends cgk> List<T> a(ftm $$0, List<T> $$1) {
        if ($$1.size() > 1) {
            this.k.accept($$0, $$1);
        }
        return $$1.subList(0, Math.min(this.d, $$1.size()));
    }

    public static yh a(List<? extends cgk> $$0) {
        return yk.b($$0, cgk::R_);
    }
}

