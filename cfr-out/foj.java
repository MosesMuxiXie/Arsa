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
import java.util.List;
import java.util.function.Consumer;

public abstract class foj
extends foq {
    public static final bgp.g e = new bgp.g(){

        @Override
        public String a() {
            return "Empty children list";
        }
    };
    protected final List<foq> f;
    private final foi a;

    protected foj(List<foq> $$0, List<frm> $$1) {
        super($$1);
        this.f = $$0;
        this.a = this.a($$0);
    }

    @Override
    public void a(fog $$0) {
        super.a($$0);
        if (this.f.isEmpty()) {
            $$0.a(e);
        }
        for (int $$1 = 0; $$1 < this.f.size(); ++$$1) {
            this.f.get($$1).a($$0.a(new bgp.d("children", $$1)));
        }
    }

    protected abstract foi a(List<? extends foi> var1);

    @Override
    public final boolean expand(fnz $$0, Consumer<fop> $$1) {
        if (!this.a($$0)) {
            return false;
        }
        return this.a.expand($$0, $$1);
    }

    public static <T extends foj> MapCodec<T> a(a<T> $$0) {
        return RecordCodecBuilder.mapCodec($$1 -> $$1.group((App)foo.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0 -> $$0.f)).and(foj.a($$1).t1()).apply((Applicative)$$1, $$0::create));
    }

    @FunctionalInterface
    public static interface a<T extends foj> {
        public T create(List<foq> var1, List<frm> var2);
    }
}

