/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public final class dok
extends Record
implements dpe {
    private final a e;
    private final IntList f;
    private final IntList g;
    private final boolean h;
    private final boolean i;
    public static final dok a = new dok(dok$a.a, IntList.of(), IntList.of(), false, false);
    public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
    public static final Codec<dok> c = RecordCodecBuilder.create($$0 -> $$0.group((App)dok$a.g.fieldOf("shape").forGetter(dok::a), (App)b.optionalFieldOf("colors", (Object)IntList.of()).forGetter(dok::b), (App)b.optionalFieldOf("fade_colors", (Object)IntList.of()).forGetter(dok::c), (App)Codec.BOOL.optionalFieldOf("has_trail", (Object)false).forGetter(dok::d), (App)Codec.BOOL.optionalFieldOf("has_twinkle", (Object)false).forGetter(dok::e)).apply((Applicative)$$0, dok::new));
    private static final aao<ByteBuf, IntList> j = aam.g.a(aam.a()).a(IntArrayList::new, ArrayList::new);
    public static final aao<ByteBuf, dok> d = aao.a(dok$a.f, dok::a, j, dok::b, j, dok::c, aam.b, dok::d, aam.b, dok::e, dok::new);
    private static final yh k = yh.c("item.minecraft.firework_star.custom_color");

    public dok(a $$0, IntList $$1, IntList $$2, boolean $$3, boolean $$4) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        $$1.accept(this.e.a().a(l.h));
        this.a($$1);
    }

    public void a(Consumer<yh> $$0) {
        if (!this.f.isEmpty()) {
            $$0.accept(dok.a(yh.i().a(l.h), this.f));
        }
        if (!this.g.isEmpty()) {
            $$0.accept(dok.a(yh.c("item.minecraft.firework_star.fade_to").b(yg.x).a(l.h), this.g));
        }
        if (this.h) {
            $$0.accept(yh.c("item.minecraft.firework_star.trail").a(l.h));
        }
        if (this.i) {
            $$0.accept(yh.c("item.minecraft.firework_star.flicker").a(l.h));
        }
    }

    private static yh a(yw $$0, IntList $$1) {
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            if ($$2 > 0) {
                $$0.f(", ");
            }
            $$0.b(dok.a($$1.getInt($$2)));
        }
        return $$0;
    }

    private static yh a(int $$0) {
        dkr $$1 = dkr.b($$0);
        if ($$1 == null) {
            return k;
        }
        return yh.c("item.minecraft.firework_star." + $$1.b());
    }

    public dok a(IntList $$0) {
        return new dok(this.e, this.f, (IntList)new IntArrayList($$0), this.h, this.i);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dok.class, "shape;colors;fadeColors;hasTrail;hasTwinkle", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dok.class, "shape;colors;fadeColors;hasTrail;hasTwinkle", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dok.class, "shape;colors;fadeColors;hasTrail;hasTwinkle", "e", "f", "g", "h", "i"}, this, $$0);
    }

    public a a() {
        return this.e;
    }

    public IntList b() {
        return this.f;
    }

    public IntList c() {
        return this.g;
    }

    public boolean d() {
        return this.h;
    }

    public boolean e() {
        return this.i;
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a(0, "small_ball");
        public static final /* enum */ a b = new a(1, "large_ball");
        public static final /* enum */ a c = new a(2, "star");
        public static final /* enum */ a d = new a(3, "creeper");
        public static final /* enum */ a e = new a(4, "burst");
        private static final IntFunction<a> h;
        public static final aao<ByteBuf, a> f;
        public static final Codec<a> g;
        private final int i;
        private final String j;
        private static final /* synthetic */ a[] k;

        public static a[] values() {
            return (a[])k.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, String $$1) {
            this.i = $$0;
            this.j = $$1;
        }

        public yw a() {
            return yh.c("item.minecraft.firework_star.shape." + this.j);
        }

        public int b() {
            return this.i;
        }

        public static a a(int $$0) {
            return h.apply($$0);
        }

        @Override
        public String c() {
            return this.j;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b, c, d, e};
        }

        static {
            k = dok$a.d();
            h = beu.a(a::b, dok$a.values(), beu.a.a);
            f = aam.a(h, a::b);
            g = bhh.b(a::values);
        }
    }
}

