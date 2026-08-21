/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;

public final class uw
implements uy {
    private static final int b = 24;
    public static final wb<uw> a = new wb.b<uw>(){

        public uw a(DataInput $$0, vi $$1) throws IOException {
            return new uw(1.d($$0, $$1));
        }

        @Override
        public vw.b a(DataInput $$0, vw $$1, vi $$2) throws IOException {
            return $$1.a(1.d($$0, $$2));
        }

        private static byte[] d(DataInput $$0, vi $$1) throws IOException {
            $$1.b(24L);
            int $$2 = $$0.readInt();
            $$1.a(1L, $$2);
            byte[] $$3 = new byte[$$2];
            $$0.readFully($$3);
            return $$3;
        }

        @Override
        public void b(DataInput $$0, vi $$1) throws IOException {
            $$0.skipBytes($$0.readInt() * 1);
        }

        @Override
        public String a() {
            return "BYTE[]";
        }

        @Override
        public String b() {
            return "TAG_Byte_Array";
        }

        @Override
        public /* synthetic */ vz c(DataInput dataInput, vi vi2) throws IOException {
            return this.a(dataInput, vi2);
        }
    };
    private byte[] c;

    public uw(byte[] $$0) {
        this.c = $$0;
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeInt(this.c.length);
        $$0.write(this.c);
    }

    @Override
    public int a() {
        return 24 + 1 * this.c.length;
    }

    @Override
    public byte b() {
        return 7;
    }

    public wb<uw> c() {
        return a;
    }

    @Override
    public String toString() {
        vy $$0 = new vy();
        $$0.a(this);
        return $$0.a();
    }

    @Override
    public vz d() {
        byte[] $$0 = new byte[this.c.length];
        System.arraycopy(this.c, 0, $$0, 0, this.c.length);
        return new uw($$0);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof uw && Arrays.equals(this.c, ((uw)$$0).c);
    }

    public int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @Override
    public void a(wd $$0) {
        $$0.a(this);
    }

    public byte[] e() {
        return this.c;
    }

    @Override
    public int size() {
        return this.c.length;
    }

    public ux a(int $$0) {
        return ux.a(this.c[$$0]);
    }

    @Override
    public boolean a(int $$0, vz $$1) {
        if ($$1 instanceof vp) {
            vp $$2 = (vp)$$1;
            this.c[$$0] = $$2.j();
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int $$0, vz $$1) {
        if ($$1 instanceof vp) {
            vp $$2 = (vp)$$1;
            this.c = ArrayUtils.add((byte[])this.c, (int)$$0, (byte)$$2.j());
            return true;
        }
        return false;
    }

    public ux b(int $$0) {
        byte $$1 = this.c[$$0];
        this.c = ArrayUtils.remove((byte[])this.c, (int)$$0);
        return ux.a($$1);
    }

    @Override
    public void clear() {
        this.c = new byte[0];
    }

    @Override
    public Optional<byte[]> f() {
        return Optional.of(this.c);
    }

    @Override
    public vw.b a(vw $$0) {
        return $$0.a(this.c);
    }

    @Override
    public /* synthetic */ vz c(int n2) {
        return this.a(n2);
    }

    @Override
    public /* synthetic */ vz d(int n2) {
        return this.b(n2);
    }
}

