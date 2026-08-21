/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public final class fes
extends Record {
    private final jd<exi<?, ?>> e;
    private final List<fev> f;
    public static final Codec<fes> a = RecordCodecBuilder.create($$02 -> $$02.group((App)exi.b.fieldOf("feature").forGetter($$0 -> $$0.e), (App)fev.b.listOf().fieldOf("placement").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, fes::new));
    public static final Codec<jd<fes>> b = amq.a(mj.bp, a);
    public static final Codec<jh<fes>> c = js.a(mj.bp, a);
    public static final Codec<List<jh<fes>>> d = js.a(mj.bp, a, true).listOf();

    public fes(jd<exi<?, ?>> $$0, List<fev> $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public boolean a(dxn $$0, eqg $$1, bgr $$2, is $$3) {
        return this.a(new fet($$0, $$1, Optional.empty()), $$2, $$3);
    }

    public boolean b(dxn $$0, eqg $$1, bgr $$2, is $$3) {
        return this.a(new fet($$0, $$1, Optional.of(this)), $$2, $$3);
    }

    private boolean a(fet $$0, bgr $$1, is $$2) {
        Stream<is> $$32 = Stream.of($$2);
        for (fev $$42 : this.f) {
            $$32 = $$32.flatMap($$3 -> $$42.a_($$0, $$1, (is)$$3));
        }
        exi<?, ?> $$5 = this.e.a();
        MutableBoolean $$6 = new MutableBoolean();
        $$32.forEach($$4 -> {
            if ($$5.a($$0.d(), $$0.f(), $$1, (is)$$4)) {
                $$6.setTrue();
                if (w.aP) {
                    exy.a($$0.d().a(), $$5, $$0.e());
                }
            }
        });
        return $$6.isTrue();
    }

    public Stream<exi<?, ?>> a() {
        return this.e.a().a();
    }

    @Override
    public String toString() {
        return "Placed " + String.valueOf(this.e);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fes.class, "feature;placement", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fes.class, "feature;placement", "e", "f"}, this, $$0);
    }

    public jd<exi<?, ?>> b() {
        return this.e;
    }

    public List<fev> c() {
        return this.f;
    }
}

