/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class fuj {
    private final fur a;
    private final String b;
    private final fuu c;
    private yh d;
    private yh e;
    private fuu.a f;
    private boolean g;
    private @Nullable aag h;

    public fuj(fur $$0, String $$1, fuu $$2, yh $$3, fuu.a $$4, boolean $$5, @Nullable aag $$6) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = this.j();
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
    }

    public a a() {
        return new a(this.b, this.c, this.d, this.f, this.g, Optional.ofNullable(this.h));
    }

    public fur b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public fuu d() {
        return this.c;
    }

    public yh e() {
        return this.d;
    }

    public boolean f() {
        return this.g;
    }

    public @Nullable aag g() {
        return this.h;
    }

    public aag a(aag $$0) {
        return Objects.requireNonNullElse(this.h, $$0);
    }

    private yh j() {
        return yk.a(this.d.f().a($$0 -> $$0.a(new yo.e(yh.b(this.b)))));
    }

    public yh h() {
        return this.e;
    }

    public void a(yh $$0) {
        this.d = $$0;
        this.e = this.j();
        this.a.b(this);
    }

    public fuu.a i() {
        return this.f;
    }

    public void a(fuu.a $$0) {
        this.f = $$0;
        this.a.b(this);
    }

    public void a(boolean $$0) {
        this.g = $$0;
        this.a.b(this);
    }

    public void b(@Nullable aag $$0) {
        this.h = $$0;
        this.a.b(this);
    }

    public static final class a
    extends Record {
        private final String b;
        private final fuu c;
        private final yh d;
        private final fuu.a e;
        private final boolean f;
        private final Optional<aag> g;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("Name").forGetter(a::a), (App)fuu.b.optionalFieldOf("CriteriaName", (Object)fuu.c).forGetter(a::b), (App)yj.a.fieldOf("DisplayName").forGetter(a::c), (App)fuu.a.c.optionalFieldOf("RenderType", fuu.a.a).forGetter(a::d), (App)Codec.BOOL.optionalFieldOf("display_auto_update", (Object)false).forGetter(a::e), (App)aai.b.optionalFieldOf("format").forGetter(a::f)).apply((Applicative)$$0, a::new));

        public a(String $$0, fuu $$1, yh $$2, fuu.a $$3, boolean $$4, Optional<aag> $$5) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
            this.g = $$5;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "name;criteria;displayName;renderType;displayAutoUpdate;numberFormat", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "name;criteria;displayName;renderType;displayAutoUpdate;numberFormat", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "name;criteria;displayName;renderType;displayAutoUpdate;numberFormat", "b", "c", "d", "e", "f", "g"}, this, $$0);
        }

        public String a() {
            return this.b;
        }

        public fuu b() {
            return this.c;
        }

        public yh c() {
            return this.d;
        }

        public fuu.a d() {
            return this.e;
        }

        public boolean e() {
            return this.f;
        }

        public Optional<aag> f() {
            return this.g;
        }
    }
}

