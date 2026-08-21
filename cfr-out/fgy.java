/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.apache.commons.lang3.mutable.MutableObject
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class fgy {
    private static final int c = Integer.MIN_VALUE;
    private static final MutableObject<Codec<jd<fgy>>> d = new MutableObject();
    public static final Codec<fgy> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.lazyInitialized(d).fieldOf("fallback").forGetter(fgy::b), (App)Codec.mapPair((MapCodec)fgw.f.fieldOf("element"), (MapCodec)Codec.intRange((int)1, (int)150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, fgy::new));
    public static final Codec<jd<fgy>> b = bhs.a(amq.a(mj.bt, a), arg_0 -> d.setValue(arg_0));
    private final List<Pair<fgw, Integer>> e;
    private final ObjectArrayList<fgw> f;
    private final jd<fgy> g;
    private int h = Integer.MIN_VALUE;

    public fgy(jd<fgy> $$0, List<Pair<fgw, Integer>> $$1) {
        this.e = $$1;
        this.f = new ObjectArrayList();
        for (Pair<fgw, Integer> $$2 : $$1) {
            fgw $$3 = (fgw)$$2.getFirst();
            for (int $$4 = 0; $$4 < (Integer)$$2.getSecond(); ++$$4) {
                this.f.add((Object)$$3);
            }
        }
        this.g = $$0;
    }

    public fgy(jd<fgy> $$0, List<Pair<Function<a, ? extends fgw>, Integer>> $$1, a $$2) {
        this.e = Lists.newArrayList();
        this.f = new ObjectArrayList();
        for (Pair<Function<a, ? extends fgw>, Integer> $$3 : $$1) {
            fgw $$4 = (fgw)((Function)$$3.getFirst()).apply($$2);
            this.e.add((Pair<fgw, Integer>)Pair.of((Object)$$4, (Object)((Integer)$$3.getSecond())));
            for (int $$5 = 0; $$5 < (Integer)$$3.getSecond(); ++$$5) {
                this.f.add((Object)$$4);
            }
        }
        this.g = $$0;
    }

    public int a(fjr $$02) {
        if (this.h == Integer.MIN_VALUE) {
            this.h = this.f.stream().filter($$0 -> $$0 != fgp.b).mapToInt($$1 -> $$1.a($$02, is.c, egm.a).e()).max().orElse(0);
        }
        return this.h;
    }

    @VisibleForTesting
    public List<Pair<fgw, Integer>> a() {
        return this.e;
    }

    public jd<fgy> b() {
        return this.g;
    }

    public fgw a(bgr $$0) {
        if (this.f.isEmpty()) {
            return fgp.b;
        }
        return (fgw)this.f.get($$0.a(this.f.size()));
    }

    public List<fgw> b(bgr $$0) {
        return bhs.a(this.f, $$0);
    }

    public int c() {
        return this.f.size();
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("terrain_matching", (ImmutableList<fjn>)ImmutableList.of((Object)new fiw(euq.a.a, -1)));
        public static final /* enum */ a b = new a("rigid", (ImmutableList<fjn>)ImmutableList.of());
        public static final bhh.a<a> c;
        private final String d;
        private final ImmutableList<fjn> e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, ImmutableList<fjn> $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        public String a() {
            return this.d;
        }

        public static a a(String $$0) {
            return c.a($$0);
        }

        public ImmutableList<fjn> b() {
            return this.e;
        }

        @Override
        public String c() {
            return this.d;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b};
        }

        static {
            f = fgy$a.d();
            c = bhh.a(a::values);
        }
    }
}

