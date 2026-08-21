/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.UnaryOperator;

public final class bde {
    public static final aao<wx, bde> a = aao.a(bde$a.f, $$0 -> $$0.c, bde$a.f, $$0 -> $$0.d, bde$a.f, $$0 -> $$0.e, bde$a.f, $$0 -> $$0.f, bde::new);
    public static final MapCodec<bde> b = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)bde$a.b.forGetter($$0 -> $$0.c), (App)bde$a.c.forGetter($$0 -> $$0.d), (App)bde$a.d.forGetter($$0 -> $$0.e), (App)bde$a.e.forGetter($$0 -> $$0.f)).apply((Applicative)$$02, bde::new));
    private a c;
    private a d;
    private a e;
    private a f;

    public bde() {
        this(bde$a.a, bde$a.a, bde$a.a, bde$a.a);
    }

    private bde(a $$0, a $$1, a $$2, a $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    @VisibleForTesting
    public a a(dja $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case dja.a -> this.c;
            case dja.b -> this.d;
            case dja.c -> this.e;
            case dja.d -> this.f;
        };
    }

    private void a(dja $$0, UnaryOperator<a> $$1) {
        switch ($$0) {
            case a: {
                this.c = (a)$$1.apply(this.c);
                break;
            }
            case b: {
                this.d = (a)$$1.apply(this.d);
                break;
            }
            case c: {
                this.e = (a)$$1.apply(this.e);
                break;
            }
            case d: {
                this.f = (a)$$1.apply(this.f);
            }
        }
    }

    public boolean b(dja $$0) {
        return this.a((dja)$$0).g;
    }

    public void a(dja $$0, boolean $$12) {
        this.a($$0, $$1 -> $$1.a($$12));
    }

    public boolean c(dja $$0) {
        return this.a((dja)$$0).h;
    }

    public void b(dja $$0, boolean $$12) {
        this.a($$0, $$1 -> $$1.b($$12));
    }

    public bde a() {
        return new bde(this.c, this.d, this.e, this.f);
    }

    public void a(bde $$0) {
        this.c = $$0.c;
        this.d = $$0.d;
        this.e = $$0.e;
        this.f = $$0.f;
    }

    public static final class a
    extends Record {
        final boolean g;
        final boolean h;
        public static final a a = new a(false, false);
        public static final MapCodec<a> b = bde$a.a("isGuiOpen", "isFilteringCraftable");
        public static final MapCodec<a> c = bde$a.a("isFurnaceGuiOpen", "isFurnaceFilteringCraftable");
        public static final MapCodec<a> d = bde$a.a("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable");
        public static final MapCodec<a> e = bde$a.a("isSmokerGuiOpen", "isSmokerFilteringCraftable");
        public static final aao<ByteBuf, a> f = aao.a(aam.b, a::a, aam.b, a::b, a::new);

        public a(boolean $$0, boolean $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        @Override
        public String toString() {
            return "[open=" + this.g + ", filtering=" + this.h + "]";
        }

        public a a(boolean $$0) {
            return new a($$0, this.h);
        }

        public a b(boolean $$0) {
            return new a(this.g, $$0);
        }

        private static MapCodec<a> a(String $$0, String $$1) {
            return RecordCodecBuilder.mapCodec($$2 -> $$2.group((App)Codec.BOOL.optionalFieldOf($$0, (Object)false).forGetter(a::a), (App)Codec.BOOL.optionalFieldOf($$1, (Object)false).forGetter(a::b)).apply((Applicative)$$2, a::new));
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "open;filtering", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "open;filtering", "g", "h"}, this, $$0);
        }

        public boolean a() {
            return this.g;
        }

        public boolean b() {
            return this.h;
        }
    }
}

