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
import java.util.function.Predicate;

public final class la
extends Record
implements df<dpk> {
    private final Optional<az<axx<String>, a>> e;
    public static final Codec<la> a = RecordCodecBuilder.create($$0 -> $$0.group((App)az.a(la$a.a).optionalFieldOf("pages").forGetter(la::b)).apply((Applicative)$$0, la::new));

    public la(Optional<az<axx<String>, a>> $$0) {
        this.e = $$0;
    }

    @Override
    public kh<dpk> a() {
        return ki.ab;
    }

    @Override
    public boolean a(dpk $$0) {
        return !this.e.isPresent() || this.e.get().a($$0.a());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{la.class, "pages", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{la.class, "pages", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{la.class, "pages", "e"}, this, $$0);
    }

    public Optional<az<axx<String>, a>> b() {
        return this.e;
    }

    public static final class a
    extends Record
    implements Predicate<axx<String>> {
        private final String b;
        public static final Codec<a> a = Codec.STRING.xmap(a::new, a::a);

        public a(String $$0) {
            this.b = $$0;
        }

        public boolean a(axx<String> $$0) {
            return $$0.a().equals(this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "contents", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "contents", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "contents", "b"}, this, $$0);
        }

        public String a() {
            return this.b;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((axx)object);
        }
    }
}

