/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class djd
implements ccv,
djb {
    private final jm<dlt> b = jm.a(1, dlt.l);
    private @Nullable dqx<?> c;

    @Override
    public int b() {
        return 1;
    }

    @Override
    public boolean c() {
        for (dlt $$0 : this.b) {
            if ($$0.f()) continue;
            return false;
        }
        return true;
    }

    @Override
    public dlt a(int $$0) {
        return this.b.get(0);
    }

    @Override
    public dlt a(int $$0, int $$1) {
        return ccw.a(this.b, 0);
    }

    @Override
    public dlt b(int $$0) {
        return ccw.a(this.b, 0);
    }

    @Override
    public void a(int $$0, dlt $$1) {
        this.b.set(0, $$1);
    }

    @Override
    public void e() {
    }

    @Override
    public boolean a(ddm $$0) {
        return true;
    }

    @Override
    public void a() {
        this.b.clear();
    }

    @Override
    public void a(@Nullable dqx<?> $$0) {
        this.c = $$0;
    }

    @Override
    public @Nullable dqx<?> d() {
        return this.c;
    }
}

