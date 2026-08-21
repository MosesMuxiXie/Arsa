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

public class fct
extends fcy {
    public static final MapCodec<fct> a = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(fct::new, $$0 -> Float.valueOf($$0.b));
    private final float b;

    public fct(float $$0) {
        this.b = $$0;
    }

    @Override
    protected fcz<?> a() {
        return fcz.e;
    }

    @Override
    public void a(fcy.a $$0) {
        bgr $$12 = $$0.b();
        if ($$12.i() >= this.b) {
            return;
        }
        ObjectArrayList<is> $$22 = $$0.c();
        if ($$22.isEmpty()) {
            return;
        }
        int $$3 = ((is)$$22.getFirst()).v();
        $$22.stream().filter($$1 -> $$1.v() - $$3 <= 2).forEach($$2 -> {
            for (iz $$3 : iz.c.a) {
                iz $$4;
                is $$5;
                if (!($$12.i() <= 0.25f) || !$$0.a($$5 = $$2.b(($$4 = $$3.g()).j(), 0, $$4.l()))) continue;
                $$0.a($$5, (eoh)((eoh)dzs.gr.m().b(eay.c, $$12.a(3))).b(eay.f, $$3));
            }
        });
    }
}

