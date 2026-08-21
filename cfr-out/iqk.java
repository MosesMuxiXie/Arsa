/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jcraft.jogg.Packet
 *  com.jcraft.jogg.Page
 *  com.jcraft.jogg.StreamState
 *  com.jcraft.jogg.SyncState
 *  com.jcraft.jorbis.Block
 *  com.jcraft.jorbis.Comment
 *  com.jcraft.jorbis.DspState
 *  com.jcraft.jorbis.Info
 *  it.unimi.dsi.fastutil.floats.FloatConsumer
 *  org.jspecify.annotations.Nullable
 */
import com.jcraft.jogg.Packet;
import com.jcraft.jogg.Page;
import com.jcraft.jogg.StreamState;
import com.jcraft.jogg.SyncState;
import com.jcraft.jorbis.Block;
import com.jcraft.jorbis.Comment;
import com.jcraft.jorbis.DspState;
import com.jcraft.jorbis.Info;
import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import org.jspecify.annotations.Nullable;

public class iqk
implements iqj {
    private static final int b = 8192;
    private static final int c = -1;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = -1;
    private static final int g = 0;
    private static final int h = 1;
    private final SyncState i = new SyncState();
    private final Page j = new Page();
    private final StreamState k = new StreamState();
    private final Packet l = new Packet();
    private final Info m = new Info();
    private final DspState n = new DspState();
    private final Block o = new Block(this.n);
    private final AudioFormat p;
    private final InputStream q;
    private long r;
    private long s = Long.MAX_VALUE;

    public iqk(InputStream $$0) throws IOException {
        this.q = $$0;
        Comment $$1 = new Comment();
        Page $$2 = this.d();
        if ($$2 == null) {
            throw new IOException("Invalid Ogg file - can't find first page");
        }
        Packet $$3 = this.a($$2);
        if (iqk.b(this.m.synthesis_headerin($$1, $$3))) {
            throw new IOException("Invalid Ogg identification packet");
        }
        for (int $$4 = 0; $$4 < 2; ++$$4) {
            Packet $$5 = this.e();
            if ($$5 == null) {
                throw new IOException("Unexpected end of Ogg stream");
            }
            if (!iqk.b(this.m.synthesis_headerin($$1, $$5))) continue;
            throw new IOException("Invalid Ogg header packet " + $$4);
        }
        this.n.synthesis_init(this.m);
        this.o.init(this.n);
        this.p = new AudioFormat(this.m.rate, 16, this.m.channels, true, false);
    }

    private static boolean b(int $$0) {
        return $$0 < 0;
    }

    @Override
    public AudioFormat a() {
        return this.p;
    }

    private boolean c() throws IOException {
        byte[] $$1 = this.i.data;
        int $$0 = this.i.buffer(8192);
        int $$2 = this.q.read($$1, $$0, 8192);
        if ($$2 == -1) {
            return false;
        }
        this.i.wrote($$2);
        return true;
    }

    private @Nullable Page d() throws IOException {
        int $$0;
        block5: while (true) {
            $$0 = this.i.pageout(this.j);
            switch ($$0) {
                case 1: {
                    if (this.j.eos() != 0) {
                        this.s = this.j.granulepos();
                    }
                    return this.j;
                }
                case 0: {
                    if (this.c()) continue block5;
                    return null;
                }
                case -1: {
                    throw new IOException("Corrupt or missing data in bitstream");
                }
            }
            break;
        }
        throw new IllegalStateException("Unknown page decode result: " + $$0);
    }

    private Packet a(Page $$0) throws IOException {
        this.k.init($$0.serialno());
        if (iqk.b(this.k.pagein($$0))) {
            throw new IOException("Failed to parse page");
        }
        int $$1 = this.k.packetout(this.l);
        if ($$1 != 1) {
            throw new IOException("Failed to read identification packet: " + $$1);
        }
        return this.l;
    }

    private @Nullable Packet e() throws IOException {
        block5: while (true) {
            int $$0 = this.k.packetout(this.l);
            switch ($$0) {
                case 1: {
                    return this.l;
                }
                case 0: {
                    Page $$1 = this.d();
                    if ($$1 != null) continue block5;
                    return null;
                    if (!iqk.b(this.k.pagein($$1))) continue block5;
                    throw new IOException("Failed to parse page");
                }
                case -1: {
                    throw new IOException("Failed to parse packet");
                }
                default: {
                    throw new IllegalStateException("Unknown packet decode result: " + $$0);
                }
            }
            break;
        }
    }

    private long c(int $$0) {
        long $$3;
        long $$1 = this.r + (long)$$0;
        if ($$1 > this.s) {
            long $$2 = this.s - this.r;
            this.r = this.s;
        } else {
            this.r = $$1;
            $$3 = $$0;
        }
        return $$3;
    }

    @Override
    public boolean a(FloatConsumer $$0) throws IOException {
        int $$4;
        float[][][] $$1 = new float[1][][];
        int[] $$2 = new int[this.m.channels];
        Packet $$3 = this.e();
        if ($$3 == null) {
            return false;
        }
        if (iqk.b(this.o.synthesis($$3))) {
            throw new IOException("Can't decode audio packet");
        }
        this.n.synthesis_blockin(this.o);
        while (($$4 = this.n.synthesis_pcmout((float[][][])$$1, $$2)) > 0) {
            float[][] $$5 = $$1[0];
            long $$6 = this.c($$4);
            switch (this.m.channels) {
                case 1: {
                    iqk.a($$5[0], $$2[0], $$6, $$0);
                    break;
                }
                case 2: {
                    iqk.a($$5[0], $$2[0], $$5[1], $$2[1], $$6, $$0);
                    break;
                }
                default: {
                    iqk.a($$5, this.m.channels, $$2, $$6, $$0);
                }
            }
            this.n.synthesis_read($$4);
        }
        return true;
    }

    private static void a(float[][] $$0, int $$1, int[] $$2, long $$3, FloatConsumer $$4) {
        int $$5 = 0;
        while ((long)$$5 < $$3) {
            for (int $$6 = 0; $$6 < $$1; ++$$6) {
                int $$7 = $$2[$$6];
                float $$8 = $$0[$$6][$$7 + $$5];
                $$4.accept($$8);
            }
            ++$$5;
        }
    }

    private static void a(float[] $$0, int $$1, long $$2, FloatConsumer $$3) {
        int $$4 = $$1;
        while ((long)$$4 < (long)$$1 + $$2) {
            $$3.accept($$0[$$4]);
            ++$$4;
        }
    }

    private static void a(float[] $$0, int $$1, float[] $$2, int $$3, long $$4, FloatConsumer $$5) {
        int $$6 = 0;
        while ((long)$$6 < $$4) {
            $$5.accept($$0[$$1 + $$6]);
            $$5.accept($$2[$$3 + $$6]);
            ++$$6;
        }
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }
}

