/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class fsl
extends Record
implements fsi {
    private final amo b;
    private final ex.g c;
    public static final MapCodec<fsl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("storage").forGetter(fsl::c), (App)ex.g.a.fieldOf("path").forGetter(fsl::d)).apply((Applicative)$$0, fsl::new));

    public fsl(amo $$0, ex.g $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public fsh a() {
        return fsj.f;
    }

    private Number a(fnz $$0, Number $$1) {
        uz $$2 = $$0.d().s().aL().a(this.b);
        try {
            vz vz2;
            List<vz> $$3 = this.c.a($$2);
            if ($$3.size() == 1 && (vz2 = $$3.getFirst()) instanceof vp) {
                vp $$4 = (vp)vz2;
                return $$4.m();
            }
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return $$1;
    }

    @Override
    public float b(fnz $$0) {
        return this.a($$0, Float.valueOf(0.0f)).floatValue();
    }

    @Override
    public int a(fnz $$0) {
        return this.a($$0, 0).intValue();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fsl.class, "storage;path", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fsl.class, "storage;path", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fsl.class, "storage;path", "b", "c"}, this, $$0);
    }

    public amo c() {
        return this.b;
    }

    public ex.g d() {
        return this.c;
    }
}

