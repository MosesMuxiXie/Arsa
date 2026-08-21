/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class ct
extends Record {
    private final uz d;
    private static final Logger e = LogUtils.getLogger();
    public static final Codec<ct> a = wa.f.xmap(ct::new, ct::a);
    public static final aao<ByteBuf, ct> b = aam.s.a(ct::new, ct::a);
    public static final String c = "SelectedItem";

    public ct(uz $$0) {
        this.d = $$0;
    }

    public boolean a(kd $$0) {
        doe $$1 = $$0.a(ki.b, doe.a);
        return $$1.b(this.d);
    }

    public boolean a(cgk $$0) {
        return this.a(ct.b($$0));
    }

    public boolean a(@Nullable vz $$0) {
        return $$0 != null && vo.a((vz)this.d, $$0, true);
    }

    public static uz b(cgk $$0) {
        try (bgp.j $$1 = new bgp.j($$0.es(), e);){
            ddm $$3;
            dlt $$4;
            fnp $$2 = fnp.a($$1, $$0.eo());
            $$0.d($$2);
            if ($$0 instanceof ddm && !($$4 = ($$3 = (ddm)$$0).gK().h()).f()) {
                $$2.a(c, dlt.b, $$4);
            }
            uz uz2 = $$2.b();
            return uz2;
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ct.class, "tag", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ct.class, "tag", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ct.class, "tag", "d"}, this, $$0);
    }

    public uz a() {
        return this.d;
    }
}

