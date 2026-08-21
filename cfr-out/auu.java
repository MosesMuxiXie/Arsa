/*
 * Decompiled with CFR 0.152.
 */
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;

public class auu
implements aut {
    private final ary a;
    private final eua b;
    private final atw c;

    public auu(ary $$0, atw $$1) {
        this.a = $$0;
        this.b = $$0.bb().n();
        this.c = $$1;
    }

    @Override
    public <T> avk.a<T> a(avk.a<T> $$0, avh $$1) {
        etv<T> $$2 = $$0.a();
        T $$3 = this.b.a($$2);
        T $$4 = $$0.b();
        this.b.a($$2, $$4, (MinecraftServer)this.a);
        this.c.a($$1, "Game rule '{}' updated from '{}' to '{}'", $$2.a(), $$2.a($$3), $$2.a($$4));
        return $$0;
    }

    @Override
    public <T> avk.a<T> a(etv<T> $$0, T $$1) {
        return new avk.a<T>($$0, $$1);
    }

    @Override
    public Stream<etv<?>> a() {
        return this.b.a();
    }

    @Override
    public <T> T a(etv<T> $$0) {
        return this.b.a($$0);
    }
}

