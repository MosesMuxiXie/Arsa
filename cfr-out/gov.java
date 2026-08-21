/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public interface gov
extends gow {
    public void b(Consumer<gow> var1);

    @Override
    default public void a(Consumer<gjc> $$0) {
        this.b($$1 -> $$1.a($$0));
    }

    default public void a() {
        this.b($$0 -> {
            if ($$0 instanceof gov) {
                gov $$1 = (gov)$$0;
                $$1.a();
            }
        });
    }
}

