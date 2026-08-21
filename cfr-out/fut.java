/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public abstract class fut {
    public boolean a(@Nullable fut $$0) {
        if ($$0 == null) {
            return false;
        }
        return this == $$0;
    }

    public abstract String c();

    public abstract yw d(yh var1);

    public abstract boolean j();

    public abstract boolean i();

    public abstract b k();

    public abstract l o();

    public abstract Collection<String> h();

    public abstract b l();

    public abstract a m();

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("always", 0);
        public static final /* enum */ a b = new a("never", 1);
        public static final /* enum */ a c = new a("pushOtherTeams", 2);
        public static final /* enum */ a d = new a("pushOwnTeam", 3);
        public static final Codec<a> e;
        private static final IntFunction<a> i;
        public static final aao<ByteBuf, a> f;
        public final String g;
        public final int h;
        private static final /* synthetic */ a[] j;

        public static a[] values() {
            return (a[])j.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, int $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        public yh a() {
            return yh.c("team.collision." + this.g);
        }

        @Override
        public String c() {
            return this.g;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            j = fut$a.b();
            e = bhh.a(a::values);
            i = beu.a($$0 -> $$0.h, fut$a.values(), beu.a.a);
            f = aam.a(i, (T $$0) -> $$0.h);
        }
    }

    public static final class b
    extends Enum<b>
    implements bhh {
        public static final /* enum */ b a = new b("always", 0);
        public static final /* enum */ b b = new b("never", 1);
        public static final /* enum */ b c = new b("hideForOtherTeams", 2);
        public static final /* enum */ b d = new b("hideForOwnTeam", 3);
        public static final Codec<b> e;
        private static final IntFunction<b> i;
        public static final aao<ByteBuf, b> f;
        public final String g;
        public final int h;
        private static final /* synthetic */ b[] j;

        public static b[] values() {
            return (b[])j.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0, int $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        public yh a() {
            return yh.c("team.visibility." + this.g);
        }

        @Override
        public String c() {
            return this.g;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d};
        }

        static {
            j = fut$b.b();
            e = bhh.a(b::values);
            i = beu.a($$0 -> $$0.h, fut$b.values(), beu.a.a);
            f = aam.a(i, (T $$0) -> $$0.h);
        }
    }
}

