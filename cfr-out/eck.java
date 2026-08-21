/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class eck
extends dzq {
    public static final MapCodec<eck> a = eck.b(eck::new);
    public static final epf<iz> b = edt.f;
    public static final eoy c = eox.k;
    private static final fug d = dzq.b(16.0, 0.0, 13.0);
    private static final fug e = fud.a(d, dzq.b(8.0, 13.0, 16.0));
    private static @Nullable eom f;

    public MapCodec<eck> a() {
        return a;
    }

    public eck(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(c, false));
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return $$0.c(c) != false ? e : d;
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)((eoh)this.m().b(b, $$0.g().g())).b(c, false);
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        if ($$0.c(c).booleanValue()) {
            return 15;
        }
        return 0;
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c);
    }

    public static eom b() {
        if (f == null) {
            f = eon.a().a("?vvv?", ">???<", ">???<", ">???<", "?^^^?").a('?', eol.a(eoq.a)).a('^', eol.a(eoq.a(dzs.gn).a(c, (Predicate<Object>)Predicates.equalTo((Object)true)).a(b, (Predicate<Object>)Predicates.equalTo((Object)iz.d)))).a('>', eol.a(eoq.a(dzs.gn).a(c, (Predicate<Object>)Predicates.equalTo((Object)true)).a(b, (Predicate<Object>)Predicates.equalTo((Object)iz.e)))).a('v', eol.a(eoq.a(dzs.gn).a(c, (Predicate<Object>)Predicates.equalTo((Object)true)).a(b, (Predicate<Object>)Predicates.equalTo((Object)iz.c)))).a('<', eol.a(eoq.a(dzs.gn).a(c, (Predicate<Object>)Predicates.equalTo((Object)true)).a(b, (Predicate<Object>)Predicates.equalTo((Object)iz.f)))).b();
        }
        return f;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

