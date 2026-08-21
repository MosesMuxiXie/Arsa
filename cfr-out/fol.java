/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fol
extends fot {
    public static final MapCodec<fol> a = RecordCodecBuilder.mapCodec($$0 -> fol.b($$0).apply((Applicative)$$0, fol::new));

    private fol(int $$0, int $$1, List<frm> $$2, List<fpr> $$3) {
        super($$0, $$1, $$2, $$3);
    }

    @Override
    public fos a() {
        return foo.b;
    }

    @Override
    public void a(Consumer<dlt> $$0, fnz $$1) {
    }

    public static fot.a<?> b() {
        return fol.a(fol::new);
    }
}

