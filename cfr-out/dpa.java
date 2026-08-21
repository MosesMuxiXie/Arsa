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
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public final class dpa
extends Record
implements doc,
dpe {
    private final List<a> e;
    public static final dpa a = new dpa(List.of());
    public static final int b = 160;
    public static final Codec<dpa> c = dpa$a.a.listOf().xmap(dpa::new, dpa::a);
    public static final aao<xq, dpa> d = dpa$a.b.a(aam.a()).a(dpa::new, dpa::a);

    public dpa(List<a> $$0) {
        this.e = $$0;
    }

    public dpa a(a $$0) {
        return new dpa(bhs.a(this.e, $$0));
    }

    @Override
    public void a(dwo $$0, chl $$1, dlt $$2, dob $$3) {
        for (a $$4 : this.e) {
            $$1.a($$4.a());
        }
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        if ($$2.b()) {
            ArrayList<cfm> $$4 = new ArrayList<cfm>();
            for (a $$5 : this.e) {
                $$4.add($$5.a());
            }
            dnr.a($$4, $$1, 1.0f, $$0.b());
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpa.class, "effects", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dpa.class, "effects", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dpa.class, "effects", "e"}, this, $$0);
    }

    public List<a> a() {
        return this.e;
    }

    public static final class a
    extends Record {
        private final jd<cfk> c;
        private final int d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cfk.a.fieldOf("id").forGetter(a::b), (App)Codec.INT.lenientOptionalFieldOf("duration", (Object)160).forGetter(a::c)).apply((Applicative)$$0, a::new));
        public static final aao<xq, a> b = aao.a(cfk.b, a::b, aam.h, a::c, a::new);

        public a(jd<cfk> $$0, int $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        public cfm a() {
            return new cfm(this.c, this.d);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "effect;duration", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "effect;duration", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "effect;duration", "c", "d"}, this, $$0);
        }

        public jd<cfk> b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }
    }
}

