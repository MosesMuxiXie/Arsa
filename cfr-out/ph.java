/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ph
implements pg.a {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = azn.b.a() + "/minecraft/structure/";

    @Override
    public uz apply(String $$0, uz $$1) {
        if ($$0.startsWith(b)) {
            return ph.a($$0, $$1);
        }
        return $$1;
    }

    public static uz a(String $$0, uz $$1) {
        fjq $$2 = new fjq();
        int $$3 = vo.b($$1, 500);
        int $$4 = 4650;
        if ($$3 < 4650) {
            a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4650, $$0});
        }
        uz $$5 = bhz.g.a(bia.a(), $$1, $$3);
        $$2.a(mi.e, $$5);
        return $$2.a(new uz());
    }
}

