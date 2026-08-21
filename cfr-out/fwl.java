/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.openal.AL10
 */
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import javax.sound.sampled.AudioFormat;
import org.jspecify.annotations.Nullable;
import org.lwjgl.openal.AL10;

public class fwl {
    private @Nullable ByteBuffer a;
    private final AudioFormat b;
    private boolean c;
    private int d;

    public fwl(ByteBuffer $$0, AudioFormat $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    OptionalInt a() {
        if (!this.c) {
            if (this.a == null) {
                return OptionalInt.empty();
            }
            int $$0 = fwk.a(this.b);
            int[] $$1 = new int[1];
            AL10.alGenBuffers((int[])$$1);
            if (fwk.a("Creating buffer")) {
                return OptionalInt.empty();
            }
            AL10.alBufferData((int)$$1[0], (int)$$0, (ByteBuffer)this.a, (int)((int)this.b.getSampleRate()));
            if (fwk.a("Assigning buffer data")) {
                return OptionalInt.empty();
            }
            this.d = $$1[0];
            this.c = true;
            this.a = null;
        }
        return OptionalInt.of(this.d);
    }

    public void b() {
        if (this.c) {
            AL10.alDeleteBuffers((int[])new int[]{this.d});
            if (fwk.a("Deleting stream buffers")) {
                return;
            }
        }
        this.c = false;
    }

    public OptionalInt c() {
        OptionalInt $$0 = this.a();
        this.c = false;
        return $$0;
    }
}

