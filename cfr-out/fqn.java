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
import java.util.Set;

public class fqn
extends fpq {
    static final MapCodec<fqn> a = RecordCodecBuilder.mapCodec($$02 -> fqn.a($$02).and((App)fsj.a.fieldOf("amplifier").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fqn::new));
    private final fsi b;

    private fqn(List<frm> $$0, fsi $$1) {
        super($$0);
        this.b = $$1;
    }

    @Override
    public Set<bhv<?>> b() {
        return this.b.b();
    }

    public fps<fqn> a() {
        return fpt.Q;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        int $$2 = bgj.a(this.b.a($$1), 0, 4);
        $$0.b(ki.ak, new dov($$2));
        return $$0;
    }

    public fsi c() {
        return this.b;
    }

    public static fpq.a<?> a(fsi $$0) {
        return fqn.a((List<frm> $$1) -> new fqn((List<frm>)$$1, $$0));
    }
}

