/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.nio.file.Path;
import org.slf4j.Logger;

public class gfe {
    private static final Logger b = LogUtils.getLogger();
    public static final int a = 9;
    private final Path c;
    private final DataFixer d;
    private final hnk[] e = new hnk[9];
    private boolean f;

    public gfe(Path $$0, DataFixer $$1) {
        this.c = $$0.resolve("hotbar.nbt");
        this.d = $$1;
        for (int $$2 = 0; $$2 < 9; ++$$2) {
            this.e[$$2] = new hnk();
        }
    }

    private void b() {
        try {
            uz $$02 = vm.a(this.c);
            if ($$02 == null) {
                return;
            }
            int $$1 = vo.b($$02, 1343);
            $$02 = bhz.e.a(this.d, $$02, $$1);
            for (int $$2 = 0; $$2 < 9; ++$$2) {
                this.e[$$2] = hnk.a.parse((DynamicOps)vn.a, (Object)$$02.a(String.valueOf($$2))).resultOrPartial($$0 -> b.warn("Failed to parse hotbar: {}", $$0)).orElseGet(hnk::new);
            }
        }
        catch (Exception $$3) {
            b.error("Failed to load creative mode options", (Throwable)$$3);
        }
    }

    public void a() {
        try {
            uz $$0 = vo.e(new uz());
            for (int $$1 = 0; $$1 < 9; ++$$1) {
                hnk $$2 = this.a($$1);
                DataResult $$3 = hnk.a.encodeStart((DynamicOps)vn.a, (Object)$$2);
                $$0.a(String.valueOf($$1), (vz)$$3.getOrThrow());
            }
            vm.b($$0, this.c);
        }
        catch (Exception $$4) {
            b.error("Failed to save creative mode options", (Throwable)$$4);
        }
    }

    public hnk a(int $$0) {
        if (!this.f) {
            this.b();
            this.f = true;
        }
        return this.e[$$0];
    }
}

