/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public interface dxj {
    public void a(cgu<?> var1, bgr var2);

    public static void a(@Nullable dpf<eld<?>> $$0, Consumer<yh> $$1, String $$2) {
        yh $$3 = dxj.a($$0, $$2);
        if ($$3 != null) {
            $$1.accept($$3);
        } else {
            $$1.accept(yg.a);
            $$1.accept(yh.c("block.minecraft.spawner.desc1").a(l.h));
            $$1.accept(yg.a().b(yh.c("block.minecraft.spawner.desc2").a(l.j)));
        }
    }

    public static @Nullable yh a(@Nullable dpf<eld<?>> $$02, String $$1) {
        if ($$02 == null) {
            return null;
        }
        return $$02.b().m($$1).flatMap($$0 -> $$0.m("entity")).flatMap($$0 -> $$0.a("id", cgu.a)).map($$0 -> yh.c($$0.g()).a(l.h)).orElse(null);
    }
}

