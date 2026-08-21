/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class iqy
implements AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private final bxv<iqx> b;
    private final cbs c;

    public iqy(FileChannel $$0, Executor $$1) {
        this.b = new bxv<iqx>(iqx.a, $$0);
        this.c = new cbs($$1, "telemetry-event-log");
    }

    public iqz a() {
        return $$0 -> this.c.a_(() -> {
            try {
                this.b.a($$0);
            }
            catch (IOException $$1) {
                a.error("Failed to write telemetry event to log", (Throwable)$$1);
            }
        });
    }

    @Override
    public void close() {
        this.c.a_(() -> IOUtils.closeQuietly(this.b));
        this.c.close();
    }
}

