/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class axl {
    public static final MapCodec<axl> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)mi.aB.q().fieldOf("type").forGetter(axl::a), (App)bfm.q.fieldOf("level").forGetter(axl::b), (App)Codec.LONG.optionalFieldOf("ticks_left", (Object)0L).forGetter($$0 -> $$0.d)).apply((Applicative)$$02, axl::new));
    private final axm b;
    private final int c;
    private long d;

    public axl(axm $$0, int $$1) {
        this($$0, $$1, $$0.g());
    }

    private axl(axm $$0, int $$1, long $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public String toString() {
        if (this.b.f()) {
            return "Ticket[" + bhs.a(mi.aB, this.b) + " " + this.c + "] with " + this.d + " ticks left ( out of" + this.b.g() + ")";
        }
        return "Ticket[" + bhs.a(mi.aB, this.b) + " " + this.c + "] with no timeout";
    }

    public axm a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public void c() {
        this.d = this.b.g();
    }

    public void d() {
        if (this.b.f()) {
            --this.d;
        }
    }

    public boolean e() {
        return this.b.f() && this.d < 0L;
    }
}

