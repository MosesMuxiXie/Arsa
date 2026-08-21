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

public class ddi {
    private static final boolean f = false;
    private static final boolean g = false;
    private static final boolean h = false;
    private static final boolean i = false;
    private static final boolean j = true;
    private static final float k = 0.05f;
    private static final float l = 0.1f;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    private float m = 0.05f;
    private float n = 0.1f;

    public float a() {
        return this.m;
    }

    public void a(float $$0) {
        this.m = $$0;
    }

    public float b() {
        return this.n;
    }

    public void b(float $$0) {
        this.n = $$0;
    }

    public a c() {
        return new a(this.a, this.b, this.c, this.d, this.e, this.m, this.n);
    }

    public void a(a $$0) {
        this.a = $$0.b;
        this.b = $$0.c;
        this.c = $$0.d;
        this.d = $$0.e;
        this.e = $$0.f;
        this.m = $$0.g;
        this.n = $$0.h;
    }

    public static final class a
    extends Record {
        final boolean b;
        final boolean c;
        final boolean d;
        final boolean e;
        final boolean f;
        final float g;
        final float h;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.BOOL.fieldOf("invulnerable").orElse((Object)false).forGetter(a::a), (App)Codec.BOOL.fieldOf("flying").orElse((Object)false).forGetter(a::b), (App)Codec.BOOL.fieldOf("mayfly").orElse((Object)false).forGetter(a::c), (App)Codec.BOOL.fieldOf("instabuild").orElse((Object)false).forGetter(a::d), (App)Codec.BOOL.fieldOf("mayBuild").orElse((Object)true).forGetter(a::e), (App)Codec.FLOAT.fieldOf("flySpeed").orElse((Object)Float.valueOf(0.05f)).forGetter(a::f), (App)Codec.FLOAT.fieldOf("walkSpeed").orElse((Object)Float.valueOf(0.1f)).forGetter(a::g)).apply((Applicative)$$0, a::new));

        public a(boolean $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, float $$5, float $$6) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
            this.g = $$5;
            this.h = $$6;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "invulnerable;flying;mayFly;instabuild;mayBuild;flyingSpeed;walkingSpeed", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "invulnerable;flying;mayFly;instabuild;mayBuild;flyingSpeed;walkingSpeed", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "invulnerable;flying;mayFly;instabuild;mayBuild;flyingSpeed;walkingSpeed", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
        }

        public boolean a() {
            return this.b;
        }

        public boolean b() {
            return this.c;
        }

        public boolean c() {
            return this.d;
        }

        public boolean d() {
            return this.e;
        }

        public boolean e() {
            return this.f;
        }

        public float f() {
            return this.g;
        }

        public float g() {
            return this.h;
        }
    }
}

