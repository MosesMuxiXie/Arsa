/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

public interface iqf
extends Closeable {
    public AudioFormat a();

    public ByteBuffer a(int var1) throws IOException;
}

