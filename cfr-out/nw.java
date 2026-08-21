/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public record nw(jf.a a) implements no
{
    private static final List<a> b = List.of(new a(fnv.be, cgu.aZ, dlx.wD), new a(fnv.bf, cgu.I, dlx.wB), new a(fnv.bg, cgu.bn, dlx.wx), new a(fnv.bh, cgu.bS, dlx.wy), new a(fnv.bi, cgu.bW, dlx.wA));

    @Override
    public void generate(BiConsumer<amt<fof>, fof.a> $$0) {
        jf.b<cgu<?>> $$1 = this.a.e(mj.F);
        ArrayList $$2 = new ArrayList(b.size());
        for (a $$3 : b) {
            $$0.accept($$3.a, fof.b().a(foe.a().a(fsf.a(1.0f)).a(fon.a($$3.c))));
            frm.a $$4 = frp.a(fnz.c.a, bs.a.a().a(bv.a($$1, $$3.b)));
            $$2.add(fou.a($$3.a).a($$4));
        }
        $$0.accept(fnv.bd, fof.b().a(foe.a().a(fsf.a(1.0f)).a(foh.a((foq.a[])$$2.toArray(foq.a[]::new)))));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nw.class, "registries", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nw.class, "registries", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nw.class, "registries", "a"}, this, $$0);
    }

    static final class a
    extends Record {
        final amt<fof> a;
        final cgu<?> b;
        final dlp c;

        a(amt<fof> $$0, cgu<?> $$1, dlp $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "lootTable;entityType;item", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "lootTable;entityType;item", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "lootTable;entityType;item", "a", "b", "c"}, this, $$0);
        }

        public amt<fof> a() {
            return this.a;
        }

        public cgu<?> b() {
            return this.b;
        }

        public dlp c() {
            return this.c;
        }
    }
}

