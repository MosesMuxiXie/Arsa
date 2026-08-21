/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;

public final class dup
extends Record
implements dpe {
    private final jd<dur> c;
    private final jd<dut> d;
    public static final Codec<dup> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dur.c.fieldOf("material").forGetter(dup::a), (App)dut.c.fieldOf("pattern").forGetter(dup::b)).apply((Applicative)$$0, dup::new));
    public static final aao<xq, dup> b = aao.a(dur.d, dup::a, dut.d, dup::b, dup::new);
    private static final yh e = yh.c(bhs.a("item", amo.b("smithing_template.upgrade"))).a(l.h);

    public dup(jd<dur> $$0, jd<dut> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        $$1.accept(e);
        $$1.accept(yg.a().b(this.d.a().a(this.c)));
        $$1.accept(yg.a().b(this.c.a().b()));
    }

    public amo a(String $$0, amt<dul> $$1) {
        duq.a $$22 = this.a().a().a().a($$1);
        return this.b().a().a().a($$2 -> $$0 + "/" + $$2 + "_" + $$22.a());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dup.class, "material;pattern", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dup.class, "material;pattern", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dup.class, "material;pattern", "c", "d"}, this, $$0);
    }

    public jd<dur> a() {
        return this.c;
    }

    public jd<dut> b() {
        return this.d;
    }
}

