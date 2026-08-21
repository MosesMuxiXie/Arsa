/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.openal.AL10
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.sound.sampled.AudioFormat;
import org.jspecify.annotations.Nullable;
import org.lwjgl.openal.AL10;
import org.slf4j.Logger;

public class fwg {
    private static final Logger b = LogUtils.getLogger();
    private static final int c = 4;
    public static final int a = 1;
    private final int d;
    private final AtomicBoolean e = new AtomicBoolean(true);
    private int f = 16384;
    private @Nullable iqf g;

    static @Nullable fwg a() {
        int[] $$0 = new int[1];
        AL10.alGenSources((int[])$$0);
        if (fwk.a("Allocate new source")) {
            return null;
        }
        return new fwg($$0[0]);
    }

    private fwg(int $$0) {
        this.d = $$0;
    }

    public void b() {
        if (this.e.compareAndSet(true, false)) {
            AL10.alSourceStop((int)this.d);
            fwk.a("Stop");
            if (this.g != null) {
                try {
                    this.g.close();
                }
                catch (IOException $$0) {
                    b.error("Failed to close audio stream", (Throwable)$$0);
                }
                this.l();
                this.g = null;
            }
            AL10.alDeleteSources((int[])new int[]{this.d});
            fwk.a("Cleanup");
        }
    }

    public void c() {
        AL10.alSourcePlay((int)this.d);
    }

    private int k() {
        if (!this.e.get()) {
            return 4116;
        }
        return AL10.alGetSourcei((int)this.d, (int)4112);
    }

    public void d() {
        if (this.k() == 4114) {
            AL10.alSourcePause((int)this.d);
        }
    }

    public void e() {
        if (this.k() == 4115) {
            AL10.alSourcePlay((int)this.d);
        }
    }

    public void f() {
        if (this.e.get()) {
            AL10.alSourceStop((int)this.d);
            fwk.a("Stop");
        }
    }

    public boolean g() {
        return this.k() == 4114;
    }

    public boolean h() {
        return this.k() == 4116;
    }

    public void a(ftm $$0) {
        AL10.alSourcefv((int)this.d, (int)4100, (float[])new float[]{(float)$$0.g, (float)$$0.h, (float)$$0.i});
    }

    public void a(float $$0) {
        AL10.alSourcef((int)this.d, (int)4099, (float)$$0);
    }

    public void a(boolean $$0) {
        AL10.alSourcei((int)this.d, (int)4103, (int)($$0 ? 1 : 0));
    }

    public void b(float $$0) {
        AL10.alSourcef((int)this.d, (int)4106, (float)$$0);
    }

    public void i() {
        AL10.alSourcei((int)this.d, (int)53248, (int)0);
    }

    public void c(float $$0) {
        AL10.alSourcei((int)this.d, (int)53248, (int)53251);
        AL10.alSourcef((int)this.d, (int)4131, (float)$$0);
        AL10.alSourcef((int)this.d, (int)4129, (float)1.0f);
        AL10.alSourcef((int)this.d, (int)4128, (float)0.0f);
    }

    public void b(boolean $$0) {
        AL10.alSourcei((int)this.d, (int)514, (int)($$0 ? 1 : 0));
    }

    public void a(fwl $$02) {
        $$02.a().ifPresent($$0 -> AL10.alSourcei((int)this.d, (int)4105, (int)$$0));
    }

    public void a(iqf $$0) {
        this.g = $$0;
        AudioFormat $$1 = $$0.a();
        this.f = fwg.a($$1, 1);
        this.a(4);
    }

    private static int a(AudioFormat $$0, int $$1) {
        return (int)((float)($$1 * $$0.getSampleSizeInBits()) / 8.0f * (float)$$0.getChannels() * $$0.getSampleRate());
    }

    private void a(int $$02) {
        if (this.g != null) {
            try {
                for (int $$1 = 0; $$1 < $$02; ++$$1) {
                    ByteBuffer $$2 = this.g.a(this.f);
                    if ($$2 == null) continue;
                    new fwl($$2, this.g.a()).c().ifPresent($$0 -> AL10.alSourceQueueBuffers((int)this.d, (int[])new int[]{$$0}));
                }
            }
            catch (IOException $$3) {
                b.error("Failed to read from audio stream", (Throwable)$$3);
            }
        }
    }

    public void j() {
        if (this.g != null) {
            int $$0 = this.l();
            this.a($$0);
        }
    }

    private int l() {
        int $$0 = AL10.alGetSourcei((int)this.d, (int)4118);
        if ($$0 > 0) {
            int[] $$1 = new int[$$0];
            AL10.alSourceUnqueueBuffers((int)this.d, (int[])$$1);
            fwk.a("Unqueue buffers");
            AL10.alDeleteBuffers((int[])$$1);
            fwk.a("Remove processed buffers");
        }
        return $$0;
    }
}

