/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntIterator
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class fiv
extends fjn {
    public static final MapCodec<fiv> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)fjp.a.fieldOf("delegate").forGetter($$0 -> $$0.b), (App)cch.e.fieldOf("limit").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, fiv::new));
    private final fjn b;
    private final cch c;

    public fiv(fjn $$0, cch $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    protected fjp<?> a() {
        return fjp.o;
    }

    @Override
    public final List<fjq.d> a(dxf $$0, is $$1, is $$2, List<fjq.d> $$3, List<fjq.d> $$4, fjm $$5) {
        if (this.c.b() == 0 || $$4.isEmpty()) {
            return $$4;
        }
        if ($$3.size() != $$4.size()) {
            bhs.b("Original block info list not in sync with processed list, skipping processing. Original size: " + $$3.size() + ", Processed size: " + $$4.size());
            return $$4;
        }
        bgr $$6 = bgr.a($$0.a().J()).e().a($$1);
        int $$7 = Math.min(this.c.a($$6), $$4.size());
        if ($$7 < 1) {
            return $$4;
        }
        IntArrayList $$8 = bhs.a(IntStream.range(0, $$4.size()), $$6);
        IntIterator $$9 = $$8.intIterator();
        int $$10 = 0;
        while ($$9.hasNext() && $$10 < $$7) {
            fjq.d $$13;
            int $$11 = $$9.nextInt();
            fjq.d $$12 = $$3.get($$11);
            fjq.d $$14 = this.b.a((dwr)$$0, $$1, $$2, $$12, $$13 = $$4.get($$11), $$5);
            if ($$14 == null || $$13.equals($$14)) continue;
            ++$$10;
            $$4.set($$11, $$14);
        }
        return $$4;
    }
}

