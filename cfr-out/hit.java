/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hit {
    private static final Logger j = LogUtils.getLogger();
    private static final int k = 1024;
    public String a;
    public String b;
    public yh c;
    public yh d;
    public @Nullable alq.b e;
    public long f;
    public int g = w.b().d();
    public yh h = yh.b(w.b().c());
    public List<yh> i = Collections.emptyList();
    private a l = hit$a.c;
    private byte @Nullable [] m;
    private c n;
    private int o;
    private b p = hit$b.a;

    public hit(String $$0, String $$1, c $$2) {
        this.a = $$0;
        this.b = $$1;
        this.n = $$2;
    }

    public uz a() {
        uz $$0 = new uz();
        $$0.a("name", this.a);
        $$0.a("ip", this.b);
        $$0.b("icon", bfm.y, this.m);
        $$0.a(hit$a.d, this.l);
        if (this.o != 0) {
            $$0.a("acceptedCodeOfConduct", this.o);
        }
        return $$0;
    }

    public a b() {
        return this.l;
    }

    public void a(a $$0) {
        this.l = $$0;
    }

    public static hit a(uz $$0) {
        hit $$1 = new hit($$0.b("name", ""), $$0.b("ip", ""), hit$c.c);
        $$1.a((byte[])$$0.a("icon", bfm.y).orElse(null));
        $$1.a($$0.a(hit$a.d).orElse(hit$a.c));
        $$1.o = $$0.b("acceptedCodeOfConduct", 0);
        return $$1;
    }

    public byte @Nullable [] c() {
        return this.m;
    }

    public void a(byte @Nullable [] $$0) {
        this.m = $$0;
    }

    public boolean d() {
        return this.n == hit$c.a;
    }

    public boolean e() {
        return this.n == hit$c.b;
    }

    public c f() {
        return this.n;
    }

    public boolean a(String $$0) {
        return this.o == $$0.hashCode();
    }

    public void b(String $$0) {
        this.o = $$0.hashCode();
    }

    public void g() {
        this.o = 0;
    }

    public void a(hit $$0) {
        this.b = $$0.b;
        this.a = $$0.a;
        this.m = $$0.m;
    }

    public void b(hit $$0) {
        this.a($$0);
        this.a($$0.b());
        this.n = $$0.n;
    }

    public b h() {
        return this.p;
    }

    public void a(b $$0) {
        this.p = $$0;
    }

    public static byte @Nullable [] b(byte @Nullable [] $$0) {
        if ($$0 != null) {
            try {
                bgo $$1 = bgo.a($$0);
                if ($$1.a() <= 1024 && $$1.b() <= 1024) {
                    return $$0;
                }
            }
            catch (IOException $$2) {
                j.warn("Failed to decode server icon", (Throwable)$$2);
            }
        }
        return null;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("enabled");
        public static final /* enum */ a b = new a("disabled");
        public static final /* enum */ a c = new a("prompt");
        public static final MapCodec<a> d;
        private final yh e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.e = yh.c("manageServer.resourcePack." + $$0);
        }

        public yh a() {
            return this.e;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c};
        }

        static {
            f = hit$a.b();
            d = Codec.BOOL.optionalFieldOf("acceptTextures").xmap($$02 -> $$02.map($$0 -> $$0 != false ? a : b).orElse(c), $$0 -> switch ($$0.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> Optional.of(true);
                case 1 -> Optional.of(false);
                case 2 -> Optional.empty();
            });
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        public static final /* enum */ b d = new b();
        public static final /* enum */ b e = new b();
        private static final /* synthetic */ b[] f;

        public static b[] values() {
            return (b[])f.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e};
        }

        static {
            f = hit$b.a();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        private static final /* synthetic */ c[] d;

        public static c[] values() {
            return (c[])d.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            d = hit$c.a();
        }
    }
}

