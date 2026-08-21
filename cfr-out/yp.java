/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.mojang.serialization.Codec
 */
import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public final class yp
extends Record {
    private final List<yu> d;
    public static final Codec<yp> a = yu.a.listOf().xmap(yp::new, yp::b);
    public static yp b = new yp(List.of());
    public static final int c = 20;

    public yp(List<yu> $$0) {
        this.d = $$0;
    }

    public void a(bgv.a $$0) throws SignatureException {
        $$0.update(Ints.toByteArray((int)this.d.size()));
        for (yu $$1 : this.d) {
            $$0.update($$1.c());
        }
    }

    public a a(yv $$0) {
        return new a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
    }

    public byte a() {
        int $$0 = 1;
        for (yu $$1 : this.d) {
            $$0 = 31 * $$0 + $$1.b();
        }
        byte $$2 = (byte)$$0;
        return $$2 == 0 ? (byte)1 : $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yp.class, "entries", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yp.class, "entries", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yp.class, "entries", "d"}, this, $$0);
    }

    public List<yu> b() {
        return this.d;
    }

    public static final class a
    extends Record {
        private final List<yu.a> b;
        public static final a a = new a(List.of());

        public a(wx $$0) {
            this((List)((Object)$$0.a(wx.a(ArrayList::new, 20), yu.a::a)));
        }

        public a(List<yu.a> $$0) {
            this.b = $$0;
        }

        public void a(wx $$0) {
            $$0.a(this.b, yu.a::a);
        }

        public Optional<yp> a(yv $$0) {
            ArrayList<yu> $$1 = new ArrayList<yu>(this.b.size());
            for (yu.a $$2 : this.b) {
                Optional<yu> $$3 = $$2.a($$0);
                if ($$3.isEmpty()) {
                    return Optional.empty();
                }
                $$1.add($$3.get());
            }
            return Optional.of(new yp($$1));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "entries", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "entries", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "entries", "b"}, this, $$0);
        }

        public List<yu.a> a() {
            return this.b;
        }
    }

    public static final class b
    extends Record {
        private final int b;
        private final BitSet c;
        private final byte d;
        public static final byte a = 0;

        public b(wx $$0) {
            this($$0.l(), $$0.e(20), $$0.readByte());
        }

        public b(int $$0, BitSet $$1, byte $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public void a(wx $$0) {
            $$0.c(this.b);
            $$0.a(this.c, 20);
            $$0.l(this.d);
        }

        public boolean a(yp $$0) {
            return this.d == 0 || this.d == $$0.a();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "offset;acknowledged;checksum", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "offset;acknowledged;checksum", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "offset;acknowledged;checksum", "b", "c", "d"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        public BitSet b() {
            return this.c;
        }

        public byte c() {
            return this.d;
        }
    }
}

