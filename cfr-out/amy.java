/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.OutputStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class amy
extends ana {
    private static final Logger b = LogUtils.getLogger();

    public amy(String $$0, OutputStream $$1) {
        super($$0, $$1);
    }

    @Override
    protected void a(@Nullable String $$0) {
        StackTraceElement[] $$1 = Thread.currentThread().getStackTrace();
        StackTraceElement $$2 = $$1[Math.min(3, $$1.length)];
        b.info("[{}]@.({}:{}): {}", new Object[]{this.a, $$2.getFileName(), $$2.getLineNumber(), $$0});
    }
}

