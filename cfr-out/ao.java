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
import java.util.Optional;

public class ao {
    public static final Codec<ao> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dlt.d.fieldOf("icon").forGetter(ao::c), (App)yj.a.fieldOf("title").forGetter(ao::a), (App)yj.a.fieldOf("description").forGetter(ao::b), (App)iu.b.a.optionalFieldOf("background").forGetter(ao::d), (App)ai.d.optionalFieldOf("frame", (Object)ai.a).forGetter(ao::e), (App)Codec.BOOL.optionalFieldOf("show_toast", (Object)true).forGetter(ao::h), (App)Codec.BOOL.optionalFieldOf("announce_to_chat", (Object)true).forGetter(ao::i), (App)Codec.BOOL.optionalFieldOf("hidden", (Object)false).forGetter(ao::j)).apply((Applicative)$$0, ao::new));
    public static final aao<xq, ao> b = aao.a(ao::a, ao::b);
    private final yh c;
    private final yh d;
    private final dlt e;
    private final Optional<iu.b> f;
    private final ai g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private float k;
    private float l;

    public ao(dlt $$0, yh $$1, yh $$2, Optional<iu.b> $$3, ai $$4, boolean $$5, boolean $$6, boolean $$7) {
        this.c = $$1;
        this.d = $$2;
        this.e = $$0;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
        this.j = $$7;
    }

    public void a(float $$0, float $$1) {
        this.k = $$0;
        this.l = $$1;
    }

    public yh a() {
        return this.c;
    }

    public yh b() {
        return this.d;
    }

    public dlt c() {
        return this.e;
    }

    public Optional<iu.b> d() {
        return this.f;
    }

    public ai e() {
        return this.g;
    }

    public float f() {
        return this.k;
    }

    public float g() {
        return this.l;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.i;
    }

    public boolean j() {
        return this.j;
    }

    private void a(xq $$0) {
        yj.d.encode($$0, this.c);
        yj.d.encode($$0, this.d);
        dlt.j.encode($$0, this.e);
        $$0.a(this.g);
        int $$1 = 0;
        if (this.f.isPresent()) {
            $$1 |= 1;
        }
        if (this.h) {
            $$1 |= 2;
        }
        if (this.j) {
            $$1 |= 4;
        }
        $$0.q($$1);
        this.f.map(iu::a).ifPresent($$0::a);
        $$0.a(this.k);
        $$0.a(this.l);
    }

    private static ao b(xq $$0) {
        yh $$1 = (yh)yj.d.decode($$0);
        yh $$2 = (yh)yj.d.decode($$0);
        dlt $$3 = (dlt)dlt.j.decode($$0);
        ai $$4 = $$0.b(ai.class);
        int $$5 = $$0.readInt();
        Optional<iu.b> $$6 = ($$5 & 1) != 0 ? Optional.of(new iu.b($$0.q())) : Optional.empty();
        boolean $$7 = ($$5 & 2) != 0;
        boolean $$8 = ($$5 & 4) != 0;
        ao $$9 = new ao($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
        $$9.a($$0.readFloat(), $$0.readFloat());
        return $$9;
    }
}

