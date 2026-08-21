/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface ze {
    public static final Logger a = LogUtils.getLogger();
    public static final ze b = yy::b;
    public static final ze c = $$0 -> {
        a.error("Received chat message from {}, but they have no chat session initialized and secure chat is enforced", (Object)$$0.g());
        return null;
    };

    public @Nullable yy updateAndValidate(yy var1);

    public static class a
    implements ze {
        private final bgw d;
        private final BooleanSupplier e;
        private @Nullable yy f;
        private boolean g = true;

        public a(bgw $$0, BooleanSupplier $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        private boolean a(yy $$0) {
            if ($$0.equals(this.f)) {
                return true;
            }
            if (this.f != null && !$$0.k().a(this.f.k())) {
                a.error("Received out-of-order chat message from {}: expected index > {} for session {}, but was {} for session {}", new Object[]{$$0.g(), this.f.k().b(), this.f.k().d(), $$0.k().b(), $$0.k().d()});
                return false;
            }
            return true;
        }

        private boolean b(yy $$0) {
            if (this.e.getAsBoolean()) {
                a.error("Received message with expired profile public key from {} with session {}", (Object)$$0.g(), (Object)$$0.k().d());
                return false;
            }
            if (!$$0.a(this.d)) {
                a.error("Received message with invalid signature (is the session wrong, or signature cache out of sync?): {}", (Object)yy.a($$0));
                return false;
            }
            return this.a($$0);
        }

        @Override
        public @Nullable yy updateAndValidate(yy $$0) {
            boolean bl2 = this.g = this.g && this.b($$0);
            if (!this.g) {
                return null;
            }
            this.f = $$0;
            return $$0;
        }
    }
}

