/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;

public interface fne {
    public a a();

    public long b();

    public long c();

    public boolean f();

    public boolean h();

    public void b(boolean var1);

    public boolean k();

    public ccz p();

    public boolean q();

    default public void a(n $$0, dwq $$1) {
        $$0.a("Level spawn location", () -> n.a($$1, this.a().b()));
        $$0.a("Level time", () -> String.format(Locale.ROOT, "%d game time, %d day time", this.b(), this.c()));
    }

    public static final class a
    extends Record {
        private final jc e;
        private final float f;
        private final float g;
        public static final a a = new a(jc.a(dwo.h, is.c), 0.0f, 0.0f);
        public static final MapCodec<a> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)jc.a.forGetter(a::c), (App)Codec.floatRange((float)-180.0f, (float)180.0f).fieldOf("yaw").forGetter(a::d), (App)Codec.floatRange((float)-90.0f, (float)90.0f).fieldOf("pitch").forGetter(a::e)).apply((Applicative)$$0, a::new));
        public static final Codec<a> c = b.codec();
        public static final aao<ByteBuf, a> d = aao.a(jc.c, a::c, aam.l, a::d, aam.l, a::e, a::new);

        public a(jc $$0, float $$1, float $$2) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
        }

        public static a a(amt<dwo> $$0, is $$1, float $$2, float $$3) {
            return new a(jc.a($$0, $$1.j()), bgj.f($$2), bgj.a($$3, -90.0f, 90.0f));
        }

        public amt<dwo> a() {
            return this.e.a();
        }

        public is b() {
            return this.e.b();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "globalPos;yaw;pitch", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "globalPos;yaw;pitch", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "globalPos;yaw;pitch", "e", "f", "g"}, this, $$0);
        }

        public jc c() {
            return this.e;
        }

        public float d() {
            return this.f;
        }

        public float e() {
            return this.g;
        }
    }
}

