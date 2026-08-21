/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.floats.FloatConsumer
 *  org.lwjgl.BufferUtils
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.BufferUtils;

public class iqh
implements FloatConsumer {
    private final List<ByteBuffer> a = Lists.newArrayList();
    private final int b;
    private int c;
    private ByteBuffer d;

    public iqh(int $$0) {
        this.b = $$0 + 1 & 0xFFFFFFFE;
        this.d = BufferUtils.createByteBuffer((int)$$0);
    }

    public void accept(float $$0) {
        if (this.d.remaining() == 0) {
            this.d.flip();
            this.a.add(this.d);
            this.d = BufferUtils.createByteBuffer((int)this.b);
        }
        int $$1 = bgj.a((int)($$0 * 32767.5f - 0.5f), Short.MIN_VALUE, Short.MAX_VALUE);
        this.d.putShort((short)$$1);
        this.c += 2;
    }

    public ByteBuffer a() {
        this.d.flip();
        if (this.a.isEmpty()) {
            return this.d;
        }
        ByteBuffer $$0 = BufferUtils.createByteBuffer((int)this.c);
        this.a.forEach($$0::put);
        $$0.put(this.d);
        $$0.flip();
        return $$0;
    }

    public int b() {
        return this.c;
    }
}

