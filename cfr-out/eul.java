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
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class eul
extends eqg {
    public static final MapCodec<eul> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)fdr.a.fieldOf("settings").forGetter(eul::h)).apply((Applicative)$$0, $$0.stable(eul::new)));
    private final fdr d;

    public eul(fdr $$0) {
        super(new dxz($$0.d()), bhs.b($$0::a));
        this.d = $$0;
    }

    @Override
    public eqh a(jf<ffu> $$0, eve $$1, long $$2) {
        Stream $$3 = this.d.c().map(jh::a).orElseGet(() -> $$0.c().map($$0 -> $$0));
        return eqh.a($$1, $$2, this.b, $$3);
    }

    @Override
    protected MapCodec<? extends eqg> b() {
        return c;
    }

    public fdr h() {
        return this.d;
    }

    @Override
    public void a(axn $$0, dxk $$1, eve $$2, eqf $$3) {
    }

    @Override
    public int a(dwq $$0) {
        return $$0.K_() + Math.min($$0.L_(), this.d.f().size());
    }

    @Override
    public CompletableFuture<eqf> a(evs $$0, eve $$1, dxk $$2, eqf $$3) {
        List<eoh> $$4 = this.d.f();
        is.a $$5 = new is.a();
        euq $$6 = $$3.a(euq.a.c);
        euq $$7 = $$3.a(euq.a.a);
        for (int $$8 = 0; $$8 < Math.min($$3.L_(), $$4.size()); ++$$8) {
            eoh $$9 = $$4.get($$8);
            if ($$9 == null) continue;
            int $$10 = $$3.K_() + $$8;
            for (int $$11 = 0; $$11 < 16; ++$$11) {
                for (int $$12 = 0; $$12 < 16; ++$$12) {
                    $$3.a((is)$$5.d($$11, $$10, $$12), $$9);
                    $$6.a($$11, $$10, $$12, $$9);
                    $$7.a($$11, $$10, $$12, $$9);
                }
            }
        }
        return CompletableFuture.completedFuture($$3);
    }

    @Override
    public int a(int $$0, int $$1, euq.a $$2, dwq $$3, eve $$4) {
        List<eoh> $$5 = this.d.f();
        for (int $$6 = Math.min($$5.size() - 1, $$3.aw()); $$6 >= 0; --$$6) {
            eoh $$7 = $$5.get($$6);
            if ($$7 == null || !$$2.e().test($$7)) continue;
            return $$3.K_() + $$6 + 1;
        }
        return $$3.K_();
    }

    @Override
    public dxa a(int $$02, int $$1, dwq $$2, eve $$3) {
        return new dxa($$2.K_(), (eoh[])this.d.f().stream().limit($$2.L_()).map($$0 -> $$0 == null ? dzs.a.m() : $$0).toArray(eoh[]::new));
    }

    @Override
    public void a(List<String> $$0, eve $$1, is $$2) {
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
        return -63;
    }
}

