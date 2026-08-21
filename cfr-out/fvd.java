/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.Hash;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.jspecify.annotations.Nullable;

public final class fvd<T>
extends Record {
    private final T b;
    private final is c;
    private final int d;
    private final fvi e;
    public static final Hash.Strategy<fvd<?>> a = new Hash.Strategy<fvd<?>>(){

        public int a(fvd<?> $$0) {
            return 31 * $$0.b().hashCode() + $$0.a().hashCode();
        }

        public boolean a(@Nullable fvd<?> $$0, @Nullable fvd<?> $$1) {
            if ($$0 == $$1) {
                return true;
            }
            if ($$0 == null || $$1 == null) {
                return false;
            }
            return $$0.a() == $$1.a() && $$0.b().equals($$1.b());
        }

        public /* synthetic */ boolean equals(@Nullable Object object, @Nullable Object object2) {
            return this.a((fvd)object, (fvd)object2);
        }

        public /* synthetic */ int hashCode(Object object) {
            return this.a((fvd)object);
        }
    };

    public fvd(T $$0, is $$1, int $$2, fvi $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static <T> Codec<fvd<T>> a(Codec<T> $$02) {
        MapCodec $$1 = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.INT.fieldOf("x").forGetter(jy::u), (App)Codec.INT.fieldOf("y").forGetter(jy::v), (App)Codec.INT.fieldOf("z").forGetter(jy::w)).apply((Applicative)$$0, is::new));
        return RecordCodecBuilder.create($$2 -> $$2.group((App)$$02.fieldOf("i").forGetter(fvd::a), (App)$$1.forGetter(fvd::b), (App)Codec.INT.fieldOf("t").forGetter(fvd::c), (App)fvi.h.fieldOf("p").forGetter(fvd::d)).apply((Applicative)$$2, fvd::new));
    }

    public static <T> List<fvd<T>> a(List<fvd<T>> $$0, dvu $$12) {
        long $$2 = $$12.b();
        return $$0.stream().filter($$1 -> dvu.a($$1.b()) == $$2).toList();
    }

    public fve<T> a(long $$0, long $$1) {
        return new fve<T>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
    }

    public static <T> fvd<T> a(T $$0, is $$1) {
        return new fvd<T>($$0, $$1, 0, fvi.d);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fvd.class, "type;pos;delay;priority", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fvd.class, "type;pos;delay;priority", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fvd.class, "type;pos;delay;priority", "b", "c", "d", "e"}, this, $$0);
    }

    public T a() {
        return this.b;
    }

    public is b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public fvi d() {
        return this.e;
    }
}

