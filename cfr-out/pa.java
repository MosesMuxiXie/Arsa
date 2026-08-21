/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 */
import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pa {
    public static CompletableFuture<jt.g> a(CompletableFuture<jf.a> $$0, jt $$1) {
        return $$0.thenApply($$12 -> {
            jr.b $$2 = jr.a(mi.aR);
            iv.a $$3 = new iv.a();
            amp.a.forEach($$1 -> $$1.a($$3::a));
            jt.g $$4 = $$1.a($$2, (jf.a)$$12, $$3);
            jf.a $$5 = $$4.a();
            Optional<jf.b<dxo>> $$6 = $$5.a(mj.aS);
            Optional<jf.b<fes>> $$7 = $$5.a(mj.bp);
            if ($$6.isPresent() || $$7.isPresent()) {
                pc.a((je<fes>)((je)DataFixUtils.orElseGet($$7, () -> $$12.e(mj.bp))), (jf)DataFixUtils.orElseGet($$6, () -> $$12.e(mj.aS)));
            }
            return $$4;
        });
    }
}

