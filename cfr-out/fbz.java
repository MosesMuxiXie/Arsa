/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class fbz
extends fca {
    public static final int a = 8;
    public static final int b = 15;
    public static final MapCodec<fbz> c = RecordCodecBuilder.mapCodec($$02 -> fbz.a($$02).and((App)fby.a.fieldOf("mangrove_root_placement").forGetter($$0 -> $$0.h)).apply((Applicative)$$02, fbz::new));
    private final fby h;

    public fbz(cch $$0, fcd $$1, Optional<fbx> $$2, fby $$3) {
        super($$0, $$1, $$2);
        this.h = $$3;
    }

    @Override
    public boolean a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, is $$3, is $$4, fay $$5) {
        ArrayList $$6 = Lists.newArrayList();
        is.a $$7 = $$3.k();
        while ($$7.v() < $$4.v()) {
            if (!this.a($$0, $$7)) {
                return false;
            }
            $$7.c(iz.b);
        }
        $$6.add($$4.e());
        for (iz $$8 : iz.c.a) {
            ArrayList $$10;
            is $$9 = $$4.a($$8);
            if (!this.a($$0, $$2, $$9, $$8, $$4, $$10 = Lists.newArrayList(), 0)) {
                return false;
            }
            $$6.addAll($$10);
            $$6.add($$4.a($$8));
        }
        for (is $$11 : $$6) {
            this.a($$0, $$1, $$2, $$11, $$5);
        }
        return true;
    }

    private boolean a(dwu $$0, bgr $$1, is $$2, iz $$3, is $$4, List<is> $$5, int $$6) {
        int $$7 = this.h.e();
        if ($$6 == $$7 || $$5.size() > $$7) {
            return false;
        }
        List<is> $$8 = this.a($$2, $$3, $$1, $$4);
        for (is $$9 : $$8) {
            if (!this.a($$0, $$9)) continue;
            $$5.add($$9);
            if (this.a($$0, $$1, $$9, $$3, $$4, $$5, $$6 + 1)) continue;
            return false;
        }
        return true;
    }

    protected List<is> a(is $$0, iz $$1, bgr $$2, is $$3) {
        is $$4 = $$0.e();
        is $$5 = $$0.a($$1);
        int $$6 = $$0.k($$3);
        int $$7 = this.h.d();
        float $$8 = this.h.f();
        if ($$6 > $$7 - 3 && $$6 <= $$7) {
            return $$2.i() < $$8 ? List.of($$4, $$5.e()) : List.of($$4);
        }
        if ($$6 > $$7) {
            return List.of($$4);
        }
        if ($$2.i() < $$8) {
            return List.of($$4);
        }
        return $$2.h() ? List.of($$5) : List.of($$4);
    }

    @Override
    protected boolean a(dwu $$02, is $$1) {
        return super.a($$02, $$1) || $$02.a($$1, (eoh $$0) -> $$0.a(this.h.a()));
    }

    @Override
    protected void a(dwu $$02, BiConsumer<is, eoh> $$1, bgr $$2, is $$3, fay $$4) {
        if ($$02.a($$3, (eoh $$0) -> $$0.a(this.h.b()))) {
            eoh $$5 = this.h.c().a($$2, $$3);
            $$1.accept($$3, this.a($$02, $$3, $$5));
        } else {
            super.a($$02, $$1, $$2, $$3, $$4);
        }
    }

    @Override
    protected fcb<?> a() {
        return fcb.a;
    }
}

