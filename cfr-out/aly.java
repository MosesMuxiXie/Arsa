/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class aly {
    private static final bfa<alx<?>> N = bfa.c(16);
    public static final alx<Byte> a = alx.a(aam.c);
    public static final alx<Integer> b = alx.a(aam.h);
    public static final alx<Long> c = alx.a(aam.k);
    public static final alx<Float> d = alx.a(aam.l);
    public static final alx<String> e = alx.a(aam.p);
    public static final alx<yh> f = alx.a(yj.d);
    public static final alx<Optional<yh>> g = alx.a(yj.e);
    public static final alx<dlt> h = new alx<dlt>(){

        @Override
        public aao<? super xq, dlt> codec() {
            return dlt.h;
        }

        public dlt a(dlt $$0) {
            return $$0.v();
        }

        @Override
        public /* synthetic */ Object copy(Object object) {
            return this.a((dlt)object);
        }
    };
    public static final alx<eoh> i = alx.a(aam.a(dzq.k));
    private static final aao<ByteBuf, Optional<eoh>> O = new aao<ByteBuf, Optional<eoh>>(){

        public void a(ByteBuf $$0, Optional<eoh> $$1) {
            if ($$1.isPresent()) {
                xy.a($$0, dzq.j($$1.get()));
            } else {
                xy.a($$0, 0);
            }
        }

        public Optional<eoh> a(ByteBuf $$0) {
            int $$1 = xy.a($$0);
            if ($$1 == 0) {
                return Optional.empty();
            }
            return Optional.of(dzq.a($$1));
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Optional)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final alx<Optional<eoh>> j = alx.a(O);
    public static final alx<Boolean> k = alx.a(aam.b);
    public static final alx<lw> l = alx.a(ly.bm);
    public static final alx<List<lw>> m = alx.a(ly.bm.a(aam.a()));
    public static final alx<jv> n = alx.a(jv.b);
    public static final alx<is> o = alx.a(is.b);
    public static final alx<Optional<is>> p = alx.a(is.b.a(aam::a));
    public static final alx<iz> q = alx.a(iz.j);
    public static final alx<Optional<cgr<chl>>> r = alx.a(cgr.b().a(aam::a));
    public static final alx<Optional<jc>> s = alx.a(jc.c.a(aam::a));
    public static final alx<dcy> t = alx.a(dcy.d);
    private static final aao<ByteBuf, OptionalInt> P = new aao<ByteBuf, OptionalInt>(){

        public OptionalInt a(ByteBuf $$0) {
            int $$1 = xy.a($$0);
            return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
        }

        public void a(ByteBuf $$0, OptionalInt $$1) {
            xy.a($$0, $$1.orElse(-1) + 1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (OptionalInt)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final alx<OptionalInt> u = alx.a(P);
    public static final alx<chx> v = alx.a(chx.u);
    public static final alx<jd<cvc>> w = alx.a(cvc.d);
    public static final alx<jd<cud>> x = alx.a(cud.d);
    public static final alx<jd<cui>> y = alx.a(cui.d);
    public static final alx<jd<cxx>> z = alx.a(cxx.d);
    public static final alx<jd<cxv>> A = alx.a(cxv.d);
    public static final alx<jd<cvs>> B = alx.a(cvs.d);
    public static final alx<jd<cxc>> C = alx.a(cxc.d);
    public static final alx<jd<cws>> D = alx.a(cws.d);
    public static final alx<jd<czh>> E = alx.a(czh.d);
    public static final alx<cto.a> F = alx.a(cto.a.e);
    public static final alx<cxm.a> G = alx.a(cxm.a.i);
    public static final alx<ejq.a> H = alx.a(ejq.a.g);
    public static final alx<cwg> I = alx.a(cwg.g);
    public static final alx<Vector3fc> J = alx.a(aam.v);
    public static final alx<Quaternionfc> K = alx.a(aam.w);
    public static final alx<doy> L = alx.a(doy.b);
    public static final alx<chb> M = alx.a(chb.d);

    public static void a(alx<?> $$0) {
        N.d($$0);
    }

    public static @Nullable alx<?> a(int $$0) {
        return N.a($$0);
    }

    public static int b(alx<?> $$0) {
        return N.a($$0);
    }

    private aly() {
    }

    static {
        aly.a(a);
        aly.a(b);
        aly.a(c);
        aly.a(d);
        aly.a(e);
        aly.a(f);
        aly.a(g);
        aly.a(h);
        aly.a(k);
        aly.a(n);
        aly.a(o);
        aly.a(p);
        aly.a(q);
        aly.a(r);
        aly.a(i);
        aly.a(j);
        aly.a(l);
        aly.a(m);
        aly.a(t);
        aly.a(u);
        aly.a(v);
        aly.a(w);
        aly.a(y);
        aly.a(z);
        aly.a(A);
        aly.a(B);
        aly.a(C);
        aly.a(x);
        aly.a(D);
        aly.a(s);
        aly.a(E);
        aly.a(G);
        aly.a(F);
        aly.a(I);
        aly.a(H);
        aly.a(J);
        aly.a(K);
        aly.a(L);
        aly.a(M);
    }
}

