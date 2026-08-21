/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public interface yf {
    public static final Codec<yf> a = yf$a.j.dispatch("action", yf::a, $$0 -> $$0.m);

    public a a();

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("open_url", true, yf$f.b);
        public static final /* enum */ a b = new a("open_file", false, yf$e.b);
        public static final /* enum */ a c = new a("run_command", true, yf$g.b);
        public static final /* enum */ a d = new a("suggest_command", true, yf$i.b);
        public static final /* enum */ a e = new a("show_dialog", true, yf$h.b);
        public static final /* enum */ a f = new a("change_page", true, yf$b.b);
        public static final /* enum */ a g = new a("copy_to_clipboard", true, yf$c.b);
        public static final /* enum */ a h = new a("custom", true, yf$d.b);
        public static final Codec<a> i;
        public static final Codec<a> j;
        private final boolean k;
        private final String l;
        final MapCodec<? extends yf> m;
        private static final /* synthetic */ a[] n;

        public static a[] values() {
            return (a[])n.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, boolean $$1, MapCodec<? extends yf> $$2) {
            this.l = $$0;
            this.k = $$1;
            this.m = $$2;
        }

        public boolean a() {
            return this.k;
        }

        @Override
        public String c() {
            return this.l;
        }

        public MapCodec<? extends yf> b() {
            return this.m;
        }

        public static DataResult<a> a(a $$0) {
            if (!$$0.a()) {
                return DataResult.error(() -> "Click event type not allowed: " + String.valueOf($$0));
            }
            return DataResult.success((Object)$$0, (Lifecycle)Lifecycle.stable());
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b, c, d, e, f, g, h};
        }

        static {
            n = yf$a.d();
            i = bhh.a(a::values);
            j = i.validate(a::a);
        }
    }

    public static final class d
    extends Record
    implements yf {
        private final amo c;
        private final Optional<vz> d;
        public static final MapCodec<d> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("id").forGetter(d::b), (App)bfm.c.optionalFieldOf("payload").forGetter(d::c)).apply((Applicative)$$0, d::new));

        public d(amo $$0, Optional<vz> $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public a a() {
            return yf$a.h;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "id;payload", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "id;payload", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "id;payload", "c", "d"}, this, $$0);
        }

        public amo b() {
            return this.c;
        }

        public Optional<vz> c() {
            return this.d;
        }
    }

    public static final class c
    extends Record
    implements yf {
        private final String c;
        public static final MapCodec<c> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("value").forGetter(c::b)).apply((Applicative)$$0, c::new));

        public c(String $$0) {
            this.c = $$0;
        }

        @Override
        public a a() {
            return yf$a.g;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "value", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "value", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "value", "c"}, this, $$0);
        }

        public String b() {
            return this.c;
        }
    }

    public static final class b
    extends Record
    implements yf {
        private final int c;
        public static final MapCodec<b> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.r.fieldOf("page").forGetter(b::b)).apply((Applicative)$$0, b::new));

        public b(int $$0) {
            this.c = $$0;
        }

        @Override
        public a a() {
            return yf$a.f;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "page", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "page", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "page", "c"}, this, $$0);
        }

        public int b() {
            return this.c;
        }
    }

    public static final class h
    extends Record
    implements yf {
        private final jd<asj> c;
        public static final MapCodec<h> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)asj.d.fieldOf("dialog").forGetter(h::b)).apply((Applicative)$$0, h::new));

        public h(jd<asj> $$0) {
            this.c = $$0;
        }

        @Override
        public a a() {
            return yf$a.e;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "dialog", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "dialog", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "dialog", "c"}, this, $$0);
        }

        public jd<asj> b() {
            return this.c;
        }
    }

    public static final class i
    extends Record
    implements yf {
        private final String c;
        public static final MapCodec<i> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.Q.fieldOf("command").forGetter(i::b)).apply((Applicative)$$0, i::new));

        public i(String $$0) {
            this.c = $$0;
        }

        @Override
        public a a() {
            return yf$a.d;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{i.class, "command", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{i.class, "command", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{i.class, "command", "c"}, this, $$0);
        }

        public String b() {
            return this.c;
        }
    }

    public static final class g
    extends Record
    implements yf {
        private final String c;
        public static final MapCodec<g> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.Q.fieldOf("command").forGetter(g::b)).apply((Applicative)$$0, g::new));

        public g(String $$0) {
            this.c = $$0;
        }

        @Override
        public a a() {
            return yf$a.c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "command", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "command", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "command", "c"}, this, $$0);
        }

        public String b() {
            return this.c;
        }
    }

    public record e(String c) implements yf
    {
        public static final MapCodec<e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("path").forGetter(e::c)).apply((Applicative)$$0, e::new));

        public e(File $$0) {
            this($$0.toString());
        }

        public e(Path $$0) {
            this($$0.toFile());
        }

        public File b() {
            return new File(this.c);
        }

        @Override
        public a a() {
            return yf$a.b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "path", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "path", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "path", "c"}, this, $$0);
        }
    }

    public static final class f
    extends Record
    implements yf {
        private final URI c;
        public static final MapCodec<f> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.P.fieldOf("url").forGetter(f::b)).apply((Applicative)$$0, f::new));

        public f(URI $$0) {
            this.c = $$0;
        }

        @Override
        public a a() {
            return yf$a.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "uri", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "uri", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "uri", "c"}, this, $$0);
        }

        public URI b() {
            return this.c;
        }
    }
}

