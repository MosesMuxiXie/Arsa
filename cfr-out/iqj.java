/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.FloatConsumer
 */
import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface iqj
extends iqi {
    public static final int a = 8192;

    public boolean a(FloatConsumer var1) throws IOException;

    @Override
    default public ByteBuffer a(int $$0) throws IOException {
        iqh $$1 = new iqh($$0 + 8192);
        while (this.a($$1) && $$1.b() < $$0) {
        }
        return $$1.a();
    }

    @Override
    default public ByteBuffer b() throws IOException {
        iqh $$0 = new iqh(16384);
        while (this.a($$0)) {
        }
        return $$0.a();
    }
}

