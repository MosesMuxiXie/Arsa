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
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class sm
extends tb {
    public static final MapCodec<sm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)tu.a.forGetter(tb::n)).apply((Applicative)$$0, sm::new));

    public sm(tu<jd<tv>> $$0) {
        super($$0);
    }

    @Override
    public void a(sz $$0) {
        is $$1 = this.b($$0);
        emy $$2 = $$0.a($$1, emy.class);
        $$2.h();
        $$0.e(() -> {
            boolean $$2;
            List<is> $$12 = this.a($$0, ept.d);
            if ($$12.isEmpty()) {
                $$0.b(yh.a("test_block.error.missing", ept.d.a()));
            }
            if ($$2 = $$12.stream().map($$1 -> $$0.a((is)$$1, emy.class)).anyMatch(emy::l)) {
                $$0.d();
            } else {
                this.a($$0, ept.c, $$1 -> $$0.b(yh.b($$1.m())));
                this.a($$0, ept.b, emy::h);
            }
        });
    }

    private void a(sz $$0, ept $$1, Consumer<emy> $$2) {
        List<is> $$3 = this.a($$0, $$1);
        for (is $$4 : $$3) {
            emy $$5 = $$0.a($$4, emy.class);
            if (!$$5.l()) continue;
            $$2.accept($$5);
            $$5.f();
        }
    }

    private is b(sz $$0) {
        List<is> $$1 = this.a($$0, ept.a);
        if ($$1.isEmpty()) {
            $$0.b(yh.a("test_block.error.missing", ept.a.a()));
        }
        if ($$1.size() != 1) {
            $$0.b(yh.a("test_block.error.too_many", ept.a.a()));
        }
        return $$1.getFirst();
    }

    private List<is> a(sz $$0, ept $$1) {
        ArrayList<is> $$2 = new ArrayList<is>();
        $$0.a((is $$3) -> {
            eoh $$4 = $$0.a((is)$$3);
            if ($$4.a(dzs.qa) && $$4.c(eio.b) == $$1) {
                $$2.add($$3.j());
            }
        });
        return $$2;
    }

    public MapCodec<sm> a() {
        return a;
    }

    @Override
    protected yw b() {
        return yh.c("test_instance.type.block_based");
    }
}

