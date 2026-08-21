/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;

public class bfn
extends InputStream {
    private static final int a = 8192;
    private final InputStream b;
    private final byte[] c;
    private int d;
    private int e;

    public bfn(InputStream $$0) {
        this($$0, 8192);
    }

    public bfn(InputStream $$0, int $$1) {
        this.b = $$0;
        this.c = new byte[$$1];
    }

    @Override
    public int read() throws IOException {
        if (this.e >= this.d) {
            this.b();
            if (this.e >= this.d) {
                return -1;
            }
        }
        return Byte.toUnsignedInt(this.c[this.e++]);
    }

    @Override
    public int read(byte[] $$0, int $$1, int $$2) throws IOException {
        int $$3 = this.a();
        if ($$3 <= 0) {
            if ($$2 >= this.c.length) {
                return this.b.read($$0, $$1, $$2);
            }
            this.b();
            $$3 = this.a();
            if ($$3 <= 0) {
                return -1;
            }
        }
        if ($$2 > $$3) {
            $$2 = $$3;
        }
        System.arraycopy(this.c, this.e, $$0, $$1, $$2);
        this.e += $$2;
        return $$2;
    }

    @Override
    public long skip(long $$0) throws IOException {
        if ($$0 <= 0L) {
            return 0L;
        }
        long $$1 = this.a();
        if ($$1 <= 0L) {
            return this.b.skip($$0);
        }
        if ($$0 > $$1) {
            $$0 = $$1;
        }
        this.e = (int)((long)this.e + $$0);
        return $$0;
    }

    @Override
    public int available() throws IOException {
        return this.a() + this.b.available();
    }

    @Override
    public void close() throws IOException {
        this.b.close();
    }

    private int a() {
        return this.d - this.e;
    }

    private void b() throws IOException {
        this.d = 0;
        this.e = 0;
        int $$0 = this.b.read(this.c, 0, this.c.length);
        if ($$0 > 0) {
            this.d = $$0;
        }
    }
}

