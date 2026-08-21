/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class fpw
extends fpq {
    public static final MapCodec<fpw> a = RecordCodecBuilder.mapCodec($$02 -> fpw.a($$02).and($$02.group((App)fpw$b.a.listOf().fieldOf("modifiers").forGetter($$0 -> $$0.b), (App)Codec.BOOL.optionalFieldOf("replace", (Object)true).forGetter($$0 -> $$0.c))).apply((Applicative)$$02, fpw::new));
    private final List<b> b;
    private final boolean c;

    fpw(List<frm> $$0, List<b> $$1, boolean $$2) {
        super($$0);
        this.b = List.copyOf($$1);
        this.c = $$2;
    }

    public fps<fpw> a() {
        return fpt.o;
    }

    @Override
    public Set<bhv<?>> b() {
        return (Set)this.b.stream().flatMap($$0 -> $$0.e.b().stream()).collect(ImmutableSet.toImmutableSet());
    }

    @Override
    public dlt a(dlt $$0, fnz $$12) {
        if (this.c) {
            $$0.b(ki.r, this.a($$12, don.a));
        } else {
            $$0.a(ki.r, don.a, $$1 -> this.a($$12, (don)$$1));
        }
        return $$0;
    }

    private don a(fnz $$0, don $$1) {
        bgr $$2 = $$0.b();
        for (b $$3 : this.b) {
            cgw $$4 = bhs.a($$3.f, $$2);
            $$1 = $$1.a($$3.c, new ciq($$3.b, $$3.e.b($$0), $$3.d), $$4);
        }
        return $$1;
    }

    public static c a(amo $$0, jd<cin> $$1, ciq.a $$2, fsi $$3) {
        return new c($$0, $$1, $$2, $$3);
    }

    public static a c() {
        return new a();
    }

    static final class b
    extends Record {
        final amo b;
        final jd<cin> c;
        final ciq.a d;
        final fsi e;
        final List<cgw> f;
        private static final Codec<List<cgw>> g = bfm.b(bfm.a(cgw.m));
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)amo.a.fieldOf("id").forGetter(b::a), (App)cin.a.fieldOf("attribute").forGetter(b::b), (App)ciq.a.f.fieldOf("operation").forGetter(b::c), (App)fsj.a.fieldOf("amount").forGetter(b::d), (App)g.fieldOf("slot").forGetter(b::e)).apply((Applicative)$$0, b::new));

        b(amo $$0, jd<cin> $$1, ciq.a $$2, fsi $$3, List<cgw> $$4) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "id;attribute;operation;amount;slots", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "id;attribute;operation;amount;slots", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "id;attribute;operation;amount;slots", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public amo a() {
            return this.b;
        }

        public jd<cin> b() {
            return this.c;
        }

        public ciq.a c() {
            return this.d;
        }

        public fsi d() {
            return this.e;
        }

        public List<cgw> e() {
            return this.f;
        }
    }

    public static class c {
        private final amo a;
        private final jd<cin> b;
        private final ciq.a c;
        private final fsi d;
        private final Set<cgw> e = EnumSet.noneOf(cgw.class);

        public c(amo $$0, jd<cin> $$1, ciq.a $$2, fsi $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public c a(cgw $$0) {
            this.e.add($$0);
            return this;
        }

        public b a() {
            return new b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
        }
    }

    public static class a
    extends fpq.a<a> {
        private final boolean a;
        private final List<b> b = Lists.newArrayList();

        public a(boolean $$0) {
            this.a = $$0;
        }

        public a() {
            this(false);
        }

        protected a a() {
            return this;
        }

        public a a(c $$0) {
            this.b.add($$0.a());
            return this;
        }

        @Override
        public fpr b() {
            return new fpw(this.g(), this.b, this.a);
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }
}

