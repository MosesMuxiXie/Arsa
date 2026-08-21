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
import java.util.Optional;

public final class cdz
extends Record {
    private final a d;
    private final a e;
    private final boolean f;
    private final Optional<yh> g;
    public static final cdz a = new cdz(cdz$a.b, cdz$a.a, false, Optional.of(yh.c("block.minecraft.bed.no_sleep")));
    public static final cdz b = new cdz(cdz$a.c, cdz$a.c, true, Optional.empty());
    public static final Codec<cdz> c = RecordCodecBuilder.create($$0 -> $$0.group((App)cdz$a.d.fieldOf("can_sleep").forGetter(cdz::b), (App)cdz$a.d.fieldOf("can_set_spawn").forGetter(cdz::c), (App)Codec.BOOL.optionalFieldOf("explodes", (Object)false).forGetter(cdz::d), (App)yj.a.optionalFieldOf("error_message").forGetter(cdz::e)).apply((Applicative)$$0, cdz::new));

    public cdz(a $$0, a $$1, boolean $$2, Optional<yh> $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    public boolean a(dwo $$0) {
        return this.d.a($$0);
    }

    public boolean b(dwo $$0) {
        return this.e.a($$0);
    }

    public ddm.a a() {
        return new ddm.a(this.g.orElse(null));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cdz.class, "canSleep;canSetSpawn;explodes;errorMessage", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cdz.class, "canSleep;canSetSpawn;explodes;errorMessage", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cdz.class, "canSleep;canSetSpawn;explodes;errorMessage", "d", "e", "f", "g"}, this, $$0);
    }

    public a b() {
        return this.d;
    }

    public a c() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }

    public Optional<yh> e() {
        return this.g;
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("always");
        public static final /* enum */ a b = new a("when_dark");
        public static final /* enum */ a c = new a("never");
        public static final Codec<a> d;
        private final String e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.e = $$0;
        }

        public boolean a(dwo $$0) {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> true;
                case 1 -> $$0.ah();
                case 2 -> false;
            };
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            f = cdz$a.a();
            d = bhh.a(a::values);
        }
    }
}

