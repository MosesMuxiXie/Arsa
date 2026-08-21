/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class zc {
    static final Logger a = LogUtils.getLogger();
    @Nullable zd b;
    Instant c = Instant.EPOCH;

    public zc(UUID $$0, UUID $$1) {
        this.b = zd.a($$0, $$1);
    }

    public c a(bgx $$0) {
        return $$1 -> {
            zd $$22 = this.b;
            if ($$22 == null) {
                return null;
            }
            this.b = $$22.a();
            return new yu($$0.sign($$2 -> yy.a($$2, $$22, $$1)));
        };
    }

    public b a(final dds $$0) {
        final bgw $$1 = $$0.a();
        return new b(){

            @Override
            public yy unpack(@Nullable yu $$02, zb $$12) throws a {
                if ($$02 == null) {
                    throw new a(zc$a.a);
                }
                if ($$0.b().a()) {
                    throw new a(zc$a.c);
                }
                zd $$2 = zc.this.b;
                if ($$2 == null) {
                    throw new a(zc$a.b);
                }
                if ($$12.b().isBefore(zc.this.c)) {
                    this.setChainBroken();
                    throw new a(zc$a.e);
                }
                zc.this.c = $$12.b();
                yy $$3 = new yy($$2, $$02, $$12, null, yl.c);
                if (!$$3.a($$1)) {
                    this.setChainBroken();
                    throw new a(zc$a.d);
                }
                if ($$3.a(Instant.now())) {
                    a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", (Object)$$12.a());
                }
                zc.this.b = $$2.a();
                return $$3;
            }

            @Override
            public void setChainBroken() {
                zc.this.b = null;
            }
        };
    }

    @FunctionalInterface
    public static interface c {
        public static final c a = $$0 -> null;

        public @Nullable yu pack(zb var1);
    }

    public static class a
    extends zi {
        static final yh a = yh.c("chat.disabled.missingProfileKey");
        static final yh b = yh.c("chat.disabled.chain_broken");
        static final yh c = yh.c("chat.disabled.expiredProfileKey");
        static final yh d = yh.c("chat.disabled.invalid_signature");
        static final yh e = yh.c("chat.disabled.out_of_order_chat");

        public a(yh $$0) {
            super($$0);
        }
    }

    @FunctionalInterface
    public static interface b {
        public static b unsigned(UUID $$0, BooleanSupplier $$1) {
            return ($$2, $$3) -> {
                if ($$1.getAsBoolean()) {
                    throw new a(zc$a.a);
                }
                return yy.a($$0, $$3.a());
            };
        }

        public yy unpack(@Nullable yu var1, zb var2) throws a;

        default public void setChainBroken() {
        }
    }
}

