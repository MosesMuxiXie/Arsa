/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import java.util.function.Supplier;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class yl {
    public static final Codec<yl> a = bhh.a(a::values).dispatch(yl::c, a::a);
    public static final yl b = new yl(new BitSet(0), yl$a.b);
    public static final yl c = new yl(new BitSet(0), yl$a.a);
    public static final zf d = zf.a.a(l.i).a(new yo.e(yh.c("chat.filtered")));
    static final MapCodec<yl> e = MapCodec.unit((Object)c);
    static final MapCodec<yl> f = MapCodec.unit((Object)b);
    static final MapCodec<yl> g = bfm.D.xmap(yl::new, yl::d).fieldOf("value");
    private static final char h = '#';
    private final BitSet i;
    private final a j;

    private yl(BitSet $$0, a $$1) {
        this.i = $$0;
        this.j = $$1;
    }

    private yl(BitSet $$0) {
        this.i = $$0;
        this.j = yl$a.c;
    }

    public yl(int $$0) {
        this(new BitSet($$0), yl$a.c);
    }

    private a c() {
        return this.j;
    }

    private BitSet d() {
        return this.i;
    }

    public static yl a(wx $$0) {
        a $$1 = $$0.b(a.class);
        return switch ($$1.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> c;
            case 1 -> b;
            case 2 -> new yl($$0.v(), yl$a.c);
        };
    }

    public static void a(wx $$0, yl $$1) {
        $$0.a($$1.j);
        if ($$1.j == yl$a.c) {
            $$0.a($$1.i);
        }
    }

    public void a(int $$0) {
        this.i.set($$0);
    }

    public @Nullable String a(String $$0) {
        return switch (this.j.ordinal()) {
            default -> throw new MatchException(null, null);
            case 1 -> null;
            case 0 -> $$0;
            case 2 -> {
                char[] $$1 = $$0.toCharArray();
                for (int $$2 = 0; $$2 < $$1.length && $$2 < this.i.length(); ++$$2) {
                    if (!this.i.get($$2)) continue;
                    $$1[$$2] = 35;
                }
                yield new String($$1);
            }
        };
    }

    public @Nullable yh b(String $$0) {
        return switch (this.j.ordinal()) {
            default -> throw new MatchException(null, null);
            case 1 -> null;
            case 0 -> yh.b($$0);
            case 2 -> {
                yw $$1 = yh.i();
                int $$2 = 0;
                boolean $$3 = this.i.get(0);
                while (true) {
                    int $$4 = $$3 ? this.i.nextClearBit($$2) : this.i.nextSetBit($$2);
                    int v1 = $$4 = $$4 < 0 ? $$0.length() : $$4;
                    if ($$4 == $$2) break;
                    if ($$3) {
                        $$1.b(yh.b(StringUtils.repeat((char)'#', (int)($$4 - $$2))).c(d));
                    } else {
                        $$1.f($$0.substring($$2, $$4));
                    }
                    $$3 = !$$3;
                    $$2 = $$4;
                }
                yield $$1;
            }
        };
    }

    public boolean a() {
        return this.j == yl$a.a;
    }

    public boolean b() {
        return this.j == yl$a.b;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        yl $$1 = (yl)$$0;
        return this.i.equals($$1.i) && this.j == $$1.j;
    }

    public int hashCode() {
        int $$0 = this.i.hashCode();
        $$0 = 31 * $$0 + this.j.hashCode();
        return $$0;
    }

    static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("pass_through", () -> e);
        public static final /* enum */ a b = new a("fully_filtered", () -> f);
        public static final /* enum */ a c = new a("partially_filtered", () -> g);
        private final String d;
        private final Supplier<MapCodec<yl>> e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, Supplier<MapCodec<yl>> $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        @Override
        public String c() {
            return this.d;
        }

        private MapCodec<yl> a() {
            return this.e.get();
        }

        private static /* synthetic */ a[] f() {
            return new a[]{a, b, c};
        }

        static {
            f = yl$a.f();
        }
    }
}

