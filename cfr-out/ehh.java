/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class ehh
extends dym {
    public static final MapCodec<ehh> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ehh$a.b.fieldOf("kind").forGetter(dym::b), ehh.x()).apply((Applicative)$$0, ehh::new));
    public static final int d = epn.a();
    private static final int b = d + 1;
    public static final eph e = eox.bf;
    private static final fug f = dzq.b(8.0, 0.0, 8.0);
    private static final fug g = dzq.b(10.0, 0.0, 8.0);

    public MapCodec<? extends ehh> a() {
        return c;
    }

    protected ehh(a $$0, eog.d $$1) {
        super($$0, $$1);
        this.l((eoh)this.m().b(e, 0));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.b() == ehh$b.h ? g : f;
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)super.a($$0).b(e, epn.a($$0.i()));
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(e, $$1.a($$0.c(e), b));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return (eoh)$$0.b(e, $$1.a($$0.c(e), b));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        super.a($$0);
        $$0.a(new epk[]{e});
    }

    public static interface a
    extends bhh {
        public static final Map<String, a> a = new Object2ObjectArrayMap();
        public static final Codec<a> b = Codec.stringResolver(bhh::c, a::get);
    }

    public static final class b
    extends Enum<b>
    implements a {
        public static final /* enum */ b c = new b("skeleton");
        public static final /* enum */ b d = new b("wither_skeleton");
        public static final /* enum */ b e = new b("player");
        public static final /* enum */ b f = new b("zombie");
        public static final /* enum */ b g = new b("creeper");
        public static final /* enum */ b h = new b("piglin");
        public static final /* enum */ b i = new b("dragon");
        private final String j;
        private static final /* synthetic */ b[] k;

        public static b[] values() {
            return (b[])k.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.j = $$0;
            a.put($$0, this);
        }

        @Override
        public String c() {
            return this.j;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{c, d, e, f, g, h, i};
        }

        static {
            k = ehh$b.a();
        }
    }
}

