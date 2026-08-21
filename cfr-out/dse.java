/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.stream.Stream;

public interface dse {
    public static final Codec<dse> a = mi.az.q().dispatch(dse::a, i::a);
    public static final aao<xq, dse> b = aam.a(mj.av).b(dse::a, i::b);

    public <T> Stream<T> a(bhx var1, drw<T> var2);

    public i<? extends dse> a();

    default public boolean a(dgz $$0) {
        return true;
    }

    default public List<dlt> a(bhx $$0) {
        return this.a($$0, e.a).toList();
    }

    default public dlt b(bhx $$0) {
        return this.a($$0, e.a).findFirst().orElse(dlt.l);
    }

    public static class e
    implements drw.b<dlt> {
        public static final e a = new e();

        public dlt b(dlt $$0) {
            return $$0;
        }

        @Override
        public /* synthetic */ Object a(dlt dlt2) {
            return this.b(dlt2);
        }
    }

    public static final class j
    extends Record
    implements dse {
        private final dse f;
        private final dse g;
        public static final MapCodec<j> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)a.fieldOf("input").forGetter(j::b), (App)a.fieldOf("remainder").forGetter(j::c)).apply((Applicative)$$0, j::new));
        public static final aao<xq, j> d = aao.a(b, j::b, b, j::c, j::new);
        public static final i<j> e = new i<j>(c, d);

        public j(dse $$0, dse $$1) {
            this.f = $$0;
            this.g = $$1;
        }

        public i<j> a() {
            return e;
        }

        @Override
        public <T> Stream<T> a(bhx $$0, drw<T> $$1) {
            if ($$1 instanceof drw.a) {
                drw.a $$22 = (drw.a)$$1;
                List $$3 = this.g.a($$0, $$1).toList();
                return this.f.a($$0, $$1).map($$2 -> $$22.a($$2, $$3));
            }
            return this.f.a($$0, $$1);
        }

        @Override
        public boolean a(dgz $$0) {
            return this.f.a($$0) && this.g.a($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{j.class, "input;remainder", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{j.class, "input;remainder", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{j.class, "input;remainder", "f", "g"}, this, $$0);
        }

        public dse b() {
            return this.f;
        }

        public dse c() {
            return this.g;
        }
    }

    public static final class b
    extends Record
    implements dse {
        private final List<dse> f;
        public static final MapCodec<b> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)a.listOf().fieldOf("contents").forGetter(b::b)).apply((Applicative)$$0, b::new));
        public static final aao<xq, b> d = aao.a(b.a(aam.a()), b::b, b::new);
        public static final i<b> e = new i<b>(c, d);

        public b(List<dse> $$0) {
            this.f = $$0;
        }

        public i<b> a() {
            return e;
        }

        @Override
        public <T> Stream<T> a(bhx $$0, drw<T> $$1) {
            return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
        }

        @Override
        public boolean a(dgz $$0) {
            return this.f.stream().allMatch($$1 -> $$1.a($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "contents", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "contents", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "contents", "f"}, this, $$0);
        }

        public List<dse> b() {
            return this.f;
        }
    }

    public static final class h
    extends Record
    implements dse {
        private final bef<dlp> f;
        public static final MapCodec<h> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bef.a(mj.R).fieldOf("tag").forGetter(h::b)).apply((Applicative)$$0, h::new));
        public static final aao<xq, h> d = aao.a(bef.c(mj.R), h::b, h::new);
        public static final i<h> e = new i<h>(c, d);

        public h(bef<dlp> $$0) {
            this.f = $$0;
        }

        public i<h> a() {
            return e;
        }

        @Override
        public <T> Stream<T> a(bhx $$02, drw<T> $$12) {
            if ($$12 instanceof drw.b) {
                drw.b $$2 = (drw.b)$$12;
                jf.a $$3 = $$02.c(dsf.b);
                if ($$3 != null) {
                    return $$3.e(mj.R).a(this.f).map($$1 -> $$1.a().map($$2::a)).stream().flatMap($$0 -> $$0);
                }
            }
            return Stream.empty();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "tag", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "tag", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "tag", "f"}, this, $$0);
        }

        public bef<dlp> b() {
            return this.f;
        }
    }

    public static final class f
    extends Record
    implements dse {
        private final dlt f;
        public static final MapCodec<f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dlt.d.fieldOf("item").forGetter(f::b)).apply((Applicative)$$0, f::new));
        public static final aao<xq, f> d = aao.a(dlt.j, f::b, f::new);
        public static final i<f> e = new i<f>(c, d);

        public f(dlt $$0) {
            this.f = $$0;
        }

        public i<f> a() {
            return e;
        }

        @Override
        public <T> Stream<T> a(bhx $$0, drw<T> $$1) {
            if ($$1 instanceof drw.b) {
                drw.b $$2 = (drw.b)$$1;
                return Stream.of($$2.a(this.f));
            }
            return Stream.empty();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public boolean equals(Object $$0) {
            if (this == $$0) return true;
            if (!($$0 instanceof f)) return false;
            f $$1 = (f)$$0;
            if (!dlt.a(this.f, $$1.f)) return false;
            return true;
        }

        @Override
        public boolean a(dgz $$0) {
            return this.f.h().a($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "stack", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "stack", "f"}, this);
        }

        public dlt b() {
            return this.f;
        }
    }

    public static final class d
    extends Record
    implements dse {
        private final jd<dlp> f;
        public static final MapCodec<d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dlp.e.fieldOf("item").forGetter(d::b)).apply((Applicative)$$0, d::new));
        public static final aao<xq, d> d = aao.a(dlp.f, d::b, d::new);
        public static final i<d> e = new i<d>(c, d);

        public d(dlp $$0) {
            this($$0.e());
        }

        public d(jd<dlp> $$0) {
            this.f = $$0;
        }

        public i<d> a() {
            return e;
        }

        @Override
        public <T> Stream<T> a(bhx $$0, drw<T> $$1) {
            if ($$1 instanceof drw.b) {
                drw.b $$2 = (drw.b)$$1;
                return Stream.of($$2.a(this.f));
            }
            return Stream.empty();
        }

        @Override
        public boolean a(dgz $$0) {
            return this.f.a().a($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "item", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "item", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "item", "f"}, this, $$0);
        }

        public jd<dlp> b() {
            return this.f;
        }
    }

    public static final class g
    extends Record
    implements dse {
        private final dse f;
        private final dse g;
        private final jd<dut> h;
        public static final MapCodec<g> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)a.fieldOf("base").forGetter(g::b), (App)a.fieldOf("material").forGetter(g::c), (App)dut.c.fieldOf("pattern").forGetter(g::d)).apply((Applicative)$$0, g::new));
        public static final aao<xq, g> d = aao.a(b, g::b, b, g::c, dut.d, g::d, g::new);
        public static final i<g> e = new i<g>(c, d);

        public g(dse $$0, dse $$1, jd<dut> $$2) {
            this.f = $$0;
            this.g = $$1;
            this.h = $$2;
        }

        public i<g> a() {
            return e;
        }

        @Override
        public <T> Stream<T> a(bhx $$02, drw<T> $$1) {
            if ($$1 instanceof drw.b) {
                drw.b $$2 = (drw.b)$$1;
                jf.a $$3 = $$02.c(dsf.b);
                if ($$3 != null) {
                    bgr $$4 = bgr.a(System.identityHashCode(this));
                    List<dlt> $$5 = this.f.a($$02);
                    if ($$5.isEmpty()) {
                        return Stream.empty();
                    }
                    List<dlt> $$6 = this.g.a($$02);
                    if ($$6.isEmpty()) {
                        return Stream.empty();
                    }
                    return Stream.generate(() -> {
                        dlt $$4 = (dlt)bhs.a($$5, $$4);
                        dlt $$5 = (dlt)bhs.a($$6, $$4);
                        return drq.a($$3, $$4, $$5, this.h);
                    }).limit(256L).filter($$0 -> !$$0.f()).limit(16L).map($$2::a);
                }
            }
            return Stream.empty();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "base;material;pattern", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "base;material;pattern", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "base;material;pattern", "f", "g", "h"}, this, $$0);
        }

        public dse b() {
            return this.f;
        }

        public dse c() {
            return this.g;
        }

        public jd<dut> d() {
            return this.h;
        }
    }

    public static class a
    implements dse {
        public static final a c = new a();
        public static final MapCodec<a> d = MapCodec.unit((Object)c);
        public static final aao<xq, a> e = aao.a(c);
        public static final i<a> f = new i<a>(d, e);

        private a() {
        }

        public i<a> a() {
            return f;
        }

        public String toString() {
            return "<any fuel>";
        }

        @Override
        public <T> Stream<T> a(bhx $$0, drw<T> $$1) {
            if ($$1 instanceof drw.b) {
                drw.b $$2 = (drw.b)$$1;
                emb $$3 = $$0.c(dsf.a);
                if ($$3 != null) {
                    return $$3.a().stream().map($$2::a);
                }
            }
            return Stream.empty();
        }
    }

    public static class c
    implements dse {
        public static final c c = new c();
        public static final MapCodec<c> d = MapCodec.unit((Object)c);
        public static final aao<xq, c> e = aao.a(c);
        public static final i<c> f = new i<c>(d, e);

        private c() {
        }

        public i<c> a() {
            return f;
        }

        public String toString() {
            return "<empty>";
        }

        @Override
        public <T> Stream<T> a(bhx $$0, drw<T> $$1) {
            return Stream.empty();
        }
    }

    public record i<T extends dse>(MapCodec<T> a, aao<xq, T> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{i.class, "codec;streamCodec", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{i.class, "codec;streamCodec", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{i.class, "codec;streamCodec", "a", "b"}, this, $$0);
        }
    }
}

