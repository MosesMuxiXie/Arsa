/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class euh
extends eqg {
    public static final MapCodec<euh> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ams.d(dxv.b)).apply((Applicative)$$0, $$0.stable(euh::new)));
    private static final int h = 2;
    private static final List<eoh> i = StreamSupport.stream(mi.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
    private static final int j = bgj.d(bgj.a((float)i.size()));
    private static final int k = bgj.d((float)i.size() / (float)j);
    protected static final eoh d = dzs.a.m();
    protected static final eoh e = dzs.iO.m();
    public static final int f = 70;
    public static final int g = 60;

    public euh(jd.c<dxo> $$0) {
        super(new dxz($$0));
    }

    @Override
    protected MapCodec<? extends eqg> b() {
        return c;
    }

    @Override
    public void a(axn $$0, dxk $$1, eve $$2, eqf $$3) {
    }

    @Override
    public void a(dxn $$0, eqf $$1, dxk $$2) {
        is.a $$3 = new is.a();
        dvu $$4 = $$1.f();
        int $$5 = $$4.h;
        int $$6 = $$4.i;
        for (int $$7 = 0; $$7 < 16; ++$$7) {
            for (int $$8 = 0; $$8 < 16; ++$$8) {
                int $$9 = jw.a($$5, $$7);
                int $$10 = jw.a($$6, $$8);
                $$0.a((is)$$3.d($$9, 60, $$10), e, 2);
                eoh $$11 = euh.a($$9, $$10);
                $$0.a((is)$$3.d($$9, 70, $$10), $$11, 2);
            }
        }
    }

    @Override
    public CompletableFuture<eqf> a(evs $$0, eve $$1, dxk $$2, eqf $$3) {
        return CompletableFuture.completedFuture($$3);
    }

    @Override
    public int a(int $$0, int $$1, euq.a $$2, dwq $$3, eve $$4) {
        return 0;
    }

    @Override
    public dxa a(int $$0, int $$1, dwq $$2, eve $$3) {
        return new dxa(0, new eoh[0]);
    }

    @Override
    public void a(List<String> $$0, eve $$1, is $$2) {
    }

    public static eoh a(int $$0, int $$1) {
        int $$3;
        eoh $$2 = d;
        if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0 && ($$0 /= 2) <= j && ($$1 /= 2) <= k && ($$3 = bgj.a($$0 * j + $$1)) < i.size()) {
            $$2 = i.get($$3);
        }
        return $$2;
    }

    @Override
    public void a(axn $$0, long $$1, eve $$2, dxq $$3, dxk $$4, eqf $$5) {
    }

    @Override
    public void a(axn $$0) {
    }

    @Override
    public int g() {
        return 0;
    }

    @Override
    public int e() {
        return 384;
    }

    @Override
    public int f() {
        return 63;
    }
}

