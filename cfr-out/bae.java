/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class bae
implements bam {
    private static final Logger d = LogUtils.getLogger();
    public static final String a = "vanilla";
    public static final String b = "tests";
    public static final bag c = bag.a("core");
    private final azn e;
    private final azp f;
    private final amo g;
    private final ftc h;

    public bae(azn $$0, azp $$1, amo $$2, ftc $$3) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
    }

    @Override
    public void loadPacks(Consumer<bah> $$0) {
        bah $$1 = this.a(this.f);
        if ($$1 != null) {
            $$0.accept($$1);
        }
        this.a($$0);
    }

    protected abstract @Nullable bah a(azl var1);

    protected abstract yh a(String var1);

    public azp a() {
        return this.f;
    }

    /*
     * Issues handling annotations - annotations may be inaccurate
     */
    private void a(Consumer<bah> $$0) {
        HashMap<String, @Nullable Function> $$12 = new HashMap<String, Function>();
        this.a($$12::put);
        $$12.forEach(($$1, $$2) -> {
            bah $$3 = (bah)$$2.apply($$1);
            if ($$3 != null) {
                $$0.accept($$3);
            }
        });
    }

    protected void a(BiConsumer<String, Function<String, bah>> $$0) {
        this.f.a(this.e, this.g, (Path $$1) -> this.a((Path)$$1, $$0));
    }

    protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, @Nullable bah>> $$1) {
        if ($$0 != null && Files.isDirectory($$0, new LinkOption[0])) {
            try {
                baf.a($$0, this.h, (Path $$12, bah.c $$2) -> $$1.accept(bae.a($$12), $$1 -> this.a((String)$$1, (bah.c)$$2, this.a((String)$$1))));
            }
            catch (IOException $$22) {
                d.warn("Failed to discover packs in {}", (Object)$$0, (Object)$$22);
            }
        }
    }

    private static String a(Path $$0) {
        return StringUtils.removeEnd((String)$$0.getFileName().toString(), (String)".zip");
    }

    protected abstract @Nullable bah a(String var1, bah.c var2, yh var3);

    protected static bah.c b(final azl $$0) {
        return new bah.c(){

            @Override
            public azl a(azk $$02) {
                return $$0;
            }

            @Override
            public azl a(azk $$02, bah.a $$1) {
                return $$0;
            }
        };
    }
}

