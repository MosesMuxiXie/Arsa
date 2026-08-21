/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface ilt {
    public static final Logger a = LogUtils.getLogger();

    public static ilt create(Set<azy<?>> $$0) {
        return ($$1, $$2) -> {
            void $$9;
            void $$10;
            ina $$17;
            void $$15;
            void $$8;
            try {
                bbb $$3 = $$2.f();
                Optional<imz> $$4 = $$3.a(imz.b);
                Optional<inj> $$5 = $$3.a(inj.e);
                List<azy.a<?>> $$6 = $$3.a($$0);
            }
            catch (Exception $$7) {
                a.error("Unable to parse metadata from {}", (Object)$$1, (Object)$$7);
                return null;
            }
            try (InputStream $$11 = $$2.d();){
                fyh $$12 = fyh.a($$11);
            }
            catch (IOException $$14) {
                a.error("Using missing texture, unable to load {}", (Object)$$1, (Object)$$14);
                return null;
            }
            if ($$8.isPresent()) {
                ina $$16 = ((imz)$$8.get()).a($$15.a(), $$15.b());
                if (!bgj.d($$15.a(), $$16.a()) || !bgj.d($$15.b(), $$16.b())) {
                    a.error("Image {} size {},{} is not multiple of frame size {},{}", new Object[]{$$1, $$15.a(), $$15.b(), $$16.a(), $$16.b()});
                    $$15.close();
                    return null;
                }
            } else {
                $$17 = new ina($$15.a(), $$15.b());
            }
            return new ilk($$1, $$17, (fyh)$$15, (Optional<imz>)$$8, (List<azy.a<?>>)$$10, (Optional<inj>)$$9);
        };
    }

    public @Nullable ilk loadSprite(amo var1, bax var2);
}

