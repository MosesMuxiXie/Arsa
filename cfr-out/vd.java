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

public final class vd
implements uy {
    private static final int b = 24;
    public static final wb<vd> a = new wb.b<vd>(){

        public vd a(DataInput $$0, vi $$1) throws IOException {
            return new vd(1.d($$0, $$1));
        }

        @Override
        public vw.b a(DataInput $$0, vw $$1, vi $$2) throws IOException {
            return $$1.a(1.d($$0, $$2));
        }

        private static int[] d(DataInput $$0, vi $$1) throws IOException {
            $$1.b(24L);
            int $$2 = $$0.readInt();
            $$1.a(4L, $$2);
            int[] $$3 = new int[$$2];
            for (int $$4 = 0; $$4 < $$2; ++$$4) {
                $$3[$$4] = $$0.readInt();
            }
            return $$3;
        }

        @Override
        public void b(DataInput $$0, vi $$1) throws IOException {
            $$0.skipBytes($$0.readInt() * 4);
        }

        @Override
        public String a() {
            return "INT[]";
        }

        @Override
        public String b() {
            return "TAG_Int_Array";
        }

        @Override
        public /* synthetic */ vz c(DataInput dataInput, vi vi2) throws IOException {
            return this.a(dataInput, vi2);
        }
    };
    private int[] c;

    public vd(int[] $$0) {
        this.c = $$0;
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeInt(this.c.length);
        for (int $$1 : this.c) {
            $$0.writeInt($$1);
        }
    }

    @Override
    public int a() {
        return 24 + 4 * this.c.length;
    }

    @Override
    public byte b() {
        return 11;
    }

    public wb<vd> c() {
        return a;
    }

    @Override
    public String toString() {
        vy $$0 = new vy();
        $$0.a(this);
        return $$0.a();
    }

    public vd e() {
        int[] $$0 = new int[this.c.length];
        System.arraycopy(this.c, 0, $$0, 0, this.c.length);
        return new vd($$0);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof vd && Arrays.equals(this.c, ((vd)$$0).c);
    }

    public int hashCode() {
        return Arrays.hashCode(this.c);
    }

    public int[] g() {
        return this.c;
    }

    @Override
    public void a(wd $$0) {
        $$0.a(this);
    }

    @Override
    public int size() {
        return this.c.length;
    }

    public ve a(int $$0) {
        return ve.a(this.c[$$0]);
    }

    @Override
    public boolean a(int $$0, vz $$1) {
        if ($$1 instanceof vp) {
            vp $$2 = (vp)$$1;
            this.c[$$0] = $$2.h();
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int $$0, vz $$1) {
        if ($$1 instanceof vp) {
            vp $$2 = (vp)$$1;
            this.c = ArrayUtils.add((int[])this.c, (int)$$0, (int)$$2.h());
            return true;
        }
        return false;
    }

    public ve b(int $$0) {
        int $$1 = this.c[$$0];
        this.c = ArrayUtils.remove((int[])this.c, (int)$$0);
        return ve.a($$1);
    }

    @Override
    public void clear() {
        this.c = new int[0];
    }

    @Override
    public Optional<int[]> q_() {
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

    @Override
    public /* synthetic */ vz d() {
        return this.e();
    }
}

