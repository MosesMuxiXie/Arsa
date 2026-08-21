/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public class ims
extends uu {
    private static final Logger b = LogUtils.getLogger();
    private final Map<String, String> c;
    private final boolean d;

    private ims(Map<String, String> $$0, boolean $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public static ims a(baz $$0, List<String> $$1, boolean $$2) {
        HashMap<String, String> $$3 = new HashMap<String, String>();
        for (String $$4 : $$1) {
            String $$5 = String.format(Locale.ROOT, "lang/%s.json", $$4);
            for (String $$6 : $$0.a()) {
                try {
                    amo $$7 = amo.a($$6, $$5);
                    ims.a($$4, $$0.a($$7), $$3);
                }
                catch (Exception $$8) {
                    b.warn("Skipped language file: {}:{} ({})", new Object[]{$$6, $$5, $$8.toString()});
                }
            }
        }
        ut.a().a($$3);
        return new ims(Map.copyOf($$3), $$2);
    }

    private static void a(String $$0, List<bax> $$1, Map<String, String> $$2) {
        for (bax $$3 : $$1) {
            try {
                InputStream $$4 = $$3.d();
                try {
                    uu.a($$4, $$2::put);
                }
                finally {
                    if ($$4 == null) continue;
                    $$4.close();
                }
            }
            catch (IOException $$5) {
                b.warn("Failed to load translations for {} from pack {}", new Object[]{$$0, $$3.b(), $$5});
            }
        }
    }

    @Override
    public String a(String $$0, String $$1) {
        return this.c.getOrDefault($$0, $$1);
    }

    @Override
    public boolean b(String $$0) {
        return this.c.containsKey($$0);
    }

    @Override
    public boolean b() {
        return this.d;
    }

    @Override
    public bfr a(yn $$0) {
        return imt.a($$0, this.d);
    }
}

