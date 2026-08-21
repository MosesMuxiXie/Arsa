/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class cgc
extends chl {
    public static final chb l = chb.b;
    public static final int m = 0;
    public static final float n = 1.62f;
    public static final ftm o = new ftm(0.0, 0.6, 0.0);
    private static final float a = 1.5f;
    private static final float b = 0.6f;
    public static final float p = 0.6f;
    protected static final cgn q = cgn.b(0.6f, 1.8f).b(1.62f).a(cgm.a().a(cgl.b, o));
    protected static final Map<chx, cgn> r = ImmutableMap.builder().put((Object)chx.a, (Object)q).put((Object)chx.c, (Object)bl).put((Object)chx.b, (Object)cgn.b(0.6f, 0.6f).b(0.4f)).put((Object)chx.d, (Object)cgn.b(0.6f, 0.6f).b(0.4f)).put((Object)chx.e, (Object)cgn.b(0.6f, 0.6f).b(0.4f)).put((Object)chx.f, (Object)cgn.b(0.6f, 1.5f).b(1.27f).a(cgm.a().a(cgl.b, o))).put((Object)chx.h, (Object)cgn.c(0.2f, 0.2f).b(1.62f)).build();
    protected static final alw<chb> s = ama.a(cgc.class, aly.M);
    protected static final alw<Byte> t = ama.a(cgc.class, aly.a);

    protected cgc(cgu<? extends chl> $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(s, l);
        $$0.a(t, (byte)0);
    }

    @Override
    public chb at() {
        return this.az.a(s);
    }

    public void a(chb $$0) {
        this.az.a(s, $$0);
    }

    public boolean a(ddo $$0) {
        return (this.aD().a(t) & $$0.a()) == $$0.a();
    }

    @Override
    public cgn b(chx $$0) {
        return r.getOrDefault($$0, q);
    }
}

