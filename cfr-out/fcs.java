/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fcs
extends fcy {
    public static final MapCodec<fcs> a = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(fcs::new, $$0 -> Float.valueOf($$0.d));
    private static final iz b = iz.d;
    private static final iz[] c = (iz[])iz.c.a.a().filter($$0 -> $$0 != b.g()).toArray(iz[]::new);
    private final float d;

    public fcs(float $$0) {
        this.d = $$0;
    }

    @Override
    protected fcz<?> a() {
        return fcz.f;
    }

    @Override
    public void a(fcy.a $$02) {
        ObjectArrayList<is> $$12 = $$02.d();
        ObjectArrayList<is> $$2 = $$02.c();
        if ($$2.isEmpty()) {
            return;
        }
        bgr $$3 = $$02.b();
        if ($$3.i() >= this.d) {
            return;
        }
        int $$4 = !$$12.isEmpty() ? Math.max(((is)$$12.getFirst()).v() - 1, ((is)$$2.getFirst()).v() + 1) : Math.min(((is)$$2.getFirst()).v() + 1 + $$3.a(3), ((is)$$2.getLast()).v());
        List $$5 = $$2.stream().filter($$1 -> $$1.v() == $$4).flatMap($$0 -> Stream.of(c).map($$0::a)).collect(Collectors.toList());
        if ($$5.isEmpty()) {
            return;
        }
        bhs.c($$5, $$3);
        Optional<is> $$6 = $$5.stream().filter($$1 -> $$02.a((is)$$1) && $$02.a($$1.a(b))).findFirst();
        if ($$6.isEmpty()) {
            return;
        }
        $$02.a($$6.get(), (eoh)dzs.qe.m().b(dzk.b, b));
        $$02.a().a($$6.get(), eld.I).ifPresent($$1 -> {
            int $$2 = 2 + $$3.a(2);
            for (int $$3 = 0; $$3 < $$2; ++$$3) {
                $$1.a(eky.c.a($$3.a(599)));
            }
        });
    }
}

