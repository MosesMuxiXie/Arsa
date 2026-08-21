/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 */
import com.mojang.datafixers.util.Either;
import java.util.Comparator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public class iry
implements fvs {
    private final Map<Either<UUID, String>, fvr> a = new ConcurrentHashMap<Either<UUID, String>, fvr>();

    @Override
    public void a(fvr $$0) {
        this.a.put($$0.a(), $$0);
    }

    @Override
    public void b(fvr $$0) {
        this.a.get($$0.a()).a($$0);
    }

    @Override
    public void c(fvr $$0) {
        this.a.remove($$0.a());
    }

    public boolean a() {
        return !this.a.isEmpty();
    }

    public void a(cgk $$0, Consumer<fvr> $$12) {
        this.a.values().stream().sorted(Comparator.comparingDouble($$1 -> $$1.a($$0)).reversed()).forEachOrdered($$12);
    }

    @Override
    public /* synthetic */ void a(fvt fvt2) {
        this.c((fvr)fvt2);
    }

    @Override
    public /* synthetic */ void c(fvt fvt2) {
        this.a((fvr)fvt2);
    }
}

