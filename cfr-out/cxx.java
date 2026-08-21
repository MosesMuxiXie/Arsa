/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class cxx
extends Record
implements dfq<dft, dfr> {
    private final a e;
    private final dfu f;
    public static final Codec<cxx> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cxx$a.a.fieldOf("assets").forGetter(cxx::b), (App)dfu.b.fieldOf("spawn_conditions").forGetter(cxx::c)).apply((Applicative)$$0, cxx::new));
    public static final Codec<cxx> b = RecordCodecBuilder.create($$0 -> $$0.group((App)cxx$a.a.fieldOf("assets").forGetter(cxx::b)).apply((Applicative)$$0, cxx::new));
    public static final Codec<jd<cxx>> c = amr.a(mj.bB);
    public static final aao<xq, jd<cxx>> d = aam.b(mj.bB);

    private cxx(a $$0) {
        this($$0, dfu.a);
    }

    public cxx(a $$0, dfu $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public List<dfq.a<dft, dfr>> a() {
        return this.f.a();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cxx.class, "assetInfo;spawnConditions", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cxx.class, "assetInfo;spawnConditions", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cxx.class, "assetInfo;spawnConditions", "e", "f"}, this, $$0);
    }

    public a b() {
        return this.e;
    }

    public dfu c() {
        return this.f;
    }

    public static final class a
    extends Record {
        private final iu.b b;
        private final iu.b c;
        private final iu.b d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)iu.b.a.fieldOf("wild").forGetter(a::a), (App)iu.b.a.fieldOf("tame").forGetter(a::b), (App)iu.b.a.fieldOf("angry").forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(iu.b $$0, iu.b $$1, iu.b $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "wild;tame;angry", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "wild;tame;angry", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "wild;tame;angry", "b", "c", "d"}, this, $$0);
        }

        public iu.b a() {
            return this.b;
        }

        public iu.b b() {
            return this.c;
        }

        public iu.b c() {
            return this.d;
        }
    }
}

