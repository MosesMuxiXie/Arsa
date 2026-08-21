/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.time.Duration;
import org.jspecify.annotations.Nullable;

public class irk {
    private final boolean a;
    private final @Nullable Duration b;

    public irk(boolean $$0, @Nullable Duration $$1) {
        this.b = $$1;
        this.a = $$0;
    }

    public void a(ira $$02) {
        if (this.b != null) {
            $$02.send(irb.d, $$0 -> {
                $$0.a(ird.x, (int)this.b.toMillis());
                $$0.a(ird.y, this.a);
            });
        }
    }
}

