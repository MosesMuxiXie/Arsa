/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Collections;
import java.util.List;
import org.jspecify.annotations.Nullable;

public interface djb {
    public void a(@Nullable dqx<?> var1);

    public @Nullable dqx<?> d();

    default public void a(ddm $$0, List<dlt> $$1) {
        dqx<?> $$2 = this.d();
        if ($$2 != null) {
            $$0.a($$2, $$1);
            if (!$$2.b().ar_()) {
                $$0.a(Collections.singleton($$2));
                this.a(null);
            }
        }
    }

    default public boolean a(axg $$0, dqx<?> $$1) {
        if ($$1.b().ar_() || !$$0.A().U().a(eua.u).booleanValue() || $$0.L().b($$1.a())) {
            this.a($$1);
            return true;
        }
        return false;
    }
}

