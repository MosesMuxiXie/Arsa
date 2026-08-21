/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuQuery;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.OptionalLong;
import org.jspecify.annotations.Nullable;

public class fzd {
    private @Nullable CommandEncoder a;
    private @Nullable GpuQuery b;

    public static fzd a() {
        return fzd$b.a;
    }

    public boolean b() {
        return this.b != null;
    }

    public void c() {
        RenderSystem.assertOnRenderThread();
        if (this.b != null) {
            throw new IllegalStateException("Current profile not ended");
        }
        this.a = RenderSystem.getDevice().createCommandEncoder();
        this.b = this.a.timerQueryBegin();
    }

    public a d() {
        RenderSystem.assertOnRenderThread();
        if (this.b == null || this.a == null) {
            throw new IllegalStateException("endProfile called before beginProfile");
        }
        this.a.timerQueryEnd(this.b);
        a $$0 = new a(this.b);
        this.b = null;
        this.a = null;
        return $$0;
    }

    static class b {
        static final fzd a = fzd$b.a();

        private b() {
        }

        private static fzd a() {
            return new fzd();
        }
    }

    public static class a {
        private static final long a = 0L;
        private static final long b = -1L;
        private final GpuQuery c;
        private long d = 0L;

        a(GpuQuery $$0) {
            this.c = $$0;
        }

        public void a() {
            RenderSystem.assertOnRenderThread();
            if (this.d != 0L) {
                return;
            }
            this.d = -1L;
            this.c.close();
        }

        public boolean b() {
            RenderSystem.assertOnRenderThread();
            if (this.d != 0L) {
                return true;
            }
            OptionalLong $$0 = this.c.getValue();
            if ($$0.isPresent()) {
                this.d = $$0.getAsLong();
                this.c.close();
                return true;
            }
            return false;
        }

        public long c() {
            OptionalLong $$0;
            RenderSystem.assertOnRenderThread();
            if (this.d == 0L && ($$0 = this.c.getValue()).isPresent()) {
                this.d = $$0.getAsLong();
                this.c.close();
            }
            return this.d;
        }
    }
}

