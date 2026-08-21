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

public final class cud
extends Record
implements dfq<dft, dfr> {
    private final dfo<a> e;
    private final dfu f;
    public static final Codec<cud> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dfo.a(cud$a.c, cud$a.a).forGetter(cud::b), (App)dfu.b.fieldOf("spawn_conditions").forGetter(cud::c)).apply((Applicative)$$0, cud::new));
    public static final Codec<cud> b = RecordCodecBuilder.create($$0 -> $$0.group((App)dfo.a(cud$a.c, cud$a.a).forGetter(cud::b)).apply((Applicative)$$0, cud::new));
    public static final Codec<jd<cud>> c = amr.a(mj.aV);
    public static final aao<xq, jd<cud>> d = aam.b(mj.aV);

    private cud(dfo<a> $$0) {
        this($$0, dfu.a);
    }

    public cud(dfo<a> $$0, dfu $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public List<dfq.a<dft, dfr>> a() {
        return this.f.a();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cud.class, "modelAndTexture;spawnConditions", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cud.class, "modelAndTexture;spawnConditions", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cud.class, "modelAndTexture;spawnConditions", "e", "f"}, this, $$0);
    }

    public dfo<a> b() {
        return this.e;
    }

    public dfu c() {
        return this.f;
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("normal");
        public static final /* enum */ a b = new a("cold");
        public static final Codec<a> c;
        private final String d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.d = $$0;
        }

        @Override
        public String c() {
            return this.d;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            e = cud$a.a();
            c = bhh.a(a::values);
        }
    }
}

