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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class fcu
extends fcy {
    public static final MapCodec<fcu> a = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(fcu::new, $$0 -> Float.valueOf($$0.b));
    private final float b;

    public fcu(float $$0) {
        this.b = $$0;
    }

    @Override
    protected fcz<?> a() {
        return fcz.d;
    }

    @Override
    public void a(fcy.a $$0) {
        bgr $$12 = $$0.b();
        ObjectArrayList<is> $$2 = $$0.c();
        if ($$2.isEmpty()) {
            return;
        }
        if ($$12.i() >= this.b) {
            return;
        }
        ArrayList<is> $$3 = new ArrayList<is>((Collection<is>)$$2);
        bhs.c($$3, $$12);
        Optional<is> $$4 = $$3.stream().filter($$1 -> {
            for (iz $$2 : iz.values()) {
                if ($$0.a($$1.a($$2), $$0 -> $$0.a(bdp.E))) continue;
                return false;
            }
            return true;
        }).findFirst();
        if ($$4.isEmpty()) {
            return;
        }
        $$0.a($$4.get(), (eoh)((eoh)dzs.cQ.m().b(ebo.c, epb.b)).b(ebo.d, true));
    }
}

