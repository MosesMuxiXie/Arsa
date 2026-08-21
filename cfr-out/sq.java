/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public class sq
extends tb {
    public static final MapCodec<sq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amt.a(mj.aG).fieldOf("function").forGetter(sq::q), (App)tu.a.forGetter(tb::n)).apply((Applicative)$$0, sq::new));
    private final amt<Consumer<sz>> c;

    public sq(amt<Consumer<sz>> $$0, tu<jd<tv>> $$1) {
        super($$1);
        this.c = $$0;
    }

    @Override
    public void a(sz $$0) {
        $$0.a().J_().c(this.c).map(jd.c::a).orElseThrow(() -> new IllegalStateException("Trying to access missing test function: " + String.valueOf(this.c.a()))).accept($$0);
    }

    private amt<Consumer<sz>> q() {
        return this.c;
    }

    public MapCodec<sq> a() {
        return a;
    }

    @Override
    protected yw b() {
        return yh.c("test_instance.type.function");
    }

    @Override
    public yh c() {
        return this.o().b(this.a("test_instance.description.function", this.c.a().toString())).b(this.p());
    }
}

