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
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ana
extends PrintStream {
    private static final Logger b = LogUtils.getLogger();
    protected final String a;

    public ana(String $$0, OutputStream $$1) {
        super($$1, false, StandardCharsets.UTF_8);
        this.a = $$0;
    }

    @Override
    public void println(@Nullable String $$0) {
        this.a($$0);
    }

    @Override
    public void println(@Nullable Object $$0) {
        this.a(String.valueOf($$0));
    }

    protected void a(@Nullable String $$0) {
        b.info("[{}]: {}", (Object)this.a, (Object)$$0);
    }
}

