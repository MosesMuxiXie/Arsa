/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public interface yo {
    public static final Codec<yo> a = yo$a.e.dispatch("action", yo::a, $$0 -> $$0.h);

    public a a();

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("show_text", true, yo$e.b);
        public static final /* enum */ a b = new a("show_item", true, yo$d.b);
        public static final /* enum */ a c = new a("show_entity", true, yo$c.b);
        public static final Codec<a> d;
        public static final Codec<a> e;
        private final String f;
        private final boolean g;
        final MapCodec<? extends yo> h;
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, boolean $$1, MapCodec<? extends yo> $$2) {
            this.f = $$0;
            this.g = $$1;
            this.h = $$2;
        }

        public boolean a() {
            return this.g;
        }

        @Override
        public String c() {
            return this.f;
        }

        public String toString() {
            return "<action " + this.f + ">";
        }

        private static DataResult<a> a(a $$0) {
            if (!$$0.a()) {
                return DataResult.error(() -> "Action not allowed: " + String.valueOf($$0));
            }
            return DataResult.success((Object)$$0, (Lifecycle)Lifecycle.stable());
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c};
        }

        static {
            i = yo$a.b();
            d = bhh.b(a::values);
            e = d.validate(a::a);
        }
    }

    public static class b {
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)mi.g.q().fieldOf("id").forGetter($$0 -> $$0.b), (App)jx.f.fieldOf("uuid").forGetter($$0 -> $$0.c), (App)yj.a.optionalFieldOf("name").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, b::new));
        public final cgu<?> b;
        public final UUID c;
        public final Optional<yh> d;
        private @Nullable List<yh> e;

        public b(cgu<?> $$0, UUID $$1, @Nullable yh $$2) {
            this($$0, $$1, Optional.ofNullable($$2));
        }

        public b(cgu<?> $$0, UUID $$1, Optional<yh> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public List<yh> a() {
            if (this.e == null) {
                this.e = new ArrayList<yh>();
                this.d.ifPresent(this.e::add);
                this.e.add(yh.a("gui.entity_tooltip.type", this.b.h()));
                this.e.add(yh.b(this.c.toString()));
            }
            return this.e;
        }

        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 == null || this.getClass() != $$0.getClass()) {
                return false;
            }
            b $$1 = (b)$$0;
            return this.b.equals($$1.b) && this.c.equals($$1.c) && this.d.equals($$1.d);
        }

        public int hashCode() {
            int $$0 = this.b.hashCode();
            $$0 = 31 * $$0 + this.c.hashCode();
            $$0 = 31 * $$0 + this.d.hashCode();
            return $$0;
        }
    }

    public static final class c
    extends Record
    implements yo {
        private final b c;
        public static final MapCodec<c> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)yo$b.a.forGetter(c::b)).apply((Applicative)$$0, c::new));

        public c(b $$0) {
            this.c = $$0;
        }

        @Override
        public a a() {
            return yo$a.c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "entity", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "entity", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "entity", "c"}, this, $$0);
        }

        public b b() {
            return this.c;
        }
    }

    public static final class d
    extends Record
    implements yo {
        private final dlt c;
        public static final MapCodec<d> b = dlt.a.xmap(d::new, d::b);

        public d(dlt $$0) {
            this.c = $$0 = $$0.v();
        }

        @Override
        public a a() {
            return yo$a.b;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public boolean equals(Object $$0) {
            if (!($$0 instanceof d)) return false;
            d $$1 = (d)$$0;
            if (!dlt.a(this.c, $$1.c)) return false;
            return true;
        }

        @Override
        public int hashCode() {
            return dlt.b(this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "item", "c"}, this);
        }

        public dlt b() {
            return this.c;
        }
    }

    public static final class e
    extends Record
    implements yo {
        private final yh c;
        public static final MapCodec<e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)yj.a.fieldOf("value").forGetter(e::b)).apply((Applicative)$$0, e::new));

        public e(yh $$0) {
            this.c = $$0;
        }

        @Override
        public a a() {
            return yo$a.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "value", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "value", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "value", "c"}, this, $$0);
        }

        public yh b() {
            return this.c;
        }
    }
}

