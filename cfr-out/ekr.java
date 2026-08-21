/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public final class ekr
extends Record
implements dpe {
    final List<b> d;
    static final Logger e = LogUtils.getLogger();
    public static final ekr a = new ekr(List.of());
    public static final Codec<ekr> b = ekr$b.a.listOf().xmap(ekr::new, ekr::b);
    public static final aao<xq, ekr> c = ekr$b.b.a(aam.a()).a(ekr::new, ekr::b);

    public ekr(List<b> $$0) {
        this.d = $$0;
    }

    public ekr a() {
        return new ekr(List.copyOf(this.d.subList(0, this.d.size() - 1)));
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        for (int $$4 = 0; $$4 < Math.min(this.b().size(), 6); ++$$4) {
            $$1.accept(this.b().get($$4).a().a(l.h));
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ekr.class, "layers", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ekr.class, "layers", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ekr.class, "layers", "d"}, this, $$0);
    }

    public List<b> b() {
        return this.d;
    }

    public static final class b
    extends Record {
        private final jd<ekq> c;
        private final dkr d;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)ekq.c.fieldOf("pattern").forGetter(b::b), (App)dkr.q.fieldOf("color").forGetter(b::c)).apply((Applicative)$$0, b::new));
        public static final aao<xq, b> b = aao.a(ekq.d, b::b, dkr.r, b::c, b::new);

        public b(jd<ekq> $$0, dkr $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        public yw a() {
            String $$0 = this.c.a().b();
            return yh.c($$0 + "." + this.d.b());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "pattern;color", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "pattern;color", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "pattern;color", "c", "d"}, this, $$0);
        }

        public jd<ekq> b() {
            return this.c;
        }

        public dkr c() {
            return this.d;
        }
    }

    public static class a {
        private final ImmutableList.Builder<b> a = ImmutableList.builder();

        @Deprecated
        public a a(je<ekq> $$0, amt<ekq> $$1, dkr $$2) {
            Optional<jd.c<ekq>> $$3 = $$0.a($$1);
            if ($$3.isEmpty()) {
                e.warn("Unable to find banner pattern with id: '{}'", (Object)$$1.a());
                return this;
            }
            return this.a((jd<ekq>)$$3.get(), $$2);
        }

        public a a(jd<ekq> $$0, dkr $$1) {
            return this.a(new b($$0, $$1));
        }

        public a a(b $$0) {
            this.a.add((Object)$$0);
            return this;
        }

        public a a(ekr $$0) {
            this.a.addAll($$0.d);
            return this;
        }

        public ekr a() {
            return new ekr((List<b>)this.a.build());
        }
    }
}

