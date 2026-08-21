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
import java.util.Objects;

public class csy {
    private final is a;
    private final jd<cta> b;
    private int c;
    private final Runnable d;

    csy(is $$0, jd<cta> $$1, int $$2, Runnable $$3) {
        this.a = $$0.j();
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public csy(is $$0, jd<cta> $$1, Runnable $$2) {
        this($$0, $$1, $$1.a().b(), $$2);
    }

    public a a() {
        return new a(this.a, this.b, this.c);
    }

    @Deprecated
    @bht
    public int b() {
        return this.c;
    }

    protected boolean c() {
        if (this.c <= 0) {
            return false;
        }
        --this.c;
        this.d.run();
        return true;
    }

    protected boolean d() {
        if (this.c >= this.b.a().b()) {
            return false;
        }
        ++this.c;
        this.d.run();
        return true;
    }

    public boolean e() {
        return this.c > 0;
    }

    public boolean f() {
        return this.c != this.b.a().b();
    }

    public is g() {
        return this.a;
    }

    public jd<cta> h() {
        return this.b;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((csy)$$0).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public static final class a
    extends Record {
        private final is b;
        private final jd<cta> c;
        private final int d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)is.a.fieldOf("pos").forGetter(a::a), (App)amr.a(mj.ai).fieldOf("type").forGetter(a::b), (App)Codec.INT.fieldOf("free_tickets").orElse((Object)0).forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(is $$0, jd<cta> $$1, int $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public csy a(Runnable $$0) {
            return new csy(this.b, this.c, this.d, $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "pos;poiType;freeTickets", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "pos;poiType;freeTickets", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "pos;poiType;freeTickets", "b", "c", "d"}, this, $$0);
        }

        public is a() {
            return this.b;
        }

        public jd<cta> b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }
    }
}

