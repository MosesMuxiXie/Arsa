/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Properties;
import org.slf4j.Logger;

public class amz {
    private static final Logger a = LogUtils.getLogger();
    private final Path b;
    private final boolean c;

    public amz(Path $$0) {
        this.b = $$0;
        this.c = w.aX || this.b();
    }

    private boolean b() {
        boolean bl2;
        block8: {
            InputStream $$0 = Files.newInputStream(this.b, new OpenOption[0]);
            try {
                Properties $$1 = new Properties();
                $$1.load($$0);
                bl2 = Boolean.parseBoolean($$1.getProperty("eula", "false"));
                if ($$0 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if ($$0 != null) {
                        try {
                            $$0.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception $$2) {
                    a.warn("Failed to load {}", (Object)this.b);
                    this.c();
                    return false;
                }
            }
            $$0.close();
        }
        return bl2;
    }

    public boolean a() {
        return this.c;
    }

    private void c() {
        if (w.aX) {
            return;
        }
        try (OutputStream $$0 = Files.newOutputStream(this.b, new OpenOption[0]);){
            Properties $$1 = new Properties();
            $$1.setProperty("eula", "false");
            $$1.store($$0, "By changing the setting below to TRUE you are indicating your agreement to our EULA (" + String.valueOf(bez.b) + ").");
        }
        catch (Exception $$2) {
            a.warn("Failed to save {}", (Object)this.b, (Object)$$2);
        }
    }
}

