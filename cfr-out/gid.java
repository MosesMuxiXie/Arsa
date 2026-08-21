/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class gid {
    public static final a a = gid.a(gib::a, gia.c);
    public static final a b = gid.a(gib::a, gia.d);
    public static final a c = gid.a(gib::a, gia.e);
    public static final a d = gid.a(gib::n, gia.j);
    public static final a e = gid.a(gib::n, gia.k);
    public static final a f = gid.a(gib::t, gia.n);
    public static final a g = gid.a(gib::o, gia.m);
    public static final a h = gid.a(gib::E, gia.p);
    public static final a i = gid.a(gib::D, gia.q);
    public static final a j = gid.a(gib::i, gia.ay);
    public static final a k = gid.a(gib::d, gia.az);
    public static final a l = gid.a(gib::j, gia.aA);
    public static final a m = gid.a(gib::j, gia.aB);
    public static final a n = gid.a(gib::j, gia.aC);
    public static final a o = gid.a(gib::j, gia.aD);
    public static final a p = gid.a(gib::b, gia.aE);
    public static final a q = gid.a(gib::b, gia.aF);
    public static final a r = gid.a(gib::b, gia.aG);
    public static final a s = gid.a(gib::b, gia.aH);
    public static final a t = gid.a(gib::l, gia.aK);
    public static final a u = gid.a(gib::m, gia.aI);
    public static final a v = gid.a(gib::G, gia.bg);
    public static final a w = gid.a(gib::a, gia.ad);
    public static final a x = gid.a(gib::A, gia.br);
    public static final a y = gid.a(gib::A, gia.bs);
    public static final a z = gid.a(gib::b, gia.bt);
    public static final a A = gid.a(gib::b, gia.bJ);
    public static final a B = gid.a(gib::q, gia.j);
    public static final a C = gid.a(gib::q, gia.k);
    public static final a D = gid.a(gib::u, gia.n);
    public static final a E = gid.a(gib::v, gia.j);
    private final gib F;
    private final ghz G;

    private gid(gib $$0, ghz $$1) {
        this.F = $$0;
        this.G = $$1;
    }

    public ghz a() {
        return this.G;
    }

    public gib b() {
        return this.F;
    }

    public gid a(Consumer<gib> $$0) {
        $$0.accept(this.F);
        return this;
    }

    public amo a(dzq $$0, BiConsumer<amo, ghx> $$1) {
        return this.G.a($$0, this.F, $$1);
    }

    public amo a(dzq $$0, String $$1, BiConsumer<amo, ghx> $$2) {
        return this.G.a($$0, $$1, this.F, $$2);
    }

    private static a a(Function<dzq, gib> $$0, ghz $$1) {
        return $$2 -> new gid((gib)$$0.apply($$2), $$1);
    }

    public static gid a(amo $$0) {
        return new gid(gib.b($$0), gia.c);
    }

    @FunctionalInterface
    public static interface a {
        public gid get(dzq var1);

        default public amo create(dzq $$0, BiConsumer<amo, ghx> $$1) {
            return this.get($$0).a($$0, $$1);
        }

        default public amo createWithSuffix(dzq $$0, String $$1, BiConsumer<amo, ghx> $$2) {
            return this.get($$0).a($$0, $$1, $$2);
        }

        default public a updateTexture(Consumer<gib> $$0) {
            return $$1 -> this.get($$1).a($$0);
        }
    }
}

