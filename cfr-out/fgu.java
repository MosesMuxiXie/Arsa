/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fgu
extends fgw {
    public static final MapCodec<fgu> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)fgw.f.listOf().fieldOf("elements").forGetter($$0 -> $$0.b), fgu.f()).apply((Applicative)$$02, fgu::new));
    private final List<fgw> b;

    public fgu(List<fgw> $$0, fgy.a $$1) {
        super($$1);
        if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Elements are empty");
        }
        this.b = $$0;
        this.b($$1);
    }

    @Override
    public jy a(fjr $$0, egm $$1) {
        int $$2 = 0;
        int $$3 = 0;
        int $$4 = 0;
        for (fgw $$5 : this.b) {
            jy $$6 = $$5.a($$0, $$1);
            $$2 = Math.max($$2, $$6.u());
            $$3 = Math.max($$3, $$6.v());
            $$4 = Math.max($$4, $$6.w());
        }
        return new jy($$2, $$3, $$4);
    }

    @Override
    public List<fjq.a> a(fjr $$0, is $$1, egm $$2, bgr $$3) {
        return this.b.get(0).a($$0, $$1, $$2, $$3);
    }

    @Override
    public ffg a(fjr $$02, is $$1, egm $$2) {
        Stream<ffg> $$32 = this.b.stream().filter($$0 -> $$0 != fgp.b).map($$3 -> $$3.a($$02, $$1, $$2));
        return ffg.b($$32::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
    }

    @Override
    public boolean a(fjr $$0, dxn $$1, dxk $$2, eqg $$3, is $$4, is $$5, egm $$6, ffg $$7, bgr $$8, fja $$9, boolean $$10) {
        for (fgw $$11 : this.b) {
            if ($$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) continue;
            return false;
        }
        return true;
    }

    @Override
    public fgx<?> a() {
        return fgx.b;
    }

    @Override
    public fgw a(fgy.a $$0) {
        super.a($$0);
        this.b($$0);
        return this;
    }

    public String toString() {
        return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
    }

    private void b(fgy.a $$0) {
        this.b.forEach($$1 -> $$1.a($$0));
    }

    @VisibleForTesting
    public List<fgw> b() {
        return this.b;
    }
}

