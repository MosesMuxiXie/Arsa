/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Consumer;

public final class dom
extends Record
implements dpe {
    private final dku<dlm> c;
    public static final Codec<dom> a = dku.a(mj.bi, dlm.c).xmap(dom::new, dom::a);
    public static final aao<xq, dom> b = dku.a(mj.bi, dlm.d).a(dom::new, dom::a);

    public dom(jd<dlm> $$0) {
        this(new dku<dlm>($$0));
    }

    @Deprecated
    public dom(amt<dlm> $$0) {
        this(new dku<dlm>($$0));
    }

    public dom(dku<dlm> $$0) {
        this.c = $$0;
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$12, dnj $$2, kd $$3) {
        jf.a $$4 = $$0.a();
        if ($$4 == null) {
            return;
        }
        this.a($$4).ifPresent($$1 -> {
            yh $$2 = yk.a(((dlm)$$1.a()).d(), zf.a.a(l.h));
            $$12.accept($$2);
        });
    }

    public Optional<jd<dlm>> a(jf.a $$0) {
        return this.c.a($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dom.class, "instrument", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dom.class, "instrument", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dom.class, "instrument", "c"}, this, $$0);
    }

    public dku<dlm> a() {
        return this.c;
    }
}

